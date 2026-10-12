package org.telegram.ui.web;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.jt;
import org.telegram.ui.rl;
import qg.o2;
public final class f2 implements Runnable {
    public final int f43245a;
    public final Object f43246b;
    public final Object f43247c;

    public f2(int i10, Object obj, Object obj2) {
        this.f43245a = i10;
        this.f43246b = obj;
        this.f43247c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f43246b;
        pa.b bVar = (pa.b) this.f43247c;
        synchronized (oVar) {
            try {
                if (oVar.f45982b == null) {
                    oVar.f45981a.add(bVar);
                } else {
                    oVar.f45982b.add(bVar.get());
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
        switch (this.f43245a) {
            case 0:
                ((g2) this.f43246b).f43265m.remove((org.telegram.ui.Wallet.s) this.f43247c);
                return;
            case 1:
                p2.b bVar = (p2.b) this.f43246b;
                bVar.f45057r = false;
                bVar.d((Uri) this.f43247c);
                return;
            case 2:
                pg.r0 r0Var = (pg.r0) this.f43246b;
                r0Var.v = true;
                RectF f7 = r0Var.f();
                Object obj = r0Var.f45633a.f14467b;
                r0Var.f45652w = new a5.a((ByteBuffer) r0Var.h(r0Var.f(), true, false, false).f16434c, 0, f7);
                r0Var.a(false);
                ((pg.y0) this.f43247c).run();
                return;
            case 3:
                Runnable runnable = (Runnable) this.f43247c;
                pg.b1 b1Var = ((pg.d1) this.f43246b).d;
                if (b1Var != null && b1Var.f45485f) {
                    pg.b1.b(b1Var);
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ((pi.t) this.f43246b).i((Exception) this.f43247c);
                return;
            case 5:
                q9.p pVar = (q9.p) this.f43246b;
                pa.b bVar2 = (pa.b) this.f43247c;
                if (pVar.f45985b == q9.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f45984a;
                        pVar.f45984a = null;
                        pVar.f45985b = bVar2;
                    }
                    aVar.g(bVar2);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 6:
                a();
                return;
            case 7:
                qg.y1 y1Var = (qg.y1) this.f43247c;
                y1Var.m();
                ((qg.m0) this.f43246b).s0(y1Var, true);
                return;
            case 8:
                ((qg.y1) this.f43246b).s((Bitmap) this.f43247c);
                return;
            case 9:
                o2 o2Var = (o2) this.f43246b;
                o2Var.G = false;
                qg.l2[] l2VarArr = (qg.l2[]) ((ArrayList) this.f43247c).toArray(new qg.l2[0]);
                o2Var.H = l2VarArr;
                if (l2VarArr.length > 0) {
                    o2Var.f46421b0.setScaleX(0.3f);
                    o2Var.f46421b0.setScaleY(0.3f);
                    o2Var.f46421b0.setAlpha(0.0f);
                    o2Var.f46421b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(js.f27634f).start();
                    return;
                }
                return;
            case 10:
                ((qi.h) this.f43246b).F((qi.i0) this.f43247c);
                return;
            case 11:
                qi.h hVar = (qi.h) this.f43246b;
                HandlerThread handlerThread = (HandlerThread) this.f43247c;
                hVar.d();
                try {
                    qi.k kVar = hVar.f46757w;
                    if (kVar != null) {
                        long m10 = kVar.m();
                        qi.p pVar2 = hVar.v;
                        if (pVar2 != null && m10 != Long.MAX_VALUE) {
                            pVar2.f46840k = Math.max(0L, m10) * 1000;
                            Handler handler = pVar2.f46847o;
                            if (handler != null) {
                                handler.removeCallbacks(pVar2.f46850p0);
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
                    qi.k kVar2 = hVar.f46757w;
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
                        hVar.f46757w = null;
                        hVar.Y = false;
                        handlerThread.quitSafely();
                    }
                }
                if (runtimeException != null) {
                    hVar.f46733j.a("camera release failed", runtimeException);
                    return;
                }
                return;
            case 12:
                qi.p pVar3 = (qi.p) this.f43246b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f43247c;
                pVar3.getClass();
                try {
                    try {
                        pVar3.e();
                        pVar3.f46841k0 = true;
                    } finally {
                        countDownLatch.countDown();
                    }
                } catch (RuntimeException e7) {
                    pVar3.f46848o0 = e7;
                    pVar3.h();
                }
                return;
            case 13:
                qi.i0 i0Var = (qi.i0) this.f43247c;
                qi.p0 p0Var = (qi.p0) ((k2.g0) this.f43246b).f14467b;
                p0Var.O++;
                p0Var.f46880x = true;
                p0Var.f46871n.b("camera switch started: target=" + i0Var);
                v60 v60Var = (v60) p0Var.d.f16326a;
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
            case 14:
                ((qi.p0) ((k2.g0) this.f43246b).f14467b).j((Exception) this.f43247c);
                return;
            case 15:
                CarResultStub.G0((Map.Entry) this.f43246b, this.f43247c);
                return;
            case 16:
                int i12 = JobInfoSchedulerService.f6445a;
                ((JobInfoSchedulerService) this.f43246b).jobFinished((JobParameters) this.f43247c, false);
                return;
            case 17:
                r9.a aVar2 = (r9.a) this.f43246b;
                Runnable runnable2 = (Runnable) this.f43247c;
                Process.setThreadPriority(aVar2.f47323c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 18:
                Callable callable = (Callable) this.f43246b;
                r9.h hVar2 = (r9.h) ((n4.l) this.f43247c).f16326a;
                try {
                    hVar2.k(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar2.l(e10);
                    return;
                }
            case 19:
                rg.j0 j0Var = (rg.j0) this.f43246b;
                TLObject tLObject = (TLObject) this.f43247c;
                ArrayList arrayList = j0Var.f47504i0;
                wm0 wm0Var = j0Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.f47508n0 + 4);
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
                    if (j0Var.f47507l0 >= 0 && i10 != 0) {
                        ((s4.d0) wm0Var.getLayoutManager()).h1(j0Var.f47507l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), j0Var.M0.f2615b);
                j0Var.f47518x0.g(max, false);
                j0Var.f47518x0.setBagePosition(max / j0Var.M0.f2616c);
                rg.h0 h0Var = j0Var.f47518x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 20:
                ((rg.j0) this.f43246b).n1((la0) this.f43247c, true);
                return;
            case 21:
                rg.a2 a2Var = (rg.a2) this.f43246b;
                AndroidUtilities.runOnUIThread(new f2(22, a2Var, FileLoader.getInstance(a2Var.f47419s).getPathToAttach((TLRPC.Document) this.f43247c)));
                return;
            case 22:
                rg.a2 a2Var2 = (rg.a2) this.f43246b;
                a2Var2.f47415e = (File) this.f43247c;
                a2Var2.a();
                return;
            case 23:
                ((sg.f) this.f43246b).c((ArrayList) this.f43247c);
                return;
            case 24:
                sg.p pVar4 = (sg.p) this.f43246b;
                sg.r rVar = (sg.r) this.f43247c;
                pVar4.getClass();
                try {
                    EGLDisplay eGLDisplay = pVar4.f48367i;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = pVar4.f48369k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar4.f48368j);
                        EGLSurface eGLSurface2 = rVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(pVar4.f48367i, eGLSurface2);
                        }
                        rVar.h = EGL14.EGL_NO_SURFACE;
                        if (pVar4.f48365f.length == 0) {
                            pVar4.b();
                        }
                    }
                    rVar.f48381b.release();
                    return;
                } catch (Throwable th5) {
                    rVar.f48381b.release();
                    throw th5;
                }
            case 25:
                sf.b bVar3 = (sf.b) this.f43247c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f43246b).f6955e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 26:
                ((tg.w0) this.f43246b).run((ArrayList) this.f43247c);
                return;
            case 27:
                ((tg.u) this.f43246b).run((TLRPC.TL_error) this.f43247c);
                return;
            case 28:
                ((jt) this.f43246b).run((ArrayList) this.f43247c);
                return;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f43247c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f43246b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
        }
    }
}
