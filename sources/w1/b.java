package w1;

import a0.m;
import a6.d;
import androidx.lifecycle.p0;
import b2.t;
public class b extends p0 {
    public static final sb.a f48456f = new sb.a(25);
    public final m d = new m();
    public boolean e = false;

    @Override
    public final void b() {
        m mVar = this.d;
        int i10 = mVar.f30c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) mVar.f29b[i11];
            d dVar = aVar.f48453l;
            dVar.a();
            dVar.f296c = true;
            t tVar = aVar.f48455n;
            if (tVar != null) {
                aVar.i(tVar);
            }
            a aVar2 = dVar.f294a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f294a = null;
                    if (tVar != null) {
                        boolean z10 = tVar.f4007b;
                    }
                    dVar.d = true;
                    dVar.f295b = false;
                    dVar.f296c = false;
                    dVar.e = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i12 = mVar.f30c;
        Object[] objArr = mVar.f29b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        mVar.f30c = 0;
    }
}
