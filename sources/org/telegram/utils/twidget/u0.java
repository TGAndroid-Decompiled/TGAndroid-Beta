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
public final class u0 extends k {
    public static final u0 f54411i = new u0();
    public t0 d;
    public Context f54416g;
    public boolean h;
    public final Object f54412b = new Object();
    public final Handler f54413c = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap f54414e = new ConcurrentHashMap();
    public final AtomicLong f54415f = new AtomicLong();

    public final t0 e() {
        t0 t0Var = this.d;
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0(this);
        if (this.f54416g.bindService(new Intent(this.f54416g, WidgetEngineService.class), t0Var2, 65)) {
            t0Var2.d = true;
            this.d = t0Var2;
            if (this.h) {
                h(t0Var2);
            }
            return t0Var2;
        }
        this.f54416g.unbindService(t0Var2);
        throw new IllegalStateException("Widget engine service is unavailable");
    }

    public final long f(android.content.Context r23, java.lang.String r24, java.lang.String r25, float r26, float r27, int r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, org.telegram.utils.twidget.WidgetSandboxBackend r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.u0.f(android.content.Context, java.lang.String, java.lang.String, float, float, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, org.telegram.utils.twidget.WidgetSandboxBackend):long");
    }

    public final void g(t0 t0Var) {
        t0Var.f54400a = null;
        if (t0Var.d) {
            t0Var.d = false;
            this.f54413c.removeCallbacks(t0Var.f54404f);
            if (this.d == t0Var) {
                this.d = null;
            }
            try {
                this.f54416g.unbindService(t0Var);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void h(t0 t0Var) {
        if (!t0Var.f54403e) {
            t0Var.f54403e = true;
            t0Var.f54402c++;
            this.f54413c.removeCallbacks(t0Var.f54404f);
            b bVar = t0Var.f54400a;
            if (bVar != null) {
                try {
                    bVar.b1();
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public final void i(t0 t0Var, int i7) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f54412b) {
            try {
                Iterator it = this.f54414e.entrySet().iterator();
                while (it.hasNext()) {
                    r0 r0Var = (r0) ((Map.Entry) it.next()).getValue();
                    if (r0Var.f54388a == t0Var && r0Var.f54389b == i7) {
                        arrayList.add(r0Var);
                        it.remove();
                        j(t0Var);
                    }
                }
                if (t0Var.f54401b == i7) {
                    g(t0Var);
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
            l1 session = ((r0) obj).f54390c.session();
            session.f54299a.post(new e1(session, 1));
        }
    }

    public final void j(t0 t0Var) {
        int i7 = t0Var.f54402c;
        j0 j0Var = t0Var.f54404f;
        int i10 = i7 - 1;
        t0Var.f54402c = i10;
        if (i10 > 0) {
            return;
        }
        Handler handler = this.f54413c;
        handler.removeCallbacks(j0Var);
        handler.postDelayed(j0Var, 30000L);
    }
}
