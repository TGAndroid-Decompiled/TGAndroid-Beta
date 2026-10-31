package sb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import c3.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import jb.g;
import n6.j;
import n6.l;
import w7.s8;
import x7.d7;
import x7.e7;
import x7.ea;
import x7.f8;
import x7.g7;
import x7.g8;
import x7.ga;
import x7.h8;
import x7.i8;
import x7.m;
import x7.m7;
import x7.n7;
import x7.o;
import x7.o7;
import x7.r0;
import x7.s;
public final class e extends jb.e {
    public boolean d = true;
    public final i8 e;
    public final a f48137f;
    public final ga f48138g;
    public final u9.b h;

    public e(rb.a aVar, a aVar2, ga gaVar) {
        l.h(aVar, "ImageLabelerOptions can not be null");
        this.f48137f = aVar2;
        this.f48138g = gaVar;
        ?? obj = new Object();
        obj.f51092a = Float.valueOf(aVar.f45509a);
        this.e = new i8(obj);
        this.h = new u9.b(g.c().b(), 6);
    }

    @Override
    public final synchronized void b() {
        this.f48137f.zzb();
        ga gaVar = this.f48138g;
        ?? obj = new Object();
        obj.f9349c = m7.TYPE_THIN;
        g8 g8Var = new g8(0);
        g8Var.f53164b = this.e;
        m mVar = o.f53266b;
        Object[] objArr = {n7.NO_ERROR};
        s8.a(1, objArr);
        g8Var.f53165c = new s(1, objArr);
        obj.d = new h8(g8Var);
        jb.m.f9797a.execute(new com.google.android.gms.internal.cast.o(gaVar, new a5.a((j2.f) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_LOAD, gaVar.b(), 7));
    }

    @Override
    public final synchronized void c() {
        this.f48137f.zzc();
        this.d = true;
        ga gaVar = this.f48138g;
        ?? obj = new Object();
        obj.f9349c = m7.TYPE_THIN;
        jb.m.f9797a.execute(new com.google.android.gms.internal.cast.o(gaVar, new a5.a((j2.f) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_CLOSE, gaVar.b(), 7));
    }

    @Override
    public final Object e(ob.a aVar) {
        n7 n7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f48137f.a(aVar);
                f(n7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (fb.a e) {
                if (e.f6971a == 14) {
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

    public final void f(n7 n7Var, ob.a aVar, long j10) {
        int i10;
        d7 d7Var;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        ga gaVar = this.f48138g;
        o7 o7Var = o7.ON_DEVICE_IMAGE_LABEL_DETECT;
        gaVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (!gaVar.c(o7Var, elapsedRealtime2)) {
            z10 = false;
        } else {
            gaVar.f53173i.put(o7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f9349c = m7.TYPE_THIN;
            q5.d dVar = new q5.d(21, false);
            ?? obj2 = new Object();
            obj2.f2777a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f2778b = n7Var;
            obj2.f2779c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.e = bool;
            dVar.f45487b = new g7(obj2);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.f14121a;
                l.g(bitmap);
                i10 = bitmap.getAllocationByteCount();
            } else if (i11 != 17 && i11 != 842094169) {
                if (i11 != 35) {
                    i10 = 0;
                } else {
                    l.g(null);
                    throw null;
                }
            } else {
                l.g(null);
                throw null;
            }
            u9.b bVar = new u9.b(5);
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
            bVar.f50194b = d7Var;
            bVar.f50195c = Integer.valueOf(i10 & Integer.MAX_VALUE);
            dVar.d = new e7(bVar);
            dVar.f45488c = this.e;
            obj.e = new f8(dVar);
            z10 = false;
            jb.m.f9797a.execute(new com.google.android.gms.internal.cast.o(gaVar, new a5.a((j2.f) obj, 0), o7Var, gaVar.b(), 7));
        }
        q5.d dVar2 = new q5.d(20, z10);
        dVar2.d = this.e;
        dVar2.f45487b = n7Var;
        dVar2.f45488c = Boolean.valueOf(this.d);
        jb.m.f9797a.execute(new ea(this.f48138g, new r0(dVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        u9.b bVar2 = this.h;
        int i12 = n7Var.f53265a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (bVar2) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (((AtomicLong) bVar2.f50195c).get() != -1 && elapsedRealtime3 - ((AtomicLong) bVar2.f50195c).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((p6.b) bVar2.f50194b).f(new n6.o(0, Arrays.asList(new j(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new g0(bVar2, elapsedRealtime3, 10));
        }
    }
}
