package ti;

import android.app.job.JobParameters;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import android.view.View;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Callable;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
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
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.y1;
import org.telegram.ui.Components.z70;
import org.telegram.ui.an;
import ug.g0;
import ug.h0;
import ug.i0;
import ug.t1;
import v4.b0;
import wg.a0;
import wg.f1;
import wg.t0;
import wg.v;
import wi.m0;
import wi.t;
public final class p implements Runnable {
    public final int f56037a;
    public final Object f56038b;
    public final Object f56039c;

    public p(int i7, Object obj, Object obj2) {
        this.f56037a = i7;
        this.f56038b = obj;
        this.f56039c = obj2;
    }

    private final void a() {
        ua.a aVar;
        u9.o oVar = (u9.o) this.f56038b;
        ua.b bVar = (ua.b) this.f56039c;
        if (oVar.f56395b == u9.o.d) {
            synchronized (oVar) {
                aVar = oVar.f56394a;
                oVar.f56394a = null;
                oVar.f56395b = bVar;
            }
            aVar.c(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void b() {
        u9.n nVar = (u9.n) this.f56038b;
        ua.b bVar = (ua.b) this.f56039c;
        synchronized (nVar) {
            try {
                if (nVar.f56392b == null) {
                    nVar.f56391a.add(bVar);
                } else {
                    nVar.f56392b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: ti.p.c():void");
    }

    private final void d() {
        vi.h hVar = (vi.h) this.f56038b;
        File file = (File) this.f56039c;
        synchronized (hVar.f57459m) {
            for (int i7 = 0; i7 < hVar.f57459m.size(); i7++) {
                try {
                    File file2 = (File) hVar.f57459m.get(i7);
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
            hVar.f57459m.clear();
        }
    }

    @Override
    public final void run() {
        int i7;
        Exception runtimeException;
        TLObject e22;
        TLObject e23;
        int i10 = 0;
        switch (this.f56037a) {
            case 0:
                q qVar = (q) this.f56038b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f56039c;
                if (qVar.f56040a == surfaceTexture && qVar.getSurfaceTexture() == null) {
                    qVar.setSurfaceTexture(surfaceTexture);
                    return;
                }
                return;
            case 1:
                u2.c cVar = (u2.c) this.f56038b;
                p pVar = (p) this.f56039c;
                cVar.f56135c.i();
                u2.f fVar = cVar.f56134b;
                synchronized (fVar.f56148a) {
                    fVar.b();
                    pVar.run();
                }
                return;
            case 2:
                u2.r rVar = (u2.r) this.f56038b;
                rVar.T.set(rVar.w((wf.b) this.f56039c, rVar.N, 0));
                return;
            case 3:
                int i11 = JobInfoSchedulerService.f6451a;
                ((JobInfoSchedulerService) this.f56038b).jobFinished((JobParameters) this.f56039c, false);
                return;
            case 4:
                a();
                return;
            case 5:
                b();
                return;
            case 6:
                l9 l9Var = (l9) this.f56038b;
                View view = (View) this.f56039c;
                ue.a aVar = (ue.a) l9Var.d;
                if ((2 & l9Var.f29516a) != 0) {
                    if (aVar.c1(view, l9Var.f29517b, l9Var.f29518c)) {
                        l9Var.f29516a &= -3;
                        l9Var.f29519e = null;
                        view.performHapticFeedback(0);
                        l9Var.f29516a = (l9Var.f29516a | 4) & (-11);
                        l9Var.f29519e = null;
                        return;
                    }
                    l9Var.f29516a = 8 | l9Var.f29516a;
                    return;
                }
                return;
            case 7:
                i0 i0Var = (i0) this.f56038b;
                TLObject tLObject = (TLObject) this.f56039c;
                ArrayList arrayList = i0Var.f56512a2;
                pj0 pj0Var = i0Var.f36222k1;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    i0Var.A2 = false;
                    i0Var.B2.b(i0Var.f56516f2 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 < pj0Var.getChildCount()) {
                            if (pj0Var.getChildAt(i12) instanceof h0) {
                                i7 = pj0Var.getChildAt(i12).getTop();
                            } else {
                                i12++;
                            }
                        } else {
                            i7 = 0;
                        }
                    }
                    i0Var.G1();
                    if (i0Var.d2 >= 0 && i7 != 0) {
                        ((b0) pj0Var.getLayoutManager()).h1(i0Var.d2 + 1, i7);
                    }
                }
                int max = Math.max(arrayList.size(), i0Var.E2.f2324b);
                i0Var.f56526p2.i(max, false);
                i0Var.f56526p2.setBagePosition(max / i0Var.E2.f2325c);
                g0 g0Var = i0Var.f56526p2;
                g0Var.H = true;
                g0Var.requestLayout();
                return;
            case 8:
                ((i0) this.f56038b).h1((z70) this.f56039c, true);
                return;
            case 9:
                t1 t1Var = (t1) this.f56038b;
                w7.G(t1Var.f56732s);
                org.telegram.messenger.g0.h3(new p(10, t1Var, w7.I((TLRPC.Document) this.f56039c)));
                return;
            case 10:
                t1 t1Var2 = (t1) this.f56038b;
                t1Var2.f56728e = (File) this.f56039c;
                t1Var2.a();
                return;
            case 11:
                c();
                return;
            case 12:
                ui.i iVar = (ui.i) this.f56038b;
                try {
                    byte[] decode = Base64.decode(((String) this.f56039c).substring(14), 2);
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
            case 13:
                ((ui.i) this.f56038b).m((byte[]) this.f56039c);
                return;
            case 14:
                v9.a aVar2 = (v9.a) this.f56038b;
                Runnable runnable = (Runnable) this.f56039c;
                Process.setThreadPriority(aVar2.f57165c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 15:
                Callable callable = (Callable) this.f56038b;
                v9.h hVar = (v9.h) ((qt) this.f56039c).f37394b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e11) {
                    hVar.l(e11);
                    return;
                }
            case 16:
                ((vg.e) this.f56038b).c((ArrayList) this.f56039c);
                return;
            case 17:
                vg.o oVar = (vg.o) this.f56038b;
                vg.q qVar2 = (vg.q) this.f56039c;
                oVar.getClass();
                try {
                    EGLDisplay eGLDisplay = oVar.f57374j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = oVar.f57376l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar.f57375k);
                        EGLSurface eGLSurface2 = qVar2.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(oVar.f57374j, eGLSurface2);
                        }
                        qVar2.h = EGL14.EGL_NO_SURFACE;
                        if (oVar.f57372g.length == 0) {
                            oVar.b();
                        }
                    }
                    qVar2.f57388b.release();
                    return;
                } catch (Throwable th2) {
                    qVar2.f57388b.release();
                    throw th2;
                }
            case 18:
                vi.h hVar2 = (vi.h) this.f56038b;
                Throwable th3 = (Throwable) this.f56039c;
                hVar2.getClass();
                if (th3 instanceof Exception) {
                    runtimeException = (Exception) th3;
                } else {
                    runtimeException = new RuntimeException(th3);
                }
                hVar2.g(runtimeException);
                return;
            case 19:
                d();
                return;
            case 20:
                ((t0) this.f56038b).a((ArrayList) this.f56039c);
                return;
            case 21:
                ((v) this.f56038b).a((TLRPC.TL_error) this.f56039c);
                return;
            case 22:
                c20 c20Var = (c20) this.f56039c;
                HashMap h02 = ((yr) this.f56038b).h0();
                if (!h02.isEmpty()) {
                    org.telegram.messenger.g0.h3(new y1(c20Var, h02, 1));
                    return;
                }
                return;
            case 23:
                ((ex) this.f56038b).a((ArrayList) this.f56039c);
                return;
            case 24:
                cc I = hc.a0((an) this.f56038b).I(2131624225, hd.M0(2131745093, null), org.telegram.messenger.g0.X2(hd.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f56039c).stars)));
                I.f32527j = 5000;
                I.k(true);
                return;
            case 25:
                qs.f(p10.f24459s0).k(191, ((a0) this.f56038b).T1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f56039c);
                return;
            case 26:
                f1 f1Var = (f1) this.f56038b;
                TLObject tLObject2 = (TLObject) this.f56039c;
                ArrayList arrayList2 = f1Var.f57638c2;
                arrayList2.clear();
                f1Var.f57650p2 = -1;
                if (tLObject2 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject2;
                    qp s12 = qp.s1(f1Var.f28612a);
                    s12.Y3(tL_contacts_found.users, false);
                    s12.S3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.my_results;
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.Peer peer = arrayList3.get(i13);
                        i13++;
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
            case 27:
                wh.i iVar2 = (wh.i) this.f56038b;
                iVar2.f57819b.add((String) this.f56039c);
                iVar2.invalidate();
                return;
            case 28:
                ((wi.j) this.f56038b).a0((m0) this.f56039c);
                return;
            default:
                wi.j jVar = (wi.j) this.f56038b;
                HandlerThread handlerThread = (HandlerThread) this.f56039c;
                jVar.k();
                wi.m mVar = jVar.f57962x;
                if (mVar != null) {
                    long p10 = mVar.p();
                    t tVar = jVar.f57960w;
                    if (tVar != null && p10 != Long.MAX_VALUE) {
                        tVar.f58081q = Math.max(0L, p10) * 1000;
                        Handler handler = tVar.f58089u;
                        if (handler != null) {
                            handler.removeCallbacks(tVar.f58095x0);
                        }
                    }
                }
                jVar.p();
                wi.m mVar2 = jVar.f57962x;
                if (mVar2 != null) {
                    mVar2.u();
                    jVar.f57962x = null;
                }
                handlerThread.quitSafely();
                return;
        }
    }
}
