package yb;

import a8.a0;
import a8.a8;
import a8.b8;
import a8.e1;
import a8.o7;
import a8.p7;
import a8.qa;
import a8.r7;
import a8.r8;
import a8.ra;
import a8.s;
import a8.s7;
import a8.s8;
import a8.u;
import a8.u0;
import a8.u8;
import a8.ua;
import a8.va;
import a8.wa;
import a8.xa;
import a8.y7;
import a8.z7;
import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import pb.g;
import pb.n;
import q4.q;
import q6.k;
import q6.m;
import q6.p;
public final class d extends pb.e {
    public boolean d = true;
    public final u8 f61126e;
    public final a f61127f;
    public final ua f61128g;
    public final wa h;

    public d(xb.a aVar, a aVar2, ua uaVar) {
        m.i(aVar, "ImageLabelerOptions can not be null");
        this.f61127f = aVar2;
        this.f61128g = uaVar;
        ?? obj = new Object();
        obj.f649a = Float.valueOf(aVar.f59659a);
        this.f61126e = new u8(obj);
        this.h = new wa(g.c().b(), 0);
    }

    @Override
    public final synchronized void b() {
        this.f61127f.zzb();
        ua uaVar = this.f61128g;
        ?? obj = new Object();
        obj.f343c = y7.TYPE_THIN;
        q qVar = new q(2, false);
        qVar.f55826b = this.f61126e;
        s sVar = u.f650b;
        Object[] objArr = {z7.NO_ERROR};
        u0.a(1, objArr);
        qVar.f55827c = new a0(1, objArr);
        obj.d = new s8(qVar);
        n.f55540a.execute(new qa(uaVar, new xa((b8) obj, 0), a8.ON_DEVICE_IMAGE_LABEL_LOAD, uaVar.b(), 0));
    }

    @Override
    public final synchronized void c() {
        this.f61127f.zzc();
        this.d = true;
        ua uaVar = this.f61128g;
        ?? obj = new Object();
        obj.f343c = y7.TYPE_THIN;
        n.f55540a.execute(new qa(uaVar, new xa((b8) obj, 0), a8.ON_DEVICE_IMAGE_LABEL_CLOSE, uaVar.b(), 0));
    }

    @Override
    public final Object e(ub.a aVar) {
        z7 z7Var;
        ArrayList c10;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                c10 = this.f61127f.c(aVar);
                f(z7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (lb.a e10) {
                if (e10.f19707a == 14) {
                    z7Var = z7.MODEL_NOT_DOWNLOADED;
                } else {
                    z7Var = z7.UNKNOWN_ERROR;
                }
                f(z7Var, aVar, elapsedRealtime);
                throw e10;
            }
        }
        return c10;
    }

    public final void f(z7 z7Var, ub.a aVar, long j3) {
        int i7;
        o7 o7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        ua uaVar = this.f61128g;
        a8 a8Var = a8.ON_DEVICE_IMAGE_LABEL_DETECT;
        uaVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (uaVar.c(a8Var, elapsedRealtime2)) {
            uaVar.f674i.put(a8Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f343c = y7.TYPE_THIN;
            android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(4, false);
            r7 r7Var = new r7(0, (byte) 0);
            r7Var.f617b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            r7Var.f618c = z7Var;
            r7Var.d = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            r7Var.f619e = bool;
            r7Var.f620f = bool;
            a0Var.f1705b = new s7(r7Var);
            int i10 = aVar.f58566e;
            if (i10 == -1) {
                Bitmap bitmap = aVar.f58563a;
                m.h(bitmap);
                i7 = bitmap.getAllocationByteCount();
            } else if (i10 != 17 && i10 != 842094169) {
                if (i10 != 35) {
                    i7 = 0;
                } else {
                    m.h(null);
                    throw null;
                }
            } else {
                m.h(null);
                throw null;
            }
            wf.b bVar = new wf.b(1, false);
            if (i10 != -1) {
                if (i10 != 35) {
                    if (i10 != 842094169) {
                        if (i10 != 16) {
                            if (i10 != 17) {
                                o7Var = o7.UNKNOWN_FORMAT;
                            } else {
                                o7Var = o7.NV21;
                            }
                        } else {
                            o7Var = o7.NV16;
                        }
                    } else {
                        o7Var = o7.YV12;
                    }
                } else {
                    o7Var = o7.YUV_420_888;
                }
            } else {
                o7Var = o7.BITMAP;
            }
            bVar.f59673b = o7Var;
            bVar.f59674c = Integer.valueOf(i7 & Integer.MAX_VALUE);
            a0Var.d = new p7(bVar);
            a0Var.f1706c = this.f61126e;
            obj.f344e = new r8(a0Var);
            n.f55540a.execute(new qa(uaVar, new xa((b8) obj, 0), a8Var, uaVar.b(), 0));
        }
        android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(3, false);
        a0Var2.d = this.f61126e;
        a0Var2.f1705b = z7Var;
        a0Var2.f1706c = Boolean.valueOf(this.d);
        n.f55540a.execute(new ra(this.f61128g, new e1(a0Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        wa waVar = this.h;
        int i11 = z7Var.f750a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (waVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (waVar.f705b.get() != -1 && elapsedRealtime3 - waVar.f705b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            waVar.f704a.f(new p(0, Arrays.asList(new k(24305, i11, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new va(waVar, elapsedRealtime3, 0));
        }
    }
}
