package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.jn;
public final class a implements View.OnClickListener {
    public final int f58984a;
    public final h f58985b;

    public a(h hVar, int i7) {
        this.f58984a = i7;
        this.f58985b = hVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f58984a;
        h hVar = this.f58985b;
        switch (i7) {
            case 0:
                ou ouVar = hVar.f59004g2;
                if (ouVar != null) {
                    ArrayList arrayList = new ArrayList(hVar.f59003f2.keySet());
                    jn jnVar = (jn) ouVar.f25804b;
                    ArrayList arrayList2 = jnVar.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = jnVar.M0;
                    if (i10 >= 0) {
                        jnVar.f36104r.g(i10);
                    }
                }
                hVar.dismiss();
                return;
            case 1:
                ou ouVar2 = hVar.f59004g2;
                if (ouVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(hVar.f59003f2.keySet());
                    jn jnVar2 = (jn) ouVar2.f25804b;
                    ArrayList arrayList4 = jnVar2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = jnVar2.M0;
                    if (i11 >= 0) {
                        jnVar2.f36104r.g(i11);
                    }
                }
                hVar.dismiss();
                return;
            case 2:
                HashMap hashMap = hVar.f59003f2;
                hashMap.clear();
                hVar.d2.b();
                hVar.Z1.O(true);
                hVar.f58999a2.c(hashMap.size(), true);
                return;
            case 3:
                hVar.g1(view);
                return;
            default:
                int i12 = h.f58998n2;
                hVar.g1(view);
                return;
        }
    }
}
