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
public final class t71 extends org.telegram.ui.Components.dk0 {
    public final Context f52288c;
    public final v71 d;

    public t71(Context context, v71 v71Var) {
        this.d = v71Var;
        this.f52288c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d.W0;
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
    public final void t(v4.f1 f1Var, int i7) {
        BlendMode blendMode;
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) f1Var.f59245a;
        v71 v71Var = this.d;
        j5Var.setPattern((TLRPC.TL_wallPaper) v71Var.W0.get(i7));
        j5Var.getImageReceiver().f22751p1 = new PorterDuffColorFilter(v71Var.l1, v71Var.f52902u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (v71Var.f52849b == 1) {
                int E0 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ge);
                long j3 = v71Var.f52905w.f29233l;
                int i11 = (int) j3;
                if (i11 != 0 || j3 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (v71Var.D1 instanceof pc1) {
                i10 = v71Var.f52861e1;
            }
            if (i10 != 0 && v71Var.n1 >= 0.0f) {
                ImageReceiver imageReceiver = v71Var.f52914z0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.a0(blendMode);
                return;
            }
            j5Var.getImageReceiver().a0(null);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10 = this.d.J1;
        s71 s71Var = new s71(this);
        ?? p9Var = new org.telegram.ui.Components.p9(this.f52288c);
        p9Var.H = new RectF();
        int i11 = org.telegram.messenger.i10.f24637t0;
        p9Var.K = i11;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        p9Var.V = i10;
        p9Var.U = s71Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(p9Var, null);
        p9Var.I = radialProgress2;
        radialProgress2.r(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        p9Var.R = new Paint(3);
        p9Var.T = org.telegram.messenger.a6.q(i11).k();
        p9Var.setOutlineProvider(new bg.q0(8));
        p9Var.setClipToOutline(true);
        return new v4.f1(p9Var);
    }
}
