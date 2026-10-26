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
public final class rc1 extends org.telegram.ui.Components.lm0 {
    public final Context f43116c;
    public final tc1 d;

    public rc1(Context context, tc1 tc1Var) {
        this.d = tc1Var;
        this.f43116c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d.V0;
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
    public final void v(s4.e1 e1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.o5 o5Var = (org.telegram.ui.Cells.o5) e1Var.f47738a;
        tc1 tc1Var = this.d;
        o5Var.setPattern((TLRPC.TL_wallPaper) tc1Var.V0.get(i10));
        o5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(tc1Var.f43770k1, tc1Var.f43790t1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (tc1Var.f43739b == 1) {
                int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                long j10 = tc1Var.v.f23223l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : D0;
                }
            } else if (tc1Var.C1 instanceof bi1) {
                i11 = tc1Var.f43748d1;
            }
            if (i11 != 0 && tc1Var.f43773m1 >= 0.0f) {
                ImageReceiver imageReceiver = tc1Var.f43802y0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            o5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.I1;
        qc1 qc1Var = new qc1(this);
        ?? y9Var = new org.telegram.ui.Components.y9(this.f43116c);
        y9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        y9Var.J = i12;
        y9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        y9Var.U = i11;
        y9Var.T = qc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(y9Var, null);
        y9Var.H = radialProgress2;
        radialProgress2.r(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        y9Var.Q = new Paint(3);
        y9Var.S = DownloadController.getInstance(i12).generateObserverTag();
        y9Var.setOutlineProvider(new ag.v0(9));
        y9Var.setClipToOutline(true);
        return new s4.e1(y9Var);
    }
}
