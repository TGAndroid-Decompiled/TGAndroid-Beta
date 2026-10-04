package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class j6 implements View.OnClickListener {
    public final int f51483a;
    public final l7 f51484b;

    public j6(l7 l7Var, int i10) {
        this.f51483a = i10;
        this.f51484b = l7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f51483a) {
            case 0:
                if (this.f51484b.f51588f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21350a = true;
                    R.showAsSheet(new x7(), obj);
                    return;
                }
                return;
            default:
                if (this.f51484b.f51588f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21350a = true;
                    R2.showAsSheet(new x7(), obj2);
                    return;
                }
                return;
        }
    }
}
