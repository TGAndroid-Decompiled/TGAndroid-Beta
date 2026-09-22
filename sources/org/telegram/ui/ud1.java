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
public final class ud1 extends org.telegram.ui.Components.kl0 {
    public final Context f37956c;
    public final wd1 d;

    public ud1(Context context, wd1 wd1Var) {
        this.d = wd1Var;
        this.f37956c = context;
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
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) c1Var.f42671a;
        wd1 wd1Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) wd1Var.U0.get(i10));
        k5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(wd1Var.f38817j1, wd1Var.f38837s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (wd1Var.f38789b == 1) {
                int B0 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Pd);
                long j3 = wd1Var.f38835s.f18698l;
                int i12 = (int) j3;
                if (i12 != 0 || j3 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (wd1Var.B1 instanceof gj1) {
                i11 = wd1Var.f38795c1;
            }
            if (i11 != 0 && wd1Var.l1 >= 0.0f) {
                ImageReceiver imageReceiver = wd1Var.f38848x0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            k5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        td1 td1Var = new td1(this);
        ?? u9Var = new org.telegram.ui.Components.u9(this.f37956c);
        u9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        u9Var.J = i12;
        u9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        u9Var.U = i11;
        u9Var.T = td1Var;
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
