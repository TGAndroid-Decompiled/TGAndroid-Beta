package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.un;
public final class a implements View.OnClickListener {
    public final int f43503a;
    public final f f43504b;

    public a(f fVar, int i10) {
        this.f43503a = i10;
        this.f43504b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43503a;
        f fVar = this.f43504b;
        switch (i10) {
            case 0:
                l.d dVar = fVar.f43524k0;
                if (dVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f43523j0.keySet());
                    un unVar = (un) dVar.f13859a;
                    ArrayList arrayList2 = unVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = unVar.L0;
                    if (i11 >= 0) {
                        unVar.f28763r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l.d dVar2 = fVar.f43524k0;
                if (dVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f43523j0.keySet());
                    un unVar2 = (un) dVar2.f13859a;
                    ArrayList arrayList4 = unVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = unVar2.L0;
                    if (i12 >= 0) {
                        unVar2.f28763r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f43523j0;
                hashMap.clear();
                fVar.f43521h0.b();
                fVar.f43517d0.N(true);
                fVar.f43518e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f43513r0;
                fVar.S(view);
                return;
        }
    }
}
