package w1;

import a0.n;
import a6.d;
import androidx.lifecycle.p0;
import b2.p;
public class b extends p0 {
    public static final qb.b f48456f = new qb.b(24);
    public final n d = new n();
    public boolean f48457e = false;

    @Override
    public final void b() {
        n nVar = this.d;
        int i10 = nVar.f36c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) nVar.f35b[i11];
            d dVar = aVar.f48453l;
            dVar.a();
            dVar.f314c = true;
            p pVar = aVar.f48455n;
            if (pVar != null) {
                aVar.i(pVar);
            }
            a aVar2 = dVar.f312a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f312a = null;
                    if (pVar != null) {
                        boolean z10 = pVar.f3426b;
                    }
                    dVar.d = true;
                    dVar.f313b = false;
                    dVar.f314c = false;
                    dVar.f315e = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i12 = nVar.f36c;
        Object[] objArr = nVar.f35b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        nVar.f36c = 0;
    }
}
