package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class g6 implements View.OnClickListener {
    public final int f47490a;
    public final k7 f47491b;

    public g6(k7 k7Var, int i10) {
        this.f47490a = i10;
        this.f47491b = k7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f47490a) {
            case 0:
                if (this.f47491b.f47660f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19577a = true;
                    R.showAsSheet(new w7(), obj);
                    return;
                }
                return;
            default:
                if (this.f47491b.f47660f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f19577a = true;
                    R2.showAsSheet(new w7(), obj2);
                    return;
                }
                return;
        }
    }
}
