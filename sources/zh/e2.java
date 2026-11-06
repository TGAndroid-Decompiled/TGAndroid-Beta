package zh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ea;
import bi.v9;
import c8.ha;
import c8.na;
import org.telegram.messenger.hd;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k41;
public final class e2 extends org.telegram.ui.ActionBar.v2 {
    public long f60181i1;

    public e2(Context context, long j3, TL_stars.SavedStarGift savedStarGift, f6 f6Var, u10 u10Var) {
        super(1, context, f6Var, false);
        this.f60181i1 = 0L;
        N();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = na.b(context, 20.0f, k6.G6, true, f6Var);
        b10.setText(hd.M0(2131749880, null));
        linearLayout.addView(b10, ha.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = na.b(context, 14.0f, k6.f28240y6, false, f6Var);
        b11.setText(hd.M0(2131749881, null));
        linearLayout.addView(b11, ha.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        fi.d dVar = new fi.d(context, f6Var, true);
        v9 G = ea.y(this.f28612a, false).G(j3, true);
        k41 k41Var = new k41(context, this.f28612a, 0, false, new org.telegram.ui.Wallet.v1(6, this, G), new c2(this, dVar), null, f6Var);
        k41Var.setSpanCount(3);
        k41Var.setOverScrollMode(2);
        k41Var.setScrollEnabled(false);
        linearLayout.addView(k41Var, ha.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(hd.M0(2131749882, null), false, true);
        linearLayout.addView(dVar, ha.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new di.u3(this, G, savedStarGift, u10Var, 16));
        this.N = linearLayout;
    }
}
