package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class j6 implements View.OnClickListener {
    public final int f51482a;
    public final l7 f51483b;

    public j6(l7 l7Var, int i10) {
        this.f51482a = i10;
        this.f51483b = l7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f51482a) {
            case 0:
                if (this.f51483b.f51587f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21349a = true;
                    R.showAsSheet(new x7(), obj);
                    return;
                }
                return;
            default:
                if (this.f51483b.f51587f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21349a = true;
                    R2.showAsSheet(new x7(), obj2);
                    return;
                }
                return;
        }
    }
}
