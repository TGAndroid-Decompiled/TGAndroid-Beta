package q5;

import android.util.Log;
import java.util.Iterator;
public final class k implements o {
    public final int f46019a;
    public final o f46020b;
    public final n f46021c;

    public k(n nVar, o oVar, int i9) {
        this.f46019a = i9;
        this.f46021c = nVar;
        this.f46020b = oVar;
    }

    @Override
    public final void b(String str, long j10, long j11, long j12) {
        switch (this.f46019a) {
            case 0:
                o oVar = this.f46020b;
                if (oVar != null) {
                    oVar.b(str, j10, j11, j12);
                    return;
                }
                return;
            default:
                o oVar2 = this.f46020b;
                if (oVar2 != null) {
                    oVar2.b(str, j10, j11, j12);
                    return;
                }
                return;
        }
    }

    @Override
    public final void p(String str, long j10, int i9, Object obj, long j11, long j12) {
        int i10;
        int i11 = this.f46019a;
        n nVar = this.f46021c;
        switch (i11) {
            case 0:
                nVar.f46024g = null;
                o oVar = this.f46020b;
                if (oVar != null) {
                    oVar.p(str, j10, i9, obj, j11, j12);
                    return;
                }
                return;
            default:
                if (this.f46020b != null) {
                    if (i9 == 2001) {
                        Object[] objArr = {Integer.valueOf(nVar.f46025i)};
                        b bVar = nVar.f46045a;
                        Log.w(bVar.f46009a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                        Iterator it = ((o5.h) nVar.h.f18343b).f18990i.iterator();
                        while (it.hasNext()) {
                            ((o5.g) it.next()).o();
                        }
                        i10 = 2001;
                    } else {
                        i10 = i9;
                    }
                    this.f46020b.p(str, j10, i10, obj, j11, j12);
                    return;
                }
                return;
        }
    }
}
