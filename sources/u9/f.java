package u9;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import f3.c0;
import hi.m2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y1;
import org.telegram.ui.cn;
import org.telegram.ui.rk;
import ug.g0;
import ug.h0;
import ug.i0;
import ug.t1;
import v4.b0;
import wg.f1;
import wg.t0;
import wg.u;
import wg.z;
import wi.m0;
import wi.t;
import x2.w0;
public final class f implements Runnable {
    public final int f56472a;
    public final Object f56473b;
    public final Object f56474c;

    public f(int i7, Object obj, Object obj2) {
        this.f56472a = i7;
        this.f56474c = obj;
        this.f56473b = obj2;
    }

    private final void a() {
        o oVar = (o) this.f56474c;
        ua.b bVar = (ua.b) this.f56473b;
        synchronized (oVar) {
            try {
                if (oVar.f56496b == null) {
                    oVar.f56495a.add(bVar);
                } else {
                    oVar.f56496b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: u9.f.b():void");
    }

    private final void c() {
        vi.h hVar = (vi.h) this.f56474c;
        File file = (File) this.f56473b;
        synchronized (hVar.f57563m) {
            for (int i7 = 0; i7 < hVar.f57563m.size(); i7++) {
                try {
                    File file2 = (File) hVar.f57563m.get(i7);
                    if (file != null && file.equals(file2)) {
                    }
                    if (file2.exists() && !file2.delete()) {
                        vi.b bVar = hVar.h;
                        bVar.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hVar.f57563m.clear();
        }
    }

    @Override
    public final void run() {
        ua.a aVar;
        int i7;
        Exception runtimeException;
        TLObject e22;
        TLObject e23;
        int i10 = 0;
        switch (this.f56472a) {
            case 0:
                p pVar = (p) this.f56474c;
                ua.b bVar = (ua.b) this.f56473b;
                if (pVar.f56499b == p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f56498a;
                        pVar.f56498a = null;
                        pVar.f56499b = bVar;
                    }
                    aVar.c(bVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 1:
                a();
                return;
            case 2:
                l9 l9Var = (l9) this.f56474c;
                View view = (View) this.f56473b;
                ue.a aVar2 = (ue.a) l9Var.d;
                if ((2 & l9Var.f29524a) != 0) {
                    if (aVar2.c1(view, l9Var.f29525b, l9Var.f29526c)) {
                        l9Var.f29524a &= -3;
                        l9Var.f29527e = null;
                        view.performHapticFeedback(0);
                        l9Var.f29524a = (l9Var.f29524a | 4) & (-11);
                        l9Var.f29527e = null;
                        return;
                    }
                    l9Var.f29524a = 8 | l9Var.f29524a;
                    return;
                }
                return;
            case 3:
                i0 i0Var = (i0) this.f56474c;
                TLObject tLObject = (TLObject) this.f56473b;
                ArrayList arrayList = i0Var.f56616a2;
                qj0 qj0Var = i0Var.f36303k1;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    i0Var.A2 = false;
                    i0Var.B2.b(i0Var.f56620f2 + 4);
                    int i11 = 0;
                    while (true) {
                        if (i11 < qj0Var.getChildCount()) {
                            if (qj0Var.getChildAt(i11) instanceof h0) {
                                i7 = qj0Var.getChildAt(i11).getTop();
                            } else {
                                i11++;
                            }
                        } else {
                            i7 = 0;
                        }
                    }
                    i0Var.G1();
                    if (i0Var.d2 >= 0 && i7 != 0) {
                        ((b0) qj0Var.getLayoutManager()).h1(i0Var.d2 + 1, i7);
                    }
                }
                int max = Math.max(arrayList.size(), i0Var.E2.f2324b);
                i0Var.f56630p2.i(max, false);
                i0Var.f56630p2.setBagePosition(max / i0Var.E2.f2325c);
                g0 g0Var = i0Var.f56630p2;
                g0Var.H = true;
                g0Var.requestLayout();
                return;
            case 4:
                ((i0) this.f56474c).h1((a80) this.f56473b, true);
                return;
            case 5:
                t1 t1Var = (t1) this.f56474c;
                w7.G(t1Var.f56836s);
                org.telegram.messenger.g0.h3(new f(6, t1Var, w7.I((TLRPC.Document) this.f56473b)));
                return;
            case 6:
                t1 t1Var2 = (t1) this.f56474c;
                t1Var2.f56832e = (File) this.f56473b;
                t1Var2.a();
                return;
            case 7:
                b();
                return;
            case 8:
                ui.i iVar = (ui.i) this.f56474c;
                try {
                    byte[] decode = Base64.decode(((String) this.f56473b).substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        iVar.m(decode);
                        return;
                    }
                    iVar.h();
                    return;
                } catch (IllegalArgumentException e10) {
                    a8.g(e10, true);
                    iVar.h();
                    return;
                }
            case 9:
                ((ui.i) this.f56474c).m((byte[]) this.f56473b);
                return;
            case 10:
                v9.a aVar3 = (v9.a) this.f56474c;
                Runnable runnable = (Runnable) this.f56473b;
                Process.setThreadPriority(aVar3.f57269c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 11:
                Callable callable = (Callable) this.f56474c;
                v9.h hVar = (v9.h) ((rt) this.f56473b).f37805b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e11) {
                    hVar.l(e11);
                    return;
                }
            case 12:
                ((vg.e) this.f56474c).c((ArrayList) this.f56473b);
                return;
            case 13:
                vg.o oVar = (vg.o) this.f56474c;
                vg.q qVar = (vg.q) this.f56473b;
                oVar.getClass();
                try {
                    EGLDisplay eGLDisplay = oVar.f57478j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = oVar.f57480l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar.f57479k);
                        EGLSurface eGLSurface2 = qVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(oVar.f57478j, eGLSurface2);
                        }
                        qVar.h = EGL14.EGL_NO_SURFACE;
                        if (oVar.f57476g.length == 0) {
                            oVar.b();
                        }
                    }
                    qVar.f57492b.release();
                    return;
                } catch (Throwable th2) {
                    qVar.f57492b.release();
                    throw th2;
                }
            case 14:
                vi.h hVar2 = (vi.h) this.f56474c;
                Throwable th3 = (Throwable) this.f56473b;
                hVar2.getClass();
                if (th3 instanceof Exception) {
                    runtimeException = (Exception) th3;
                } else {
                    runtimeException = new RuntimeException(th3);
                }
                hVar2.g(runtimeException);
                return;
            case 15:
                c();
                return;
            case 16:
                ((t0) this.f56474c).a((ArrayList) this.f56473b);
                return;
            case 17:
                ((u) this.f56474c).a((TLRPC.TL_error) this.f56473b);
                return;
            case 18:
                c20 c20Var = (c20) this.f56473b;
                HashMap h02 = ((yr) this.f56474c).h0();
                if (!h02.isEmpty()) {
                    org.telegram.messenger.g0.h3(new y1(c20Var, h02, 1));
                    return;
                }
                return;
            case 19:
                ((fx) this.f56474c).a((ArrayList) this.f56473b);
                return;
            case 20:
                cc I = hc.a0((cn) this.f56474c).I(2131624225, id.M0(2131745092, null), org.telegram.messenger.g0.X2(id.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f56473b).stars)));
                I.f32627j = 5000;
                I.k(true);
                return;
            case 21:
                qs.f(p10.f24470s0).k(191, ((z) this.f56474c).T1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f56473b);
                return;
            case 22:
                f1 f1Var = (f1) this.f56474c;
                TLObject tLObject2 = (TLObject) this.f56473b;
                ArrayList arrayList2 = f1Var.f57728c2;
                arrayList2.clear();
                f1Var.f57740p2 = -1;
                if (tLObject2 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject2;
                    qp s12 = qp.s1(f1Var.f28621a);
                    s12.Y3(tL_contacts_found.users, false);
                    s12.S3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.my_results;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.Peer peer = arrayList3.get(i12);
                        i12++;
                        long o4 = m5.o(peer);
                        if (!hashSet.contains(Long.valueOf(o4)) && (e23 = s12.e2(o4)) != null) {
                            arrayList2.add(e23);
                            hashSet.add(Long.valueOf(o4));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList4 = tL_contacts_found.results;
                    int size2 = arrayList4.size();
                    while (i10 < size2) {
                        TLRPC.Peer peer2 = arrayList4.get(i10);
                        i10++;
                        long o10 = m5.o(peer2);
                        if (!hashSet.contains(Long.valueOf(o10)) && (e22 = s12.e2(o10)) != null) {
                            arrayList2.add(e22);
                            hashSet.add(Long.valueOf(o10));
                        }
                    }
                }
                f1Var.p1(true, true);
                return;
            case 23:
                wh.i iVar2 = (wh.i) this.f56474c;
                iVar2.f57923b.add((String) this.f56473b);
                iVar2.invalidate();
                return;
            case 24:
                ((wi.k) this.f56474c).Y((m0) this.f56473b);
                return;
            case 25:
                wi.k kVar = (wi.k) this.f56474c;
                HandlerThread handlerThread = (HandlerThread) this.f56473b;
                kVar.j();
                wi.n nVar = kVar.f58068w;
                if (nVar != null) {
                    long p10 = nVar.p();
                    t tVar = kVar.v;
                    if (tVar != null && p10 != Long.MAX_VALUE) {
                        tVar.f58183q = Math.max(0L, p10) * 1000;
                        Handler handler = tVar.f58191u;
                        if (handler != null) {
                            handler.removeCallbacks(tVar.f58199y0);
                        }
                    }
                }
                kVar.n();
                wi.n nVar2 = kVar.f58068w;
                if (nVar2 != null) {
                    nVar2.u();
                    kVar.f58068w = null;
                }
                if (kVar.f58069w0 > 0) {
                    kVar.f58036j.b("release waits for camera open results: pending=" + kVar.f58069w0);
                    kVar.f58071x0 = handlerThread;
                    return;
                }
                handlerThread.quitSafely();
                return;
            case 26:
                t tVar2 = (t) this.f56474c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f56473b;
                tVar2.getClass();
                try {
                    try {
                        tVar2.f();
                        tVar2.f58186r0 = true;
                    } finally {
                        countDownLatch.countDown();
                    }
                } catch (RuntimeException e12) {
                    tVar2.f58197x0 = e12;
                    tVar2.i();
                }
                return;
            case 27:
                m0 m0Var = (m0) this.f56473b;
                wi.t0 t0Var = (wi.t0) ((rt) this.f56474c).f37805b;
                t0Var.R++;
                t0Var.f58224y = true;
                t0Var.f58213m.b("camera switch started: target=" + m0Var);
                o40 o40Var = (o40) t0Var.d.f37805b;
                FrameLayout frameLayout = o40Var.f36644x;
                o40Var.f36639t0++;
                ValueAnimator valueAnimator = o40Var.f36618c0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    o40Var.f36618c0.cancel();
                    o40Var.f36618c0 = null;
                }
                o40Var.f36632o0 = true;
                o40Var.f36633p0 = false;
                o40Var.f36634q0 = false;
                o40Var.f36636r0 = false;
                o40Var.f36638s0 = SystemClock.elapsedRealtime();
                rk rkVar = o40Var.D;
                o40Var.A(false);
                Bitmap bitmap = o40Var.f36640u0;
                if (bitmap != null) {
                    rkVar.setImageBitmap(bitmap);
                    o40Var.f36631n0 = true;
                    rkVar.animate().cancel();
                    rkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i13 = o40Var.f36639t0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                o40Var.f36618c0 = ofFloat;
                ofFloat.setDuration(580L);
                o40Var.f36618c0.setInterpolator(xq.h);
                o40Var.f36618c0.addUpdateListener(new i2(o40Var, i13, 4));
                o40Var.f36618c0.addListener(new m2(o40Var, i13, 10));
                o40Var.f36618c0.start();
                a8.b("RoundVideo camera flip started: facing=" + m0Var + ", minimumDurationMs=580");
                o40Var.D();
                t0Var.o();
                return;
            case 28:
                ((h2.j) this.f56474c).accept(this.f56473b);
                return;
            default:
                ((w0) this.f56474c).y((c0) this.f56473b);
                return;
        }
    }
}
