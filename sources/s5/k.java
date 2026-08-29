package s5;

import android.util.Log;
import java.util.Iterator;
public final class k implements o {
    public final int f47590a;
    public final o f47591b;
    public final n f47592c;

    public k(n nVar, o oVar, int i10) {
        this.f47590a = i10;
        this.f47592c = nVar;
        this.f47591b = oVar;
    }

    @Override
    public final void c(String str, long j10, long j11, long j12) {
        switch (this.f47590a) {
            case 0:
                o oVar = this.f47591b;
                if (oVar != null) {
                    oVar.c(str, j10, j11, j12);
                    return;
                }
                return;
            default:
                o oVar2 = this.f47591b;
                if (oVar2 != null) {
                    oVar2.c(str, j10, j11, j12);
                    return;
                }
                return;
        }
    }

    @Override
    public final void o(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        int i12 = this.f47590a;
        n nVar = this.f47592c;
        switch (i12) {
            case 0:
                nVar.f47595g = null;
                o oVar = this.f47591b;
                if (oVar != null) {
                    oVar.o(str, j10, i10, obj, j11, j12);
                    return;
                }
                return;
            default:
                if (this.f47591b != null) {
                    if (i10 == 2001) {
                        Object[] objArr = {Integer.valueOf(nVar.f47596i)};
                        b bVar = nVar.f47616a;
                        Log.w(bVar.f47580a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                        Iterator it = ((q5.h) nVar.h.f19159b).f46397i.iterator();
                        while (it.hasNext()) {
                            ((q5.g) it.next()).o();
                        }
                        i11 = 2001;
                    } else {
                        i11 = i10;
                    }
                    this.f47591b.o(str, j10, i11, obj, j11, j12);
                    return;
                }
                return;
        }
    }
}
