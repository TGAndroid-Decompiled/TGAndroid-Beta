package u5;

import android.util.Log;
import java.util.Iterator;
public final class k implements o {
    public final int f45107a;
    public final o f45108b;
    public final n f45109c;

    public k(n nVar, o oVar, int i10) {
        this.f45107a = i10;
        this.f45109c = nVar;
        this.f45108b = oVar;
    }

    @Override
    public final void c(String str, long j10, long j11, long j12) {
        switch (this.f45107a) {
            case 0:
                o oVar = this.f45108b;
                if (oVar != null) {
                    oVar.c(str, j10, j11, j12);
                    return;
                }
                return;
            default:
                o oVar2 = this.f45108b;
                if (oVar2 != null) {
                    oVar2.c(str, j10, j11, j12);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        int i12 = this.f45107a;
        n nVar = this.f45109c;
        switch (i12) {
            case 0:
                nVar.f45111g = null;
                o oVar = this.f45108b;
                if (oVar != null) {
                    oVar.g(str, j10, i10, obj, j11, j12);
                    return;
                }
                return;
            default:
                if (this.f45108b != null) {
                    if (i10 == 2001) {
                        Object[] objArr = {Integer.valueOf(nVar.f45112i)};
                        b bVar = nVar.f45131a;
                        Log.w(bVar.f45098a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                        Iterator it = ((s5.h) nVar.h.f28149b).f44077i.iterator();
                        while (it.hasNext()) {
                            ((s5.g) it.next()).o();
                        }
                        i11 = 2001;
                    } else {
                        i11 = i10;
                    }
                    this.f45108b.g(str, j10, i11, obj, j11, j12);
                    return;
                }
                return;
        }
    }
}
