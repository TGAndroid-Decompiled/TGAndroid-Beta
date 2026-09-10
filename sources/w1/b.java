package w1;

import a0.m;
import a6.d;
import androidx.lifecycle.p0;
import b2.p;
public class b extends p0 {
    public static final qb.b f43433f = new qb.b(24);
    public final m d = new m();
    public boolean e = false;

    @Override
    public final void b() {
        m mVar = this.d;
        int i10 = mVar.f31c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) mVar.f30b[i11];
            d dVar = aVar.f43430l;
            dVar.a();
            dVar.f290c = true;
            p pVar = aVar.f43432n;
            if (pVar != null) {
                aVar.i(pVar);
            }
            a aVar2 = dVar.f288a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f288a = null;
                    if (pVar != null) {
                        boolean z10 = pVar.f1869b;
                    }
                    dVar.d = true;
                    dVar.f289b = false;
                    dVar.f290c = false;
                    dVar.e = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i12 = mVar.f31c;
        Object[] objArr = mVar.f30b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        mVar.f31c = 0;
    }
}
