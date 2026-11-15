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
public final class r71 extends org.telegram.ui.Components.tj0 {
    public final Context f50870c;
    public final t71 d;

    public r71(Context context, t71 t71Var) {
        this.d = t71Var;
        this.f50870c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
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
    public final void t(v4.e1 e1Var, int i7) {
        BlendMode blendMode;
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) e1Var.f58535a;
        t71 t71Var = this.d;
        i5Var.setPattern((TLRPC.TL_wallPaper) t71Var.W0.get(i7));
        i5Var.getImageReceiver().f22290p1 = new PorterDuffColorFilter(t71Var.l1, t71Var.f51465u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (t71Var.f51412b == 1) {
                int E0 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Ge);
                long j3 = t71Var.f51468w.f28611l;
                int i11 = (int) j3;
                if (i11 != 0 || j3 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (t71Var.D1 instanceof oc1) {
                i10 = t71Var.f51424e1;
            }
            if (i10 != 0 && t71Var.n1 >= 0.0f) {
                ImageReceiver imageReceiver = t71Var.f51477z0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.Z(blendMode);
                return;
            }
            i5Var.getImageReceiver().Z(null);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        int i10 = this.d.J1;
        q71 q71Var = new q71(this);
        ?? i9Var = new org.telegram.ui.Components.i9(this.f50870c);
        i9Var.H = new RectF();
        int i11 = org.telegram.messenger.m10.f24934t0;
        i9Var.K = i11;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        i9Var.V = i10;
        i9Var.U = q71Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(i9Var, null);
        i9Var.I = radialProgress2;
        radialProgress2.r(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        i9Var.R = new Paint(3);
        i9Var.T = org.telegram.messenger.z5.q(i11).k();
        i9Var.setOutlineProvider(new bg.p0(8));
        i9Var.setClipToOutline(true);
        return new v4.e1(i9Var);
    }
}
