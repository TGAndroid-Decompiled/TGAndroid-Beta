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
public final class tc1 extends org.telegram.ui.Components.mm0 {
    public final Context f43599c;
    public final vc1 d;

    public tc1(Context context, vc1 vc1Var) {
        this.d = vc1Var;
        this.f43599c = context;
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
        org.telegram.ui.Cells.o5 o5Var = (org.telegram.ui.Cells.o5) e1Var.f47773a;
        vc1 vc1Var = this.d;
        o5Var.setPattern((TLRPC.TL_wallPaper) vc1Var.V0.get(i10));
        o5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(vc1Var.f44280k1, vc1Var.f44300t1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (vc1Var.f44249b == 1) {
                int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                long j10 = vc1Var.v.f23224l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : D0;
                }
            } else if (vc1Var.C1 instanceof di1) {
                i11 = vc1Var.f44258d1;
            }
            if (i11 != 0 && vc1Var.f44283m1 >= 0.0f) {
                ImageReceiver imageReceiver = vc1Var.f44312y0.getImageReceiver();
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
        sc1 sc1Var = new sc1(this);
        ?? y9Var = new org.telegram.ui.Components.y9(this.f43599c);
        y9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        y9Var.J = i12;
        y9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        y9Var.U = i11;
        y9Var.T = sc1Var;
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
