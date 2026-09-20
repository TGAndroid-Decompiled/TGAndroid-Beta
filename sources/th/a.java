package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.un;
public final class a implements View.OnClickListener {
    public final int f43547a;
    public final f f43548b;

    public a(f fVar, int i10) {
        this.f43547a = i10;
        this.f43548b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43547a;
        f fVar = this.f43548b;
        switch (i10) {
            case 0:
                l.d dVar = fVar.f43568k0;
                if (dVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f43567j0.keySet());
                    un unVar = (un) dVar.f13898a;
                    ArrayList arrayList2 = unVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = unVar.L0;
                    if (i11 >= 0) {
                        unVar.f28762r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l.d dVar2 = fVar.f43568k0;
                if (dVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f43567j0.keySet());
                    un unVar2 = (un) dVar2.f13898a;
                    ArrayList arrayList4 = unVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = unVar2.L0;
                    if (i12 >= 0) {
                        unVar2.f28762r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f43567j0;
                hashMap.clear();
                fVar.f43565h0.b();
                fVar.f43561d0.N(true);
                fVar.f43562e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f43557r0;
                fVar.S(view);
                return;
        }
    }
}
