package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import k2.u;
import org.telegram.ui.Components.un;
public final class a implements View.OnClickListener {
    public final int f43244a;
    public final f f43245b;

    public a(f fVar, int i10) {
        this.f43244a = i10;
        this.f43245b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43244a;
        f fVar = this.f43245b;
        switch (i10) {
            case 0:
                u uVar = fVar.f43265k0;
                if (uVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f43264j0.keySet());
                    un unVar = (un) uVar.f13384b;
                    ArrayList arrayList2 = unVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = unVar.L0;
                    if (i11 >= 0) {
                        unVar.f28458r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                u uVar2 = fVar.f43265k0;
                if (uVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f43264j0.keySet());
                    un unVar2 = (un) uVar2.f13384b;
                    ArrayList arrayList4 = unVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = unVar2.L0;
                    if (i12 >= 0) {
                        unVar2.f28458r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f43264j0;
                hashMap.clear();
                fVar.f43262h0.b();
                fVar.f43258d0.N(true);
                fVar.f43259e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f43254r0;
                fVar.S(view);
                return;
        }
    }
}
