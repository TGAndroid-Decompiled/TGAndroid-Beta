package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.xn;
public final class a implements View.OnClickListener {
    public final int f43640a;
    public final f f43641b;

    public a(f fVar, int i10) {
        this.f43640a = i10;
        this.f43641b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43640a;
        f fVar = this.f43641b;
        switch (i10) {
            case 0:
                l.d dVar = fVar.f43661k0;
                if (dVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f43660j0.keySet());
                    xn xnVar = (xn) dVar.f13940a;
                    ArrayList arrayList2 = xnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = xnVar.L0;
                    if (i11 >= 0) {
                        xnVar.f30412r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l.d dVar2 = fVar.f43661k0;
                if (dVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f43660j0.keySet());
                    xn xnVar2 = (xn) dVar2.f13940a;
                    ArrayList arrayList4 = xnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = xnVar2.L0;
                    if (i12 >= 0) {
                        xnVar2.f30412r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f43660j0;
                hashMap.clear();
                fVar.f43658h0.b();
                fVar.f43654d0.N(true);
                fVar.f43655e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f43650r0;
                fVar.S(view);
                return;
        }
    }
}
