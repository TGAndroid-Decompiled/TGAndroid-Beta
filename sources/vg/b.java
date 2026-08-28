package vg;

import android.content.Context;
import android.os.Build;
import ff.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
public final class b extends kh.d implements td.b {
    public final td.a f48403d0;
    public final b6 f48404e0;

    public b(Context context, b6 b6Var) {
        super(context, b6Var, true);
        this.f48403d0 = new td.a(0, this, gr.h, 320L, true);
        this.f48404e0 = b6Var;
        e();
        setOutlineProvider(r0.f6255b);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        boolean q10;
        b6 b6Var = this.f48404e0;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = f6.I.q();
        }
        float f12 = this.f48403d0.f47775e;
        setElevation((1.0f - f12) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f12, m(f6.f23001d6), m(f6.Oh)));
        setTextColor(i0.a.d(f12, m(f6.f23230q7), m(f6.Sh)));
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

    public final int m(int i9) {
        b6 b6Var = this.f48404e0;
        if (b6Var != null) {
            return b6Var.N0(i9);
        }
        return f6.w0(null, i9, false);
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
