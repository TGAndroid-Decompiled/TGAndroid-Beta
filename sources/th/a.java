package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.vn;
public final class a implements View.OnClickListener {
    public final int f43518a;
    public final f f43519b;

    public a(f fVar, int i10) {
        this.f43518a = i10;
        this.f43519b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43518a;
        f fVar = this.f43519b;
        switch (i10) {
            case 0:
                l.d dVar = fVar.f43539k0;
                if (dVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f43538j0.keySet());
                    vn vnVar = (vn) dVar.f13909a;
                    ArrayList arrayList2 = vnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = vnVar.L0;
                    if (i11 >= 0) {
                        vnVar.f29203r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l.d dVar2 = fVar.f43539k0;
                if (dVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f43538j0.keySet());
                    vn vnVar2 = (vn) dVar2.f13909a;
                    ArrayList arrayList4 = vnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = vnVar2.L0;
                    if (i12 >= 0) {
                        vnVar2.f29203r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f43538j0;
                hashMap.clear();
                fVar.f43536h0.b();
                fVar.f43532d0.N(true);
                fVar.f43533e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f43528r0;
                fVar.S(view);
                return;
        }
    }
}
