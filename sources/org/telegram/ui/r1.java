package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r1 extends WebChromeClient {
    public final int f42247a;
    public final KeyEvent.Callback f42248b;

    public r1(KeyEvent.Callback callback, int i9) {
        this.f42247a = i9;
        this.f42248b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f42247a) {
            case 0:
                super.onHideCustomView();
                v1 v1Var = (v1) this.f42248b;
                l4 l4Var = v1Var.f43363x;
                if (l4Var.K != null) {
                    l4Var.L.setVisibility(4);
                    l4 l4Var2 = v1Var.f43363x;
                    l4Var2.L.removeView(l4Var2.K);
                    WebChromeClient.CustomViewCallback customViewCallback = v1Var.f43363x.O;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        v1Var.f43363x.O.onCustomViewHidden();
                    }
                    v1Var.f43363x.K = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.gu guVar = (org.telegram.ui.Components.gu) this.f42248b;
                if (guVar.d != null) {
                    guVar.getSheetContainer().setVisibility(0);
                    guVar.f28870e.setVisibility(4);
                    guVar.f28870e.removeView(guVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = guVar.f28871f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        guVar.f28871f.onCustomViewHidden();
                    }
                    guVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i9, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f42247a) {
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
        switch (this.f42247a) {
            case 0:
                l4 l4Var = ((v1) this.f42248b).f43363x;
                if (l4Var.K != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                l4Var.K = view;
                l4Var.O = customViewCallback;
                AndroidUtilities.runOnUIThread(new kt0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.gu guVar = (org.telegram.ui.Components.gu) this.f42248b;
                FrameLayout frameLayout = guVar.f28870e;
                if (guVar.d == null && !org.telegram.ui.Components.pf0.f31622l0.L) {
                    guVar.H();
                    guVar.d = view;
                    guVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, g7.e6.c(-1.0f, -1));
                    guVar.f28871f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
