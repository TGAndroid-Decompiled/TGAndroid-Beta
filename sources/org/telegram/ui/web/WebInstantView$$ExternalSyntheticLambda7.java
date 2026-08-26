package org.telegram.ui.web;

import android.webkit.ValueCallback;
import java.util.HashMap;

public final class WebInstantView$$ExternalSyntheticLambda7 implements ValueCallback {
    public final int $r8$classId;

    public WebInstantView$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                HashMap map = WebInstantView.instants;
                break;
            default:
                int i = BotWebViewContainer.MyWebView.$r8$clinit;
                break;
        }
    }
}
