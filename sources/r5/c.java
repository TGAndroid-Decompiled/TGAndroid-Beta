package r5;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.n4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import q5.f0;
public final class c extends f {
    public static final u5.b f46733m = new u5.b("CastSession", null);
    public final Context f46734c;
    public final HashSet d;
    public final q f46735e;
    public final b f46736f;
    public final com.google.android.gms.internal.cast.o f46737g;
    public final t5.h h;
    public f0 f46738i;
    public s5.h f46739j;
    public CastDevice f46740k;
    public n4 f46741l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.o oVar, t5.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f46734c = context.getApplicationContext();
        this.f46736f = bVar;
        this.f46737g = oVar;
        this.h = hVar;
        l6.a f10 = f();
        j jVar = new j(this);
        u5.b bVar2 = com.google.android.gms.internal.cast.d.f2974a;
        q qVar = null;
        if (f10 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.d.b(context).U0(bVar, f10, jVar);
            } catch (RemoteException | d e6) {
                com.google.android.gms.internal.cast.d.f2974a.a(e6, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            }
        }
        this.f46735e = qVar;
    }

    public static void g(c cVar, int i10) {
        t5.h hVar = cVar.h;
        if (hVar.f48056q) {
            hVar.f48056q = false;
            s5.h hVar2 = hVar.f48053n;
            if (hVar2 != null) {
                d0 d0Var = hVar.f48052m;
                b6.m.e("Must be called from the main thread.");
                if (d0Var != null) {
                    hVar2.f47082i.remove(d0Var);
                }
            }
            hVar.f48044c.J0(null);
            c5.j jVar = hVar.h;
            if (jVar != null) {
                jVar.C();
                jVar.f2318e = null;
            }
            c5.j jVar2 = hVar.f48048i;
            if (jVar2 != null) {
                jVar2.C();
                jVar2.f2318e = null;
            }
            android.support.v4.media.session.c0 c0Var = hVar.f48055p;
            if (c0Var != null) {
                c0Var.d(null, null);
                hVar.f48055p.e(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.c0 c0Var2 = hVar.f48055p;
            if (c0Var2 != null) {
                c0Var2.c(false);
                hVar.f48055p.b();
                hVar.f48055p = null;
            }
            hVar.f48053n = null;
            hVar.f48054o = null;
            hVar.h();
            if (i10 == 0) {
                hVar.i();
            }
        }
        f0 f0Var = cVar.f46738i;
        if (f0Var != null) {
            com.google.android.gms.common.api.internal.v e6 = com.google.android.gms.common.api.internal.w.e();
            e6.f2824c = q5.z.f44673b;
            e6.f2822a = 8403;
            f0Var.e(1, e6.e());
            f0Var.h();
            com.google.android.gms.common.api.internal.n nVar = y5.h.h(f0Var.f2856f, f0Var.f44574k, "castDeviceControllerListenerKey").f2779c;
            b6.m.i(nVar, "Key must not be null");
            f0Var.c(nVar, 8415);
            cVar.f46738i = null;
        }
        cVar.f46740k = null;
        s5.h hVar3 = cVar.f46739j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.f46739j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        u5.b bVar = f46733m;
        q qVar = cVar.f46735e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                u5.u uVar = (u5.u) task.getResult();
                Status status = uVar.f48427a;
                if (status.e()) {
                    bVar.b("%s() -> success result", str);
                    s5.h hVar = new s5.h(new u5.n());
                    cVar.f46739j = hVar;
                    hVar.v(cVar.f46738i);
                    cVar.f46739j.p(new d0(cVar, 0));
                    cVar.f46739j.u();
                    t5.h hVar2 = cVar.h;
                    s5.h hVar3 = cVar.f46739j;
                    b6.m.e("Must be called from the main thread.");
                    hVar2.a(hVar3, cVar.f46740k);
                    q5.d dVar = uVar.f48428b;
                    b6.m.h(dVar);
                    String str2 = uVar.f48429c;
                    String str3 = uVar.d;
                    b6.m.h(str3);
                    boolean z4 = uVar.f48430e;
                    o oVar = (o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.s.c(M0, dVar);
                    M0.writeString(str2);
                    M0.writeString(str3);
                    M0.writeInt(z4 ? 1 : 0);
                    oVar.Q0(M0, 4);
                    return;
                }
                bVar.b("%s() -> failure result", str);
                int i10 = status.f2646a;
                o oVar2 = (o) qVar;
                Parcel M02 = oVar2.M0();
                M02.writeInt(i10);
                oVar2.Q0(M02, 5);
                return;
            }
            Exception exception = task.getException();
            if (exception instanceof com.google.android.gms.common.api.f) {
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                o oVar3 = (o) qVar;
                Parcel M03 = oVar3.M0();
                M03.writeInt(statusCode);
                oVar3.Q0(M03, 5);
                return;
            }
            o oVar4 = (o) qVar;
            Parcel M04 = oVar4.M0();
            M04.writeInt(2476);
            oVar4.Q0(M04, 5);
        } catch (RemoteException e6) {
            bVar.a(e6, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: r5.c.i(android.os.Bundle):void");
    }
}
