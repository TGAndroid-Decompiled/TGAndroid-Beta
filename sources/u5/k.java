package u5;

import android.util.Log;
import java.util.Iterator;
public final class k implements o {
    public final int f48359a;
    public final o f48360b;
    public final n f48361c;

    public k(n nVar, o oVar, int i10) {
        this.f48359a = i10;
        this.f48361c = nVar;
        this.f48360b = oVar;
    }

    @Override
    public final void m(String str, long j10, long j11, long j12) {
        switch (this.f48359a) {
            case 0:
                o oVar = this.f48360b;
                if (oVar != null) {
                    oVar.m(str, j10, j11, j12);
                    return;
                }
                return;
            default:
                o oVar2 = this.f48360b;
                if (oVar2 != null) {
                    oVar2.m(str, j10, j11, j12);
                    return;
                }
                return;
        }
    }

    @Override
    public final void n(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        int i12 = this.f48359a;
        n nVar = this.f48361c;
        switch (i12) {
            case 0:
                nVar.f48364g = null;
                o oVar = this.f48360b;
                if (oVar != null) {
                    oVar.n(str, j10, i10, obj, j11, j12);
                    return;
                }
                return;
            default:
                if (this.f48360b != null) {
                    if (i10 == 2001) {
                        Object[] objArr = {Integer.valueOf(nVar.f48365i)};
                        b bVar = nVar.f48385a;
                        Log.w(bVar.f48349a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                        Iterator it = ((s5.h) nVar.h.f42528b).f47051i.iterator();
                        while (it.hasNext()) {
                            ((s5.g) it.next()).o();
                        }
                        i11 = 2001;
                    } else {
                        i11 = i10;
                    }
                    this.f48360b.n(str, j10, i11, obj, j11, j12);
                    return;
                }
                return;
        }
    }
}
