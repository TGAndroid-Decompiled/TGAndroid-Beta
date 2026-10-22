package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r1 extends WebChromeClient {
    public final int f41031a;
    public final KeyEvent.Callback f41032b;

    public r1(KeyEvent.Callback callback, int i10) {
        this.f41031a = i10;
        this.f41032b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f41031a) {
            case 0:
                super.onHideCustomView();
                v1 v1Var = (v1) this.f41032b;
                l4 l4Var = v1Var.f42096x;
                if (l4Var.O != null) {
                    l4Var.P.setVisibility(4);
                    l4 l4Var2 = v1Var.f42096x;
                    l4Var2.P.removeView(l4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = v1Var.f42096x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        v1Var.f42096x.S.onCustomViewHidden();
                    }
                    v1Var.f42096x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.f41032b;
                if (cvVar.d != null) {
                    cvVar.getSheetContainer().setVisibility(0);
                    cvVar.e.setVisibility(4);
                    cvVar.e.removeView(cvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = cvVar.f25265f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        cvVar.f25265f.onCustomViewHidden();
                    }
                    cvVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f41031a) {
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
        switch (this.f41031a) {
            case 0:
                l4 l4Var = ((v1) this.f41032b).f42096x;
                if (l4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                l4Var.O = view;
                l4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new st0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.f41032b;
                FrameLayout frameLayout = cvVar.e;
                if (cvVar.d == null && !org.telegram.ui.Components.ah0.f24601p0.P) {
                    cvVar.I();
                    cvVar.d = view;
                    cvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.z5.c(-1.0f, -1));
                    cvVar.f25265f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
