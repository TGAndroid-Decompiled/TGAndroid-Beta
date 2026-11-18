package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.rn;
public final class a implements View.OnClickListener {
    public final int f59552a;
    public final g f59553b;

    public a(g gVar, int i7) {
        this.f59552a = i7;
        this.f59553b = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f59552a;
        g gVar = this.f59553b;
        switch (i7) {
            case 0:
                hn hnVar = gVar.f59570g2;
                if (hnVar != null) {
                    ArrayList arrayList = new ArrayList(gVar.f59569f2.keySet());
                    rn rnVar = (rn) hnVar.f35933b;
                    ArrayList arrayList2 = rnVar.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = rnVar.M0;
                    if (i10 >= 0) {
                        rnVar.f39239r.g(i10);
                    }
                }
                gVar.dismiss();
                return;
            case 1:
                hn hnVar2 = gVar.f59570g2;
                if (hnVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.f59569f2.keySet());
                    rn rnVar2 = (rn) hnVar2.f35933b;
                    ArrayList arrayList4 = rnVar2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = rnVar2.M0;
                    if (i11 >= 0) {
                        rnVar2.f39239r.g(i11);
                    }
                }
                gVar.dismiss();
                return;
            case 2:
                HashMap hashMap = gVar.f59569f2;
                hashMap.clear();
                gVar.d2.b();
                gVar.Z1.O(true);
                gVar.f59565a2.c(hashMap.size(), true);
                return;
            case 3:
                gVar.h1(view);
                return;
            default:
                int i12 = g.f59564n2;
                gVar.h1(view);
                return;
        }
    }
}
