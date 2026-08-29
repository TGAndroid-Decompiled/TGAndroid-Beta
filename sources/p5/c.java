package p5;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import o5.e0;
public final class c extends f {
    public static final s5.b f45623m = new s5.b("CastSession", null);
    public final Context f45624c;
    public final HashSet d;
    public final q f45625e;
    public final b f45626f;
    public final com.google.android.gms.internal.cast.q f45627g;
    public final r5.h h;
    public e0 f45628i;
    public q5.h f45629j;
    public CastDevice f45630k;
    public o4 f45631l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.q qVar, r5.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f45624c = context.getApplicationContext();
        this.f45626f = bVar;
        this.f45627g = qVar;
        this.h = hVar;
        j6.a f9 = f();
        j jVar = new j(this);
        s5.b bVar2 = com.google.android.gms.internal.cast.e.f4087a;
        q qVar2 = null;
        if (f9 != null) {
            try {
                qVar2 = com.google.android.gms.internal.cast.e.b(context).U0(bVar, f9, jVar);
            } catch (RemoteException | d e10) {
                com.google.android.gms.internal.cast.e.f4087a.a(e10, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.f45625e = qVar2;
    }

    public static void g(c cVar, int i10) {
        r5.h hVar = cVar.h;
        if (hVar.f47077q) {
            hVar.f47077q = false;
            q5.h hVar2 = hVar.f47074n;
            if (hVar2 != null) {
                c0 c0Var = hVar.f47073m;
                z5.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar2.f46397i.remove(c0Var);
                }
            }
            hVar.f47065c.J0(null);
            a5.j jVar = hVar.h;
            if (jVar != null) {
                jVar.x();
                jVar.f214e = null;
            }
            a5.j jVar2 = hVar.f47069i;
            if (jVar2 != null) {
                jVar2.x();
                jVar2.f214e = null;
            }
            android.support.v4.media.session.d0 d0Var = hVar.f47076p;
            if (d0Var != null) {
                d0Var.d(null, null);
                hVar.f47076p.e(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.d0 d0Var2 = hVar.f47076p;
            if (d0Var2 != null) {
                d0Var2.c(false);
                hVar.f47076p.b();
                hVar.f47076p = null;
            }
            hVar.f47074n = null;
            hVar.f47075o = null;
            hVar.h();
            if (i10 == 0) {
                hVar.i();
            }
        }
        e0 e0Var = cVar.f45628i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.f3928c = o5.z.f19351b;
            b10.f3926a = 8403;
            e0Var.e(1, b10.b());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = za.c.i(e0Var.f3960f, e0Var.f19252k, "castDeviceControllerListenerKey").f3887c;
            z5.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f45628i = null;
        }
        cVar.f45630k = null;
        q5.h hVar3 = cVar.f45629j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.f45629j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        s5.b bVar = f45623m;
        q qVar = cVar.f45625e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                s5.u uVar = (s5.u) task.getResult();
                Status status = uVar.f47622a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    q5.h hVar = new q5.h(new s5.n());
                    cVar.f45629j = hVar;
                    hVar.v(cVar.f45628i);
                    cVar.f45629j.p(new c0(cVar, 0));
                    cVar.f45629j.u();
                    r5.h hVar2 = cVar.h;
                    q5.h hVar3 = cVar.f45629j;
                    z5.l.e("Must be called from the main thread.");
                    hVar2.a(hVar3, cVar.f45630k);
                    o5.d dVar = uVar.f47623b;
                    z5.l.h(dVar);
                    String str2 = uVar.f47624c;
                    String str3 = uVar.d;
                    z5.l.h(str3);
                    boolean z10 = uVar.f47625e;
                    o oVar = (o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.u.c(M0, dVar);
                    M0.writeString(str2);
                    M0.writeString(str3);
                    M0.writeInt(z10 ? 1 : 0);
                    oVar.Q0(M0, 4);
                    return;
                }
                bVar.b("%s() -> failure result", str);
                int i10 = status.f3755a;
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
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: p5.c.i(android.os.Bundle):void");
    }
}
