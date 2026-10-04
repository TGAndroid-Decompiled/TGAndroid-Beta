package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.xn;
public final class a implements View.OnClickListener {
    public final int f47140a;
    public final f f47141b;

    public a(f fVar, int i10) {
        this.f47140a = i10;
        this.f47141b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f47140a;
        f fVar = this.f47141b;
        switch (i10) {
            case 0:
                l2.g gVar = fVar.f47161k0;
                if (gVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f47160j0.keySet());
                    xn xnVar = (xn) gVar.f15266b;
                    ArrayList arrayList2 = xnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = xnVar.L0;
                    if (i11 >= 0) {
                        xnVar.f32934r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                l2.g gVar2 = fVar.f47161k0;
                if (gVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f47160j0.keySet());
                    xn xnVar2 = (xn) gVar2.f15266b;
                    ArrayList arrayList4 = xnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = xnVar2.L0;
                    if (i12 >= 0) {
                        xnVar2.f32934r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f47160j0;
                hashMap.clear();
                fVar.f47158h0.b();
                fVar.f47154d0.N(true);
                fVar.f47155e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.Q(view);
                return;
            default:
                int i13 = f.f47150r0;
                fVar.Q(view);
                return;
        }
    }
}
