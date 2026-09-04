package w1;

import a0.m;
import a6.d;
import androidx.lifecycle.p0;
import b2.p;
public class b extends p0 {
    public static final rb.a f47910f = new rb.a(24);
    public final m d = new m();
    public boolean f47911e = false;

    @Override
    public final void b() {
        m mVar = this.d;
        int i10 = mVar.f34c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) mVar.f33b[i11];
            d dVar = aVar.f47907l;
            dVar.a();
            dVar.f300c = true;
            p pVar = aVar.f47909n;
            if (pVar != null) {
                aVar.i(pVar);
            }
            a aVar2 = dVar.f298a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f298a = null;
                    if (pVar != null) {
                        boolean z10 = pVar.f2232b;
                    }
                    dVar.d = true;
                    dVar.f299b = false;
                    dVar.f300c = false;
                    dVar.f301e = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i12 = mVar.f34c;
        Object[] objArr = mVar.f33b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        mVar.f34c = 0;
    }
}
