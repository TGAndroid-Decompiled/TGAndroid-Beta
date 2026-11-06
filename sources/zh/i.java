package zh;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.hc;
public final class i implements View.OnClickListener {
    public final int f60237a;
    public final m f60238b;

    public i(m mVar, int i7) {
        this.f60237a = i7;
        this.f60238b = mVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f60237a;
        m mVar = this.f60238b;
        switch (i7) {
            case 0:
                mVar.dismiss();
                return;
            case 1:
                int value = mVar.U1.getValue();
                int e10 = (int) mVar.d2.e();
                if (value < e10) {
                    org.telegram.messenger.g0.F3(mVar.S1);
                    org.telegram.messenger.camera.q.s(hd.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new hc(mVar.f28618c, mVar.I0), 2131624067, 36);
                    return;
                }
                mVar.g1(value);
                return;
            default:
                mVar.U1.setValueAnimated((int) mVar.d2.e());
                return;
        }
    }
}
