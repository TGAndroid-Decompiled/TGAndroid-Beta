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
public final class vd1 extends org.telegram.ui.Components.xl0 {
    public final Context f38548c;
    public final xd1 d;

    public vd1(Context context, xd1 xd1Var) {
        this.d = xd1Var;
        this.f38548c = context;
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
        org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) c1Var.f42995a;
        xd1 xd1Var = this.d;
        l5Var.setPattern((TLRPC.TL_wallPaper) xd1Var.U0.get(i10));
        l5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(xd1Var.f39525j1, xd1Var.f39545s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (xd1Var.f39497b == 1) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j3 = xd1Var.f39543s.f18950l;
                int i12 = (int) j3;
                if (i12 != 0 || j3 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (xd1Var.B1 instanceof fj1) {
                i11 = xd1Var.f39503c1;
            }
            if (i11 != 0 && xd1Var.l1 >= 0.0f) {
                ImageReceiver imageReceiver = xd1Var.f39556x0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            l5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        ud1 ud1Var = new ud1(this);
        ?? v9Var = new org.telegram.ui.Components.v9(this.f38548c);
        v9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        v9Var.J = i12;
        v9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        v9Var.U = i11;
        v9Var.T = ud1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(v9Var, null);
        v9Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        v9Var.Q = new Paint(3);
        v9Var.S = DownloadController.getInstance(i12).generateObserverTag();
        v9Var.setOutlineProvider(new ai.k2(7));
        v9Var.setClipToOutline(true);
        return new s4.c1(v9Var);
    }
}
