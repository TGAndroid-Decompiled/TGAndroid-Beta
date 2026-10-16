package zh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class z5 implements View.OnClickListener {
    public final int f51383a;
    public final d7 f51384b;

    public z5(d7 d7Var, int i10) {
        this.f51383a = i10;
        this.f51384b = d7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.m2 R;
        org.telegram.ui.ActionBar.m2 R2;
        switch (this.f51383a) {
            case 0:
                if (this.f51384b.f50391f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f20169a = true;
                    R.showAsSheet(new p7(), obj);
                    return;
                }
                return;
            default:
                if (this.f51384b.f50391f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f20169a = true;
                    R2.showAsSheet(new p7(), obj2);
                    return;
                }
                return;
        }
    }
}
