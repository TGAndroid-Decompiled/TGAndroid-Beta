package sh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.z5;
public final class s {
    public final RectF f47657a = new RectF();
    public final z5 f47658b;
    public final z5 f47659c;
    public final z5 d;
    public final z5 f47660e;
    public final c5 f47661f;
    public final c5 f47662g;
    public final z5 h;
    public final z5 f47663i;
    public final rc f47664j;
    public final Paint f47665k;
    public final j6 f47666l;
    public int f47667m;
    public final org.telegram.ui.Cells.z f47668n;
    public final tp f47669o;
    public final org.telegram.ui.Components.voip.h f47670p;

    public s(u uVar) {
        pr prVar = pr.h;
        this.f47658b = new z5(uVar, 0L, 320L, prVar);
        this.f47659c = new z5(uVar, 0L, 320L, prVar);
        this.d = new z5(uVar, 0L, 320L, prVar);
        this.f47660e = new z5(uVar, 0L, 320L, prVar);
        this.f47661f = new c5(uVar, 320L, prVar, 0);
        this.f47662g = new c5(uVar, 320L, prVar, 0);
        this.h = new z5(uVar, 0L, 320L, prVar);
        this.f47663i = new z5(uVar, 0L, 320L, prVar);
        this.f47664j = new rc(uVar);
        this.f47665k = new Paint(1);
        j6 j6Var = new j6(true, false, true, false);
        this.f47666l = j6Var;
        org.telegram.ui.Cells.z Y = k6.Y(0, 9, 9);
        this.f47668n = Y;
        tp tpVar = new tp(-1);
        this.f47669o = tpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f47670p = hVar;
        j6Var.f28029b = 17;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x * 4;
        j6Var.n(true);
        j6Var.setCallback(uVar);
        tpVar.setCallback(uVar);
        Y.setCallback(uVar);
        hVar.f32060l = true;
        hVar.f32061m = 2.0f;
    }
}
