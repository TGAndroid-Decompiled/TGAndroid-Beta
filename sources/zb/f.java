package zb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.internal.cast.p;
import com.google.firebase.messaging.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import n6.j;
import n6.k;
import n6.m;
import n7.z0;
import w7.j8;
import x7.d7;
import x7.da;
import x7.e7;
import x7.f8;
import x7.fa;
import x7.g7;
import x7.g8;
import x7.ga;
import x7.h8;
import x7.m7;
import x7.n7;
import x7.o;
import x7.o7;
import x7.r0;
import x7.s;
public final class f extends qb.e {
    public boolean d = true;
    public final h8 f54400e;
    public final b f54401f;
    public final fa f54402g;
    public final ga h;

    public f(yb.a aVar, b bVar, fa faVar) {
        m.i(aVar, "ImageLabelerOptions can not be null");
        this.f54401f = bVar;
        this.f54402g = faVar;
        ?? obj = new Object();
        obj.f49855a = Float.valueOf(aVar.f51198a);
        this.f54400e = new h8(obj);
        this.h = new ga(qb.g.c().b(), 0);
    }

    @Override
    public final synchronized void b() {
        this.f54401f.zzb();
        fa faVar = this.f54402g;
        ?? obj = new Object();
        obj.f7955c = m7.TYPE_THIN;
        k kVar = new k(28);
        kVar.f16729b = this.f54400e;
        x7.m mVar = o.f50972b;
        Object[] objArr = {n7.NO_ERROR};
        j8.a(1, objArr);
        kVar.f16730c = new s(1, objArr);
        obj.d = new g8(kVar);
        qb.m.f46169a.execute(new p(faVar, new a5.a((n) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_LOAD, faVar.b(), 7));
    }

    @Override
    public final synchronized void c() {
        this.f54401f.zzc();
        this.d = true;
        fa faVar = this.f54402g;
        ?? obj = new Object();
        obj.f7955c = m7.TYPE_THIN;
        qb.m.f46169a.execute(new p(faVar, new a5.a((n) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_CLOSE, faVar.b(), 7));
    }

    @Override
    public final Object e(vb.a aVar) {
        n7 n7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f54401f.a(aVar);
                f(n7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (mb.a e7) {
                if (e7.f16312a == 14) {
                    n7Var = n7.MODEL_NOT_DOWNLOADED;
                } else {
                    n7Var = n7.UNKNOWN_ERROR;
                }
                f(n7Var, aVar, elapsedRealtime);
                throw e7;
            }
        }
        return a2;
    }

    public final void f(n7 n7Var, vb.a aVar, long j3) {
        int i10;
        d7 d7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        fa faVar = this.f54402g;
        o7 o7Var = o7.ON_DEVICE_IMAGE_LABEL_DETECT;
        faVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (faVar.c(o7Var, elapsedRealtime2)) {
            faVar.f50859i.put(o7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f7955c = m7.TYPE_THIN;
            v7.k kVar = new v7.k(11, false);
            ?? obj2 = new Object();
            obj2.f6064a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f6065b = n7Var;
            obj2.f6066c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.f6067e = bool;
            kVar.f49333b = new g7(obj2);
            int i11 = aVar.f49605e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.f49602a;
                m.h(bitmap);
                i10 = bitmap.getAllocationByteCount();
            } else if (i11 != 17 && i11 != 842094169) {
                if (i11 != 35) {
                    i10 = 0;
                } else {
                    m.h(null);
                    throw null;
                }
            } else {
                m.h(null);
                throw null;
            }
            z0 z0Var = new z0(25, (byte) 0);
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
            z0Var.f16869b = d7Var;
            z0Var.f16870c = Integer.valueOf(i10 & Integer.MAX_VALUE);
            kVar.d = new e7(z0Var);
            kVar.f49334c = this.f54400e;
            obj.f7956e = new f8(kVar);
            qb.m.f46169a.execute(new p(faVar, new a5.a((n) obj, 0), o7Var, faVar.b(), 7));
        }
        v7.k kVar2 = new v7.k(10, false);
        kVar2.d = this.f54400e;
        kVar2.f49333b = n7Var;
        kVar2.f49334c = Boolean.valueOf(this.d);
        qb.m.f46169a.execute(new da(this.f54402g, new r0(kVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        ga gaVar = this.h;
        int i12 = n7Var.f50971a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (gaVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (gaVar.f50874b.get() != -1 && elapsedRealtime3 - gaVar.f50874b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            gaVar.f50873a.f(new n6.p(0, Arrays.asList(new j(24305, i12, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new e6.n(gaVar, elapsedRealtime3, 8));
        }
    }
}
