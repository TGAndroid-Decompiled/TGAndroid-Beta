package wg;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.ke;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.qy0;
public final class q implements Runnable {
    public final int f59810a;
    public final Object f59811b;
    public final Object f59812c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i7) {
        this.f59810a = i7;
        this.f59811b = obj;
        this.f59812c = obj2;
        this.d = obj3;
    }

    private final void a() {
        xi.i iVar = (xi.i) this.f59811b;
        WebView webView = (WebView) this.f59812c;
        e5.f fVar = (e5.f) this.d;
        synchronized (iVar.f60631a) {
            if (!iVar.f60649u && iVar.f60643o == webView && iVar.f60644p == fVar && !iVar.f60646r) {
                if (iVar.f60647s) {
                    a8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                    iVar.q();
                    return;
                }
                iVar.f60647s = true;
                a8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                iVar.h();
            }
        }
    }

    private final void b() {
        File file = (File) this.d;
        k8.a aVar = ((yi.j) this.f59811b).f61321g;
        long j3 = ((yi.h) this.f59812c).f61312a;
        synchronized (((e0.g) aVar.f18184c).f10209f) {
            ((HashMap) ((e0.g) aVar.f18184c).f10210g).put(Long.valueOf(j3), file);
        }
        ((Handler) ((e0.g) aVar.f18184c).d).post(new org.telegram.messenger.u0(aVar, j3, (ke) aVar.f18183b, file, 1));
    }

    @Override
    public final void run() {
        Exception runtimeException;
        byte[] bArr;
        switch (this.f59810a) {
            case 0:
                ((ug.z) this.f59811b).a(new Pair((HashMap) this.f59812c, (ArrayList) this.d));
                return;
            case 1:
                xh.l lVar = (xh.l) this.f59811b;
                l80 l80Var = (l80) this.f59812c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                j80 j80Var = lVar.H;
                if (j80Var != null && lVar.I == l80Var) {
                    j80Var.a(clickableSpan);
                    lVar.I = null;
                    lVar.f60603y.f(true);
                    return;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                yf.e eVar = (yf.e) this.f59811b;
                TLObject tLObject = (TLObject) this.f59812c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                String str = eVar.f61197b;
                int i7 = eVar.f61196a;
                if (tLObject != null) {
                    ri.d0(i7).l1(str, (TLRPC.Document) tLObject, false);
                } else {
                    eVar.a();
                    ri.d0(i7).l1(str, null, true);
                    if (tL_error != null) {
                        ks.f(i7).d(new r(16, eVar, tL_error));
                    }
                }
                eVar.a();
                return;
            case 4:
                yi.j jVar = (yi.j) this.f59811b;
                byte[] bArr2 = (byte[]) this.d;
                File file = ((yi.h) this.f59812c).f61313b;
                if (jVar.G == 4) {
                    jVar.B = bArr2;
                    try {
                        jVar.p();
                        if (jVar.f61319e) {
                            l2.f0 a10 = new l2.n(jVar.f61316a).a();
                            jVar.A = a10;
                            a10.I0(jVar.F);
                            jVar.A.m0(e2.l0.b(Uri.fromFile(file)));
                            jVar.A.a();
                        }
                        jVar.s(5);
                        ji.j jVar2 = jVar.f61320f;
                        long j3 = jVar.j();
                        byte[] bArr3 = jVar.B;
                        if (bArr3 == null) {
                            bArr = null;
                        } else {
                            bArr = (byte[]) bArr3.clone();
                        }
                        jVar2.Q(j3, bArr);
                        return;
                    } catch (Throwable th2) {
                        if (th2 instanceof Exception) {
                            runtimeException = th2;
                        } else {
                            runtimeException = new RuntimeException(th2);
                        }
                        jVar.g(runtimeException);
                        return;
                    }
                }
                return;
            case 5:
                b();
                return;
            case 6:
                zi.t tVar = (zi.t) this.f59811b;
                HandlerThread handlerThread = (HandlerThread) this.f59812c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                tVar.getClass();
                try {
                    tVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 7:
                zi.u0 u0Var = (zi.u0) this.f59811b;
                zi.x xVar = (zi.x) this.f59812c;
                File file2 = (File) this.d;
                Handler handler = u0Var.f62316i;
                try {
                    xVar.c(file2);
                    u0Var.g();
                    long h = xVar.h();
                    zi.o oVar = u0Var.f62320m;
                    oVar.b("preview snapshot completed: durationMs=" + h + ", size=" + file2.length() + ", elapsedMs=" + zi.u0.f(u0Var.N));
                    handler.post(new zi.f0(u0Var, h, 1));
                    return;
                } catch (Exception e10) {
                    handler.post(new zi.e0(u0Var, e10, 3));
                    return;
                }
            default:
                File file3 = (File) this.d;
                zi.r0 r0Var = ((zi.u0) this.f59811b).f62313e;
                long j10 = ((zi.q0) this.f59812c).f62243a;
                qy0 qy0Var = (qy0) r0Var;
                synchronized (qy0Var) {
                    if (!qy0Var.d) {
                        qy0Var.f38941c.put(Long.valueOf(j10), new oy0(file3));
                        return;
                    }
                    return;
                }
        }
    }
}
