package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.wn;
public final class a implements View.OnClickListener {
    public final int f43531a;
    public final f f43532b;

    public a(f fVar, int i10) {
        this.f43531a = i10;
        this.f43532b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43531a;
        f fVar = this.f43532b;
        switch (i10) {
            case 0:
                l.d dVar = fVar.f43552k0;
                if (dVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f43551j0.keySet());
                    wn wnVar = (wn) dVar.f13924a;
                    ArrayList arrayList2 = wnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = wnVar.L0;
                    if (i11 >= 0) {
                        wnVar.f30135r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l.d dVar2 = fVar.f43552k0;
                if (dVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f43551j0.keySet());
                    wn wnVar2 = (wn) dVar2.f13924a;
                    ArrayList arrayList4 = wnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = wnVar2.L0;
                    if (i12 >= 0) {
                        wnVar2.f30135r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f43551j0;
                hashMap.clear();
                fVar.f43549h0.b();
                fVar.f43545d0.N(true);
                fVar.f43546e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f43541r0;
                fVar.S(view);
                return;
        }
    }
}
