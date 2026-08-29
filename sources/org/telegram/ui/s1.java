package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class s1 extends WebChromeClient {
    public final int f42249a;
    public final KeyEvent.Callback f42250b;

    public s1(KeyEvent.Callback callback, int i10) {
        this.f42249a = i10;
        this.f42250b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f42249a) {
            case 0:
                super.onHideCustomView();
                w1 w1Var = (w1) this.f42250b;
                m4 m4Var = w1Var.f43819x;
                if (m4Var.K != null) {
                    m4Var.L.setVisibility(4);
                    m4 m4Var2 = w1Var.f43819x;
                    m4Var2.L.removeView(m4Var2.K);
                    WebChromeClient.CustomViewCallback customViewCallback = w1Var.f43819x.O;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        w1Var.f43819x.O.onCustomViewHidden();
                    }
                    w1Var.f43819x.K = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.mu muVar = (org.telegram.ui.Components.mu) this.f42250b;
                if (muVar.d != null) {
                    muVar.getSheetContainer().setVisibility(0);
                    muVar.f30766e.setVisibility(4);
                    muVar.f30766e.removeView(muVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = muVar.f30767f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        muVar.f30767f.onCustomViewHidden();
                    }
                    muVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f42249a) {
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
        switch (this.f42249a) {
            case 0:
                m4 m4Var = ((w1) this.f42250b).f43819x;
                if (m4Var.K != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                m4Var.K = view;
                m4Var.O = customViewCallback;
                AndroidUtilities.runOnUIThread(new it0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.mu muVar = (org.telegram.ui.Components.mu) this.f42250b;
                FrameLayout frameLayout = muVar.f30766e;
                if (muVar.d == null && !org.telegram.ui.Components.bg0.f27076l0.L) {
                    muVar.H();
                    muVar.d = view;
                    muVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, i7.f6.c(-1.0f, -1));
                    muVar.f30767f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
