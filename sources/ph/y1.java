package ph;

import android.view.View;
public final class y1 implements View.OnClickListener {
    public final int f46161a;
    public final p2 f46162b;

    public y1(p2 p2Var, int i10) {
        this.f46161a = i10;
        this.f46162b = p2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46161a) {
            case 0:
                org.telegram.ui.web.w0 webView = this.f46162b.f45987x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f46162b.r();
                return;
        }
    }
}
