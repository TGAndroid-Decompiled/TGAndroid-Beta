package zh;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x20;
public final class y5 {
    public final int f49110a;
    public final ru f49111b;
    public final x20 f49112c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.g5 f49113f;
    public final org.telegram.ui.Components.g5 f49114g;

    public y5(View view) {
        ru ruVar = new ru(1, view);
        this.f49110a = UserConfig.selectedAccount;
        this.f49111b = ruVar;
        wr wrVar = wr.h;
        this.f49113f = new org.telegram.ui.Components.g5(ruVar, 350L, wrVar);
        this.f49114g = new org.telegram.ui.Components.g5(ruVar, 350L, wrVar);
        x20 x20Var = new x20();
        this.f49112c = x20Var;
        x20Var.f28913a = true;
        x20Var.f28914b = true;
        b(false);
        x20Var.f28915c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        x20Var.f28915c.setStyle(Paint.Style.STROKE);
        x20Var.f28915c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f49113f.a(this.d, false);
        int a10 = this.f49114g.a(this.e, false);
        x20 x20Var = this.f49112c;
        x20Var.d(a2, a10, 0, 0);
        x20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return x20Var.f28915c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.j6.I.q()), z10);
        } else {
            b(z10);
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.e = i11;
        if (!z10) {
            this.f49113f.a(i10, true);
            this.f49114g.a(i11, true);
        }
        ru ruVar = this.f49111b;
        if (ruVar != null) {
            ruVar.run();
        }
    }
}
