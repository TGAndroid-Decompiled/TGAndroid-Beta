package ph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import bg.u0;
import hi.e;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;
public final class a extends e implements te.b {
    public final te.a m0;
    public final h6 f55668n0;
    public boolean f55669o0;

    public a(Context context, h6 h6Var) {
        super(context, h6Var, true);
        this.m0 = new te.a(0, this, nr.h, 320L, true);
        this.f55668n0 = h6Var;
        f();
        setOutlineProvider(u0.f3356b);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        boolean q10;
        this.f55669o0 = true;
        h6 h6Var = this.f55668n0;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = m6.I.q();
        }
        float f12 = this.m0.f57696e;
        setElevation((1.0f - f12) * g0.L(1.0f));
        setColor(i0.a.f(f12, m(m6.f29378d6), m(m6.Fi)));
        setTextColor(i0.a.f(f12, m(m6.f29619q7), m(m6.Ji)));
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
        h6 h6Var = this.f55668n0;
        if (h6Var != null) {
            return h6Var.k(i7);
        }
        return m6.x0(null, i7, false);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        te.a aVar = this.m0;
        if (aVar != null && this.f55669o0) {
            try {
                float f10 = aVar.f57696e;
                int f11 = i0.a.f(f10, m(m6.f29378d6), m(m6.Fi));
                Drawable background = getBackground();
                if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f11) {
                    ((ShapeDrawable) background).getPaint().setColor(f11);
                    background.invalidateSelf();
                }
                setTextColor(i0.a.f(f10, m(m6.f29619q7), m(m6.Ji)));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
