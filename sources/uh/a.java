package uh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.co;
public final class a implements View.OnClickListener {
    public final int f48268a;
    public final f f48269b;

    public a(f fVar, int i10) {
        this.f48268a = i10;
        this.f48269b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f48268a;
        f fVar = this.f48269b;
        switch (i10) {
            case 0:
                l2.f fVar2 = fVar.f48289k0;
                if (fVar2 != null) {
                    ArrayList arrayList = new ArrayList(fVar.f48288j0.keySet());
                    co coVar = (co) fVar2.f15906b;
                    ArrayList arrayList2 = coVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = coVar.L0;
                    if (i11 >= 0) {
                        coVar.f25390r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l2.f fVar3 = fVar.f48289k0;
                if (fVar3 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f48288j0.keySet());
                    co coVar2 = (co) fVar3.f15906b;
                    ArrayList arrayList4 = coVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = coVar2.L0;
                    if (i12 >= 0) {
                        coVar2.f25390r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f48288j0;
                hashMap.clear();
                fVar.f48286h0.b();
                fVar.f48282d0.N(true);
                fVar.f48283e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f48278r0;
                fVar.S(view);
                return;
        }
    }
}
