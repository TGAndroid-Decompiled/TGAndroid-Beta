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
    public final Context f41072c;
    public final wd1 d;

    public ud1(Context context, wd1 wd1Var) {
        this.d = wd1Var;
        this.f41072c = context;
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
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) c1Var.f45738a;
        wd1 wd1Var = this.d;
        j5Var.setPattern((TLRPC.TL_wallPaper) wd1Var.U0.get(i10));
        j5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(wd1Var.f41946j1, wd1Var.f41966s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (wd1Var.f41917b == 1) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j3 = wd1Var.f41964s.f20499l;
                int i12 = (int) j3;
                if (i12 != 0 || j3 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (wd1Var.B1 instanceof gj1) {
                i11 = wd1Var.f41923c1;
            }
            if (i11 != 0 && wd1Var.l1 >= 0.0f) {
                ImageReceiver imageReceiver = wd1Var.f41977x0.getImageReceiver();
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
        td1 td1Var = new td1(this);
        ?? x9Var = new org.telegram.ui.Components.x9(this.f41072c);
        x9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        x9Var.J = i12;
        x9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        x9Var.U = i11;
        x9Var.T = td1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(x9Var, null);
        x9Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        x9Var.Q = new Paint(3);
        x9Var.S = DownloadController.getInstance(i12).generateObserverTag();
        x9Var.setOutlineProvider(new bi.z1(7));
        x9Var.setClipToOutline(true);
        return new s4.c1(x9Var);
    }
}
