package r5;

import android.util.Log;
import java.util.Iterator;

public final class k implements o {

    public final int f46778a;

    public final o f46779b;

    public final n f46780c;

    public k(n nVar, o oVar, int i10) {
        this.f46778a = i10;
        this.f46780c = nVar;
        this.f46779b = oVar;
    }

    @Override
    public final void d(String str, long j10, long j11, long j12) {
        switch (this.f46778a) {
            case 0:
                o oVar = this.f46779b;
                if (oVar != null) {
                    oVar.d(str, j10, j11, j12);
                }
                break;
            default:
                o oVar2 = this.f46779b;
                if (oVar2 != null) {
                    oVar2.d(str, j10, j11, j12);
                }
                break;
        }
    }

    @Override
    public final void j(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        int i12 = this.f46778a;
        n nVar = this.f46780c;
        switch (i12) {
            case 0:
                nVar.f46783g = null;
                o oVar = this.f46779b;
                if (oVar != null) {
                    oVar.j(str, j10, i10, obj, j11, j12);
                }
                break;
            default:
                if (this.f46779b != null) {
                    if (i10 == 2001) {
                        Object[] objArr = {Integer.valueOf(nVar.f46784i)};
                        b bVar = nVar.f46804a;
                        Log.w(bVar.f46768a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                        Iterator it = ((o5.h) nVar.h.f18130b).f19337i.iterator();
                        while (it.hasNext()) {
                            ((o5.g) it.next()).o();
                        }
                        i11 = 2001;
                    } else {
                        i11 = i10;
                    }
                    this.f46779b.j(str, j10, i11, obj, j11, j12);
                }
                break;
        }
    }
}
