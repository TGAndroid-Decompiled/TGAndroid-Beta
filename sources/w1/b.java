package w1;

import a0.l;
import androidx.lifecycle.p0;
import c2.u;
import z9.d;
public class b extends p0 {
    public static final d f46357f = new d(24);
    public final l d = new l();
    public boolean e = false;

    @Override
    public final void b() {
        l lVar = this.d;
        int i10 = lVar.f28c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) lVar.f27b[i11];
            o5.d dVar = aVar.f46354l;
            dVar.a();
            dVar.f16446c = true;
            u uVar = aVar.f46356n;
            if (uVar != null) {
                aVar.i(uVar);
            }
            a aVar2 = dVar.f16444a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f16444a = null;
                    if (uVar != null) {
                        boolean z4 = uVar.f2006b;
                    }
                    dVar.d = true;
                    dVar.f16445b = false;
                    dVar.f16446c = false;
                    dVar.e = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i12 = lVar.f28c;
        Object[] objArr = lVar.f27b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        lVar.f28c = 0;
    }
}
