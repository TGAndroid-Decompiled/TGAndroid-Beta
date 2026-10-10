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
public final class vd1 extends org.telegram.ui.Components.qm0 {
    public final Context f42878c;
    public final xd1 d;

    public vd1(Context context, xd1 xd1Var) {
        this.d = xd1Var;
        this.f42878c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
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
    public final void v(s4.d1 d1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) d1Var.f47702a;
        xd1 xd1Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) xd1Var.U0.get(i10));
        k5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(xd1Var.f44013j1, xd1Var.f44033s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (xd1Var.f43984b == 1) {
                int C0 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Pd);
                long j3 = xd1Var.f44031s.f20666l;
                int i12 = (int) j3;
                if (i12 != 0 || j3 == 0) {
                    i11 = i12 != 0 ? i12 : C0;
                }
            } else if (xd1Var.B1 instanceof ij1) {
                i11 = xd1Var.f43990c1;
            }
            if (i11 != 0 && xd1Var.l1 >= 0.0f) {
                ImageReceiver imageReceiver = xd1Var.f44044x0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            k5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        ud1 ud1Var = new ud1(this);
        ?? y9Var = new org.telegram.ui.Components.y9(this.f42878c);
        y9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        y9Var.J = i12;
        y9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        y9Var.U = i11;
        y9Var.T = ud1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(y9Var, null);
        y9Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        y9Var.Q = new Paint(3);
        y9Var.S = DownloadController.getInstance(i12).generateObserverTag();
        y9Var.setOutlineProvider(new ai.l2(7));
        y9Var.setClipToOutline(true);
        return new s4.d1(y9Var);
    }
}
