package ph;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.uc;
public final class s {
    public final RectF f46032a = new RectF();
    public final d6 f46033b;
    public final d6 f46034c;
    public final d6 d;
    public final d6 f46035e;
    public final f5 f46036f;
    public final f5 f46037g;
    public final d6 h;
    public final d6 f46038i;
    public final uc f46039j;
    public final Paint f46040k;
    public final n6 f46041l;
    public int f46042m;
    public final org.telegram.ui.Cells.z f46043n;
    public final np f46044o;
    public final org.telegram.ui.Components.voip.h f46045p;

    public s(u uVar) {
        jr jrVar = jr.h;
        this.f46033b = new d6(uVar, 0L, 320L, jrVar);
        this.f46034c = new d6(uVar, 0L, 320L, jrVar);
        this.d = new d6(uVar, 0L, 320L, jrVar);
        this.f46035e = new d6(uVar, 0L, 320L, jrVar);
        this.f46036f = new f5(uVar, 320L, jrVar, 0);
        this.f46037g = new f5(uVar, 320L, jrVar, 0);
        this.h = new d6(uVar, 0L, 320L, jrVar);
        this.f46038i = new d6(uVar, 0L, 320L, jrVar);
        this.f46039j = new uc(uVar);
        this.f46040k = new Paint(1);
        n6 n6Var = new n6(true, false, true, false);
        this.f46041l = n6Var;
        org.telegram.ui.Cells.z Y = g6.Y(0, 9, 9);
        this.f46043n = Y;
        np npVar = new np(-1);
        this.f46044o = npVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f46045p = hVar;
        n6Var.f30862b = 17;
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x * 4;
        n6Var.n(true);
        n6Var.setCallback(uVar);
        npVar.setCallback(uVar);
        Y.setCallback(uVar);
        hVar.f33725l = true;
        hVar.f33726m = 2.0f;
    }
}
