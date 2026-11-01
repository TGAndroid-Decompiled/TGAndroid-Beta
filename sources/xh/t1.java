package xh;

import android.view.View;
public final class t1 implements View.OnClickListener {
    public final int f54066a;
    public final m2 f54067b;

    public t1(m2 m2Var, int i10) {
        this.f54066a = i10;
        this.f54067b = m2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f54066a) {
            case 0:
                org.telegram.ui.web.v0 webView = this.f54067b.D.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f54067b.w();
                return;
        }
    }
}
