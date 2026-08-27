package pf;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.v90;

public final class j0 implements MediaDataController.KeywordResultCallback, c2 {

    public final u0 f45835a;

    public j0(u0 u0Var) {
        this.f45835a = u0Var;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        u0 u0Var = this.f45835a;
        u0Var.J = arrayList;
        u0Var.E = null;
        u0Var.f45949w0 = null;
        u0Var.f45950x = null;
        u0Var.f45952y = null;
        u0Var.F = null;
        u0Var.M = null;
        u0Var.I = null;
        u0Var.G = null;
        u0Var.L = null;
        u0Var.l();
        v90 v90Var = u0Var.R;
        ArrayList arrayList2 = u0Var.J;
        v90Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
