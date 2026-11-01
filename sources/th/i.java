package th;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.tw;
public final class i extends hg.c {
    public final boolean d;
    public final tw e;

    public i(tw twVar, boolean z10) {
        this.e = twVar;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z10 = this.d;
        tw twVar = this.e;
        if (z10) {
            arrayList = twVar.D;
        } else {
            arrayList = twVar.f49241y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        l lVar = (l) c1Var.f47909a;
        lVar.f49165b = i10;
        boolean z10 = this.d;
        tw twVar = this.e;
        if (z10) {
            lVar.setDialogId(((j) twVar.D.get(i10)).f49092c);
        } else {
            lVar.setDialogId(((j) twVar.f49241y.get(i10)).f49092c);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        l lVar = new l(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        lVar.N = z10;
        if (z10) {
            lVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new s4.c1(lVar);
    }
}
