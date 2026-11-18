package ph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import bg.u0;
import hi.d;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;
public final class a extends d implements te.b {
    public final te.a m0;
    public final i6 f55627n0;
    public boolean f55628o0;

    public a(Context context, i6 i6Var) {
        super(context, i6Var, true);
        this.m0 = new te.a(0, this, lr.h, 320L, true);
        this.f55627n0 = i6Var;
        f();
        setOutlineProvider(u0.f3343b);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        boolean q10;
        this.f55628o0 = true;
        i6 i6Var = this.f55627n0;
        if (i6Var != null) {
            q10 = i6Var.d();
        } else {
            q10 = n6.I.q();
        }
        float f12 = this.m0.f57657e;
        setElevation((1.0f - f12) * g0.L(1.0f));
        setColor(i0.a.f(f12, m(n6.f29396d6), m(n6.Fi)));
        setTextColor(i0.a.f(f12, m(n6.f29637q7), m(n6.Ji)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (q10) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
                return;
            }
            setOutlineAmbientShadowColor(1610612736);
            setOutlineSpotShadowColor(1610612736);
        }
    }

    public final int m(int i7) {
        i6 i6Var = this.f55627n0;
        if (i6Var != null) {
            return i6Var.k(i7);
        }
        return n6.x0(null, i7, false);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        te.a aVar = this.m0;
        if (aVar != null && this.f55628o0) {
            try {
                float f10 = aVar.f57657e;
                int f11 = i0.a.f(f10, m(n6.f29396d6), m(n6.Fi));
                Drawable background = getBackground();
                if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f11) {
                    ((ShapeDrawable) background).getPaint().setColor(f11);
                    background.invalidateSelf();
                }
                setTextColor(i0.a.f(f10, m(n6.f29637q7), m(n6.Ji)));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
