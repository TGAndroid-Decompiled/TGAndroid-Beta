package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import k2.u;
import org.telegram.ui.Components.un;
public final class a implements View.OnClickListener {
    public final int f43248a;
    public final f f43249b;

    public a(f fVar, int i10) {
        this.f43248a = i10;
        this.f43249b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43248a;
        f fVar = this.f43249b;
        switch (i10) {
            case 0:
                u uVar = fVar.f43269k0;
                if (uVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f43268j0.keySet());
                    un unVar = (un) uVar.f13382b;
                    ArrayList arrayList2 = unVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = unVar.L0;
                    if (i11 >= 0) {
                        unVar.f28461r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                u uVar2 = fVar.f43269k0;
                if (uVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f43268j0.keySet());
                    un unVar2 = (un) uVar2.f13382b;
                    ArrayList arrayList4 = unVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = unVar2.L0;
                    if (i12 >= 0) {
                        unVar2.f28461r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f43268j0;
                hashMap.clear();
                fVar.f43266h0.b();
                fVar.f43262d0.N(true);
                fVar.f43263e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f43258r0;
                fVar.S(view);
                return;
        }
    }
}
