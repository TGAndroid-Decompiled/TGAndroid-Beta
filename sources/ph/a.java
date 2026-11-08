package ph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import bg.u0;
import fi.d;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
public final class a extends d implements te.b {
    public final te.a f53634k0;
    public final f6 f53635l0;
    public boolean m0;

    public a(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.f53634k0 = new te.a(0, this, xq.h, 320L, true);
        this.f53635l0 = f6Var;
        f();
        setOutlineProvider(u0.f3381b);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        boolean q10;
        this.m0 = true;
        f6 f6Var = this.f53635l0;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = k6.I.q();
        }
        float f12 = this.f53634k0.f55486e;
        setElevation((1.0f - f12) * g0.L(1.0f));
        setColor(i0.a.f(f12, m(k6.f27852d6), m(k6.Ci)));
        setTextColor(i0.a.f(f12, m(k6.f28093q7), m(k6.Gi)));
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
        f6 f6Var = this.f53635l0;
        if (f6Var != null) {
            return f6Var.h(i7);
        }
        return k6.x0(null, i7, false);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        te.a aVar = this.f53634k0;
        if (aVar != null && this.m0) {
            try {
                float f10 = aVar.f55486e;
                int f11 = i0.a.f(f10, m(k6.f27852d6), m(k6.Ci));
                Drawable background = getBackground();
                if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f11) {
                    ((ShapeDrawable) background).getPaint().setColor(f11);
                    background.invalidateSelf();
                }
                setTextColor(i0.a.f(f10, m(k6.f28093q7), m(k6.Gi)));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
