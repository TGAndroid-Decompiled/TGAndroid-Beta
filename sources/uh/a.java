package uh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import ji.u4;
import org.telegram.ui.Components.tn;
public final class a implements View.OnClickListener {
    public final int f47264a;
    public final f f47265b;

    public a(f fVar, int i10) {
        this.f47264a = i10;
        this.f47265b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f47264a;
        f fVar = this.f47265b;
        switch (i10) {
            case 0:
                u4 u4Var = fVar.f47285k0;
                if (u4Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.f47284j0.keySet());
                    tn tnVar = (tn) u4Var.f14247b;
                    ArrayList arrayList2 = tnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = tnVar.L0;
                    if (i11 >= 0) {
                        tnVar.f30679r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                u4 u4Var2 = fVar.f47285k0;
                if (u4Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f47284j0.keySet());
                    tn tnVar2 = (tn) u4Var2.f14247b;
                    ArrayList arrayList4 = tnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = tnVar2.L0;
                    if (i12 >= 0) {
                        tnVar2.f30679r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f47284j0;
                hashMap.clear();
                fVar.f47282h0.b();
                fVar.f47278d0.N(true);
                fVar.f47279e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f47274r0;
                fVar.S(view);
                return;
        }
    }
}
