package z1;

import a0.m;
import androidx.lifecycle.p0;
import ca.i;
import d6.d;
public class b extends p0 {
    public static final pb.b f59578f = new pb.b(29);
    public final m d = new m();
    public boolean f59579e = false;

    @Override
    public final void b() {
        m mVar = this.d;
        int i7 = mVar.f34c;
        for (int i10 = 0; i10 < i7; i10++) {
            a aVar = (a) mVar.f33b[i10];
            d dVar = aVar.f59575l;
            dVar.a();
            dVar.f8195c = true;
            i iVar = aVar.f59577n;
            if (iVar != null) {
                aVar.i(iVar);
            }
            a aVar2 = dVar.f8193a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f8193a = null;
                    if (iVar != null) {
                        boolean z9 = iVar.f6013b;
                    }
                    dVar.d = true;
                    dVar.f8194b = false;
                    dVar.f8195c = false;
                    dVar.f8196e = false;
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
