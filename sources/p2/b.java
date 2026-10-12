package p2;

import android.animation.ValueAnimator;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.widget.FrameLayout;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import ei.v2;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.g0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.b2;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.eo;
import org.telegram.ui.jt;
import org.telegram.ui.rl;
import pg.b1;
import pg.d1;
import pg.r0;
import pg.y0;
import qg.l2;
import qg.m0;
import qg.o2;
import qg.y1;
import qi.i0;
import qi.p0;
import rg.a2;
import rg.h0;
import rg.j0;
import s4.d0;
import tg.v0;
import tg.z;
public final class b implements Runnable {
    public final int f45043a;
    public final Object f45044b;
    public final Object f45045c;

    public b(int i10, Object obj, Object obj2) {
        this.f45043a = i10;
        this.f45044b = obj;
        this.f45045c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f45044b;
        pa.b bVar = (pa.b) this.f45045c;
        synchronized (oVar) {
            try {
                if (oVar.f45974b == null) {
                    oVar.f45973a.add(bVar);
                } else {
                    oVar.f45974b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        pa.a aVar;
        Exception runtimeException;
        Exception runtimeException2;
        Exception runtimeException3;
        int i10;
        switch (this.f45043a) {
            case 0:
                c cVar = (c) this.f45044b;
                cVar.f45052r = false;
                cVar.d((Uri) this.f45045c);
                return;
            case 1:
                r0 r0Var = (r0) this.f45044b;
                r0Var.v = true;
                RectF f7 = r0Var.f();
                Object obj = r0Var.f45628a.f14466b;
                r0Var.f45647w = new a5.a((ByteBuffer) r0Var.h(r0Var.f(), true, false, false).f16433c, 0, f7);
                r0Var.a(false);
                ((y0) this.f45045c).run();
                return;
            case 2:
                Runnable runnable = (Runnable) this.f45045c;
                b1 b1Var = ((d1) this.f45044b).d;
                if (b1Var != null && b1Var.f45480f) {
                    b1.b(b1Var);
                    runnable.run();
                    return;
                }
                return;
            case 3:
                q9.p pVar = (q9.p) this.f45044b;
                pa.b bVar = (pa.b) this.f45045c;
                if (pVar.f45977b == q9.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f45976a;
                        pVar.f45976a = null;
                        pVar.f45977b = bVar;
                    }
                    aVar.g(bVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 4:
                a();
                return;
            case 5:
                y1 y1Var = (y1) this.f45045c;
                y1Var.m();
                ((m0) this.f45044b).s0(y1Var, true);
                return;
            case 6:
                ((y1) this.f45044b).s((Bitmap) this.f45045c);
                return;
            case 7:
                o2 o2Var = (o2) this.f45044b;
                o2Var.G = false;
                l2[] l2VarArr = (l2[]) ((ArrayList) this.f45045c).toArray(new l2[0]);
                o2Var.H = l2VarArr;
                if (l2VarArr.length > 0) {
                    o2Var.f46413b0.setScaleX(0.3f);
                    o2Var.f46413b0.setScaleY(0.3f);
                    o2Var.f46413b0.setAlpha(0.0f);
                    o2Var.f46413b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(js.f27627f).start();
                    return;
                }
                return;
            case 8:
                ((qi.h) this.f45044b).F((i0) this.f45045c);
                return;
            case 9:
                qi.h hVar = (qi.h) this.f45044b;
                HandlerThread handlerThread = (HandlerThread) this.f45045c;
                hVar.d();
                try {
                    qi.k kVar = hVar.f46749w;
                    if (kVar != null) {
                        long m10 = kVar.m();
                        qi.p pVar2 = hVar.v;
                        if (pVar2 != null && m10 != Long.MAX_VALUE) {
                            pVar2.f46832k = Math.max(0L, m10) * 1000;
                            Handler handler = pVar2.f46839o;
                            if (handler != null) {
                                handler.removeCallbacks(pVar2.f46842p0);
                            }
                        }
                    }
                    runtimeException = null;
                } catch (Throwable th2) {
                    if (th2 instanceof Exception) {
                        runtimeException = th2;
                    } else {
                        runtimeException = new RuntimeException(th2);
                    }
                }
                try {
                    hVar.h();
                } catch (Throwable th3) {
                    if (th3 instanceof Exception) {
                        runtimeException2 = th3;
                    } else {
                        runtimeException2 = new RuntimeException(th3);
                    }
                    if (runtimeException == null) {
                        runtimeException = runtimeException2;
                    } else if (runtimeException != runtimeException2) {
                        runtimeException.addSuppressed(runtimeException2);
                    }
                }
                try {
                    qi.k kVar2 = hVar.f46749w;
                    if (kVar2 != null) {
                        kVar2.r();
                    }
                } catch (Throwable th4) {
                    try {
                        if (th4 instanceof Exception) {
                            runtimeException3 = th4;
                        } else {
                            runtimeException3 = new RuntimeException(th4);
                        }
                        if (runtimeException == null) {
                            runtimeException = runtimeException3;
                        } else if (runtimeException != runtimeException3) {
                            runtimeException.addSuppressed(runtimeException3);
                        }
                    } finally {
                        hVar.f46749w = null;
                        hVar.Y = false;
                        handlerThread.quitSafely();
                    }
                }
                if (runtimeException != null) {
                    hVar.f46725j.a("camera release failed", runtimeException);
                    return;
                }
                return;
            case 10:
                qi.p pVar3 = (qi.p) this.f45044b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f45045c;
                pVar3.getClass();
                try {
                    try {
                        pVar3.e();
                        pVar3.f46833k0 = true;
                    } finally {
                        countDownLatch.countDown();
                    }
                } catch (RuntimeException e7) {
                    pVar3.f46840o0 = e7;
                    pVar3.h();
                }
                return;
            case 11:
                i0 i0Var = (i0) this.f45045c;
                p0 p0Var = (p0) ((g0) this.f45044b).f14466b;
                p0Var.O++;
                p0Var.f46872x = true;
                p0Var.f46863n.b("camera switch started: target=" + i0Var);
                v60 v60Var = (v60) p0Var.d.f16325a;
                FrameLayout frameLayout = v60Var.f31439x;
                v60Var.f31433s0++;
                ValueAnimator valueAnimator = v60Var.f31413b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    v60Var.f31413b0.cancel();
                    v60Var.f31413b0 = null;
                }
                v60Var.f31426n0 = true;
                v60Var.f31427o0 = false;
                v60Var.f31428p0 = false;
                v60Var.f31429q0 = false;
                v60Var.f31431r0 = SystemClock.elapsedRealtime();
                rl rlVar = v60Var.E;
                v60Var.v(false);
                Bitmap bitmap = v60Var.f31434t0;
                if (bitmap != null) {
                    rlVar.setImageBitmap(bitmap);
                    v60Var.m0 = true;
                    rlVar.animate().cancel();
                    rlVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i11 = v60Var.f31433s0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                v60Var.f31413b0 = ofFloat;
                ofFloat.setDuration(580L);
                v60Var.f31413b0.setInterpolator(js.h);
                v60Var.f31413b0.addUpdateListener(new p2(v60Var, i11, 4));
                v60Var.f31413b0.addListener(new v2(v60Var, i11, 8));
                v60Var.f31413b0.start();
                FileLog.d("RoundVideo camera flip started: facing=" + i0Var + ", minimumDurationMs=580");
                v60Var.y();
                p0Var.q();
                return;
            case 12:
                ((p0) ((g0) this.f45044b).f14466b).j((Exception) this.f45045c);
                return;
            case 13:
                CarResultStub.G0((Map.Entry) this.f45044b, this.f45045c);
                return;
            case 14:
                int i12 = JobInfoSchedulerService.f6445a;
                ((JobInfoSchedulerService) this.f45044b).jobFinished((JobParameters) this.f45045c, false);
                return;
            case 15:
                r9.a aVar2 = (r9.a) this.f45044b;
                Runnable runnable2 = (Runnable) this.f45045c;
                Process.setThreadPriority(aVar2.f47315c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 16:
                Callable callable = (Callable) this.f45044b;
                r9.h hVar2 = (r9.h) ((n4.l) this.f45045c).f16325a;
                try {
                    hVar2.k(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar2.l(e10);
                    return;
                }
            case 17:
                j0 j0Var = (j0) this.f45044b;
                TLObject tLObject = (TLObject) this.f45045c;
                ArrayList arrayList = j0Var.f47496i0;
                wm0 wm0Var = j0Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.f47500n0 + 4);
                    int i13 = 0;
                    while (true) {
                        if (i13 < wm0Var.getChildCount()) {
                            if (wm0Var.getChildAt(i13) instanceof rg.i0) {
                                i10 = wm0Var.getChildAt(i13).getTop();
                            } else {
                                i13++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    j0Var.N1();
                    if (j0Var.f47499l0 >= 0 && i10 != 0) {
                        ((d0) wm0Var.getLayoutManager()).h1(j0Var.f47499l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), j0Var.M0.f2615b);
                j0Var.f47510x0.g(max, false);
                j0Var.f47510x0.setBagePosition(max / j0Var.M0.f2616c);
                h0 h0Var = j0Var.f47510x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 18:
                ((j0) this.f45044b).n1((la0) this.f45045c, true);
                return;
            case 19:
                a2 a2Var = (a2) this.f45044b;
                AndroidUtilities.runOnUIThread(new b(20, a2Var, FileLoader.getInstance(a2Var.f47411s).getPathToAttach((TLRPC.Document) this.f45045c)));
                return;
            case 20:
                a2 a2Var2 = (a2) this.f45044b;
                a2Var2.f47407e = (File) this.f45045c;
                a2Var2.a();
                return;
            case 21:
                ((sg.f) this.f45044b).c((ArrayList) this.f45045c);
                return;
            case 22:
                sg.p pVar4 = (sg.p) this.f45044b;
                sg.r rVar = (sg.r) this.f45045c;
                pVar4.getClass();
                try {
                    EGLDisplay eGLDisplay = pVar4.f48359i;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = pVar4.f48361k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar4.f48360j);
                        EGLSurface eGLSurface2 = rVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(pVar4.f48359i, eGLSurface2);
                        }
                        rVar.h = EGL14.EGL_NO_SURFACE;
                        if (pVar4.f48357f.length == 0) {
                            pVar4.b();
                        }
                    }
                    rVar.f48373b.release();
                    return;
                } catch (Throwable th5) {
                    rVar.f48373b.release();
                    throw th5;
                }
            case 23:
                sf.b bVar2 = (sf.b) this.f45045c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f45044b).f6955e).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 24:
                ((v0) this.f45044b).run((ArrayList) this.f45045c);
                return;
            case 25:
                ((tg.u) this.f45044b).run((TLRPC.TL_error) this.f45045c);
                return;
            case 26:
                ((jt) this.f45044b).run((ArrayList) this.f45045c);
                return;
            case 27:
                Utilities.Callback callback = (Utilities.Callback) this.f45045c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f45044b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new b2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 28:
                sc M = zc.a0((eo) this.f45044b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f45045c).stars)), R.raw.stars_send);
                M.f30540j = 5000;
                M.k(true);
                return;
            default:
                z zVar = (z) this.f45044b;
                zVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, zVar.f48661b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f45045c);
                return;
        }
    }
}
