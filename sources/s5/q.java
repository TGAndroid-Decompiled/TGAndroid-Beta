package s5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import org.telegram.ui.Components.i50;
public final class q {
    public final int f47069a;
    public final c f47070b;

    public q(c cVar, int i10) {
        this.f47069a = i10;
        this.f47070b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.f47069a) {
            case 0:
                Status i10 = nVar.i();
                int i11 = i10.f2646a;
                c cVar = this.f47070b;
                if (i11 != 0) {
                    u5.b bVar = cVar.f47019a;
                    String str = i10.f2647b;
                    Log.w(bVar.f48349a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f47028l = null;
                if (!cVar.h.isEmpty()) {
                    a7.e eVar = cVar.f47025i;
                    i50 i50Var = cVar.f47026j;
                    eVar.removeCallbacks(i50Var);
                    eVar.postDelayed(i50Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = nVar.i();
                int i13 = i12.f2646a;
                c cVar2 = this.f47070b;
                if (i13 != 0) {
                    u5.b bVar2 = cVar2.f47019a;
                    String str2 = i12.f2647b;
                    Log.w(bVar2.f48349a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f47027k = null;
                if (!cVar2.h.isEmpty()) {
                    a7.e eVar2 = cVar2.f47025i;
                    i50 i50Var2 = cVar2.f47026j;
                    eVar2.removeCallbacks(i50Var2);
                    eVar2.postDelayed(i50Var2, 500L);
                    return;
                }
                return;
        }
    }
}
