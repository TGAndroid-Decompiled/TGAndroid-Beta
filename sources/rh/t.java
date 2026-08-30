package rh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.z5;
public final class t {
    public final RectF f43749a = new RectF();
    public final z5 f43750b;
    public final z5 f43751c;
    public final z5 d;
    public final z5 e;
    public final c5 f43752f;
    public final c5 f43753g;
    public final z5 h;
    public final z5 f43754i;
    public final rc f43755j;
    public final Paint f43756k;
    public final j6 f43757l;
    public int f43758m;
    public final org.telegram.ui.Cells.z f43759n;
    public final rp f43760o;
    public final org.telegram.ui.Components.voip.h f43761p;

    public t(v vVar) {
        nr nrVar = nr.h;
        this.f43750b = new z5(vVar, 0L, 320L, nrVar);
        this.f43751c = new z5(vVar, 0L, 320L, nrVar);
        this.d = new z5(vVar, 0L, 320L, nrVar);
        this.e = new z5(vVar, 0L, 320L, nrVar);
        this.f43752f = new c5(vVar, 320L, nrVar, 0);
        this.f43753g = new c5(vVar, 320L, nrVar, 0);
        this.h = new z5(vVar, 0L, 320L, nrVar);
        this.f43754i = new z5(vVar, 0L, 320L, nrVar);
        this.f43755j = new rc(vVar);
        this.f43756k = new Paint(1);
        j6 j6Var = new j6(true, false, true, false);
        this.f43757l = j6Var;
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.j6.Y(0, 9, 9);
        this.f43759n = Y;
        rp rpVar = new rp(-1);
        this.f43760o = rpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f43761p = hVar;
        j6Var.f25884b = 17;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x * 4;
        j6Var.n(true);
        j6Var.setCallback(vVar);
        rpVar.setCallback(vVar);
        Y.setCallback(vVar);
        hVar.f29661l = true;
        hVar.f29662m = 2.0f;
    }
}
