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
public final class v71 extends org.telegram.ui.Components.dk0 {
    public final Context f52751c;
    public final x71 d;

    public v71(Context context, x71 x71Var) {
        this.d = x71Var;
        this.f52751c = context;
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
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) f1Var.f59161a;
        x71 x71Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) x71Var.W0.get(i7));
        k5Var.getImageReceiver().f22681p1 = new PorterDuffColorFilter(x71Var.l1, x71Var.f53768u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (x71Var.f53715b == 1) {
                int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ge);
                long j3 = x71Var.f53771w.f29102l;
                int i11 = (int) j3;
                if (i11 != 0 || j3 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (x71Var.D1 instanceof rc1) {
                i10 = x71Var.f53727e1;
            }
            if (i10 != 0 && x71Var.n1 >= 0.0f) {
                ImageReceiver imageReceiver = x71Var.f53780z0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.Z(blendMode);
                return;
            }
            k5Var.getImageReceiver().Z(null);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10 = this.d.J1;
        u71 u71Var = new u71(this);
        ?? q9Var = new org.telegram.ui.Components.q9(this.f52751c);
        q9Var.H = new RectF();
        int i11 = org.telegram.messenger.j10.f24798t0;
        q9Var.K = i11;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        q9Var.V = i10;
        q9Var.U = u71Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(q9Var, null);
        q9Var.I = radialProgress2;
        radialProgress2.r(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        q9Var.R = new Paint(3);
        q9Var.T = org.telegram.messenger.a6.q(i11).k();
        q9Var.setOutlineProvider(new bg.q0(8));
        q9Var.setClipToOutline(true);
        return new v4.f1(q9Var);
    }
}
