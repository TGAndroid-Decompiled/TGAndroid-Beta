package u5;

import android.util.Log;
import java.util.Iterator;
public final class k implements o {
    public final int f45169a;
    public final o f45170b;
    public final n f45171c;

    public k(n nVar, o oVar, int i10) {
        this.f45169a = i10;
        this.f45171c = nVar;
        this.f45170b = oVar;
    }

    @Override
    public final void e(String str, long j10, long j11, long j12) {
        switch (this.f45169a) {
            case 0:
                o oVar = this.f45170b;
                if (oVar != null) {
                    oVar.e(str, j10, j11, j12);
                    return;
                }
                return;
            default:
                o oVar2 = this.f45170b;
                if (oVar2 != null) {
                    oVar2.e(str, j10, j11, j12);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        int i12 = this.f45169a;
        n nVar = this.f45171c;
        switch (i12) {
            case 0:
                nVar.f45173g = null;
                o oVar = this.f45170b;
                if (oVar != null) {
                    oVar.g(str, j10, i10, obj, j11, j12);
                    return;
                }
                return;
            default:
                if (this.f45170b != null) {
                    if (i10 == 2001) {
                        Object[] objArr = {Integer.valueOf(nVar.f45174i)};
                        b bVar = nVar.f45193a;
                        Log.w(bVar.f45160a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                        Iterator it = ((s5.h) nVar.h.f16228b).f44142i.iterator();
                        while (it.hasNext()) {
                            ((s5.g) it.next()).o();
                        }
                        i11 = 2001;
                    } else {
                        i11 = i10;
                    }
                    this.f45170b.g(str, j10, i11, obj, j11, j12);
                    return;
                }
                return;
        }
    }
}
