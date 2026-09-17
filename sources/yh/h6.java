package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class h6 implements View.OnClickListener {
    public final int f47283a;
    public final m7 f47284b;

    public h6(m7 m7Var, int i10) {
        this.f47283a = i10;
        this.f47284b = m7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.o2 R;
        org.telegram.ui.ActionBar.o2 R2;
        switch (this.f47283a) {
            case 0:
                if (this.f47284b.f47494f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19397a = true;
                    R.showAsSheet(new y7(), obj);
                    return;
                }
                return;
            default:
                if (this.f47284b.f47494f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f19397a = true;
                    R2.showAsSheet(new y7(), obj2);
                    return;
                }
                return;
        }
    }
}
