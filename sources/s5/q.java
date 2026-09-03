package s5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import org.telegram.ui.Components.h50;
public final class q {
    public final int f44160a;
    public final c f44161b;

    public q(c cVar, int i10) {
        this.f44160a = i10;
        this.f44161b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.f44160a) {
            case 0:
                Status i10 = nVar.i();
                int i11 = i10.f2701a;
                c cVar = this.f44161b;
                if (i11 != 0) {
                    u5.b bVar = cVar.f44113a;
                    String str = i10.f2702b;
                    Log.w(bVar.f45160a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f44121l = null;
                if (!cVar.h.isEmpty()) {
                    a7.e eVar = cVar.f44118i;
                    h50 h50Var = cVar.f44119j;
                    eVar.removeCallbacks(h50Var);
                    eVar.postDelayed(h50Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = nVar.i();
                int i13 = i12.f2701a;
                c cVar2 = this.f44161b;
                if (i13 != 0) {
                    u5.b bVar2 = cVar2.f44113a;
                    String str2 = i12.f2702b;
                    Log.w(bVar2.f45160a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f44120k = null;
                if (!cVar2.h.isEmpty()) {
                    a7.e eVar2 = cVar2.f44118i;
                    h50 h50Var2 = cVar2.f44119j;
                    eVar2.removeCallbacks(h50Var2);
                    eVar2.postDelayed(h50Var2, 500L);
                    return;
                }
                return;
        }
    }
}
