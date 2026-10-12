package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r1 extends WebChromeClient {
    public final int f39568a;
    public final KeyEvent.Callback f39569b;

    public r1(KeyEvent.Callback callback, int i10) {
        this.f39568a = i10;
        this.f39569b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f39568a) {
            case 0:
                super.onHideCustomView();
                v1 v1Var = (v1) this.f39569b;
                k4 k4Var = v1Var.f40855x;
                if (k4Var.O != null) {
                    k4Var.P.setVisibility(4);
                    k4 k4Var2 = v1Var.f40855x;
                    k4Var2.P.removeView(k4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = v1Var.f40855x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        v1Var.f40855x.S.onCustomViewHidden();
                    }
                    v1Var.f40855x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.hv hvVar = (org.telegram.ui.Components.hv) this.f39569b;
                if (hvVar.d != null) {
                    hvVar.getSheetContainer().setVisibility(0);
                    hvVar.e.setVisibility(4);
                    hvVar.e.removeView(hvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = hvVar.f25753f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        hvVar.f25753f.onCustomViewHidden();
                    }
                    hvVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f39568a) {
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
        switch (this.f39568a) {
            case 0:
                k4 k4Var = ((v1) this.f39569b).f40855x;
                if (k4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                k4Var.O = view;
                k4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new tu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.hv hvVar = (org.telegram.ui.Components.hv) this.f39569b;
                FrameLayout frameLayout = hvVar.e;
                if (hvVar.d == null && !org.telegram.ui.Components.fh0.f25035p0.P) {
                    hvVar.I();
                    hvVar.d = view;
                    hvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.a6.d(-1.0f, -1));
                    hvVar.f25753f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
