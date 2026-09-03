package rh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.z5;
public final class s {
    public final RectF f43801a = new RectF();
    public final z5 f43802b;
    public final z5 f43803c;
    public final z5 d;
    public final z5 e;
    public final c5 f43804f;
    public final c5 f43805g;
    public final z5 h;
    public final z5 f43806i;
    public final rc f43807j;
    public final Paint f43808k;
    public final j6 f43809l;
    public int f43810m;
    public final org.telegram.ui.Cells.z f43811n;
    public final qp f43812o;
    public final org.telegram.ui.Components.voip.h f43813p;

    public s(u uVar) {
        mr mrVar = mr.h;
        this.f43802b = new z5(uVar, 0L, 320L, mrVar);
        this.f43803c = new z5(uVar, 0L, 320L, mrVar);
        this.d = new z5(uVar, 0L, 320L, mrVar);
        this.e = new z5(uVar, 0L, 320L, mrVar);
        this.f43804f = new c5(uVar, 320L, mrVar, 0);
        this.f43805g = new c5(uVar, 320L, mrVar, 0);
        this.h = new z5(uVar, 0L, 320L, mrVar);
        this.f43806i = new z5(uVar, 0L, 320L, mrVar);
        this.f43807j = new rc(uVar);
        this.f43808k = new Paint(1);
        j6 j6Var = new j6(true, false, true, false);
        this.f43809l = j6Var;
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.j6.Y(0, 9, 9);
        this.f43811n = Y;
        qp qpVar = new qp(-1);
        this.f43812o = qpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f43813p = hVar;
        j6Var.f25847b = 17;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x * 4;
        j6Var.n(true);
        j6Var.setCallback(uVar);
        qpVar.setCallback(uVar);
        Y.setCallback(uVar);
        hVar.f29633l = true;
        hVar.f29634m = 2.0f;
    }
}
