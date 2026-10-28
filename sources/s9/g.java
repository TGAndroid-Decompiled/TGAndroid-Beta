package s9;

import a8.fg;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import c3.b0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import li.e3;
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
import org.telegram.ui.Components.c2;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.wn;
import s4.c0;
import sg.l2;
import sg.m0;
import sg.o2;
import sg.y1;
import tg.a2;
import tg.h0;
import tg.i0;
import tg.j0;
import u2.w0;
import vg.a0;
import vg.n1;
import vg.v;
import vi.n0;
public final class g implements Runnable {
    public final int f48026a;
    public final Object f48027b;
    public final Object f48028c;

    public g(int i10, Object obj, Object obj2) {
        this.f48026a = i10;
        this.f48027b = obj;
        this.f48028c = obj2;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: s9.g.a():void");
    }

    private final void b() {
        ui.o oVar = (ui.o) this.f48027b;
        File file = (File) this.f48028c;
        synchronized (oVar.f49993m) {
            for (int i10 = 0; i10 < oVar.f49993m.size(); i10++) {
                try {
                    File file2 = (File) oVar.f49993m.get(i10);
                    if (file != null && file.equals(file2)) {
                    }
                    if (file2.exists() && !file2.delete()) {
                        ui.b bVar = oVar.h;
                        bVar.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            oVar.f49993m.clear();
        }
    }

    @Override
    public final void run() {
        int i10;
        Exception runtimeException;
        switch (this.f48026a) {
            case 0:
                p pVar = (p) this.f48027b;
                ra.b bVar = (ra.b) this.f48028c;
                synchronized (pVar) {
                    try {
                        if (pVar.f48049b == null) {
                            pVar.f48048a.add(bVar);
                        } else {
                            pVar.f48049b.add(bVar.get());
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                y1 y1Var = (y1) this.f48028c;
                y1Var.m();
                ((m0) this.f48027b).q0(y1Var, true);
                return;
            case 2:
                ((y1) this.f48027b).s((Bitmap) this.f48028c);
                return;
            case 3:
                o2 o2Var = (o2) this.f48027b;
                o2Var.G = false;
                l2[] l2VarArr = (l2[]) ((ArrayList) this.f48028c).toArray(new l2[0]);
                o2Var.H = l2VarArr;
                if (l2VarArr.length > 0) {
                    o2Var.f48464b0.setScaleX(0.3f);
                    o2Var.f48464b0.setScaleY(0.3f);
                    o2Var.f48464b0.setAlpha(0.0f);
                    o2Var.f48464b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(ds.f27530f).start();
                    return;
                }
                return;
            case 4:
                t9.a aVar = (t9.a) this.f48027b;
                Runnable runnable = (Runnable) this.f48028c;
                Process.setThreadPriority(aVar.f48766c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 5:
                Callable callable = (Callable) this.f48027b;
                t9.h hVar = (t9.h) ((e3) this.f48028c).f17209b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 6:
                j0 j0Var = (j0) this.f48027b;
                TLObject tLObject = (TLObject) this.f48028c;
                ArrayList arrayList = j0Var.f48927i0;
                nm0 nm0Var = j0Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.f48931n0 + 4);
                    int i11 = 0;
                    while (true) {
                        if (i11 < nm0Var.getChildCount()) {
                            if (nm0Var.getChildAt(i11) instanceof i0) {
                                i10 = nm0Var.getChildAt(i11).getTop();
                            } else {
                                i11++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    j0Var.Q1();
                    if (j0Var.f48930l0 >= 0 && i10 != 0) {
                        ((c0) nm0Var.getLayoutManager()).h1(j0Var.f48930l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), j0Var.M0.f2568b);
                j0Var.f48941x0.i(max, false);
                j0Var.f48941x0.setBagePosition(max / j0Var.M0.f2569c);
                h0 h0Var = j0Var.f48941x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 7:
                ((j0) this.f48027b).q1((da0) this.f48028c, true);
                return;
            case 8:
                a2 a2Var = (a2) this.f48027b;
                AndroidUtilities.runOnUIThread(new g(9, a2Var, FileLoader.getInstance(a2Var.f48849s).getPathToAttach((TLRPC.Document) this.f48028c)));
                return;
            case 9:
                a2 a2Var2 = (a2) this.f48027b;
                a2Var2.e = (File) this.f48028c;
                a2Var2.a();
                return;
            case 10:
                a();
                return;
            case 11:
                ti.j jVar = (ti.j) this.f48027b;
                String str = (String) this.f48028c;
                jVar.getClass();
                try {
                    byte[] decode = Base64.decode(str.substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        jVar.k(decode);
                        return;
                    }
                    jVar.f();
                    return;
                } catch (IllegalArgumentException e10) {
                    FileLog.e(e10);
                    jVar.f();
                    return;
                }
            case 12:
                ((ti.j) this.f48027b).k((byte[]) this.f48028c);
                return;
            case 13:
                ((e2.j) this.f48027b).accept(this.f48028c);
                return;
            case 14:
                ((w0) this.f48027b).y((b0) this.f48028c);
                return;
            case 15:
                ((ug.f) this.f48027b).c((ArrayList) this.f48028c);
                return;
            case 16:
                ug.p pVar2 = (ug.p) this.f48027b;
                ug.r rVar = (ug.r) this.f48028c;
                pVar2.getClass();
                try {
                    EGLDisplay eGLDisplay = pVar2.f49902j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = pVar2.f49904l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar2.f49903k);
                        EGLSurface eGLSurface2 = rVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(pVar2.f49902j, eGLSurface2);
                        }
                        rVar.h = EGL14.EGL_NO_SURFACE;
                        if (pVar2.f49900g.length == 0) {
                            pVar2.b();
                        }
                    }
                    rVar.f49916b.release();
                    return;
                } catch (Throwable th2) {
                    rVar.f49916b.release();
                    throw th2;
                }
            case 17:
                ui.o oVar = (ui.o) this.f48027b;
                Throwable th3 = (Throwable) this.f48028c;
                oVar.getClass();
                if (th3 instanceof Exception) {
                    runtimeException = (Exception) th3;
                } else {
                    runtimeException = new RuntimeException(th3);
                }
                oVar.g(runtimeException);
                return;
            case 18:
                b();
                return;
            case 19:
                uf.b bVar2 = (uf.b) this.f48028c;
                if (((AtomicBoolean) ((fg) this.f48027b).e).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 20:
                ((vg.w0) this.f48027b).run((ArrayList) this.f48028c);
                return;
            case 21:
                ((v) this.f48027b).run((TLRPC.TL_error) this.f48028c);
                return;
            case 22:
                ((oy) this.f48027b).run((ArrayList) this.f48028c);
                return;
            case 23:
                Utilities.Callback callback = (Utilities.Callback) this.f48028c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f48027b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new c2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 24:
                qc M = wc.b0((wn) this.f48027b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f48028c).stars)), R.raw.stars_send);
                M.f31861j = 5000;
                M.k(true);
                return;
            case 25:
                a0 a0Var = (a0) this.f48027b;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f50154b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f48028c);
                return;
            case 26:
                n1.P((n1) this.f48027b, (TLObject) this.f48028c);
                return;
            case 27:
                ((vi.j) this.f48027b).a0((n0) this.f48028c);
                return;
            case 28:
                vi.j jVar2 = (vi.j) this.f48027b;
                HandlerThread handlerThread = (HandlerThread) this.f48028c;
                jVar2.k();
                vi.m mVar = jVar2.f50500x;
                if (mVar != null) {
                    long p10 = mVar.p();
                    vi.s sVar = jVar2.f50498w;
                    if (sVar != null && p10 != Long.MAX_VALUE) {
                        sVar.f50605q = Math.max(0L, p10) * 1000;
                        Handler handler = sVar.f50613u;
                        if (handler != null) {
                            handler.removeCallbacks(sVar.f50619x0);
                        }
                    }
                }
                jVar2.p();
                vi.m mVar2 = jVar2.f50500x;
                if (mVar2 != null) {
                    mVar2.u();
                    jVar2.f50500x = null;
                }
                handlerThread.quitSafely();
                return;
            default:
                vi.s sVar2 = (vi.s) this.f48027b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f48028c;
                sVar2.getClass();
                try {
                    try {
                        sVar2.f();
                        sVar2.f50608r0 = true;
                    } catch (RuntimeException e11) {
                        sVar2.f50617w0 = e11;
                        sVar2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
        }
    }
}
