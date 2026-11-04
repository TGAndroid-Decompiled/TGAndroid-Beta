package vb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import b8.cg;
import b8.fg;
import b8.ig;
import b8.jg;
import b8.ke;
import b8.kg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import mb.g;
import p6.k;
import p6.m;
import p6.p;
import x7.u6;
import z7.c7;
import z7.d7;
import z7.da;
import z7.e8;
import z7.f7;
import z7.f8;
import z7.g8;
import z7.l;
import z7.l7;
import z7.m7;
import z7.n;
import z7.n7;
import z7.r;
import z7.r0;
public final class e extends mb.e {
    public boolean d = true;
    public final g8 f56510e;
    public final a f56511f;
    public final da f56512g;
    public final jg h;

    public e(ub.a aVar, a aVar2, da daVar) {
        m.h(aVar, "ImageLabelerOptions can not be null");
        this.f56511f = aVar2;
        this.f56512g = daVar;
        ?? obj = new Object();
        obj.f58284a = Float.valueOf(aVar.f55080a);
        this.f56510e = new g8(obj);
        this.h = new jg(g.c().b(), 2);
    }

    @Override
    public final synchronized void b() {
        this.f56511f.zzb();
        da daVar = this.f56512g;
        ?? obj = new Object();
        obj.f17691c = l7.TYPE_THIN;
        ua.b bVar = new ua.b(8);
        bVar.f55783b = this.f56510e;
        l lVar = n.f59960b;
        Object[] objArr = {m7.NO_ERROR};
        u6.a(1, objArr);
        bVar.f55784c = new r(1, objArr);
        obj.d = new f8(bVar);
        mb.m.f19245a.execute(new cg(daVar, new kg((l2.e) obj, 0), n7.ON_DEVICE_IMAGE_LABEL_LOAD, daVar.b(), 8));
    }

    @Override
    public final synchronized void c() {
        this.f56511f.zzc();
        this.d = true;
        da daVar = this.f56512g;
        ?? obj = new Object();
        obj.f17691c = l7.TYPE_THIN;
        mb.m.f19245a.execute(new cg(daVar, new kg((l2.e) obj, 0), n7.ON_DEVICE_IMAGE_LABEL_CLOSE, daVar.b(), 8));
    }

    @Override
    public final Object e(rb.a aVar) {
        m7 m7Var;
        ArrayList a10;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a10 = this.f56511f.a(aVar);
                f(m7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (ib.a e10) {
                if (e10.f14716a == 14) {
                    m7Var = m7.MODEL_NOT_DOWNLOADED;
                } else {
                    m7Var = m7.UNKNOWN_ERROR;
                }
                f(m7Var, aVar, elapsedRealtime);
                throw e10;
            }
        }
        return a10;
    }

    public final void f(m7 m7Var, rb.a aVar, long j10) {
        int i3;
        c7 c7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        da daVar = this.f56512g;
        n7 n7Var = n7.ON_DEVICE_IMAGE_LABEL_DETECT;
        daVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (daVar.c(n7Var, elapsedRealtime2)) {
            daVar.f59847i.put(n7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f17691c = l7.TYPE_THIN;
            ?? obj2 = new Object();
            ke keVar = new ke(21);
            keVar.f2716b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            keVar.f2717c = m7Var;
            keVar.d = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            keVar.f2718e = bool;
            keVar.f2719f = bool;
            obj2.f60011b = new f7(keVar);
            int i10 = aVar.f54471e;
            if (i10 == -1) {
                Bitmap bitmap = aVar.f54468a;
                m.g(bitmap);
                i3 = bitmap.getAllocationByteCount();
            } else if (i10 != 17 && i10 != 842094169) {
                if (i10 != 35) {
                    i3 = 0;
                } else {
                    m.g(null);
                    throw null;
                }
            } else {
                m.g(null);
                throw null;
            }
            w9.b bVar = new w9.b();
            if (i10 != -1) {
                if (i10 != 35) {
                    if (i10 != 842094169) {
                        if (i10 != 16) {
                            if (i10 != 17) {
                                c7Var = c7.UNKNOWN_FORMAT;
                            } else {
                                c7Var = c7.NV21;
                            }
                        } else {
                            c7Var = c7.NV16;
                        }
                    } else {
                        c7Var = c7.YV12;
                    }
                } else {
                    c7Var = c7.YUV_420_888;
                }
            } else {
                c7Var = c7.BITMAP;
            }
            bVar.f57424b = c7Var;
            bVar.f57425c = Integer.valueOf(i3 & Integer.MAX_VALUE);
            obj2.f60012c = new d7(bVar);
            obj2.f60010a = this.f56510e;
            obj.f17692e = new e8(obj2);
            mb.m.f19245a.execute(new cg(daVar, new kg((l2.e) obj, 0), n7Var, daVar.b(), 8));
        }
        ?? obj3 = new Object();
        obj3.f60010a = this.f56510e;
        obj3.f60011b = m7Var;
        obj3.f60012c = Boolean.valueOf(this.d);
        mb.m.f19245a.execute(new fg(this.f56512g, new r0(obj3), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        jg jgVar = this.h;
        int i11 = m7Var.f59957a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (jgVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (jgVar.f2700b.get() != -1 && elapsedRealtime3 - jgVar.f2700b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            jgVar.f2699a.f(new p(0, Arrays.asList(new k(24305, i11, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ig(jgVar, elapsedRealtime3, 11));
        }
    }
}
