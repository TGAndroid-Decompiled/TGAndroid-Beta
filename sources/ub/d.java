package ub;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c3.g0;
import com.google.android.gms.internal.cast.o;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import jb.e;
import jb.g;
import jb.j;
import jb.m;
import m.p3;
import n6.l;
import v7.y8;
import w7.o6;
import x7.ea;
import z7.bg;
import z7.eg;
import z7.fb;
import z7.fg;
import z7.gb;
import z7.gg;
import z7.hb;
import z7.hg;
import z7.i1;
import z7.ig;
import z7.jg;
import z7.kg;
import z7.xf;
public final class d extends e {
    public static final k6.c[] f50204k = {j.f9792c};
    public static final pb.a f50205l = pb.a.f44896a;
    public final Context d;
    public final tb.d e;
    public final xf f50206f;
    public final y8 f50207g;
    public boolean h = true;
    public boolean f50208i;
    public eg f50209j;

    public d(g gVar, tb.d dVar, xf xfVar, y8 y8Var) {
        l.h(gVar, "MlKitContext can not be null");
        l.h(dVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = dVar;
        this.f50206f = xfVar;
        this.f50207g = y8Var;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            k6.c[] cVarArr = f50204k;
            if (!j.a(context, cVarArr)) {
                if (!this.f50208i) {
                    j.c(this.d, cVarArr);
                    this.f50208i = true;
                }
                f(gb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new fb.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f50209j == null) {
                    IBinder b10 = y6.e.c(this.d, y6.e.f54188b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = gg.f54811a;
                    if (b10 == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        if (queryLocalInterface instanceof hg) {
                            aVar = (hg) queryLocalInterface;
                        } else {
                            aVar = new a9.a(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 11);
                        }
                    }
                    x6.b bVar = new x6.b(this.d);
                    this.e.getClass();
                    tb.d dVar = this.e;
                    this.f50209j = ((fg) aVar).X0(bVar, new kg(false, dVar.f48589a, dVar.f48590b, false, dVar.f48591c));
                }
                try {
                    eg egVar = this.f50209j;
                    egVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(egVar.f318c);
                    egVar.T0(obtain, 1);
                    f(gb.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e) {
                    f(gb.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new fb.a("Failed to init module subject segmenter", e);
                }
            } catch (Exception e7) {
                f(gb.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new fb.a("Failed to load subject segmentation module", e7);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            eg egVar = this.f50209j;
            if (egVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(egVar.f318c);
                egVar.T0(obtain, 2);
            }
            this.f50209j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f50209j = null;
        }
        this.h = true;
        xf xfVar = this.f50206f;
        hb hbVar = hb.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        xfVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (xfVar.d(hbVar, elapsedRealtime)) {
            xfVar.f55170i.put(hbVar, Long.valueOf(elapsedRealtime));
            ?? obj = new Object();
            obj.f12520c = fb.TYPE_THIN;
            m.f9797a.execute(new o(xfVar, new a5.a((p3) obj, 0), hbVar, xfVar.c(), 8));
        }
    }

    @Override
    public final Object e(ob.a aVar) {
        Throwable th2;
        x6.b bVar;
        d dVar;
        ob.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    eg egVar = this.f50209j;
                    l.g(egVar);
                    bg bgVar = new bg(aVar.e, aVar.f14122b, aVar.f14123c, SystemClock.elapsedRealtime(), o6.a(aVar.d));
                    int i10 = aVar.e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 != 35) {
                                    if (i10 != 842094169) {
                                        int i11 = aVar.e;
                                        throw new fb.a("Unsupported image format: " + i11, 3);
                                    }
                                } else {
                                    bVar = new x6.b(null);
                                }
                            }
                            l.g(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f14121a;
                        l.g(bitmap);
                        bVar = new x6.b(bitmap);
                        try {
                            jg X0 = egVar.X0(bVar, bgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.f48590b) {
                                for (ig igVar : X0.f54987a) {
                                    float[] fArr = igVar.f54972a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new tb.a(igVar.f54973b, igVar.f54974c, igVar.d, igVar.e, igVar.f54975f));
                                }
                            }
                            dVar = this;
                            aVar2 = aVar;
                            try {
                                dVar.g(gb.NO_ERROR, elapsedRealtime, this.h, aVar2, X0);
                                dVar.h = false;
                                float[] fArr2 = X0.f54988b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e) {
                                            e = e;
                                            dVar.g(gb.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, dVar.h, aVar2, null);
                                            throw new fb.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e7) {
                                        e = e7;
                                    }
                                }
                                return new tb.b(arrayList);
                            } catch (RemoteException e10) {
                                e = e10;
                            }
                        } catch (RemoteException e11) {
                            e = e11;
                            dVar = this;
                            aVar2 = aVar;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void f(gb gbVar, long j10) {
        this.f50206f.b(new ki.g(this, gbVar, j10), hb.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(gb gbVar, long j10, boolean z10, ob.a aVar, jg jgVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f50206f.b(new k.j(this, elapsedRealtime, gbVar, z10, aVar, jgVar), hb.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        q5.d dVar = new q5.d(28, false);
        dVar.d = this.e.a();
        dVar.f45487b = gbVar;
        dVar.f45488c = Boolean.valueOf(z10);
        m.f9797a.execute(new ea(this.f50206f, new i1(dVar), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        y8 y8Var = this.f50207g;
        int i10 = gbVar.f54807a;
        synchronized (y8Var) {
            AtomicLong atomicLong = y8Var.f50659b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - y8Var.f50659b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            y8Var.f50658a.f(new n6.o(0, Arrays.asList(new n6.j(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new g0(y8Var, elapsedRealtime2, 11));
        }
    }
}
