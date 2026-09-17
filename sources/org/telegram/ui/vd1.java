package org.telegram.ui;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class vd1 extends org.telegram.ui.Components.ll0 {
    public final Context f38396c;
    public final xd1 d;

    public vd1(Context context, xd1 xd1Var) {
        this.d = xd1Var;
        this.f38396c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d.U0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) c1Var.f42697a;
        xd1 xd1Var = this.d;
        j5Var.setPattern((TLRPC.TL_wallPaper) xd1Var.U0.get(i10));
        j5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(xd1Var.f39562j1, xd1Var.f39582s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (xd1Var.f39534b == 1) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j3 = xd1Var.f39580s.f18728l;
                int i12 = (int) j3;
                if (i12 != 0 || j3 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (xd1Var.B1 instanceof fj1) {
                i11 = xd1Var.f39540c1;
            }
            if (i11 != 0 && xd1Var.l1 >= 0.0f) {
                ImageReceiver imageReceiver = xd1Var.f39593x0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            j5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        ud1 ud1Var = new ud1(this);
        ?? u9Var = new org.telegram.ui.Components.u9(this.f38396c);
        u9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        u9Var.J = i12;
        u9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        u9Var.U = i11;
        u9Var.T = ud1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(u9Var, null);
        u9Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        u9Var.Q = new Paint(3);
        u9Var.S = DownloadController.getInstance(i12).generateObserverTag();
        u9Var.setOutlineProvider(new ai.k2(7));
        u9Var.setClipToOutline(true);
        return new s4.c1(u9Var);
    }
}
