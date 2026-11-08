package zh;

import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;
public final class h implements View.OnClickListener {
    public final int f60345a;
    public final l f60346b;

    public h(l lVar, int i7) {
        this.f60345a = i7;
        this.f60346b = lVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f60345a;
        l lVar = this.f60346b;
        switch (i7) {
            case 0:
                lVar.dismiss();
                return;
            case 1:
                int value = lVar.U1.getValue();
                int e10 = (int) lVar.d2.e();
                if (value < e10) {
                    org.telegram.messenger.g0.F3(lVar.S1);
                    org.telegram.messenger.camera.q.s(id.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new hc(lVar.f28622c, lVar.I0), 2131624067, 36);
                    return;
                }
                lVar.g1(value);
                return;
            default:
                lVar.U1.setValueAnimated((int) lVar.d2.e());
                return;
        }
    }
}
