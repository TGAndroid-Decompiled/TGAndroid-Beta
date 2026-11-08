package u9;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.messenger.yr;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y1;
import org.telegram.ui.Components.z70;
import org.telegram.ui.an;
import org.telegram.ui.pk;
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
import x2.w0;
public final class f implements Runnable {
    public final int f56460a;
    public final Object f56461b;
    public final Object f56462c;

    public f(int i7, Object obj, Object obj2) {
        this.f56460a = i7;
        this.f56461b = obj;
        this.f56462c = obj2;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: u9.f.a():void");
    }

    private final void b() {
        vi.h hVar = (vi.h) this.f56461b;
        File file = (File) this.f56462c;
        synchronized (hVar.f57551m) {
            for (int i7 = 0; i7 < hVar.f57551m.size(); i7++) {
                try {
                    File file2 = (File) hVar.f57551m.get(i7);
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
            hVar.f57551m.clear();
        }
    }

    @Override
    public final void run() {
        int i7;
        Exception runtimeException;
        TLObject e22;
        TLObject e23;
        TLRPC.Document document;
        int i10 = 0;
        switch (this.f56460a) {
            case 0:
                o oVar = (o) this.f56461b;
                ua.b bVar = (ua.b) this.f56462c;
                synchronized (oVar) {
                    try {
                        if (oVar.f56484b == null) {
                            oVar.f56483a.add(bVar);
                        } else {
                            oVar.f56484b.add(bVar.get());
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                l9 l9Var = (l9) this.f56461b;
                View view = (View) this.f56462c;
                ue.a aVar = (ue.a) l9Var.d;
                if ((2 & l9Var.f29520a) != 0) {
                    if (aVar.c1(view, l9Var.f29521b, l9Var.f29522c)) {
                        l9Var.f29520a &= -3;
                        l9Var.f29523e = null;
                        view.performHapticFeedback(0);
                        l9Var.f29520a = (l9Var.f29520a | 4) & (-11);
                        l9Var.f29523e = null;
                        return;
                    }
                    l9Var.f29520a = 8 | l9Var.f29520a;
                    return;
                }
                return;
            case 2:
                i0 i0Var = (i0) this.f56461b;
                TLObject tLObject = (TLObject) this.f56462c;
                ArrayList arrayList = i0Var.f56604a2;
                pj0 pj0Var = i0Var.f36277k1;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    i0Var.A2 = false;
                    i0Var.B2.b(i0Var.f56608f2 + 4);
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
                    if (i0Var.d2 >= 0 && i7 != 0) {
                        ((b0) pj0Var.getLayoutManager()).h1(i0Var.d2 + 1, i7);
                    }
                }
                int max = Math.max(arrayList.size(), i0Var.E2.f2324b);
                i0Var.f56618p2.i(max, false);
                i0Var.f56618p2.setBagePosition(max / i0Var.E2.f2325c);
                g0 g0Var = i0Var.f56618p2;
                g0Var.H = true;
                g0Var.requestLayout();
                return;
            case 3:
                ((i0) this.f56461b).h1((z70) this.f56462c, true);
                return;
            case 4:
                t1 t1Var = (t1) this.f56461b;
                w7.G(t1Var.f56824s);
                org.telegram.messenger.g0.h3(new f(5, t1Var, w7.I((TLRPC.Document) this.f56462c)));
                return;
            case 5:
                t1 t1Var2 = (t1) this.f56461b;
                t1Var2.f56820e = (File) this.f56462c;
                t1Var2.a();
                return;
            case 6:
                a();
                return;
            case 7:
                ui.i iVar = (ui.i) this.f56461b;
                try {
                    byte[] decode = Base64.decode(((String) this.f56462c).substring(14), 2);
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
            case 8:
                ((ui.i) this.f56461b).m((byte[]) this.f56462c);
                return;
            case 9:
                v9.a aVar2 = (v9.a) this.f56461b;
                Runnable runnable = (Runnable) this.f56462c;
                Process.setThreadPriority(aVar2.f57257c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 10:
                Callable callable = (Callable) this.f56461b;
                v9.h hVar = (v9.h) ((rt) this.f56462c).f37758b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e11) {
                    hVar.l(e11);
                    return;
                }
            case 11:
                ((vg.e) this.f56461b).c((ArrayList) this.f56462c);
                return;
            case 12:
                vg.o oVar2 = (vg.o) this.f56461b;
                vg.q qVar = (vg.q) this.f56462c;
                oVar2.getClass();
                try {
                    EGLDisplay eGLDisplay = oVar2.f57466j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = oVar2.f57468l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar2.f57467k);
                        EGLSurface eGLSurface2 = qVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(oVar2.f57466j, eGLSurface2);
                        }
                        qVar.h = EGL14.EGL_NO_SURFACE;
                        if (oVar2.f57464g.length == 0) {
                            oVar2.b();
                        }
                    }
                    qVar.f57480b.release();
                    return;
                } catch (Throwable th2) {
                    qVar.f57480b.release();
                    throw th2;
                }
            case 13:
                vi.h hVar2 = (vi.h) this.f56461b;
                Throwable th3 = (Throwable) this.f56462c;
                hVar2.getClass();
                if (th3 instanceof Exception) {
                    runtimeException = (Exception) th3;
                } else {
                    runtimeException = new RuntimeException(th3);
                }
                hVar2.g(runtimeException);
                return;
            case 14:
                b();
                return;
            case 15:
                ((t0) this.f56461b).a((ArrayList) this.f56462c);
                return;
            case 16:
                ((v) this.f56461b).a((TLRPC.TL_error) this.f56462c);
                return;
            case 17:
                c20 c20Var = (c20) this.f56462c;
                HashMap h02 = ((yr) this.f56461b).h0();
                if (!h02.isEmpty()) {
                    org.telegram.messenger.g0.h3(new y1(c20Var, h02, 1));
                    return;
                }
                return;
            case 18:
                ((fx) this.f56461b).a((ArrayList) this.f56462c);
                return;
            case 19:
                cc I = hc.a0((an) this.f56461b).I(2131624225, id.M0(2131745095, null), org.telegram.messenger.g0.X2(id.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f56462c).stars)));
                I.f32545j = 5000;
                I.k(true);
                return;
            case 20:
                qs.f(p10.f24470s0).k(191, ((a0) this.f56461b).T1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f56462c);
                return;
            case 21:
                f1 f1Var = (f1) this.f56461b;
                TLObject tLObject2 = (TLObject) this.f56462c;
                ArrayList arrayList2 = f1Var.f57730c2;
                arrayList2.clear();
                f1Var.f57742p2 = -1;
                if (tLObject2 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject2;
                    qp s12 = qp.s1(f1Var.f28616a);
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
            case 22:
                wh.i iVar2 = (wh.i) this.f56461b;
                iVar2.f57911b.add((String) this.f56462c);
                iVar2.invalidate();
                return;
            case 23:
                ((wi.k) this.f56461b).Z((m0) this.f56462c);
                return;
            case 24:
                wi.k kVar = (wi.k) this.f56461b;
                HandlerThread handlerThread = (HandlerThread) this.f56462c;
                kVar.j();
                wi.n nVar = kVar.f58061x;
                if (nVar != null) {
                    long p10 = nVar.p();
                    t tVar = kVar.f58059w;
                    if (tVar != null && p10 != Long.MAX_VALUE) {
                        tVar.f58174q = Math.max(0L, p10) * 1000;
                        Handler handler = tVar.f58182u;
                        if (handler != null) {
                            handler.removeCallbacks(tVar.f58190y0);
                        }
                    }
                }
                kVar.o();
                wi.n nVar2 = kVar.f58061x;
                if (nVar2 != null) {
                    nVar2.u();
                    kVar.f58061x = null;
                }
                if (kVar.f58062x0 > 0) {
                    kVar.f58026j.b("release waits for camera open results: pending=" + kVar.f58062x0);
                    kVar.f58064y0 = handlerThread;
                    return;
                }
                handlerThread.quitSafely();
                return;
            case 25:
                t tVar2 = (t) this.f56461b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f56462c;
                tVar2.getClass();
                try {
                    try {
                        tVar2.f();
                        tVar2.f58177r0 = true;
                    } finally {
                        countDownLatch.countDown();
                    }
                } catch (RuntimeException e12) {
                    tVar2.f58188x0 = e12;
                    tVar2.i();
                }
                return;
            case 26:
                m0 m0Var = (m0) this.f56462c;
                wi.t0 t0Var = (wi.t0) ((rt) this.f56461b).f37758b;
                t0Var.R++;
                t0Var.f58215y = true;
                t0Var.f58204m.b("camera switch started: target=" + m0Var);
                n40 n40Var = (n40) t0Var.d.f37758b;
                FrameLayout frameLayout = n40Var.f36238x;
                n40Var.f36233t0++;
                ValueAnimator valueAnimator = n40Var.f36212c0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    n40Var.f36212c0.cancel();
                    n40Var.f36212c0 = null;
                }
                n40Var.f36226o0 = true;
                n40Var.f36227p0 = false;
                n40Var.f36228q0 = false;
                n40Var.f36230r0 = false;
                n40Var.f36232s0 = SystemClock.elapsedRealtime();
                pk pkVar = n40Var.D;
                n40Var.A(false);
                Bitmap bitmap = n40Var.f36234u0;
                if (bitmap != null) {
                    pkVar.setImageBitmap(bitmap);
                    n40Var.f36225n0 = true;
                    pkVar.animate().cancel();
                    pkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i13 = n40Var.f36233t0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                n40Var.f36212c0 = ofFloat;
                ofFloat.setDuration(580L);
                n40Var.f36212c0.setInterpolator(xq.h);
                n40Var.f36212c0.addUpdateListener(new i2(n40Var, i13, 4));
                n40Var.f36212c0.addListener(new m2(n40Var, i13, 10));
                n40Var.f36212c0.start();
                a8.b("RoundVideo camera flip started: facing=" + m0Var + ", minimumDurationMs=580");
                n40Var.D();
                t0Var.o();
                return;
            case 27:
                ((h2.j) this.f56461b).accept(this.f56462c);
                return;
            case 28:
                ((w0) this.f56461b).y((c0) this.f56462c);
                return;
            default:
                yf.d dVar = (yf.d) this.f56461b;
                TLObject tLObject3 = (TLObject) this.f56462c;
                if (tLObject3 != null) {
                    if (tLObject3 instanceof TL_account.TL_savedRingtonesNotModified) {
                        dVar.f(true);
                    } else if (tLObject3 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject3;
                        ArrayList<TLRPC.Document> arrayList5 = tL_savedRingtones.ringtones;
                        ArrayList arrayList6 = dVar.f59416e;
                        if (!dVar.f59417f) {
                            dVar.f(false);
                            dVar.f59417f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size3 = arrayList6.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj = arrayList6.get(i14);
                            i14++;
                            yf.c cVar = (yf.c) obj;
                            if (cVar.f59409b != null && (document = cVar.f59408a) != null) {
                                hashMap.put(Long.valueOf(document.f26962id), cVar.f59409b);
                            }
                        }
                        arrayList6.clear();
                        SharedPreferences d = dVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList5.size());
                        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                            TLRPC.Document document2 = arrayList5.get(i15);
                            String str = (String) hashMap.get(Long.valueOf(document2.f26962id));
                            SerializedData serializedData = new SerializedData(document2.getObjectSize());
                            document2.serializeToStream(serializedData);
                            edit.putString("tone_document" + i15, Utilities.f(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i15, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f59408a = document2;
                            obj2.f59409b = str;
                            int i16 = dVar.d;
                            dVar.d = i16 + 1;
                            obj2.f59410c = i16;
                            arrayList6.add(obj2);
                        }
                        edit.apply();
                        qs.f(dVar.f59415c).k(307, new Object[0]);
                        SharedPreferences.Editor edit2 = dVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        yf.d.f59411g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        yf.d.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    dVar.b();
                    return;
                }
                return;
        }
    }
}
