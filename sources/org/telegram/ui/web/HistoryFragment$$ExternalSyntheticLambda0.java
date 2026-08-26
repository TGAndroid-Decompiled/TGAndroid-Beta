package org.telegram.ui.web;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;

public final class HistoryFragment$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;

    public HistoryFragment$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj) {
        UniversalAdapter universalAdapter;
        switch (this.$r8$classId) {
            case 0:
                HistoryFragment historyFragment = (HistoryFragment) this.f$0;
                historyFragment.history = (ArrayList) obj;
                UniversalFragment.AnonymousClass3 anonymousClass3 = historyFragment.listView;
                if (anonymousClass3.mIsAttached) {
                    anonymousClass3.adapter.update(true);
                }
                break;
            case 1:
                BotWebViewContainer.WebViewProxy webViewProxy = (BotWebViewContainer.WebViewProxy) this.f$0;
                webViewProxy.getClass();
                webViewProxy.webView.evaluateJS(SurfaceContainer$$ExternalSyntheticOutline0.m(new StringBuilder("window.navigator.__share__receive("), ((Boolean) obj).booleanValue() ? "" : "'abort'", ")"));
                break;
            default:
                WebBrowserSettings webBrowserSettings = (WebBrowserSettings) this.f$0;
                webBrowserSettings.getClass();
                webBrowserSettings.historySize = ((ArrayList) obj).size();
                UniversalFragment.AnonymousClass3 anonymousClass4 = webBrowserSettings.listView;
                if (anonymousClass4 != null && (universalAdapter = anonymousClass4.adapter) != null && anonymousClass4.mIsAttached) {
                    universalAdapter.update(true);
                    break;
                }
                break;
        }
    }
}
