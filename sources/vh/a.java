package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.tn;
public final class a implements View.OnClickListener {
    public final int f59559a;
    public final g f59560b;

    public a(g gVar, int i7) {
        this.f59559a = i7;
        this.f59560b = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f59559a;
        g gVar = this.f59560b;
        switch (i7) {
            case 0:
                jn jnVar = gVar.f59577g2;
                if (jnVar != null) {
                    ArrayList arrayList = new ArrayList(gVar.f59576f2.keySet());
                    tn tnVar = (tn) jnVar.f36522b;
                    ArrayList arrayList2 = tnVar.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = tnVar.M0;
                    if (i10 >= 0) {
                        tnVar.f39959r.g(i10);
                    }
                }
                gVar.dismiss();
                return;
            case 1:
                jn jnVar2 = gVar.f59577g2;
                if (jnVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.f59576f2.keySet());
                    tn tnVar2 = (tn) jnVar2.f36522b;
                    ArrayList arrayList4 = tnVar2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = tnVar2.M0;
                    if (i11 >= 0) {
                        tnVar2.f39959r.g(i11);
                    }
                }
                gVar.dismiss();
                return;
            case 2:
                HashMap hashMap = gVar.f59576f2;
                hashMap.clear();
                gVar.d2.b();
                gVar.Z1.O(true);
                gVar.f59572a2.c(hashMap.size(), true);
                return;
            case 3:
                gVar.h1(view);
                return;
            default:
                int i12 = g.f59571n2;
                gVar.h1(view);
                return;
        }
    }
}
