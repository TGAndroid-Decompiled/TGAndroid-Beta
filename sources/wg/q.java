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
    public final int f59811a;
    public final Object f59812b;
    public final Object f59813c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i7) {
        this.f59811a = i7;
        this.f59812b = obj;
        this.f59813c = obj2;
        this.d = obj3;
    }

    private final void a() {
        xi.i iVar = (xi.i) this.f59812b;
        WebView webView = (WebView) this.f59813c;
        e5.f fVar = (e5.f) this.d;
        synchronized (iVar.f60632a) {
            if (!iVar.f60650u && iVar.f60644o == webView && iVar.f60645p == fVar && !iVar.f60647r) {
                if (iVar.f60648s) {
                    a8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                    iVar.q();
                    return;
                }
                iVar.f60648s = true;
                a8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                iVar.h();
            }
        }
    }

    private final void b() {
        File file = (File) this.d;
        k8.a aVar = ((yi.j) this.f59812b).f61322g;
        long j3 = ((yi.h) this.f59813c).f61313a;
        synchronized (((e0.g) aVar.f18181c).f10206f) {
            ((HashMap) ((e0.g) aVar.f18181c).f10207g).put(Long.valueOf(j3), file);
        }
        ((Handler) ((e0.g) aVar.f18181c).d).post(new org.telegram.messenger.u0(aVar, j3, (ke) aVar.f18180b, file, 1));
    }

    @Override
    public final void run() {
        Exception runtimeException;
        byte[] bArr;
        switch (this.f59811a) {
            case 0:
                ((ug.z) this.f59812b).a(new Pair((HashMap) this.f59813c, (ArrayList) this.d));
                return;
            case 1:
                xh.l lVar = (xh.l) this.f59812b;
                l80 l80Var = (l80) this.f59813c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                j80 j80Var = lVar.H;
                if (j80Var != null && lVar.I == l80Var) {
                    j80Var.a(clickableSpan);
                    lVar.I = null;
                    lVar.f60604y.f(true);
                    return;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                yf.e eVar = (yf.e) this.f59812b;
                TLObject tLObject = (TLObject) this.f59813c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                String str = eVar.f61198b;
                int i7 = eVar.f61197a;
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
                yi.j jVar = (yi.j) this.f59812b;
                byte[] bArr2 = (byte[]) this.d;
                File file = ((yi.h) this.f59813c).f61314b;
                if (jVar.G == 4) {
                    jVar.B = bArr2;
                    try {
                        jVar.p();
                        if (jVar.f61320e) {
                            l2.f0 a10 = new l2.n(jVar.f61317a).a();
                            jVar.A = a10;
                            a10.I0(jVar.F);
                            jVar.A.m0(e2.l0.b(Uri.fromFile(file)));
                            jVar.A.a();
                        }
                        jVar.s(5);
                        ji.j jVar2 = jVar.f61321f;
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
                zi.t tVar = (zi.t) this.f59812b;
                HandlerThread handlerThread = (HandlerThread) this.f59813c;
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
                zi.u0 u0Var = (zi.u0) this.f59812b;
                zi.x xVar = (zi.x) this.f59813c;
                File file2 = (File) this.d;
                Handler handler = u0Var.f62317i;
                try {
                    xVar.c(file2);
                    u0Var.g();
                    long h = xVar.h();
                    zi.o oVar = u0Var.f62321m;
                    oVar.b("preview snapshot completed: durationMs=" + h + ", size=" + file2.length() + ", elapsedMs=" + zi.u0.f(u0Var.N));
                    handler.post(new zi.f0(u0Var, h, 1));
                    return;
                } catch (Exception e10) {
                    handler.post(new zi.e0(u0Var, e10, 3));
                    return;
                }
            default:
                File file3 = (File) this.d;
                zi.r0 r0Var = ((zi.u0) this.f59812b).f62314e;
                long j10 = ((zi.q0) this.f59813c).f62244a;
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
