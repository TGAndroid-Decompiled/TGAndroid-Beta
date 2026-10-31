package ph;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.u51;
import rh.e6;
import rh.v5;
import w7.b6;
import w7.g6;
public final class i2 extends org.telegram.ui.ActionBar.z2 {
    public long f45119i1;

    public i2(Context context, long j10, TL_stars.SavedStarGift savedStarGift, p6 p6Var, i20 i20Var) {
        super(1, context, p6Var, false);
        this.f45119i1 = 0L;
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = g6.b(context, 20.0f, t6.G6, true, p6Var);
        b10.setText(cd.L0(2131749890, null));
        linearLayout.addView(b10, b6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = g6.b(context, 14.0f, t6.f21311y6, false, p6Var);
        b11.setText(cd.L0(2131749891, null));
        linearLayout.addView(b11, b6.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        vh.d dVar = new vh.d(context, p6Var, true);
        v5 G = e6.y(this.f21583a, false).G(j10, true);
        u51 u51Var = new u51(context, this.f21583a, 0, false, new ih.s(28, this, G), new org.telegram.ui.web.k0(5, this, dVar), null, p6Var);
        u51Var.setSpanCount(3);
        u51Var.setOverScrollMode(2);
        u51Var.setScrollEnabled(false);
        linearLayout.addView(u51Var, b6.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(cd.L0(2131749892, null), false, true);
        linearLayout.addView(dVar, b6.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new org.telegram.messenger.video.h(this, G, savedStarGift, i20Var, 12));
        this.N = linearLayout;
    }
}
