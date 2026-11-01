package ph;

import android.view.View;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.cc;
public final class g implements View.OnClickListener {
    public final int f45066a;
    public final m f45067b;

    public g(m mVar, int i10) {
        this.f45066a = i10;
        this.f45067b = mVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f45066a;
        m mVar = this.f45067b;
        switch (i10) {
            case 0:
                mVar.dismiss();
                return;
            case 1:
                int value = mVar.U1.getValue();
                int e = (int) mVar.f45227d2.e();
                if (value < e) {
                    org.telegram.messenger.i0.E3(mVar.S1);
                    a30.s(dd.G(e, "Gift2AuctionMinimumBidIncreased", new Object[0]), new cc(mVar.f21590c, mVar.I0), 2131624066, 36);
                    return;
                }
                mVar.g1(value);
                return;
            default:
                mVar.U1.setValueAnimated((int) mVar.f45227d2.e());
                return;
        }
    }
}
