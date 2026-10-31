package rh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class d7 implements View.OnClickListener {
    public final int f46763a;
    public final w7 f46764b;

    public d7(w7 w7Var, int i10) {
        this.f46763a = i10;
        this.f46764b = w7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k2 Q;
        org.telegram.ui.ActionBar.k2 Q2;
        switch (this.f46763a) {
            case 0:
                if (this.f46764b.f47650f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f20389a = true;
                    Q.showAsSheet(new h8(), obj);
                    return;
                }
                return;
            default:
                if (this.f46764b.f47650f > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f20389a = true;
                    Q2.showAsSheet(new h8(), obj2);
                    return;
                }
                return;
        }
    }
}
