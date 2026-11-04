package y1;

import a0.m;
import androidx.lifecycle.p0;
import ba.i;
import c6.d;
public class b extends p0 {
    public static final mb.b f58894f = new mb.b(28);
    public final m d = new m();
    public boolean f58895e = false;

    @Override
    public final void b() {
        m mVar = this.d;
        int i3 = mVar.f34c;
        for (int i10 = 0; i10 < i3; i10++) {
            a aVar = (a) mVar.f33b[i10];
            d dVar = aVar.f58891l;
            dVar.a();
            dVar.f4223c = true;
            i iVar = aVar.f58893n;
            if (iVar != null) {
                aVar.i(iVar);
            }
            a aVar2 = dVar.f4221a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f4221a = null;
                    if (iVar != null) {
                        boolean z10 = iVar.f3186b;
                    }
                    dVar.d = true;
                    dVar.f4222b = false;
                    dVar.f4223c = false;
                    dVar.f4224e = false;
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
