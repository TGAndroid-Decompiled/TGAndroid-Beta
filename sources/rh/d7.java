package rh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class d7 implements View.OnClickListener {
    public final int f46777a;
    public final w7 f46778b;

    public d7(w7 w7Var, int i10) {
        this.f46777a = i10;
        this.f46778b = w7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k2 Q;
        org.telegram.ui.ActionBar.k2 Q2;
        switch (this.f46777a) {
            case 0:
                if (this.f46778b.f47660f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f20390a = true;
                    Q.showAsSheet(new h8(), obj);
                    return;
                }
                return;
            default:
                if (this.f46778b.f47660f > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f20390a = true;
                    Q2.showAsSheet(new h8(), obj2);
                    return;
                }
                return;
        }
    }
}
