package xb;

import a7.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.util.Log;
import b8.cg;
import b8.fg;
import b8.hg;
import b8.ig;
import b8.jg;
import b8.kg;
import b8.lb;
import b8.nb;
import b8.ob;
import b8.p1;
import b8.qg;
import b8.tg;
import b8.ug;
import b8.vg;
import b8.wg;
import b8.xg;
import b8.yg;
import b8.zg;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import mb.e;
import mb.g;
import mb.j;
import p6.k;
import p6.m;
import p6.p;
import x7.s;
public final class d extends e {
    public static final m6.c[] f58599k = {j.f19240c};
    public static final sb.a f58600l = sb.a.f54691a;
    public final Context d;
    public final wb.d f58601e;
    public final hg f58602f;
    public final jg f58603g;
    public boolean h = true;
    public boolean f58604i;
    public tg f58605j;

    public d(g gVar, wb.d dVar, hg hgVar, jg jgVar) {
        m.h(gVar, "MlKitContext can not be null");
        m.h(dVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.f58601e = dVar;
        this.f58602f = hgVar;
        this.f58603g = jgVar;
    }

    @Override
    public final synchronized void b() {
        IInterface aVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            m6.c[] cVarArr = f58599k;
            if (!j.a(context, cVarArr)) {
                if (!this.f58604i) {
                    j.c(this.d, cVarArr);
                    this.f58604i = true;
                }
                f(nb.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new ib.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f58605j == null) {
                    IBinder b10 = f.c(this.d, f.f141b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i3 = vg.f3100a;
                    if (b10 == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        if (queryLocalInterface instanceof wg) {
                            aVar = (wg) queryLocalInterface;
                        } else {
                            aVar = new b8.a(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 0);
                        }
                    }
                    z6.b bVar = new z6.b(this.d);
                    this.f58601e.getClass();
                    wb.d dVar = this.f58601e;
                    this.f58605j = ((ug) aVar).X0(bVar, new zg(false, dVar.f57448a, dVar.f57449b, false, dVar.f57450c));
                }
                try {
                    tg tgVar = this.f58605j;
                    tgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(tgVar.f2457c);
                    tgVar.T0(obtain, 1);
                    f(nb.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e10) {
                    f(nb.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new ib.a("Failed to init module subject segmenter", e10);
                }
            } catch (Exception e11) {
                f(nb.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new ib.a("Failed to load subject segmentation module", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void c() {
        try {
            tg tgVar = this.f58605j;
            if (tgVar != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(tgVar.f2457c);
                tgVar.T0(obtain, 2);
            }
            this.f58605j = null;
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            this.f58605j = null;
        }
        this.h = true;
        hg hgVar = this.f58602f;
        ob obVar = ob.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        hgVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (hgVar.d(obVar, elapsedRealtime)) {
            hgVar.f2664i.put(obVar, Long.valueOf(elapsedRealtime));
            fa.f fVar = new fa.f(1);
            fVar.d = lb.TYPE_THIN;
            mb.m.f19245a.execute(new cg(hgVar, new kg(fVar, 0), obVar, hgVar.c(), 0));
        }
    }

    @Override
    public final Object e(rb.a aVar) {
        Throwable th2;
        z6.b bVar;
        d dVar;
        rb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    tg tgVar = this.f58605j;
                    m.g(tgVar);
                    qg qgVar = new qg(aVar.f54471e, aVar.f54469b, aVar.f54470c, SystemClock.elapsedRealtime(), s.a(aVar.d));
                    int i3 = aVar.f54471e;
                    try {
                        if (i3 != -1) {
                            if (i3 != 17) {
                                if (i3 != 35) {
                                    if (i3 != 842094169) {
                                        int i10 = aVar.f54471e;
                                        throw new ib.a("Unsupported image format: " + i10, 3);
                                    }
                                } else {
                                    bVar = new z6.b(null);
                                }
                            }
                            m.g(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.f54468a;
                        m.g(bitmap);
                        bVar = new z6.b(bitmap);
                        try {
                            yg X0 = tgVar.X0(bVar, qgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.f58601e.f57449b) {
                                for (xg xgVar : X0.f3149a) {
                                    float[] fArr = xgVar.f3130a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new wb.a(xgVar.f3131b, xgVar.f3132c, xgVar.d, xgVar.f3133e, xgVar.f3134f));
                                }
                            }
                            dVar = this;
                            aVar2 = aVar;
                            try {
                                dVar.g(nb.NO_ERROR, elapsedRealtime, this.h, aVar2, X0);
                                dVar.h = false;
                                float[] fArr2 = X0.f3150b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            dVar.g(nb.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, dVar.h, aVar2, null);
                                            throw new ib.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e11) {
                                        e = e11;
                                    }
                                }
                                return new wb.b(arrayList);
                            } catch (RemoteException e12) {
                                e = e12;
                            }
                        } catch (RemoteException e13) {
                            e = e13;
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

    public final void f(nb nbVar, long j10) {
        this.f58602f.b(new vi.f(this, nbVar, j10), ob.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void g(nb nbVar, long j10, boolean z10, rb.a aVar, yg ygVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f58602f.b(new k.j(this, elapsedRealtime, nbVar, z10, aVar, ygVar), ob.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        a0 a0Var = new a0(8, false);
        a0Var.d = this.f58601e.a();
        a0Var.f1186b = nbVar;
        a0Var.f1187c = Boolean.valueOf(z10);
        mb.m.f19245a.execute(new fg(this.f58602f, new p1(a0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        jg jgVar = this.f58603g;
        int i3 = nbVar.f2845a;
        synchronized (jgVar) {
            AtomicLong atomicLong = jgVar.f2700b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - jgVar.f2700b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            jgVar.f2699a.f(new p(0, Arrays.asList(new k(24336, i3, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ig(jgVar, elapsedRealtime2, 0));
        }
    }
}
