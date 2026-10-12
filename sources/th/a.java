package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import n4.l;
import org.telegram.ui.Components.no;
public final class a implements View.OnClickListener {
    public final int f48686a;
    public final f f48687b;

    public a(f fVar, int i10) {
        this.f48686a = i10;
        this.f48687b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f48686a;
        f fVar = this.f48687b;
        switch (i10) {
            case 0:
                l lVar = fVar.f48707k0;
                if (lVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f48706j0.keySet());
                    no noVar = (no) lVar.f16325a;
                    ArrayList arrayList2 = noVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = noVar.L0;
                    if (i11 >= 0) {
                        noVar.f28901r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l lVar2 = fVar.f48707k0;
                if (lVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f48706j0.keySet());
                    no noVar2 = (no) lVar2.f16325a;
                    ArrayList arrayList4 = noVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = noVar2.L0;
                    if (i12 >= 0) {
                        noVar2.f28901r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f48706j0;
                hashMap.clear();
                fVar.f48704h0.b();
                fVar.f48700d0.N(true);
                fVar.f48701e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.T(view);
                return;
            default:
                int i13 = f.f48696r0;
                fVar.T(view);
                return;
        }
    }
}
