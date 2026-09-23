package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class f6 implements View.OnClickListener {
    public final int f47069a;
    public final k7 f47070b;

    public f6(k7 k7Var, int i10) {
        this.f47069a = i10;
        this.f47070b = k7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f47069a) {
            case 0:
                if (this.f47070b.f47307f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19352a = true;
                    R.showAsSheet(new w7(), obj);
                    return;
                }
                return;
            default:
                if (this.f47070b.f47307f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f19352a = true;
                    R2.showAsSheet(new w7(), obj2);
                    return;
                }
                return;
        }
    }
}
