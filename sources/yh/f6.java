package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class f6 implements View.OnClickListener {
    public final int f47379a;
    public final j7 f47380b;

    public f6(j7 j7Var, int i10) {
        this.f47379a = i10;
        this.f47380b = j7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f47379a) {
            case 0:
                if (this.f47380b.f47572f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19545a = true;
                    R.showAsSheet(new v7(), obj);
                    return;
                }
                return;
            default:
                if (this.f47380b.f47572f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f19545a = true;
                    R2.showAsSheet(new v7(), obj2);
                    return;
                }
                return;
        }
    }
}
