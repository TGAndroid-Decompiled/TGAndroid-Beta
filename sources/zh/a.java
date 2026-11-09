package zh;

import android.view.KeyEvent;
import android.view.View;
import bi.dd;
import org.telegram.ui.LaunchActivity;
public final class a implements View.OnClickListener {
    public final int f60209a;
    public final KeyEvent.Callback f60210b;

    public a(KeyEvent.Callback callback, int i7) {
        this.f60209a = i7;
        this.f60210b = callback;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.f2 Q;
        switch (this.f60209a) {
            case 0:
                ((d) this.f60210b).dismiss();
                return;
            case 1:
                ((b0) this.f60210b).dismiss();
                return;
            case 2:
                if (((g1) this.f60210b).W1.f4723e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f27408a = true;
                    Q.showAsSheet(new dd(), obj);
                    return;
                }
                return;
            default:
                ((u2) this.f60210b).performClick();
                return;
        }
    }
}
