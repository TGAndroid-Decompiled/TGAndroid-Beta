package w1;

import a0.m;
import androidx.lifecycle.p0;
import b2.u;
import b6.d;
import u7.s;
public class b extends p0 {
    public static final s f50648f = new s(25);
    public final m d = new m();
    public boolean e = false;

    @Override
    public final void b() {
        m mVar = this.d;
        int i10 = mVar.f30c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) mVar.f29b[i11];
            d dVar = aVar.f50645l;
            dVar.a();
            dVar.f3659c = true;
            u uVar = aVar.f50647n;
            if (uVar != null) {
                aVar.i(uVar);
            }
            a aVar2 = dVar.f3657a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f3657a = null;
                    if (uVar != null) {
                        boolean z10 = uVar.f3463b;
                    }
                    dVar.d = true;
                    dVar.f3658b = false;
                    dVar.f3659c = false;
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
