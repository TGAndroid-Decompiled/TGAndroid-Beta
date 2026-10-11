package w1;

import a0.n;
import androidx.lifecycle.p0;
import b2.p;
import na.d;
public class b extends p0 {
    public static final d f49841f = new d(25);
    public final n d = new n();
    public boolean f49842e = false;

    @Override
    public final void b() {
        n nVar = this.d;
        int i10 = nVar.f36c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) nVar.f35b[i11];
            a6.d dVar = aVar.f49838l;
            dVar.a();
            dVar.f314c = true;
            p pVar = aVar.f49840n;
            if (pVar != null) {
                aVar.i(pVar);
            }
            a aVar2 = dVar.f312a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f312a = null;
                    if (pVar != null) {
                        boolean z10 = pVar.f3505b;
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
