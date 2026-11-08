package org.telegram.utils.twidget;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class r0 extends k {
    public static final r0 f52954i = new r0();
    public q0 d;
    public Context f52959g;
    public boolean h;
    public final Object f52955b = new Object();
    public final Handler f52956c = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap f52957e = new ConcurrentHashMap();
    public final AtomicLong f52958f = new AtomicLong();

    public final q0 e() {
        q0 q0Var = this.d;
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(this);
        if (this.f52959g.bindService(new Intent(this.f52959g, WidgetEngineService.class), q0Var2, 65)) {
            q0Var2.d = true;
            this.d = q0Var2;
            return q0Var2;
        }
        this.f52959g.unbindService(q0Var2);
        throw new IllegalStateException("Widget engine service is unavailable");
    }

    public final long f(android.content.Context r23, java.lang.String r24, java.lang.String r25, float r26, float r27, int r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, org.telegram.utils.twidget.WidgetSandboxBackend r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.r0.f(android.content.Context, java.lang.String, java.lang.String, float, float, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, org.telegram.utils.twidget.WidgetSandboxBackend):long");
    }

    public final void g(q0 q0Var, int i7) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f52955b) {
            try {
                if (q0Var.f52943b == i7) {
                    q0Var.f52942a = null;
                }
                Iterator it = this.f52957e.entrySet().iterator();
                while (it.hasNext()) {
                    o0 o0Var = (o0) ((Map.Entry) it.next()).getValue();
                    if (o0Var.f52928a == q0Var && o0Var.f52929b == i7) {
                        arrayList.add(o0Var);
                        it.remove();
                        i(q0Var);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h1 session = ((o0) obj).f52930c.session();
            session.f52825a.post(new b1(session, 1));
        }
    }

    public final void h(Context context) {
        synchronized (this.f52955b) {
            try {
                if (this.h) {
                    return;
                }
                if (this.f52959g == null) {
                    this.f52959g = context.getApplicationContext();
                }
                q0 e10 = e();
                this.f52956c.removeCallbacks(e10.f52945e);
                e10.f52944c++;
                this.h = true;
                b bVar = e10.f52942a;
                if (bVar != null) {
                    try {
                        bVar.b1();
                    } catch (RemoteException unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(q0 q0Var) {
        int i7 = q0Var.f52944c;
        j0 j0Var = q0Var.f52945e;
        int i10 = i7 - 1;
        q0Var.f52944c = i10;
        if (i10 > 0) {
            return;
        }
        Handler handler = this.f52956c;
        handler.removeCallbacks(j0Var);
        handler.postDelayed(j0Var, 30000L);
    }
}
