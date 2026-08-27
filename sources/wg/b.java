package wg;

import android.content.Context;
import android.os.Build;
import gf.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;

public final class b extends lh.d implements ud.b {

    public final ud.a f49314d0;

    public final c6 f49315e0;

    public b(Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.f49314d0 = new ud.a(0, this, er.h, 320L, true);
        this.f49315e0 = c6Var;
        e();
        setOutlineProvider(r0.f7055b);
    }

    public final int m(int i10) {
        c6 c6Var = this.f49315e0;
        return c6Var != null ? c6Var.N0(i10) : g6.w0(null, i10, false);
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        c6 c6Var = this.f49315e0;
        boolean zA = c6Var != null ? c6Var.a() : g6.I.q();
        float f12 = this.f49314d0.f48497e;
        setElevation((1.0f - f12) * AndroidUtilities.dp(1.0f));
        setColor(i0.b.d(f12, m(g6.f23053d6), m(g6.Oh)));
        setTextColor(i0.b.d(f12, m(g6.f23284q7), m(g6.Sh)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (zA) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
            } else {
                setOutlineAmbientShadowColor(1610612736);
                setOutlineSpotShadowColor(1610612736);
            }
        }
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
