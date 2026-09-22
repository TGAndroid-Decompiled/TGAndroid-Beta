package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.un;
public final class a implements View.OnClickListener {
    public final int f43568a;
    public final f f43569b;

    public a(f fVar, int i10) {
        this.f43568a = i10;
        this.f43569b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43568a;
        f fVar = this.f43569b;
        switch (i10) {
            case 0:
                l.d dVar = fVar.f43589k0;
                if (dVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f43588j0.keySet());
                    un unVar = (un) dVar.f13912b;
                    ArrayList arrayList2 = unVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = unVar.L0;
                    if (i11 >= 0) {
                        unVar.f28833r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l.d dVar2 = fVar.f43589k0;
                if (dVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f43588j0.keySet());
                    un unVar2 = (un) dVar2.f13912b;
                    ArrayList arrayList4 = unVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = unVar2.L0;
                    if (i12 >= 0) {
                        unVar2.f28833r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f43588j0;
                hashMap.clear();
                fVar.f43586h0.b();
                fVar.f43582d0.N(true);
                fVar.f43583e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f43578r0;
                fVar.S(view);
                return;
        }
    }
}
