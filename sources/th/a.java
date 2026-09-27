package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.wn;
public final class a implements View.OnClickListener {
    public final int f43578a;
    public final f f43579b;

    public a(f fVar, int i10) {
        this.f43578a = i10;
        this.f43579b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43578a;
        f fVar = this.f43579b;
        switch (i10) {
            case 0:
                ka.c cVar = fVar.f43599k0;
                if (cVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f43598j0.keySet());
                    wn wnVar = (wn) cVar.f13554b;
                    ArrayList arrayList2 = wnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = wnVar.L0;
                    if (i11 >= 0) {
                        wnVar.f30104r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                ka.c cVar2 = fVar.f43599k0;
                if (cVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f43598j0.keySet());
                    wn wnVar2 = (wn) cVar2.f13554b;
                    ArrayList arrayList4 = wnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = wnVar2.L0;
                    if (i12 >= 0) {
                        wnVar2.f30104r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f43598j0;
                hashMap.clear();
                fVar.f43596h0.b();
                fVar.f43592d0.N(true);
                fVar.f43593e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f43588r0;
                fVar.S(view);
                return;
        }
    }
}
