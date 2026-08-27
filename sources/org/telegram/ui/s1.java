package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class s1 extends WebChromeClient {

    public final int f42390a;

    public final KeyEvent.Callback f42391b;

    public s1(KeyEvent.Callback callback, int i10) {
        this.f42390a = i10;
        this.f42391b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f42390a) {
            case 0:
                super.onHideCustomView();
                w1 w1Var = (w1) this.f42391b;
                m4 m4Var = w1Var.f43570x;
                if (m4Var.K != null) {
                    m4Var.L.setVisibility(4);
                    m4 m4Var2 = w1Var.f43570x;
                    m4Var2.L.removeView(m4Var2.K);
                    WebChromeClient.CustomViewCallback customViewCallback = w1Var.f43570x.O;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        w1Var.f43570x.O.onCustomViewHidden();
                    }
                    w1Var.f43570x.K = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.fu fuVar = (org.telegram.ui.Components.fu) this.f42391b;
                if (fuVar.d != null) {
                    fuVar.getSheetContainer().setVisibility(0);
                    fuVar.f28452e.setVisibility(4);
                    fuVar.f28452e.removeView(fuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = fuVar.f28453f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        fuVar.f28453f.onCustomViewHidden();
                    }
                    fuVar.d = null;
                    break;
                }
                break;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f42390a) {
            case 0:
                onShowCustomView(view, customViewCallback);
                break;
            default:
                onShowCustomView(view, customViewCallback);
                break;
        }
    }

    @Override
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f42390a) {
            case 0:
                m4 m4Var = ((w1) this.f42391b).f43570x;
                if (m4Var.K != null) {
                    customViewCallback.onCustomViewHidden();
                } else {
                    m4Var.K = view;
                    m4Var.O = customViewCallback;
                    AndroidUtilities.runOnUIThread(new lt0(this, 7), 100L);
                }
                break;
            default:
                org.telegram.ui.Components.fu fuVar = (org.telegram.ui.Components.fu) this.f42391b;
                FrameLayout frameLayout = fuVar.f28452e;
                if (fuVar.d == null && !org.telegram.ui.Components.sf0.f32415l0.L) {
                    fuVar.I();
                    fuVar.d = view;
                    fuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, h7.z5.c(-1.0f, -1));
                    fuVar.f28453f = customViewCallback;
                } else {
                    customViewCallback.onCustomViewHidden();
                }
                break;
        }
    }
}
