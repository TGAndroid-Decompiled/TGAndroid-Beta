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
public final class t71 extends org.telegram.ui.Components.oj0 {
    public final Context f49965c;
    public final v71 d;

    public t71(Context context, v71 v71Var) {
        this.d = v71Var;
        this.f49965c = context;
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
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) d1Var.f57044a;
        v71 v71Var = this.d;
        i5Var.setPattern((TLRPC.TL_wallPaper) v71Var.V0.get(i7));
        i5Var.getImageReceiver().f21209o1 = new PorterDuffColorFilter(v71Var.f50555k1, v71Var.f50574t1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (v71Var.f50524b == 1) {
                int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                long j3 = v71Var.f50579w.f27528l;
                int i11 = (int) j3;
                if (i11 != 0 || j3 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (v71Var.C1 instanceof pc1) {
                i10 = v71Var.f50533d1;
            }
            if (i10 != 0 && v71Var.f50558m1 >= 0.0f) {
                ImageReceiver imageReceiver = v71Var.f50586y0.getImageReceiver();
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
        s71 s71Var = new s71(this);
        ?? l9Var = new org.telegram.ui.Components.l9(this.f49965c);
        l9Var.G = new RectF();
        int i11 = org.telegram.messenger.p10.f24470s0;
        l9Var.J = i11;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        l9Var.U = i10;
        l9Var.T = s71Var;
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
