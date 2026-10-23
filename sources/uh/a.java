package uh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.fo;
public final class a implements View.OnClickListener {
    public final int f48269a;
    public final f f48270b;

    public a(f fVar, int i10) {
        this.f48269a = i10;
        this.f48270b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f48269a;
        f fVar = this.f48270b;
        switch (i10) {
            case 0:
                l2.f fVar2 = fVar.f48290k0;
                if (fVar2 != null) {
                    ArrayList arrayList = new ArrayList(fVar.f48289j0.keySet());
                    fo foVar = (fo) fVar2.f15906b;
                    ArrayList arrayList2 = foVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = foVar.L0;
                    if (i11 >= 0) {
                        foVar.f26418r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l2.f fVar3 = fVar.f48290k0;
                if (fVar3 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f48289j0.keySet());
                    fo foVar2 = (fo) fVar3.f15906b;
                    ArrayList arrayList4 = foVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = foVar2.L0;
                    if (i12 >= 0) {
                        foVar2.f26418r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f48289j0;
                hashMap.clear();
                fVar.f48287h0.b();
                fVar.f48283d0.N(true);
                fVar.f48284e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f48279r0;
                fVar.S(view);
                return;
        }
    }
}
