package yg;

import android.content.Context;
import android.os.Build;
import jf.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
public final class b extends nh.d implements vd.b {
    public final vd.a f50539d0;
    public final c6 f50540e0;

    public b(Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.f50539d0 = new vd.a(0, this, jr.h, 320L, true);
        this.f50540e0 = c6Var;
        e();
        setOutlineProvider(q0.f11669b);
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        boolean q6;
        c6 c6Var = this.f50540e0;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = g6.I.q();
        }
        float f11 = this.f50539d0.f49505e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(g6.f23062d6), m(g6.Oh)));
        setTextColor(i0.a.d(f11, m(g6.f23295q7), m(g6.Sh)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (q6) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
                return;
            }
            setOutlineAmbientShadowColor(1610612736);
            setOutlineSpotShadowColor(1610612736);
        }
    }

    public final int m(int i10) {
        c6 c6Var = this.f50540e0;
        if (c6Var != null) {
            return c6Var.C0(i10);
        }
        return g6.w0(null, i10, false);
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
