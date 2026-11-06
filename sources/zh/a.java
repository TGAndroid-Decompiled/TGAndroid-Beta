package zh;

import android.view.View;
import bi.dd;
import org.telegram.ui.Components.na;
import org.telegram.ui.LaunchActivity;
public final class a implements View.OnClickListener {
    public final int f60101a;
    public final na f60102b;

    public a(na naVar, int i7) {
        this.f60101a = i7;
        this.f60102b = naVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.f2 Q;
        switch (this.f60101a) {
            case 0:
                ((d) this.f60102b).dismiss();
                return;
            case 1:
                ((c0) this.f60102b).dismiss();
                return;
            default:
                if (((h1) this.f60102b).W1.f4724f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f27420a = true;
                    Q.showAsSheet(new dd(), obj);
                    return;
                }
                return;
        }
    }
}
