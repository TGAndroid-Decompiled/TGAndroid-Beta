package zh;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.nx;
public final class i extends ng.b {
    public final boolean d;
    public final nx e;

    public i(nx nxVar, boolean z10) {
        this.e = nxVar;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z10 = this.d;
        nx nxVar = this.e;
        if (z10) {
            arrayList = nxVar.f48628y;
        } else {
            arrayList = nxVar.f48626x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        k kVar = (k) c1Var.f41610a;
        kVar.f48565b = i10;
        boolean z10 = this.d;
        nx nxVar = this.e;
        if (z10) {
            kVar.setDialogId(((j) nxVar.f48628y.get(i10)).f48525c);
        } else {
            kVar.setDialogId(((j) nxVar.f48626x.get(i10)).f48525c);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        k kVar = new k(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        kVar.N = z10;
        if (z10) {
            kVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new s4.c1(kVar);
    }
}
