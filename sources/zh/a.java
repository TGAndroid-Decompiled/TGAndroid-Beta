package zh;

import android.view.View;
import bi.dd;
import org.telegram.ui.Components.na;
import org.telegram.ui.LaunchActivity;
public final class a implements View.OnClickListener {
    public final int f60200a;
    public final na f60201b;

    public a(na naVar, int i7) {
        this.f60200a = i7;
        this.f60201b = naVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.f2 Q;
        switch (this.f60200a) {
            case 0:
                ((d) this.f60201b).dismiss();
                return;
            case 1:
                ((b0) this.f60201b).dismiss();
                return;
            default:
                if (((g1) this.f60201b).W1.f4724f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f27424a = true;
                    Q.showAsSheet(new dd(), obj);
                    return;
                }
                return;
        }
    }
}
