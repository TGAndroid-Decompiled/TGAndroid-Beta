package zb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.internal.cast.p;
import com.google.firebase.messaging.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import m.g3;
import n6.j;
import n6.l;
import n7.a1;
import og.u0;
import v7.a6;
import v7.z8;
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
    public final b f47974f;
    public final fa f47975g;
    public final z8 h;

    public f(yb.a aVar, b bVar, fa faVar) {
        l.i(aVar, "ImageLabelerOptions can not be null");
        this.f47974f = bVar;
        this.f47975g = faVar;
        g3 g3Var = new g3(26, false);
        g3Var.f13018b = Float.valueOf(aVar.f45081a);
        this.e = new h8(g3Var);
        this.h = new z8(qb.g.c().b(), 1);
    }

    @Override
    public final synchronized void b() {
        this.f47974f.zzb();
        fa faVar = this.f47975g;
        ?? obj = new Object();
        obj.f6105c = m7.TYPE_THIN;
        a1 a1Var = new a1(26, (byte) 0);
        a1Var.f13938b = this.e;
        m mVar = o.f44872b;
        Object[] objArr = {n7.NO_ERROR};
        j8.a(1, objArr);
        a1Var.f13939c = new s(1, objArr);
        obj.d = new g8(a1Var);
        qb.m.f40631a.execute(new p(faVar, new a5.a((n) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_LOAD, faVar.b(), 7));
    }

    @Override
    public final synchronized void c() {
        this.f47974f.zzc();
        this.d = true;
        fa faVar = this.f47975g;
        ?? obj = new Object();
        obj.f6105c = m7.TYPE_THIN;
        qb.m.f40631a.execute(new p(faVar, new a5.a((n) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_CLOSE, faVar.b(), 7));
    }

    @Override
    public final Object e(vb.a aVar) {
        n7 n7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f47974f.a(aVar);
                f(n7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (mb.a e) {
                if (e.f13594a == 14) {
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
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        fa faVar = this.f47975g;
        o7 o7Var = o7.ON_DEVICE_IMAGE_LABEL_DETECT;
        faVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (!faVar.c(o7Var, elapsedRealtime2)) {
            z10 = false;
        } else {
            faVar.f44767i.put(o7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f6105c = m7.TYPE_THIN;
            a6 a6Var = new a6(7, false);
            ?? obj2 = new Object();
            obj2.f3719a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f3720b = n7Var;
            obj2.f3721c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.e = bool;
            a6Var.f42934b = new g7(obj2);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.f43300a;
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
            u0 u0Var = new u0(24);
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
            u0Var.f14497b = d7Var;
            u0Var.f14498c = Integer.valueOf(i10 & Integer.MAX_VALUE);
            a6Var.d = new e7(u0Var);
            a6Var.f42935c = this.e;
            obj.e = new f8(a6Var);
            z10 = false;
            qb.m.f40631a.execute(new p(faVar, new a5.a((n) obj, 0), o7Var, faVar.b(), 7));
        }
        a6 a6Var2 = new a6(6, z10);
        a6Var2.f42935c = this.e;
        a6Var2.f42934b = n7Var;
        a6Var2.d = Boolean.valueOf(this.d);
        qb.m.f40631a.execute(new da(this.f47975g, new r0(a6Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        z8 z8Var = this.h;
        int i12 = n7Var.f44868a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (z8Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (z8Var.f43222b.get() != -1 && elapsedRealtime3 - z8Var.f43222b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            z8Var.f43221a.f(new n6.o(0, Arrays.asList(new j(24305, i12, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new e6.n(z8Var, elapsedRealtime3, 8));
        }
    }
}
