package w1;

import a0.n;
import a6.d;
import androidx.lifecycle.p0;
import b2.p;
public class b extends p0 {
    public static final qb.b f44753f = new qb.b(24);
    public final n d = new n();
    public boolean e = false;

    @Override
    public final void b() {
        n nVar = this.d;
        int i10 = nVar.f33c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) nVar.f32b[i11];
            d dVar = aVar.f44750l;
            dVar.a();
            dVar.f292c = true;
            p pVar = aVar.f44752n;
            if (pVar != null) {
                aVar.i(pVar);
            }
            a aVar2 = dVar.f290a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f290a = null;
                    if (pVar != null) {
                        boolean z10 = pVar.f3168b;
                    }
                    dVar.d = true;
                    dVar.f291b = false;
                    dVar.f292c = false;
                    dVar.e = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i12 = nVar.f33c;
        Object[] objArr = nVar.f32b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        nVar.f33c = 0;
    }
}
