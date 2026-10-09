package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class z5 implements View.OnClickListener {
    public final int f53470a;
    public final d7 f53471b;

    public z5(d7 d7Var, int i10) {
        this.f53470a = i10;
        this.f53471b = d7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f53470a) {
            case 0:
                if (this.f53471b.f52401f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21357a = true;
                    R.showAsSheet(new p7(), obj);
                    return;
                }
                return;
            default:
                if (this.f53471b.f52401f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21357a = true;
                    R2.showAsSheet(new p7(), obj2);
                    return;
                }
                return;
        }
    }
}
