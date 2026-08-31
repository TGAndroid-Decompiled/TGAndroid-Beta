package sh;

import android.view.View;
public final class y1 implements View.OnClickListener {
    public final int f47786a;
    public final p2 f47787b;

    public y1(p2 p2Var, int i10) {
        this.f47786a = i10;
        this.f47787b = p2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47786a) {
            case 0:
                org.telegram.ui.web.x0 webView = this.f47787b.f47612x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f47787b.r();
                return;
        }
    }
}
