package uh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.fo;
public final class a implements View.OnClickListener {
    public final int f47869a;
    public final f f47870b;

    public a(f fVar, int i10) {
        this.f47869a = i10;
        this.f47870b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f47869a;
        f fVar = this.f47870b;
        switch (i10) {
            case 0:
                l2.f fVar2 = fVar.f47890k0;
                if (fVar2 != null) {
                    ArrayList arrayList = new ArrayList(fVar.f47889j0.keySet());
                    fo foVar = (fo) fVar2.f15844b;
                    ArrayList arrayList2 = foVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = foVar.L0;
                    if (i11 >= 0) {
                        foVar.f26313r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l2.f fVar3 = fVar.f47890k0;
                if (fVar3 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f47889j0.keySet());
                    fo foVar2 = (fo) fVar3.f15844b;
                    ArrayList arrayList4 = foVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = foVar2.L0;
                    if (i12 >= 0) {
                        foVar2.f26313r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f47889j0;
                hashMap.clear();
                fVar.f47887h0.b();
                fVar.f47883d0.N(true);
                fVar.f47884e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.T(view);
                return;
            default:
                int i13 = f.f47879r0;
                fVar.T(view);
                return;
        }
    }
}
