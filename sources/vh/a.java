package vh;

import android.view.View;
import j6.r;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.qn;
public final class a implements View.OnClickListener {
    public final int f59679a;
    public final g f59680b;

    public a(g gVar, int i7) {
        this.f59679a = i7;
        this.f59680b = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f59679a;
        g gVar = this.f59680b;
        switch (i7) {
            case 0:
                r rVar = gVar.f59697g2;
                if (rVar != null) {
                    ArrayList arrayList = new ArrayList(gVar.f59696f2.keySet());
                    qn qnVar = (qn) rVar.f17372b;
                    ArrayList arrayList2 = qnVar.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = qnVar.M0;
                    if (i10 >= 0) {
                        qnVar.f38941r.g(i10);
                    }
                }
                gVar.dismiss();
                return;
            case 1:
                r rVar2 = gVar.f59697g2;
                if (rVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.f59696f2.keySet());
                    qn qnVar2 = (qn) rVar2.f17372b;
                    ArrayList arrayList4 = qnVar2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = qnVar2.M0;
                    if (i11 >= 0) {
                        qnVar2.f38941r.g(i11);
                    }
                }
                gVar.dismiss();
                return;
            case 2:
                HashMap hashMap = gVar.f59696f2;
                hashMap.clear();
                gVar.d2.b();
                gVar.Z1.O(true);
                gVar.f59692a2.c(hashMap.size(), true);
                return;
            case 3:
                gVar.h1(view);
                return;
            default:
                int i12 = g.f59691n2;
                gVar.h1(view);
                return;
        }
    }
}
