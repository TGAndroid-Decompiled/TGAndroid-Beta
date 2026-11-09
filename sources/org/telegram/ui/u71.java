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
public final class u71 extends org.telegram.ui.Components.pj0 {
    public final Context f50316c;
    public final w71 d;

    public u71(Context context, w71 w71Var) {
        this.d = w71Var;
        this.f50316c = context;
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
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) d1Var.f57056a;
        w71 w71Var = this.d;
        i5Var.setPattern((TLRPC.TL_wallPaper) w71Var.V0.get(i7));
        i5Var.getImageReceiver().f21209o1 = new PorterDuffColorFilter(w71Var.f50937k1, w71Var.f50956t1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (w71Var.f50906b == 1) {
                int E0 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.De);
                long j3 = w71Var.f50961w.f27580l;
                int i11 = (int) j3;
                if (i11 != 0 || j3 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (w71Var.C1 instanceof sc1) {
                i10 = w71Var.f50915d1;
            }
            if (i10 != 0 && w71Var.f50940m1 >= 0.0f) {
                ImageReceiver imageReceiver = w71Var.f50968y0.getImageReceiver();
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
        t71 t71Var = new t71(this);
        ?? l9Var = new org.telegram.ui.Components.l9(this.f50316c);
        l9Var.G = new RectF();
        int i11 = org.telegram.messenger.p10.f24470s0;
        l9Var.J = i11;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        l9Var.U = i10;
        l9Var.T = t71Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(l9Var, null);
        l9Var.H = radialProgress2;
        radialProgress2.r(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        l9Var.Q = new Paint(3);
        l9Var.S = org.telegram.messenger.z5.q(i11).k();
        l9Var.setOutlineProvider(new bg.q0(8));
        l9Var.setClipToOutline(true);
        return new v4.d1(l9Var);
    }
}
