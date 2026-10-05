package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class k6 implements View.OnClickListener {
    public final int f51551a;
    public final m7 f51552b;

    public k6(m7 m7Var, int i10) {
        this.f51551a = i10;
        this.f51552b = m7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f51551a) {
            case 0:
                if (this.f51552b.f51660f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21358a = true;
                    R.showAsSheet(new z7(), obj);
                    return;
                }
                return;
            default:
                if (this.f51552b.f51660f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21358a = true;
                    R2.showAsSheet(new z7(), obj2);
                    return;
                }
                return;
        }
    }
}
