package com.youngmanster.collection.mvp.presenter.wechat.okhttpcache;

import com.youngmanster.collection.been.Result;
import com.youngmanster.collection.been.WeChatNewsResult;
import com.youngmanster.collection.been.wechat.WeChatNews;
import com.youngmanster.collection.http.ApiClient;
import com.youngmanster.collection.http.ApiUrl;
import com.youngmanster.collection.mvp.contract.wechat.okhttpcache.WeChatFeaturedContract;
import com.youngmanster.collectionlibrary.db.DataManager;
import com.youngmanster.collectionlibrary.network.RequestBuilder;
import com.youngmanster.collectionlibrary.network.rx.RxObservableListener;

import java.util.List;

/**
 * Created by yangyan
 * on 2018/3/21.
 */

public class WeChatFeaturedNoCommonClassPresenter extends WeChatFeaturedContract.Presenter {
	@Override
	public void requestFeaturedNews(int page, int num) {

		RequestBuilder<WeChatNewsResult> resultRequestBuilder = new RequestBuilder<>(new RxObservableListener<WeChatNewsResult>(mView) {
			@Override
			public void onNext(WeChatNewsResult result) {
				mView.refreshUI(result.getResult());
			}
		});

		resultRequestBuilder
				.setUrl(ApiUrl.URL_WETCHAT_FEATURED)
				.setTransformClass(WeChatNewsResult.class)
				.setUserCommonClass(false)
				.setRequestParam(ApiClient.getRequiredBaseParam())
				.setParam("page",page)
				.setParam("num",num);

		rxManager.addObserver(DataManager.getInstance(DataManager.DataType.RETROFIT).httpRequest(resultRequestBuilder));

	}
}
