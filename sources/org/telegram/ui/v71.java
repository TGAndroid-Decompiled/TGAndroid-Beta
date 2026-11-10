package org.telegram.ui;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class v71 extends org.telegram.ui.Components.oj0 {
    public final Context f50651c;
    public final x71 d;

    public v71(Context context, x71 x71Var) {
        this.d = x71Var;
        this.f50651c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d.V0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final int d(int i7) {
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        BlendMode blendMode;
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) d1Var.f57052a;
        x71 x71Var = this.d;
        i5Var.setPattern((TLRPC.TL_wallPaper) x71Var.V0.get(i7));
        i5Var.getImageReceiver().f21214o1 = new PorterDuffColorFilter(x71Var.f51596k1, x71Var.f51615t1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (x71Var.f51565b == 1) {
                int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.De);
                long j3 = x71Var.f51620w.f27618l;
                int i11 = (int) j3;
                if (i11 != 0 || j3 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (x71Var.C1 instanceof tc1) {
                i10 = x71Var.f51574d1;
            }
            if (i10 != 0 && x71Var.f51599m1 >= 0.0f) {
                ImageReceiver imageReceiver = x71Var.f51627y0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.Z(blendMode);
                return;
            }
            i5Var.getImageReceiver().Z(null);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10 = this.d.I1;
        u71 u71Var = new u71(this);
        ?? k9Var = new org.telegram.ui.Components.k9(this.f50651c);
        k9Var.G = new RectF();
        int i11 = org.telegram.messenger.p10.f24474s0;
        k9Var.J = i11;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        k9Var.U = i10;
        k9Var.T = u71Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(k9Var, null);
        k9Var.H = radialProgress2;
        radialProgress2.r(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        k9Var.Q = new Paint(3);
        k9Var.S = org.telegram.messenger.z5.q(i11).k();
        k9Var.setOutlineProvider(new bg.q0(8));
        k9Var.setClipToOutline(true);
        return new v4.d1(k9Var);
    }
}
