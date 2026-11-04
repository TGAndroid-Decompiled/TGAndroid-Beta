package z6;

import android.support.v4.media.session.a0;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import hd.j;
import java.util.Iterator;
import java.util.LinkedList;
import m.o3;
import od.p;
import z9.k;
import z9.m;
public final class c implements SuccessContinuation, zd.b {
    public final Object f59791a;

    public c(Object obj) {
        this.f59791a = obj;
    }

    @Override
    public java.lang.Object U(zd.c r7, hd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: z6.c.U(zd.c, hd.c):java.lang.Object");
    }

    public void a(a0 a0Var) {
        o3 o3Var = (o3) this.f59791a;
        o3Var.f18683b = a0Var;
        Iterator it = ((LinkedList) o3Var.f18684c).iterator();
        while (it.hasNext()) {
            ((d) it.next()).b();
        }
        ((LinkedList) o3Var.f18684c).clear();
    }

    @Override
    public Task then(Object obj) {
        ha.b bVar = (ha.b) obj;
        m mVar = ((k) this.f59791a).f60190e;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        return Tasks.whenAll(m.b(mVar), mVar.f60205m.h(null, mVar.f60198e.f286a));
    }

    public c(p pVar) {
        this.f59791a = (j) pVar;
    }

    public c(k kVar, String str) {
        this.f59791a = kVar;
    }
}
