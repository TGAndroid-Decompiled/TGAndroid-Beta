package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class g6 implements View.OnClickListener {
    public final int f47167a;
    public final l7 f47168b;

    public g6(l7 l7Var, int i10) {
        this.f47167a = i10;
        this.f47168b = l7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f47167a) {
            case 0:
                if (this.f47168b.f47375f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19364a = true;
                    R.showAsSheet(new x7(), obj);
                    return;
                }
                return;
            default:
                if (this.f47168b.f47375f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f19364a = true;
                    R2.showAsSheet(new x7(), obj2);
                    return;
                }
                return;
        }
    }
}
