package yb;

import a8.a0;
import a8.a8;
import a8.b8;
import a8.e1;
import a8.o7;
import a8.p7;
import a8.pa;
import a8.qa;
import a8.r7;
import a8.r8;
import a8.s;
import a8.s7;
import a8.s8;
import a8.t8;
import a8.ta;
import a8.u;
import a8.u0;
import a8.ua;
import a8.va;
import a8.wa;
import a8.y7;
import a8.z7;
import android.graphics.Bitmap;
import android.os.SystemClock;
import d6.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import pb.g;
import q4.q;
import q6.k;
import q6.m;
import q6.p;
public final class e extends pb.e {
    public boolean d = true;
    public final t8 f59346e;
    public final a f59347f;
    public final ta f59348g;
    public final va h;

    public e(xb.a aVar, a aVar2, ta taVar) {
        m.h(aVar, "ImageLabelerOptions can not be null");
        this.f59347f = aVar2;
        this.f59348g = taVar;
        i iVar = new i(1, false);
        iVar.f8209b = Float.valueOf(aVar.f57641a);
        this.f59346e = new t8(iVar);
        this.h = new va(g.c().b(), 0);
    }

    @Override
    public final synchronized void b() {
        this.f59347f.zzb();
        ta taVar = this.f59348g;
        ?? obj = new Object();
        obj.f337c = y7.TYPE_THIN;
        q qVar = new q(2, false);
        qVar.f53804b = this.f59346e;
        s sVar = u.f672b;
        Object[] objArr = {z7.NO_ERROR};
        u0.a(1, objArr);
        qVar.f53805c = new a0(1, objArr);
        obj.d = new s8(qVar);
        pb.m.f53545a.execute(new pa(taVar, new wa((b8) obj, 0), a8.ON_DEVICE_IMAGE_LABEL_LOAD, taVar.b(), 0));
    }

    @Override
    public final synchronized void c() {
        this.f59347f.zzc();
        this.d = true;
        ta taVar = this.f59348g;
        ?? obj = new Object();
        obj.f337c = y7.TYPE_THIN;
        pb.m.f53545a.execute(new pa(taVar, new wa((b8) obj, 0), a8.ON_DEVICE_IMAGE_LABEL_CLOSE, taVar.b(), 0));
    }

    @Override
    public final Object e(ub.a aVar) {
        z7 z7Var;
        ArrayList a10;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a10 = this.f59347f.a(aVar);
                f(z7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (lb.a e10) {
                if (e10.f18210a == 14) {
                    z7Var = z7.MODEL_NOT_DOWNLOADED;
                } else {
                    z7Var = z7.UNKNOWN_ERROR;
                }
                f(z7Var, aVar, elapsedRealtime);
                throw e10;
            }
        }
        return a10;
    }

    public final void f(z7 z7Var, ub.a aVar, long j3) {
        int i7;
        o7 o7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        ta taVar = this.f59348g;
        a8 a8Var = a8.ON_DEVICE_IMAGE_LABEL_DETECT;
        taVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (taVar.c(a8Var, elapsedRealtime2)) {
            taVar.f670i.put(a8Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f337c = y7.TYPE_THIN;
            android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(4, false);
            r7 r7Var = new r7(0, (byte) 0);
            r7Var.f614b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            r7Var.f615c = z7Var;
            r7Var.d = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            r7Var.f616e = bool;
            r7Var.f617f = bool;
            a0Var.f1763b = new s7(r7Var);
            int i10 = aVar.f56493e;
            if (i10 == -1) {
                Bitmap bitmap = aVar.f56490a;
                m.g(bitmap);
                i7 = bitmap.getAllocationByteCount();
            } else if (i10 != 17 && i10 != 842094169) {
                if (i10 != 35) {
                    i7 = 0;
                } else {
                    m.g(null);
                    throw null;
                }
            } else {
                m.g(null);
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
            bVar.f57655b = o7Var;
            bVar.f57656c = Integer.valueOf(i7 & Integer.MAX_VALUE);
            a0Var.d = new p7(bVar);
            a0Var.f1764c = this.f59346e;
            obj.f338e = new r8(a0Var);
            pb.m.f53545a.execute(new pa(taVar, new wa((b8) obj, 0), a8Var, taVar.b(), 0));
        }
        android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(3, false);
        a0Var2.d = this.f59346e;
        a0Var2.f1763b = z7Var;
        a0Var2.f1764c = Boolean.valueOf(this.d);
        pb.m.f53545a.execute(new qa(this.f59348g, new e1(a0Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        va vaVar = this.h;
        int i11 = z7Var.f751a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (vaVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (vaVar.f689b.get() != -1 && elapsedRealtime3 - vaVar.f689b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            vaVar.f688a.f(new p(0, Arrays.asList(new k(24305, i11, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ua(vaVar, elapsedRealtime3, 0));
        }
    }
}
