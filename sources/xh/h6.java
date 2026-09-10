package xh;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class h6 implements View.OnClickListener {
    public final int f45516a;
    public final n7 f45517b;

    public h6(n7 n7Var, int i10) {
        this.f45516a = i10;
        this.f45517b = n7Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.p2 R;
        org.telegram.ui.ActionBar.p2 R2;
        switch (this.f45516a) {
            case 0:
                if (this.f45517b.f45777f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f18485a = true;
                    R.showAsSheet(new z7(), obj);
                    return;
                }
                return;
            default:
                if (this.f45517b.f45777f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f18485a = true;
                    R2.showAsSheet(new z7(), obj2);
                    return;
                }
                return;
        }
    }
}
