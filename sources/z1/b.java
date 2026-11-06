package z1;

import a0.m;
import androidx.lifecycle.p0;
import ca.i;
import d6.d;
public class b extends p0 {
    public static final pb.b f59446f = new pb.b(29);
    public final m d = new m();
    public boolean f59447e = false;

    @Override
    public final void b() {
        m mVar = this.d;
        int i7 = mVar.f34c;
        for (int i10 = 0; i10 < i7; i10++) {
            a aVar = (a) mVar.f33b[i10];
            d dVar = aVar.f59443l;
            dVar.a();
            dVar.f8197c = true;
            i iVar = aVar.f59445n;
            if (iVar != null) {
                aVar.i(iVar);
            }
            a aVar2 = dVar.f8195a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f8195a = null;
                    if (iVar != null) {
                        boolean z9 = iVar.f6015b;
                    }
                    dVar.d = true;
                    dVar.f8196b = false;
                    dVar.f8197c = false;
                    dVar.f8198e = false;
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
