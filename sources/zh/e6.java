package zh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class e6 implements View.OnClickListener {
    public final int f51866a;
    public final j7 f51867b;

    public e6(j7 j7Var, int i10) {
        this.f51866a = i10;
        this.f51867b = j7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f51866a) {
            case 0:
                if (this.f51867b.f52145f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21169a = true;
                    R.showAsSheet(new v7(), obj);
                    return;
                }
                return;
            default:
                if (this.f51867b.f52145f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21169a = true;
                    R2.showAsSheet(new v7(), obj2);
                    return;
                }
                return;
        }
    }
}
