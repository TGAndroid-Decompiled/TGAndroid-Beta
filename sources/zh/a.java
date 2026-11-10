package zh;

import android.view.KeyEvent;
import android.view.View;
import bi.dd;
import org.telegram.ui.LaunchActivity;
public final class a implements View.OnClickListener {
    public final int f60207a;
    public final KeyEvent.Callback f60208b;

    public a(KeyEvent.Callback callback, int i7) {
        this.f60207a = i7;
        this.f60208b = callback;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.f2 Q;
        switch (this.f60207a) {
            case 0:
                ((d) this.f60208b).dismiss();
                return;
            case 1:
                ((b0) this.f60208b).dismiss();
                return;
            case 2:
                if (((g1) this.f60208b).Z1.f4723e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f27388a = true;
                    Q.showAsSheet(new dd(), obj);
                    return;
                }
                return;
            default:
                ((u2) this.f60208b).performClick();
                return;
        }
    }
}
