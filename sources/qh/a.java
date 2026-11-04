package qh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import cg.t0;
import gi.d;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
public final class a extends d implements qe.b {
    public final qe.a f53941l0;
    public final e6 m0;
    public boolean f53942n0;

    public a(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.f53941l0 = new qe.a(0, this, xq.h, 320L, true);
        this.m0 = e6Var;
        f();
        setOutlineProvider(t0.f4746b);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        boolean q10;
        this.f53942n0 = true;
        e6 e6Var = this.m0;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = k6.I.q();
        }
        float f12 = this.f53941l0.f53840e;
        setElevation((1.0f - f12) * g0.L(1.0f));
        setColor(i0.a.f(f12, m(k6.f27878d6), m(k6.Ci)));
        setTextColor(i0.a.f(f12, m(k6.f28122q7), m(k6.Gi)));
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

    public final int m(int i3) {
        e6 e6Var = this.m0;
        if (e6Var != null) {
            return e6Var.h(i3);
        }
        return k6.x0(null, i3, false);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        qe.a aVar = this.f53941l0;
        if (aVar != null && this.f53942n0) {
            try {
                float f10 = aVar.f53840e;
                int f11 = i0.a.f(f10, m(k6.f27878d6), m(k6.Ci));
                Drawable background = getBackground();
                if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f11) {
                    ((ShapeDrawable) background).getPaint().setColor(f11);
                    background.invalidateSelf();
                }
                setTextColor(i0.a.f(f10, m(k6.f28122q7), m(k6.Gi)));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
