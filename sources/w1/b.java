package w1;

import a0.l;
import androidx.lifecycle.p0;
import c2.u;
import o5.d;
public class b extends p0 {
    public static final cb.b f49321f = new cb.b(24);
    public final l d = new l();
    public boolean f49322e = false;

    @Override
    public final void b() {
        l lVar = this.d;
        int i10 = lVar.f31c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) lVar.f30b[i11];
            d dVar = aVar.f49318l;
            dVar.a();
            dVar.f16603c = true;
            u uVar = aVar.f49320n;
            if (uVar != null) {
                aVar.i(uVar);
            }
            a aVar2 = dVar.f16601a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f16601a = null;
                    if (uVar != null) {
                        boolean z4 = uVar.f2179b;
                    }
                    dVar.d = true;
                    dVar.f16602b = false;
                    dVar.f16603c = false;
                    dVar.f16604e = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i12 = lVar.f31c;
        Object[] objArr = lVar.f30b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        lVar.f31c = 0;
    }
}
