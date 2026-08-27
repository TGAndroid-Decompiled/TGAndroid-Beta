package w1;

import a0.l;
import androidx.lifecycle.p0;
import c2.t;
import k5.d;

public class b extends p0 {

    public static final xa.a f48931f = new xa.a(23);
    public final l d = new l();

    public boolean f48932e = false;

    @Override
    public final void b() {
        l lVar = this.d;
        int i10 = lVar.f31c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) lVar.f30b[i11];
            d dVar = aVar.f48928l;
            dVar.a();
            dVar.f14468c = true;
            t tVar = aVar.f48930n;
            if (tVar != null) {
                aVar.i(tVar);
            }
            a aVar2 = dVar.f14466a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f14466a = null;
            if (tVar != null) {
                boolean z10 = tVar.f2346b;
            }
            dVar.d = true;
            dVar.f14467b = false;
            dVar.f14468c = false;
            dVar.f14469e = false;
        }
        int i12 = lVar.f31c;
        Object[] objArr = lVar.f30b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        lVar.f31c = 0;
    }
}
