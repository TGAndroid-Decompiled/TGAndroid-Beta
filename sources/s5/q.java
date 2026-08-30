package s5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import org.telegram.ui.Components.g50;
public final class q {
    public final int f44095a;
    public final c f44096b;

    public q(c cVar, int i10) {
        this.f44095a = i10;
        this.f44096b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.f44095a) {
            case 0:
                Status i10 = nVar.i();
                int i11 = i10.f2718a;
                c cVar = this.f44096b;
                if (i11 != 0) {
                    u5.b bVar = cVar.f44048a;
                    String str = i10.f2719b;
                    Log.w(bVar.f45098a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f44056l = null;
                if (!cVar.h.isEmpty()) {
                    a7.e eVar = cVar.f44053i;
                    g50 g50Var = cVar.f44054j;
                    eVar.removeCallbacks(g50Var);
                    eVar.postDelayed(g50Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = nVar.i();
                int i13 = i12.f2718a;
                c cVar2 = this.f44096b;
                if (i13 != 0) {
                    u5.b bVar2 = cVar2.f44048a;
                    String str2 = i12.f2719b;
                    Log.w(bVar2.f45098a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f44055k = null;
                if (!cVar2.h.isEmpty()) {
                    a7.e eVar2 = cVar2.f44053i;
                    g50 g50Var2 = cVar2.f44054j;
                    eVar2.removeCallbacks(g50Var2);
                    eVar2.postDelayed(g50Var2, 500L);
                    return;
                }
                return;
        }
    }
}
