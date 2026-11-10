package zh;

import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.Components.gc;
public final class h implements View.OnClickListener {
    public final int f60359a;
    public final l f60360b;

    public h(l lVar, int i7) {
        this.f60359a = i7;
        this.f60360b = lVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f60359a;
        l lVar = this.f60360b;
        switch (i7) {
            case 0:
                lVar.dismiss();
                return;
            case 1:
                int value = lVar.X1.getValue();
                int e10 = (int) lVar.f60438g2.e();
                if (value < e10) {
                    org.telegram.messenger.g0.F3(lVar.V1);
                    org.telegram.messenger.camera.q.s(id.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new gc(lVar.f28675c, lVar.I0), 2131624067, 36);
                    return;
                }
                lVar.g1(value);
                return;
            default:
                lVar.X1.setValueAnimated((int) lVar.f60438g2.e());
                return;
        }
    }
}
