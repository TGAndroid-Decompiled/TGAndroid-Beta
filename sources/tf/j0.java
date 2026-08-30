package tf;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.ka0;
public final class j0 implements MediaDataController.KeywordResultCallback, d2 {
    public final u0 f44759a;

    public j0(u0 u0Var) {
        this.f44759a = u0Var;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        boolean z4;
        u0 u0Var = this.f44759a;
        u0Var.K = arrayList;
        u0Var.F = null;
        u0Var.f44866x0 = null;
        u0Var.f44865x = null;
        u0Var.f44867y = null;
        u0Var.G = null;
        u0Var.N = null;
        u0Var.J = null;
        u0Var.H = null;
        u0Var.M = null;
        u0Var.l();
        ka0 ka0Var = u0Var.S;
        ArrayList arrayList2 = u0Var.K;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        ka0Var.a(z4);
    }
}
