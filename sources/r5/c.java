package r5;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import androidx.biometric.f0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
public final class c extends f {
    public static final u5.b f43354m = new u5.b("CastSession", null);
    public final Context f43355c;
    public final HashSet d;
    public final q e;
    public final b f43356f;
    public final com.google.android.gms.internal.cast.p f43357g;
    public final t5.h h;
    public q5.e0 f43358i;
    public s5.h f43359j;
    public CastDevice f43360k;
    public o4 f43361l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.p pVar, t5.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f43355c = context.getApplicationContext();
        this.f43356f = bVar;
        this.f43357g = pVar;
        this.h = hVar;
        l6.a f10 = f();
        j jVar = new j(this);
        u5.b bVar2 = com.google.android.gms.internal.cast.d.f2989a;
        q qVar = null;
        if (f10 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.d.b(context).U0(bVar, f10, jVar);
            } catch (RemoteException | d e) {
                com.google.android.gms.internal.cast.d.f2989a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            }
        }
        this.e = qVar;
    }

    public static void g(c cVar, int i10) {
        t5.h hVar = cVar.h;
        if (hVar.f44609q) {
            hVar.f44609q = false;
            s5.h hVar2 = hVar.f44606n;
            if (hVar2 != null) {
                d0 d0Var = hVar.f44605m;
                b6.m.e("Must be called from the main thread.");
                if (d0Var != null) {
                    hVar2.f44077i.remove(d0Var);
                }
            }
            hVar.f44598c.J0(null);
            c5.j jVar = hVar.h;
            if (jVar != null) {
                jVar.C();
                jVar.e = null;
            }
            c5.j jVar2 = hVar.f44601i;
            if (jVar2 != null) {
                jVar2.C();
                jVar2.e = null;
            }
            android.support.v4.media.session.c0 c0Var = hVar.f44608p;
            if (c0Var != null) {
                c0Var.d(null, null);
                hVar.f44608p.e(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.c0 c0Var2 = hVar.f44608p;
            if (c0Var2 != null) {
                c0Var2.c(false);
                hVar.f44608p.b();
                hVar.f44608p = null;
            }
            hVar.f44606n = null;
            hVar.f44607o = null;
            hVar.h();
            if (i10 == 0) {
                hVar.i();
            }
        }
        q5.e0 e0Var = cVar.f43358i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
            e.f2885c = q5.z.f42882b;
            e.f2883a = 8403;
            e0Var.e(1, e.e());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = f0.f(e0Var.f2914f, e0Var.f42789k, "castDeviceControllerListenerKey").f2843c;
            b6.m.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f43358i = null;
        }
        cVar.f43360k = null;
        s5.h hVar3 = cVar.f43359j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.f43359j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        u5.b bVar = f43354m;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                u5.u uVar = (u5.u) task.getResult();
                Status status = uVar.f45137a;
                if (status.e()) {
                    bVar.b("%s() -> success result", str);
                    s5.h hVar = new s5.h(new u5.n());
                    cVar.f43359j = hVar;
                    hVar.v(cVar.f43358i);
                    cVar.f43359j.p(new d0(cVar, 0));
                    cVar.f43359j.u();
                    t5.h hVar2 = cVar.h;
                    s5.h hVar3 = cVar.f43359j;
                    b6.m.e("Must be called from the main thread.");
                    hVar2.a(hVar3, cVar.f43360k);
                    q5.d dVar = uVar.f45138b;
                    b6.m.h(dVar);
                    String str2 = uVar.f45139c;
                    String str3 = uVar.d;
                    b6.m.h(str3);
                    boolean z4 = uVar.e;
                    o oVar = (o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.t.c(M0, dVar);
                    M0.writeString(str2);
                    M0.writeString(str3);
                    M0.writeInt(z4 ? 1 : 0);
                    oVar.Q0(M0, 4);
                    return;
                }
                bVar.b("%s() -> failure result", str);
                int i10 = status.f2718a;
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
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: r5.c.i(android.os.Bundle):void");
    }
}
