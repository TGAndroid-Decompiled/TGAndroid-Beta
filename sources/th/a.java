package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import m2.t;
import org.telegram.ui.Components.lo;
public final class a implements View.OnClickListener {
    public final int f48455a;
    public final f f48456b;

    public a(f fVar, int i10) {
        this.f48455a = i10;
        this.f48456b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f48455a;
        f fVar = this.f48456b;
        switch (i10) {
            case 0:
                t tVar = fVar.f48476k0;
                if (tVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f48475j0.keySet());
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
                t tVar2 = fVar.f48476k0;
                if (tVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f48475j0.keySet());
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
                HashMap hashMap = fVar.f48475j0;
                hashMap.clear();
                fVar.f48473h0.b();
                fVar.f48469d0.N(true);
                fVar.f48470e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.T(view);
                return;
            default:
                int i13 = f.f48465r0;
                fVar.T(view);
                return;
        }
    }
}
