package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.bn;
public final class a implements View.OnClickListener {
    public final int f57408a;
    public final g f57409b;

    public a(g gVar, int i7) {
        this.f57408a = i7;
        this.f57409b = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f57408a;
        g gVar = this.f57409b;
        switch (i7) {
            case 0:
                gf.g gVar2 = gVar.f57423c2;
                if (gVar2 != null) {
                    ArrayList arrayList = new ArrayList(gVar.f57422b2.keySet());
                    bn bnVar = (bn) gVar2.f13889b;
                    ArrayList arrayList2 = bnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = bnVar.L0;
                    if (i10 >= 0) {
                        bnVar.f32203r.g(i10);
                    }
                }
                gVar.dismiss();
                return;
            case 1:
                gf.g gVar3 = gVar.f57423c2;
                if (gVar3 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.f57422b2.keySet());
                    bn bnVar2 = (bn) gVar3.f13889b;
                    ArrayList arrayList4 = bnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = bnVar2.L0;
                    if (i11 >= 0) {
                        bnVar2.f32203r.g(i11);
                    }
                }
                gVar.dismiss();
                return;
            case 2:
                HashMap hashMap = gVar.f57422b2;
                hashMap.clear();
                gVar.Z1.b();
                gVar.V1.O(true);
                gVar.W1.c(hashMap.size(), true);
                return;
            case 3:
                gVar.g1(view);
                return;
            default:
                int i12 = g.f57420j2;
                gVar.g1(view);
                return;
        }
    }
}
