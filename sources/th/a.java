package th;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import m2.t;
import org.telegram.ui.Components.lo;
public final class a implements View.OnClickListener {
    public final int f48579a;
    public final f f48580b;

    public a(f fVar, int i10) {
        this.f48579a = i10;
        this.f48580b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f48579a;
        f fVar = this.f48580b;
        switch (i10) {
            case 0:
                t tVar = fVar.f48600k0;
                if (tVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f48599j0.keySet());
                    lo loVar = (lo) tVar.f16033b;
                    ArrayList arrayList2 = loVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = loVar.L0;
                    if (i11 >= 0) {
                        loVar.f28538r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                t tVar2 = fVar.f48600k0;
                if (tVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f48599j0.keySet());
                    lo loVar2 = (lo) tVar2.f16033b;
                    ArrayList arrayList4 = loVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = loVar2.L0;
                    if (i12 >= 0) {
                        loVar2.f28538r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f48599j0;
                hashMap.clear();
                fVar.f48597h0.b();
                fVar.f48593d0.N(true);
                fVar.f48594e0.b(hashMap.size(), true);
                return;
            case 3:
                fVar.T(view);
                return;
            default:
                int i13 = f.f48589r0;
                fVar.T(view);
                return;
        }
    }
}
