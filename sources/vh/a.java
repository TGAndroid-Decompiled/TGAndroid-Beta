package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import li.e3;
import org.telegram.ui.Components.go;
public final class a implements View.OnClickListener {
    public final int f50299a;
    public final f f50300b;

    public a(f fVar, int i10) {
        this.f50299a = i10;
        this.f50300b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f50299a;
        f fVar = this.f50300b;
        switch (i10) {
            case 0:
                e3 e3Var = fVar.f50320k0;
                if (e3Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.f50319j0.keySet());
                    go goVar = (go) e3Var.f17210b;
                    ArrayList arrayList2 = goVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = goVar.L0;
                    if (i11 >= 0) {
                        goVar.f28645r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                e3 e3Var2 = fVar.f50320k0;
                if (e3Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f50319j0.keySet());
                    go goVar2 = (go) e3Var2.f17210b;
                    ArrayList arrayList4 = goVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = goVar2.L0;
                    if (i12 >= 0) {
                        goVar2.f28645r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f50319j0;
                hashMap.clear();
                fVar.f50317h0.b();
                fVar.f50313d0.O(true);
                fVar.f50314e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f50309r0;
                fVar.S(view);
                return;
        }
    }
}
