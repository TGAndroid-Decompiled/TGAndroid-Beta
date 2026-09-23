package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import k2.u;
import org.telegram.ui.Components.vn;
public final class a implements View.OnClickListener {
    public final int f43199a;
    public final f f43200b;

    public a(f fVar, int i10) {
        this.f43199a = i10;
        this.f43200b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43199a;
        f fVar = this.f43200b;
        switch (i10) {
            case 0:
                u uVar = fVar.f43220k0;
                if (uVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f43219j0.keySet());
                    vn vnVar = (vn) uVar.f13371b;
                    ArrayList arrayList2 = vnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = vnVar.L0;
                    if (i11 >= 0) {
                        vnVar.f28803r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                u uVar2 = fVar.f43220k0;
                if (uVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f43219j0.keySet());
                    vn vnVar2 = (vn) uVar2.f13371b;
                    ArrayList arrayList4 = vnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = vnVar2.L0;
                    if (i12 >= 0) {
                        vnVar2.f28803r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f43219j0;
                hashMap.clear();
                fVar.f43217h0.b();
                fVar.f43213d0.N(true);
                fVar.f43214e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f43209r0;
                fVar.S(view);
                return;
        }
    }
}
