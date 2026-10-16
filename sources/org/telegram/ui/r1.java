package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r1 extends WebChromeClient {
    public final int f39260a;
    public final KeyEvent.Callback f39261b;

    public r1(KeyEvent.Callback callback, int i10) {
        this.f39260a = i10;
        this.f39261b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f39260a) {
            case 0:
                super.onHideCustomView();
                v1 v1Var = (v1) this.f39261b;
                k4 k4Var = v1Var.f40542x;
                if (k4Var.O != null) {
                    k4Var.P.setVisibility(4);
                    k4 k4Var2 = v1Var.f40542x;
                    k4Var2.P.removeView(k4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = v1Var.f40542x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        v1Var.f40542x.S.onCustomViewHidden();
                    }
                    v1Var.f40542x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.hv hvVar = (org.telegram.ui.Components.hv) this.f39261b;
                if (hvVar.d != null) {
                    hvVar.getSheetContainer().setVisibility(0);
                    hvVar.e.setVisibility(4);
                    hvVar.e.removeView(hvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = hvVar.f25407f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        hvVar.f25407f.onCustomViewHidden();
                    }
                    hvVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f39260a) {
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
        switch (this.f39260a) {
            case 0:
                k4 k4Var = ((v1) this.f39261b).f40542x;
                if (k4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                k4Var.O = view;
                k4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new su0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.hv hvVar = (org.telegram.ui.Components.hv) this.f39261b;
                FrameLayout frameLayout = hvVar.e;
                if (hvVar.d == null && !org.telegram.ui.Components.fh0.f24733p0.P) {
                    hvVar.I();
                    hvVar.d = view;
                    hvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.z5.d(-1.0f, -1));
                    hvVar.f25407f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
