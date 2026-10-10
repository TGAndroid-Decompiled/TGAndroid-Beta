package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class z5 implements View.OnClickListener {
    public final int f53516a;
    public final d7 f53517b;

    public z5(d7 d7Var, int i10) {
        this.f53516a = i10;
        this.f53517b = d7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f53516a) {
            case 0:
                if (this.f53517b.f52447f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21361a = true;
                    R.showAsSheet(new p7(), obj);
                    return;
                }
                return;
            default:
                if (this.f53517b.f52447f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21361a = true;
                    R2.showAsSheet(new p7(), obj2);
                    return;
                }
                return;
        }
    }
}
