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
    public final RectF f47693a = new RectF();
    public final z5 f47694b;
    public final z5 f47695c;
    public final z5 d;
    public final z5 f47696e;
    public final c5 f47697f;
    public final c5 f47698g;
    public final z5 h;
    public final z5 f47699i;
    public final rc f47700j;
    public final Paint f47701k;
    public final j6 f47702l;
    public int f47703m;
    public final org.telegram.ui.Cells.z f47704n;
    public final tp f47705o;
    public final org.telegram.ui.Components.voip.h f47706p;

    public s(u uVar) {
        pr prVar = pr.h;
        this.f47694b = new z5(uVar, 0L, 320L, prVar);
        this.f47695c = new z5(uVar, 0L, 320L, prVar);
        this.d = new z5(uVar, 0L, 320L, prVar);
        this.f47696e = new z5(uVar, 0L, 320L, prVar);
        this.f47697f = new c5(uVar, 320L, prVar, 0);
        this.f47698g = new c5(uVar, 320L, prVar, 0);
        this.h = new z5(uVar, 0L, 320L, prVar);
        this.f47699i = new z5(uVar, 0L, 320L, prVar);
        this.f47700j = new rc(uVar);
        this.f47701k = new Paint(1);
        j6 j6Var = new j6(true, false, true, false);
        this.f47702l = j6Var;
        org.telegram.ui.Cells.z Y = k6.Y(0, 9, 9);
        this.f47704n = Y;
        tp tpVar = new tp(-1);
        this.f47705o = tpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f47706p = hVar;
        j6Var.f27999b = 17;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x * 4;
        j6Var.n(true);
        j6Var.setCallback(uVar);
        tpVar.setCallback(uVar);
        Y.setCallback(uVar);
        hVar.f32065l = true;
        hVar.f32066m = 2.0f;
    }
}
