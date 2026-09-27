package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class e6 implements View.OnClickListener {
    public final int f47391a;
    public final j7 f47392b;

    public e6(j7 j7Var, int i10) {
        this.f47391a = i10;
        this.f47392b = j7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.o2 R;
        org.telegram.ui.ActionBar.o2 R2;
        switch (this.f47391a) {
            case 0:
                if (this.f47392b.f47634f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19631a = true;
                    R.showAsSheet(new v7(), obj);
                    return;
                }
                return;
            default:
                if (this.f47392b.f47634f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f19631a = true;
                    R2.showAsSheet(new v7(), obj2);
                    return;
                }
                return;
        }
    }
}
