package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r1 extends WebChromeClient {
    public final int f40552a;
    public final KeyEvent.Callback f40553b;

    public r1(KeyEvent.Callback callback, int i10) {
        this.f40552a = i10;
        this.f40553b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f40552a) {
            case 0:
                super.onHideCustomView();
                v1 v1Var = (v1) this.f40553b;
                l4 l4Var = v1Var.f42075x;
                if (l4Var.O != null) {
                    l4Var.P.setVisibility(4);
                    l4 l4Var2 = v1Var.f42075x;
                    l4Var2.P.removeView(l4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = v1Var.f42075x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        v1Var.f42075x.S.onCustomViewHidden();
                    }
                    v1Var.f42075x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.f40553b;
                if (cvVar.d != null) {
                    cvVar.getSheetContainer().setVisibility(0);
                    cvVar.e.setVisibility(4);
                    cvVar.e.removeView(cvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = cvVar.f25373f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        cvVar.f25373f.onCustomViewHidden();
                    }
                    cvVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f40552a) {
            case 0:
                onShowCustomView(view, customViewCallback);
                return;
            default:
                onShowCustomView(view, customViewCallback);
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f40552a) {
            case 0:
                l4 l4Var = ((v1) this.f40553b).f42075x;
                if (l4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                l4Var.O = view;
                l4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new ut0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.f40553b;
                FrameLayout frameLayout = cvVar.e;
                if (cvVar.d == null && !org.telegram.ui.Components.zg0.f32905p0.P) {
                    cvVar.I();
                    cvVar.d = view;
                    cvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.z5.c(-1.0f, -1));
                    cvVar.f25373f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
