package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class s1 extends WebChromeClient {
    public final int f38085a;
    public final KeyEvent.Callback f38086b;

    public s1(KeyEvent.Callback callback, int i10) {
        this.f38085a = i10;
        this.f38086b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f38085a) {
            case 0:
                super.onHideCustomView();
                w1 w1Var = (w1) this.f38086b;
                n4 n4Var = w1Var.f39241x;
                if (n4Var.L != null) {
                    n4Var.M.setVisibility(4);
                    n4 n4Var2 = w1Var.f39241x;
                    n4Var2.M.removeView(n4Var2.L);
                    WebChromeClient.CustomViewCallback customViewCallback = w1Var.f39241x.P;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        w1Var.f39241x.P.onCustomViewHidden();
                    }
                    w1Var.f39241x.L = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.ou ouVar = (org.telegram.ui.Components.ou) this.f38086b;
                if (ouVar.d != null) {
                    ouVar.getSheetContainer().setVisibility(0);
                    ouVar.e.setVisibility(4);
                    ouVar.e.removeView(ouVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = ouVar.f27653f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        ouVar.f27653f.onCustomViewHidden();
                    }
                    ouVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f38085a) {
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
        switch (this.f38085a) {
            case 0:
                n4 n4Var = ((w1) this.f38086b).f39241x;
                if (n4Var.L != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                n4Var.L = view;
                n4Var.P = customViewCallback;
                AndroidUtilities.runOnUIThread(new yt0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.ou ouVar = (org.telegram.ui.Components.ou) this.f38086b;
                FrameLayout frameLayout = ouVar.e;
                if (ouVar.d == null && !org.telegram.ui.Components.mg0.m0.M) {
                    ouVar.H();
                    ouVar.d = view;
                    ouVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, k7.b6.c(-1.0f, -1));
                    ouVar.f27653f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
