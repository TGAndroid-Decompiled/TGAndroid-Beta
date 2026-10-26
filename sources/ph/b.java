package ph;

import ag.z0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import oe.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
public final class b extends fi.d implements oe.d {
    public final oe.b f46856k0;
    public final u6 f46857l0;
    public boolean m0;

    public b(Context context, u6 u6Var) {
        super(context, u6Var, true);
        this.f46856k0 = new oe.b(0, this, ds.h, 320L, true);
        this.f46857l0 = u6Var;
        f();
        setOutlineProvider(z0.f1401b);
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        boolean q5;
        this.m0 = true;
        u6 u6Var = this.f46857l0;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = y6.I.q();
        }
        float f11 = this.f46856k0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.f(f11, m(y6.f23356d6), m(y6.Oh)));
        setTextColor(i0.a.f(f11, m(y6.f23598q7), m(y6.Sh)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (q5) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
                return;
            }
            setOutlineAmbientShadowColor(1610612736);
            setOutlineSpotShadowColor(1610612736);
        }
    }

    public final int m(int i10) {
        u6 u6Var = this.f46857l0;
        if (u6Var != null) {
            return u6Var.g(i10);
        }
        return y6.x0(null, i10, false);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        oe.b bVar = this.f46856k0;
        if (bVar != null && this.m0) {
            try {
                float f7 = bVar.e;
                int f10 = i0.a.f(f7, m(y6.f23356d6), m(y6.Oh));
                Drawable background = getBackground();
                if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f10) {
                    ((ShapeDrawable) background).getPaint().setColor(f10);
                    background.invalidateSelf();
                }
                setTextColor(i0.a.f(f7, m(y6.f23598q7), m(y6.Sh)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
