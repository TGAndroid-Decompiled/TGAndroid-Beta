package sh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import m.g3;
import org.telegram.ui.Components.zn;
public final class a implements View.OnClickListener {
    public final int f42033a;
    public final f f42034b;

    public a(f fVar, int i10) {
        this.f42033a = i10;
        this.f42034b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f42033a;
        f fVar = this.f42034b;
        switch (i10) {
            case 0:
                g3 g3Var = fVar.f42054k0;
                if (g3Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.f42053j0.keySet());
                    zn znVar = (zn) g3Var.f13018b;
                    ArrayList arrayList2 = znVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = znVar.L0;
                    if (i11 >= 0) {
                        znVar.f29760r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                g3 g3Var2 = fVar.f42054k0;
                if (g3Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f42053j0.keySet());
                    zn znVar2 = (zn) g3Var2.f13018b;
                    ArrayList arrayList4 = znVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = znVar2.L0;
                    if (i12 >= 0) {
                        znVar2.f29760r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f42053j0;
                hashMap.clear();
                fVar.f42051h0.b();
                fVar.f42047d0.N(true);
                fVar.f42048e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f42043r0;
                fVar.S(view);
                return;
        }
    }
}
