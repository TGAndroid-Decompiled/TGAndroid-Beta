package uf;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.ma0;
public final class j0 implements MediaDataController.KeywordResultCallback, d2 {
    public final u0 f48607a;

    public j0(u0 u0Var) {
        this.f48607a = u0Var;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        boolean z4;
        u0 u0Var = this.f48607a;
        u0Var.K = arrayList;
        u0Var.F = null;
        u0Var.f48723x0 = null;
        u0Var.f48722x = null;
        u0Var.f48724y = null;
        u0Var.G = null;
        u0Var.N = null;
        u0Var.J = null;
        u0Var.H = null;
        u0Var.M = null;
        u0Var.l();
        ma0 ma0Var = u0Var.S;
        ArrayList arrayList2 = u0Var.K;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        ma0Var.a(z4);
    }
}
