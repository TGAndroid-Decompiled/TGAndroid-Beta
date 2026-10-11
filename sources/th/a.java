package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import m2.t;
import org.telegram.ui.Components.lo;
public final class a implements View.OnClickListener {
    public final int f48545a;
    public final f f48546b;

    public a(f fVar, int i10) {
        this.f48545a = i10;
        this.f48546b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f48545a;
        f fVar = this.f48546b;
        switch (i10) {
            case 0:
                t tVar = fVar.f48566k0;
                if (tVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f48565j0.keySet());
                    lo loVar = (lo) tVar.f15997b;
                    ArrayList arrayList2 = loVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = loVar.L0;
                    if (i11 >= 0) {
                        loVar.f28401r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                t tVar2 = fVar.f48566k0;
                if (tVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f48565j0.keySet());
                    lo loVar2 = (lo) tVar2.f15997b;
                    ArrayList arrayList4 = loVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = loVar2.L0;
                    if (i12 >= 0) {
                        loVar2.f28401r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f48565j0;
                hashMap.clear();
                fVar.f48563h0.b();
                fVar.f48559d0.N(true);
                fVar.f48560e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.T(view);
                return;
            default:
                int i13 = f.f48555r0;
                fVar.T(view);
                return;
        }
    }
}
