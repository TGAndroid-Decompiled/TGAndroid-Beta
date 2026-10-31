package xh;

import android.view.View;
public final class t1 implements View.OnClickListener {
    public final int f54060a;
    public final m2 f54061b;

    public t1(m2 m2Var, int i10) {
        this.f54060a = i10;
        this.f54061b = m2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f54060a) {
            case 0:
                org.telegram.ui.web.v0 webView = this.f54061b.D.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f54061b.w();
                return;
        }
    }
}
