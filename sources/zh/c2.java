package zh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ea;
import bi.v9;
import c8.ha;
import c8.qa;
import org.telegram.messenger.id;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.r41;
public final class c2 extends org.telegram.ui.ActionBar.v2 {
    public long f60260i1;

    public c2(Context context, long j3, TL_stars.SavedStarGift savedStarGift, g6 g6Var, u10 u10Var) {
        super(1, context, g6Var, false);
        this.f60260i1 = 0L;
        N();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = qa.b(context, 20.0f, l6.G6, true, g6Var);
        b10.setText(id.M0(2131749881, null));
        linearLayout.addView(b10, ha.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = qa.b(context, 14.0f, l6.f28257y6, false, g6Var);
        b11.setText(id.M0(2131749882, null));
        linearLayout.addView(b11, ha.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        fi.d dVar = new fi.d(context, g6Var, true);
        v9 G = ea.y(this.f28621a, false).G(j3, true);
        r41 r41Var = new r41(context, this.f28621a, 0, false, new org.telegram.ui.Wallet.t1(6, this, G), new org.telegram.ui.web.a0(29, this, dVar), null, g6Var);
        r41Var.setSpanCount(3);
        r41Var.setOverScrollMode(2);
        r41Var.setScrollEnabled(false);
        linearLayout.addView(r41Var, ha.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(id.M0(2131749883, null), false, true);
        linearLayout.addView(dVar, ha.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new di.v3(this, G, savedStarGift, u10Var, 16));
        this.N = linearLayout;
    }
}
