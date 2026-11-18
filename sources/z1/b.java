package z1;

import a0.m;
import androidx.lifecycle.p0;
import ca.i;
import d6.d;
import w7.s;
public class b extends p0 {
    public static final s f61342f = new s(29);
    public final m d = new m();
    public boolean f61343e = false;

    @Override
    public final void b() {
        m mVar = this.d;
        int i7 = mVar.f34c;
        for (int i10 = 0; i10 < i7; i10++) {
            a aVar = (a) mVar.f33b[i10];
            d dVar = aVar.f61339l;
            dVar.a();
            dVar.f7869c = true;
            i iVar = aVar.f61341n;
            if (iVar != null) {
                aVar.i(iVar);
            }
            a aVar2 = dVar.f7867a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f7867a = null;
                    if (iVar != null) {
                        boolean z10 = iVar.f5125b;
                    }
                    dVar.d = true;
                    dVar.f7868b = false;
                    dVar.f7869c = false;
                    dVar.f7870e = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i11 = mVar.f34c;
        Object[] objArr = mVar.f33b;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        mVar.f34c = 0;
    }
}
