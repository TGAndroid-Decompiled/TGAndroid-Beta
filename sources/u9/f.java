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
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x1;
import org.telegram.ui.Components.z70;
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
import x2.v0;
public final class f implements Runnable {
    public final int f56471a;
    public final Object f56472b;
    public final Object f56473c;

    public f(int i7, Object obj, Object obj2) {
        this.f56471a = i7;
        this.f56473c = obj;
        this.f56472b = obj2;
    }

    private final void a() {
        o oVar = (o) this.f56473c;
        ua.b bVar = (ua.b) this.f56472b;
        synchronized (oVar) {
            try {
                if (oVar.f56495b == null) {
                    oVar.f56494a.add(bVar);
                } else {
                    oVar.f56495b.add(bVar.get());
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
        vi.h hVar = (vi.h) this.f56473c;
        File file = (File) this.f56472b;
        synchronized (hVar.f57562m) {
            for (int i7 = 0; i7 < hVar.f57562m.size(); i7++) {
                try {
                    File file2 = (File) hVar.f57562m.get(i7);
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
            hVar.f57562m.clear();
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
        switch (this.f56471a) {
            case 0:
                p pVar = (p) this.f56473c;
                ua.b bVar = (ua.b) this.f56472b;
                if (pVar.f56498b == p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f56497a;
                        pVar.f56497a = null;
                        pVar.f56498b = bVar;
                    }
                    aVar.c(bVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 1:
                a();
                return;
            case 2:
                l9 l9Var = (l9) this.f56473c;
                View view = (View) this.f56472b;
                ue.a aVar2 = (ue.a) l9Var.d;
                if ((2 & l9Var.f29535a) != 0) {
                    if (aVar2.c1(view, l9Var.f29536b, l9Var.f29537c)) {
                        l9Var.f29535a &= -3;
                        l9Var.f29538e = null;
                        view.performHapticFeedback(0);
                        l9Var.f29535a = (l9Var.f29535a | 4) & (-11);
                        l9Var.f29538e = null;
                        return;
                    }
                    l9Var.f29535a = 8 | l9Var.f29535a;
                    return;
                }
                return;
            case 3:
                i0 i0Var = (i0) this.f56473c;
                TLObject tLObject = (TLObject) this.f56472b;
                ArrayList arrayList = i0Var.d2;
                pj0 pj0Var = i0Var.n1;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    i0Var.D2 = false;
                    i0Var.E2.b(i0Var.f56622i2 + 4);
                    int i11 = 0;
                    while (true) {
                        if (i11 < pj0Var.getChildCount()) {
                            if (pj0Var.getChildAt(i11) instanceof h0) {
                                i7 = pj0Var.getChildAt(i11).getTop();
                            } else {
                                i11++;
                            }
                        } else {
                            i7 = 0;
                        }
                    }
                    i0Var.G1();
                    if (i0Var.f56620g2 >= 0 && i7 != 0) {
                        ((b0) pj0Var.getLayoutManager()).h1(i0Var.f56620g2 + 1, i7);
                    }
                }
                int max = Math.max(arrayList.size(), i0Var.H2.f2324b);
                i0Var.f56632s2.i(max, false);
                i0Var.f56632s2.setBagePosition(max / i0Var.H2.f2325c);
                g0 g0Var = i0Var.f56632s2;
                g0Var.H = true;
                g0Var.requestLayout();
                return;
            case 4:
                ((i0) this.f56473c).h1((z70) this.f56472b, true);
                return;
            case 5:
                t1 t1Var = (t1) this.f56473c;
                w7.G(t1Var.f56835s);
                org.telegram.messenger.g0.h3(new f(6, t1Var, w7.I((TLRPC.Document) this.f56472b)));
                return;
            case 6:
                t1 t1Var2 = (t1) this.f56473c;
                t1Var2.f56831e = (File) this.f56472b;
                t1Var2.a();
                return;
            case 7:
                b();
                return;
            case 8:
                ui.i iVar = (ui.i) this.f56473c;
                try {
                    byte[] decode = Base64.decode(((String) this.f56472b).substring(14), 2);
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
                ((ui.i) this.f56473c).m((byte[]) this.f56472b);
                return;
            case 10:
                v9.a aVar3 = (v9.a) this.f56473c;
                Runnable runnable = (Runnable) this.f56472b;
                Process.setThreadPriority(aVar3.f57265c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 11:
                Callable callable = (Callable) this.f56473c;
                v9.h hVar = (v9.h) ((qt) this.f56472b).f37395b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e11) {
                    hVar.l(e11);
                    return;
                }
            case 12:
                ((vg.e) this.f56473c).c((ArrayList) this.f56472b);
                return;
            case 13:
                vg.o oVar = (vg.o) this.f56473c;
                vg.q qVar = (vg.q) this.f56472b;
                oVar.getClass();
                try {
                    EGLDisplay eGLDisplay = oVar.f57474j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = oVar.f57476l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar.f57475k);
                        EGLSurface eGLSurface2 = qVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(oVar.f57474j, eGLSurface2);
                        }
                        qVar.h = EGL14.EGL_NO_SURFACE;
                        if (oVar.f57472g.length == 0) {
                            oVar.b();
                        }
                    }
                    qVar.f57488b.release();
                    return;
                } catch (Throwable th2) {
                    qVar.f57488b.release();
                    throw th2;
                }
            case 14:
                vi.h hVar2 = (vi.h) this.f56473c;
                Throwable th3 = (Throwable) this.f56472b;
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
                ((t0) this.f56473c).a((ArrayList) this.f56472b);
                return;
            case 17:
                ((u) this.f56473c).a((TLRPC.TL_error) this.f56472b);
                return;
            case 18:
                c20 c20Var = (c20) this.f56472b;
                HashMap h02 = ((yr) this.f56473c).h0();
                if (!h02.isEmpty()) {
                    org.telegram.messenger.g0.h3(new x1(c20Var, h02, 1));
                    return;
                }
                return;
            case 19:
                ((ex) this.f56473c).a((ArrayList) this.f56472b);
                return;
            case 20:
                bc I = gc.a0((cn) this.f56473c).I(2131624225, id.M0(2131745092, null), org.telegram.messenger.g0.X2(id.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f56472b).stars)));
                I.f32203j = 5000;
                I.k(true);
                return;
            case 21:
                qs.f(p10.f24474s0).k(191, ((z) this.f56473c).W1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f56472b);
                return;
            case 22:
                f1 f1Var = (f1) this.f56473c;
                TLObject tLObject2 = (TLObject) this.f56472b;
                ArrayList arrayList2 = f1Var.f57729f2;
                arrayList2.clear();
                f1Var.f57742s2 = -1;
                if (tLObject2 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject2;
                    qp s12 = qp.s1(f1Var.f28669a);
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
                wh.i iVar2 = (wh.i) this.f56473c;
                iVar2.f57927b.add((String) this.f56472b);
                iVar2.invalidate();
                return;
            case 24:
                ((wi.k) this.f56473c).Y((m0) this.f56472b);
                return;
            case 25:
                wi.k kVar = (wi.k) this.f56473c;
                HandlerThread handlerThread = (HandlerThread) this.f56472b;
                kVar.j();
                wi.n nVar = kVar.f58072w;
                if (nVar != null) {
                    long p10 = nVar.p();
                    t tVar = kVar.v;
                    if (tVar != null && p10 != Long.MAX_VALUE) {
                        tVar.f58187q = Math.max(0L, p10) * 1000;
                        Handler handler = tVar.f58195u;
                        if (handler != null) {
                            handler.removeCallbacks(tVar.f58203y0);
                        }
                    }
                }
                kVar.n();
                wi.n nVar2 = kVar.f58072w;
                if (nVar2 != null) {
                    nVar2.u();
                    kVar.f58072w = null;
                }
                if (kVar.f58073w0 > 0) {
                    kVar.f58040j.b("release waits for camera open results: pending=" + kVar.f58073w0);
                    kVar.f58075x0 = handlerThread;
                    return;
                }
                handlerThread.quitSafely();
                return;
            case 26:
                t tVar2 = (t) this.f56473c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f56472b;
                tVar2.getClass();
                try {
                    try {
                        tVar2.f();
                        tVar2.f58190r0 = true;
                    } finally {
                        countDownLatch.countDown();
                    }
                } catch (RuntimeException e12) {
                    tVar2.f58201x0 = e12;
                    tVar2.i();
                }
                return;
            case 27:
                m0 m0Var = (m0) this.f56472b;
                wi.t0 t0Var = (wi.t0) ((qt) this.f56473c).f37395b;
                t0Var.R++;
                t0Var.f58228y = true;
                t0Var.f58217m.b("camera switch started: target=" + m0Var);
                n40 n40Var = (n40) t0Var.d.f37395b;
                FrameLayout frameLayout = n40Var.f36236x;
                n40Var.f36231t0++;
                ValueAnimator valueAnimator = n40Var.f36210c0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    n40Var.f36210c0.cancel();
                    n40Var.f36210c0 = null;
                }
                n40Var.f36224o0 = true;
                n40Var.f36225p0 = false;
                n40Var.f36226q0 = false;
                n40Var.f36228r0 = false;
                n40Var.f36230s0 = SystemClock.elapsedRealtime();
                rk rkVar = n40Var.D;
                n40Var.A(false);
                Bitmap bitmap = n40Var.f36232u0;
                if (bitmap != null) {
                    rkVar.setImageBitmap(bitmap);
                    n40Var.f36223n0 = true;
                    rkVar.animate().cancel();
                    rkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i13 = n40Var.f36231t0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                n40Var.f36210c0 = ofFloat;
                ofFloat.setDuration(580L);
                n40Var.f36210c0.setInterpolator(wq.h);
                n40Var.f36210c0.addUpdateListener(new i2(n40Var, i13, 4));
                n40Var.f36210c0.addListener(new m2(n40Var, i13, 10));
                n40Var.f36210c0.start();
                a8.b("RoundVideo camera flip started: facing=" + m0Var + ", minimumDurationMs=580");
                n40Var.D();
                t0Var.o();
                return;
            case 28:
                ((h2.j) this.f56473c).accept(this.f56472b);
                return;
            default:
                ((v0) this.f56473c).y((c0) this.f56472b);
                return;
        }
    }
}
