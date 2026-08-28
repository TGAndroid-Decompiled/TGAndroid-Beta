package w1;

import a0.l;
import androidx.lifecycle.p0;
import c2.t;
import v9.d;
public class b extends p0 {
    public static final d f48428f = new d(25);
    public final l d = new l();
    public boolean f48429e = false;

    @Override
    public final void b() {
        l lVar = this.d;
        int i9 = lVar.f31c;
        for (int i10 = 0; i10 < i9; i10++) {
            a aVar = (a) lVar.f30b[i10];
            k5.d dVar = aVar.f48425l;
            dVar.a();
            dVar.f14647c = true;
            t tVar = aVar.f48427n;
            if (tVar != null) {
                aVar.i(tVar);
            }
            a aVar2 = dVar.f14645a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f14645a = null;
                    if (tVar != null) {
                        boolean z10 = tVar.f2233b;
                    }
                    dVar.d = true;
                    dVar.f14646b = false;
                    dVar.f14647c = false;
                    dVar.f14648e = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i11 = lVar.f31c;
        Object[] objArr = lVar.f30b;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        lVar.f31c = 0;
    }
}
