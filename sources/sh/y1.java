package sh;

import android.view.View;
public final class y1 implements View.OnClickListener {
    public final int f47822a;
    public final p2 f47823b;

    public y1(p2 p2Var, int i10) {
        this.f47822a = i10;
        this.f47823b = p2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47822a) {
            case 0:
                org.telegram.ui.web.x0 webView = this.f47823b.f47648x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f47823b.r();
                return;
        }
    }
}
