package zh;

import android.view.View;
import bi.dd;
import org.telegram.ui.Components.na;
import org.telegram.ui.LaunchActivity;
public final class a implements View.OnClickListener {
    public final int f60106a;
    public final na f60107b;

    public a(na naVar, int i7) {
        this.f60106a = i7;
        this.f60107b = naVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.f2 Q;
        switch (this.f60106a) {
            case 0:
                ((d) this.f60107b).dismiss();
                return;
            case 1:
                ((c0) this.f60107b).dismiss();
                return;
            default:
                if (((h1) this.f60107b).W1.f4724f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f27421a = true;
                    Q.showAsSheet(new dd(), obj);
                    return;
                }
                return;
        }
    }
}
