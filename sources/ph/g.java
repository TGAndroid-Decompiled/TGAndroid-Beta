package ph;

import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.cc;
public final class g implements View.OnClickListener {
    public final int f45055a;
    public final m f45056b;

    public g(m mVar, int i10) {
        this.f45055a = i10;
        this.f45056b = mVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f45055a;
        m mVar = this.f45056b;
        switch (i10) {
            case 0:
                mVar.dismiss();
                return;
            case 1:
                int value = mVar.U1.getValue();
                int e = (int) mVar.f45216d2.e();
                if (value < e) {
                    org.telegram.messenger.i0.E3(mVar.S1);
                    z20.s(cd.G(e, "Gift2AuctionMinimumBidIncreased", new Object[0]), new cc(mVar.f21589c, mVar.I0), 2131624066, 36);
                    return;
                }
                mVar.g1(value);
                return;
            default:
                mVar.U1.setValueAnimated((int) mVar.f45216d2.e());
                return;
        }
    }
}
