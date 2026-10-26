package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import li.e3;
import org.telegram.ui.Components.go;
public final class a implements View.OnClickListener {
    public final int f50302a;
    public final f f50303b;

    public a(f fVar, int i10) {
        this.f50302a = i10;
        this.f50303b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f50302a;
        f fVar = this.f50303b;
        switch (i10) {
            case 0:
                e3 e3Var = fVar.f50323k0;
                if (e3Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.f50322j0.keySet());
                    go goVar = (go) e3Var.f17210b;
                    ArrayList arrayList2 = goVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = goVar.L0;
                    if (i11 >= 0) {
                        goVar.f28647r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                e3 e3Var2 = fVar.f50323k0;
                if (e3Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f50322j0.keySet());
                    go goVar2 = (go) e3Var2.f17210b;
                    ArrayList arrayList4 = goVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = goVar2.L0;
                    if (i12 >= 0) {
                        goVar2.f28647r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f50322j0;
                hashMap.clear();
                fVar.f50320h0.b();
                fVar.f50316d0.O(true);
                fVar.f50317e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f50312r0;
                fVar.S(view);
                return;
        }
    }
}
