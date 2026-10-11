package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class z5 implements View.OnClickListener {
    public final int f53593a;
    public final d7 f53594b;

    public z5(d7 d7Var, int i10) {
        this.f53593a = i10;
        this.f53594b = d7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.m2 R;
        org.telegram.ui.ActionBar.m2 R2;
        switch (this.f53593a) {
            case 0:
                if (this.f53594b.f52524f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21349a = true;
                    R.showAsSheet(new p7(), obj);
                    return;
                }
                return;
            default:
                if (this.f53594b.f52524f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21349a = true;
                    R2.showAsSheet(new p7(), obj2);
                    return;
                }
                return;
        }
    }
}
