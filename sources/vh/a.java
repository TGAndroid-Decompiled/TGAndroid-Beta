package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.an;
public final class a implements View.OnClickListener {
    public final int f57508a;
    public final g f57509b;

    public a(g gVar, int i7) {
        this.f57508a = i7;
        this.f57509b = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f57508a;
        g gVar = this.f57509b;
        switch (i7) {
            case 0:
                gf.g gVar2 = gVar.f57525f2;
                if (gVar2 != null) {
                    ArrayList arrayList = new ArrayList(gVar.f57524e2.keySet());
                    an anVar = (an) gVar2.f13891b;
                    ArrayList arrayList2 = anVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = anVar.L0;
                    if (i10 >= 0) {
                        anVar.f31920r.g(i10);
                    }
                }
                gVar.dismiss();
                return;
            case 1:
                gf.g gVar3 = gVar.f57525f2;
                if (gVar3 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.f57524e2.keySet());
                    an anVar2 = (an) gVar3.f13891b;
                    ArrayList arrayList4 = anVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = anVar2.L0;
                    if (i11 >= 0) {
                        anVar2.f31920r.g(i11);
                    }
                }
                gVar.dismiss();
                return;
            case 2:
                HashMap hashMap = gVar.f57524e2;
                hashMap.clear();
                gVar.f57523c2.b();
                gVar.Y1.O(true);
                gVar.Z1.c(hashMap.size(), true);
                return;
            case 3:
                gVar.g1(view);
                return;
            default:
                int i12 = g.f57520m2;
                gVar.g1(view);
                return;
        }
    }
}
