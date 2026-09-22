package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class g6 implements View.OnClickListener {
    public final int f47511a;
    public final k7 f47512b;

    public g6(k7 k7Var, int i10) {
        this.f47511a = i10;
        this.f47512b = k7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f47511a) {
            case 0:
                if (this.f47512b.f47681f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19592a = true;
                    R.showAsSheet(new w7(), obj);
                    return;
                }
                return;
            default:
                if (this.f47512b.f47681f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f19592a = true;
                    R2.showAsSheet(new w7(), obj2);
                    return;
                }
                return;
        }
    }
}
