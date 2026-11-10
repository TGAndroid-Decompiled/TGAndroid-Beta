package ph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import bg.u0;
import fi.d;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.wq;
public final class a extends d implements te.b {
    public final te.a f53646k0;
    public final h6 f53647l0;
    public boolean m0;

    public a(Context context, h6 h6Var) {
        super(context, h6Var, true);
        this.f53646k0 = new te.a(0, this, wq.h, 320L, true);
        this.f53647l0 = h6Var;
        f();
        setOutlineProvider(u0.f3381b);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        boolean q10;
        this.m0 = true;
        h6 h6Var = this.f53647l0;
        if (h6Var != null) {
            q10 = h6Var.a();
        } else {
            q10 = m6.I.q();
        }
        float f12 = this.f53646k0.f55498e;
        setElevation((1.0f - f12) * g0.L(1.0f));
        setColor(i0.a.f(f12, m(m6.f27890d6), m(m6.Ci)));
        setTextColor(i0.a.f(f12, m(m6.f28131q7), m(m6.Gi)));
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
        h6 h6Var = this.f53647l0;
        if (h6Var != null) {
            return h6Var.h(i7);
        }
        return m6.x0(null, i7, false);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        te.a aVar = this.f53646k0;
        if (aVar != null && this.m0) {
            try {
                float f10 = aVar.f55498e;
                int f11 = i0.a.f(f10, m(m6.f27890d6), m(m6.Ci));
                Drawable background = getBackground();
                if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f11) {
                    ((ShapeDrawable) background).getPaint().setColor(f11);
                    background.invalidateSelf();
                }
                setTextColor(i0.a.f(f10, m(m6.f28131q7), m(m6.Gi)));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
