package zb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.internal.cast.p;
import com.google.firebase.messaging.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import n6.j;
import n6.l;
import n7.a1;
import v7.r2;
import w7.j8;
import x7.d7;
import x7.da;
import x7.e7;
import x7.f8;
import x7.fa;
import x7.g7;
import x7.g8;
import x7.h8;
import x7.m;
import x7.m7;
import x7.n7;
import x7.o;
import x7.o7;
import x7.r0;
import x7.s;
public final class f extends qb.e {
    public boolean d = true;
    public final h8 e;
    public final b f48855f;
    public final fa f48856g;
    public final o0.a h;

    public f(yb.a aVar, b bVar, fa faVar) {
        l.i(aVar, "ImageLabelerOptions can not be null");
        this.f48855f = bVar;
        this.f48856g = faVar;
        ?? obj = new Object();
        obj.f44265a = Float.valueOf(aVar.f45741a);
        this.e = new h8(obj);
        this.h = new o0.a(qb.g.c().b());
    }

    @Override
    public final synchronized void b() {
        this.f48855f.zzb();
        fa faVar = this.f48856g;
        ?? obj = new Object();
        obj.f7333c = m7.TYPE_THIN;
        a1 a1Var = new a1(26);
        a1Var.f15108b = this.e;
        m mVar = o.f45532b;
        Object[] objArr = {n7.NO_ERROR};
        j8.a(1, objArr);
        a1Var.f15109c = new s(1, objArr);
        obj.d = new g8(a1Var);
        qb.m.f41254a.execute(new p(faVar, new a5.a((n) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_LOAD, faVar.b(), 7));
    }

    @Override
    public final synchronized void c() {
        this.f48855f.zzc();
        this.d = true;
        fa faVar = this.f48856g;
        ?? obj = new Object();
        obj.f7333c = m7.TYPE_THIN;
        qb.m.f41254a.execute(new p(faVar, new a5.a((n) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_CLOSE, faVar.b(), 7));
    }

    @Override
    public final Object e(vb.a aVar) {
        n7 n7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f48855f.a(aVar);
                f(n7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (mb.a e) {
                if (e.f14752a == 14) {
                    n7Var = n7.MODEL_NOT_DOWNLOADED;
                } else {
                    n7Var = n7.UNKNOWN_ERROR;
                }
                f(n7Var, aVar, elapsedRealtime);
                throw e;
            }
        }
        return a2;
    }

    public final void f(n7 n7Var, vb.a aVar, long j3) {
        int i10;
        d7 d7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        fa faVar = this.f48856g;
        o7 o7Var = o7.ON_DEVICE_IMAGE_LABEL_DETECT;
        faVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (faVar.c(o7Var, elapsedRealtime2)) {
            faVar.f45427i.put(o7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f7333c = m7.TYPE_THIN;
            r2 r2Var = new r2(8, false);
            ?? obj2 = new Object();
            obj2.f4255a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f4256b = n7Var;
            obj2.f4257c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.e = bool;
            r2Var.f44079b = new g7(obj2);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.f44281a;
                l.h(bitmap);
                i10 = bitmap.getAllocationByteCount();
            } else if (i11 != 17 && i11 != 842094169) {
                if (i11 != 35) {
                    i10 = 0;
                } else {
                    l.h(null);
                    throw null;
                }
            } else {
                l.h(null);
                throw null;
            }
            o0.a aVar2 = new o0.a(25, (byte) 0);
            if (i11 != -1) {
                if (i11 != 35) {
                    if (i11 != 842094169) {
                        if (i11 != 16) {
                            if (i11 != 17) {
                                d7Var = d7.UNKNOWN_FORMAT;
                            } else {
                                d7Var = d7.NV21;
                            }
                        } else {
                            d7Var = d7.NV16;
                        }
                    } else {
                        d7Var = d7.YV12;
                    }
                } else {
                    d7Var = d7.YUV_420_888;
                }
            } else {
                d7Var = d7.BITMAP;
            }
            aVar2.f15300b = d7Var;
            aVar2.f15301c = Integer.valueOf(i10 & Integer.MAX_VALUE);
            r2Var.d = new e7(aVar2);
            r2Var.f44080c = this.e;
            obj.e = new f8(r2Var);
            qb.m.f41254a.execute(new p(faVar, new a5.a((n) obj, 0), o7Var, faVar.b(), 7));
        }
        r2 r2Var2 = new r2(7, false);
        r2Var2.d = this.e;
        r2Var2.f44079b = n7Var;
        r2Var2.f44080c = Boolean.valueOf(this.d);
        qb.m.f41254a.execute(new da(this.f48856g, new r0(r2Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        o0.a aVar3 = this.h;
        int i12 = n7Var.f45528a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (aVar3) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) aVar3.f15301c).get() != -1 && elapsedRealtime3 - ((AtomicLong) aVar3.f15301c).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((p6.b) aVar3.f15300b).f(new n6.o(0, Arrays.asList(new j(24305, i12, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new e6.n(aVar3, elapsedRealtime3, 8));
        }
    }
}
