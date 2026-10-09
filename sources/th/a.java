package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import m2.t;
import org.telegram.ui.Components.lo;
public final class a implements View.OnClickListener {
    public final int f48453a;
    public final f f48454b;

    public a(f fVar, int i10) {
        this.f48453a = i10;
        this.f48454b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f48453a;
        f fVar = this.f48454b;
        switch (i10) {
            case 0:
                t tVar = fVar.f48474k0;
                if (tVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f48473j0.keySet());
                    lo loVar = (lo) tVar.f15972b;
                    ArrayList arrayList2 = loVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = loVar.L0;
                    if (i11 >= 0) {
                        loVar.f28523r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                t tVar2 = fVar.f48474k0;
                if (tVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f48473j0.keySet());
                    lo loVar2 = (lo) tVar2.f15972b;
                    ArrayList arrayList4 = loVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = loVar2.L0;
                    if (i12 >= 0) {
                        loVar2.f28523r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f48473j0;
                hashMap.clear();
                fVar.f48471h0.b();
                fVar.f48467d0.N(true);
                fVar.f48468e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.T(view);
                return;
            default:
                int i13 = f.f48463r0;
                fVar.T(view);
                return;
        }
    }
}
