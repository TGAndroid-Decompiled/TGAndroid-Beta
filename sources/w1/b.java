package w1;

import a0.l;
import androidx.lifecycle.p0;
import h7.u;
import o5.d;
public class b extends p0 {
    public static final u f46439f = new u(24);
    public final l d = new l();
    public boolean e = false;

    @Override
    public final void b() {
        l lVar = this.d;
        int i10 = lVar.f28c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) lVar.f27b[i11];
            d dVar = aVar.f46436l;
            dVar.a();
            dVar.f16428c = true;
            c2.u uVar = aVar.f46438n;
            if (uVar != null) {
                aVar.i(uVar);
            }
            a aVar2 = dVar.f16426a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f16426a = null;
                    if (uVar != null) {
                        boolean z4 = uVar.f2036b;
                    }
                    dVar.d = true;
                    dVar.f16427b = false;
                    dVar.f16428c = false;
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
