package zb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.firebase.messaging.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import n6.l;
import n6.p;
import org.telegram.ui.Cells.f3;
import v7.s1;
import w7.k8;
import x7.d7;
import x7.e7;
import x7.ea;
import x7.f7;
import x7.g8;
import x7.ga;
import x7.h7;
import x7.h8;
import x7.i8;
import x7.m;
import x7.n7;
import x7.o;
import x7.o7;
import x7.p7;
import x7.r0;
import x7.s;
public final class f extends qb.e {
    public boolean d = true;
    public final i8 e;
    public final b f49175f;
    public final ga f49176g;
    public final d7 h;

    public f(yb.a aVar, b bVar, ga gaVar) {
        l.i(aVar, "ImageLabelerOptions can not be null");
        this.f49175f = bVar;
        this.f49176g = gaVar;
        o0.b bVar2 = new o0.b(24, false);
        bVar2.f15487b = Float.valueOf(aVar.f46060a);
        this.e = new i8(bVar2);
        Context b10 = qb.g.c().b();
        ?? obj = new Object();
        obj.f45703b = new AtomicLong(-1L);
        obj.f45702a = new j(b10, p6.b.f41006k, new p("mlkit:vision"), i.f6033c);
        this.h = obj;
    }

    @Override
    public final synchronized void b() {
        this.f49175f.zzb();
        ga gaVar = this.f49176g;
        ?? obj = new Object();
        obj.f7330c = n7.TYPE_THIN;
        f3 f3Var = new f3(23);
        f3Var.f20284b = this.e;
        m mVar = o.f45845b;
        Object[] objArr = {o7.NO_ERROR};
        k8.a(1, objArr);
        f3Var.f20285c = new s(1, objArr);
        obj.d = new h8(f3Var);
        qb.m.f41578a.execute(new com.google.android.gms.internal.cast.p(gaVar, new a5.a((n) obj, 0), p7.ON_DEVICE_IMAGE_LABEL_LOAD, gaVar.b(), 7));
    }

    @Override
    public final synchronized void c() {
        this.f49175f.zzc();
        this.d = true;
        ga gaVar = this.f49176g;
        ?? obj = new Object();
        obj.f7330c = n7.TYPE_THIN;
        qb.m.f41578a.execute(new com.google.android.gms.internal.cast.p(gaVar, new a5.a((n) obj, 0), p7.ON_DEVICE_IMAGE_LABEL_CLOSE, gaVar.b(), 7));
    }

    @Override
    public final Object e(vb.a aVar) {
        o7 o7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f49175f.a(aVar);
                f(o7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (mb.a e) {
                if (e.f14988a == 14) {
                    o7Var = o7.MODEL_NOT_DOWNLOADED;
                } else {
                    o7Var = o7.UNKNOWN_ERROR;
                }
                f(o7Var, aVar, elapsedRealtime);
                throw e;
            }
        }
        return a2;
    }

    public final void f(o7 o7Var, vb.a aVar, long j3) {
        int i10;
        e7 e7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        ga gaVar = this.f49176g;
        p7 p7Var = p7.ON_DEVICE_IMAGE_LABEL_DETECT;
        gaVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (gaVar.c(p7Var, elapsedRealtime2)) {
            gaVar.f45752i.put(p7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f7330c = n7.TYPE_THIN;
            s1 s1Var = new s1(9, false);
            ?? obj2 = new Object();
            obj2.f4259a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f4260b = o7Var;
            obj2.f4261c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.e = bool;
            s1Var.f44405b = new h7(obj2);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.f44600a;
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
            ?? obj3 = new Object();
            if (i11 != -1) {
                if (i11 != 35) {
                    if (i11 != 842094169) {
                        if (i11 != 16) {
                            if (i11 != 17) {
                                e7Var = e7.UNKNOWN_FORMAT;
                            } else {
                                e7Var = e7.NV21;
                            }
                        } else {
                            e7Var = e7.NV16;
                        }
                    } else {
                        e7Var = e7.YV12;
                    }
                } else {
                    e7Var = e7.YUV_420_888;
                }
            } else {
                e7Var = e7.BITMAP;
            }
            obj3.f45702a = e7Var;
            obj3.f45703b = Integer.valueOf(i10 & Integer.MAX_VALUE);
            s1Var.f44406c = new f7(obj3);
            s1Var.d = this.e;
            obj.e = new g8(s1Var);
            qb.m.f41578a.execute(new com.google.android.gms.internal.cast.p(gaVar, new a5.a((n) obj, 0), p7Var, gaVar.b(), 7));
        }
        s1 s1Var2 = new s1(8, false);
        s1Var2.f44406c = this.e;
        s1Var2.f44405b = o7Var;
        s1Var2.d = Boolean.valueOf(this.d);
        qb.m.f41578a.execute(new ea(this.f49176g, new r0(s1Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        d7 d7Var = this.h;
        int i12 = o7Var.f45856a;
        long j10 = currentTimeMillis - elapsedRealtime;
        synchronized (d7Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) d7Var.f45703b).get() != -1 && elapsedRealtime3 - ((AtomicLong) d7Var.f45703b).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((p6.b) d7Var.f45702a).f(new n6.o(0, Arrays.asList(new n6.j(24305, i12, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new e6.n(d7Var, elapsedRealtime3, 8));
        }
    }
}
