package wh;

import android.view.View;
import gi.v5;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.an;
public final class a implements View.OnClickListener {
    public final int f57755a;
    public final h f57756b;

    public a(h hVar, int i3) {
        this.f57755a = i3;
        this.f57756b = hVar;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f57755a;
        h hVar = this.f57756b;
        switch (i3) {
            case 0:
                v5 v5Var = hVar.f57772d2;
                if (v5Var != null) {
                    ArrayList arrayList = new ArrayList(hVar.c2.keySet());
                    an anVar = (an) v5Var.f13688b;
                    ArrayList arrayList2 = anVar.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = anVar.M0;
                    if (i10 >= 0) {
                        anVar.f31936r.g(i10);
                    }
                }
                hVar.dismiss();
                return;
            case 1:
                v5 v5Var2 = hVar.f57772d2;
                if (v5Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(hVar.c2.keySet());
                    an anVar2 = (an) v5Var2.f13688b;
                    ArrayList arrayList4 = anVar2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = anVar2.M0;
                    if (i11 >= 0) {
                        anVar2.f31936r.g(i11);
                    }
                }
                hVar.dismiss();
                return;
            case 2:
                HashMap hashMap = hVar.c2;
                hashMap.clear();
                hVar.f57770a2.b();
                hVar.W1.O(true);
                hVar.X1.c(hashMap.size(), true);
                return;
            case 3:
                hVar.g1(view);
                return;
            default:
                int i12 = h.f57769k2;
                hVar.g1(view);
                return;
        }
    }
}
