package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.tn;
public final class a implements View.OnClickListener {
    public final int f59594a;
    public final g f59595b;

    public a(g gVar, int i7) {
        this.f59594a = i7;
        this.f59595b = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f59594a;
        g gVar = this.f59595b;
        switch (i7) {
            case 0:
                jn jnVar = gVar.f59612g2;
                if (jnVar != null) {
                    ArrayList arrayList = new ArrayList(gVar.f59611f2.keySet());
                    tn tnVar = (tn) jnVar.f36566b;
                    ArrayList arrayList2 = tnVar.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = tnVar.M0;
                    if (i10 >= 0) {
                        tnVar.f39980r.g(i10);
                    }
                }
                gVar.dismiss();
                return;
            case 1:
                jn jnVar2 = gVar.f59612g2;
                if (jnVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.f59611f2.keySet());
                    tn tnVar2 = (tn) jnVar2.f36566b;
                    ArrayList arrayList4 = tnVar2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = tnVar2.M0;
                    if (i11 >= 0) {
                        tnVar2.f39980r.g(i11);
                    }
                }
                gVar.dismiss();
                return;
            case 2:
                HashMap hashMap = gVar.f59611f2;
                hashMap.clear();
                gVar.d2.b();
                gVar.Z1.O(true);
                gVar.f59607a2.c(hashMap.size(), true);
                return;
            case 3:
                gVar.h1(view);
                return;
            default:
                int i12 = g.f59606n2;
                gVar.h1(view);
                return;
        }
    }
}
