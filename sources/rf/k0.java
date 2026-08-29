package rf;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.fa0;
public final class k0 implements MediaDataController.KeywordResultCallback, c2 {
    public final v0 f47276a;

    public k0(v0 v0Var) {
        this.f47276a = v0Var;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        boolean z10;
        v0 v0Var = this.f47276a;
        v0Var.J = arrayList;
        v0Var.E = null;
        v0Var.f47390w0 = null;
        v0Var.f47391x = null;
        v0Var.f47393y = null;
        v0Var.F = null;
        v0Var.M = null;
        v0Var.I = null;
        v0Var.G = null;
        v0Var.L = null;
        v0Var.l();
        fa0 fa0Var = v0Var.R;
        ArrayList arrayList2 = v0Var.J;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        fa0Var.a(z10);
    }
}
