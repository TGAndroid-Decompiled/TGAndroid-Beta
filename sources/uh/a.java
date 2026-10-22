package uh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.fo;
public final class a implements View.OnClickListener {
    public final int f47832a;
    public final f f47833b;

    public a(f fVar, int i10) {
        this.f47832a = i10;
        this.f47833b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f47832a;
        f fVar = this.f47833b;
        switch (i10) {
            case 0:
                l2.f fVar2 = fVar.f47853k0;
                if (fVar2 != null) {
                    ArrayList arrayList = new ArrayList(fVar.f47852j0.keySet());
                    fo foVar = (fo) fVar2.f15843b;
                    ArrayList arrayList2 = foVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = foVar.L0;
                    if (i11 >= 0) {
                        foVar.f26314r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l2.f fVar3 = fVar.f47853k0;
                if (fVar3 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f47852j0.keySet());
                    fo foVar2 = (fo) fVar3.f15843b;
                    ArrayList arrayList4 = foVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = foVar2.L0;
                    if (i12 >= 0) {
                        foVar2.f26314r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f47852j0;
                hashMap.clear();
                fVar.f47850h0.b();
                fVar.f47846d0.N(true);
                fVar.f47847e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.T(view);
                return;
            default:
                int i13 = f.f47842r0;
                fVar.T(view);
                return;
        }
    }
}
