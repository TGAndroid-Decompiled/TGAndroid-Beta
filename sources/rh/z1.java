package rh;

import android.view.View;
public final class z1 implements View.OnClickListener {
    public final int f43865a;
    public final q2 f43866b;

    public z1(q2 q2Var, int i10) {
        this.f43865a = i10;
        this.f43866b = q2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43865a) {
            case 0:
                org.telegram.ui.web.w0 webView = this.f43866b.f43708x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f43866b.r();
                return;
        }
    }
}
