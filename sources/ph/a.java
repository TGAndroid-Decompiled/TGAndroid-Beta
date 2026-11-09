package ph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import bg.u0;
import fi.d;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.xq;
public final class a extends d implements te.b {
    public final te.a f53647k0;
    public final g6 f53648l0;
    public boolean m0;

    public a(Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.f53647k0 = new te.a(0, this, xq.h, 320L, true);
        this.f53648l0 = g6Var;
        f();
        setOutlineProvider(u0.f3381b);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        boolean q10;
        this.m0 = true;
        g6 g6Var = this.f53648l0;
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = l6.I.q();
        }
        float f12 = this.f53647k0.f55499e;
        setElevation((1.0f - f12) * g0.L(1.0f));
        setColor(i0.a.f(f12, m(l6.f27865d6), m(l6.Ci)));
        setTextColor(i0.a.f(f12, m(l6.f28106q7), m(l6.Gi)));
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
        g6 g6Var = this.f53648l0;
        if (g6Var != null) {
            return g6Var.h(i7);
        }
        return l6.x0(null, i7, false);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        te.a aVar = this.f53647k0;
        if (aVar != null && this.m0) {
            try {
                float f10 = aVar.f55499e;
                int f11 = i0.a.f(f10, m(l6.f27865d6), m(l6.Ci));
                Drawable background = getBackground();
                if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f11) {
                    ((ShapeDrawable) background).getPaint().setColor(f11);
                    background.invalidateSelf();
                }
                setTextColor(i0.a.f(f10, m(l6.f28106q7), m(l6.Gi)));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
