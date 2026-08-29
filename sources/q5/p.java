package q5;

import android.util.Log;
import c2.v0;
import com.google.android.gms.common.api.Status;
import nh.g2;
public final class p {
    public final int f46412a;
    public final c f46413b;

    public p(c cVar, int i10) {
        this.f46412a = i10;
        this.f46413b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        m mVar = (m) qVar;
        switch (this.f46412a) {
            case 0:
                Status i10 = mVar.i();
                int i11 = i10.f3755a;
                c cVar = this.f46413b;
                if (i11 != 0) {
                    s5.b bVar = cVar.f46365a;
                    String str = i10.f3756b;
                    Log.w(bVar.f47580a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f46374l = null;
                if (!cVar.h.isEmpty()) {
                    v0 v0Var = cVar.f46371i;
                    g2 g2Var = cVar.f46372j;
                    v0Var.removeCallbacks(g2Var);
                    v0Var.postDelayed(g2Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = mVar.i();
                int i13 = i12.f3755a;
                c cVar2 = this.f46413b;
                if (i13 != 0) {
                    s5.b bVar2 = cVar2.f46365a;
                    String str2 = i12.f3756b;
                    Log.w(bVar2.f47580a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f46373k = null;
                if (!cVar2.h.isEmpty()) {
                    v0 v0Var2 = cVar2.f46371i;
                    g2 g2Var2 = cVar2.f46372j;
                    v0Var2.removeCallbacks(g2Var2);
                    v0Var2.postDelayed(g2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
