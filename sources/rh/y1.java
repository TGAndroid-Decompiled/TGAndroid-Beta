package rh;

import android.view.View;
public final class y1 implements View.OnClickListener {
    public final int f43917a;
    public final p2 f43918b;

    public y1(p2 p2Var, int i10) {
        this.f43917a = i10;
        this.f43918b = p2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43917a) {
            case 0:
                org.telegram.ui.web.y0 webView = this.f43918b.f43760x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f43918b.r();
                return;
        }
    }
}
