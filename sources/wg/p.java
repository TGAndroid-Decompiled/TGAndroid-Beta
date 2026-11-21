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
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sy0;
public final class p implements Runnable {
    public final int f59846a;
    public final Object f59847b;
    public final Object f59848c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i7) {
        this.f59846a = i7;
        this.f59847b = obj;
        this.f59848c = obj2;
        this.d = obj3;
    }

    private final void a() {
        xi.i iVar = (xi.i) this.f59847b;
        WebView webView = (WebView) this.f59848c;
        e5.f fVar = (e5.f) this.d;
        synchronized (iVar.f60673a) {
            if (!iVar.f60691u && iVar.f60685o == webView && iVar.f60686p == fVar && !iVar.f60688r) {
                if (iVar.f60689s) {
                    a8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                    iVar.q();
                    return;
                }
                iVar.f60689s = true;
                a8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                iVar.h();
            }
        }
    }

    private final void b() {
        File file = (File) this.d;
        k8.a aVar = ((yi.j) this.f59847b).f61363g;
        long j3 = ((yi.h) this.f59848c).f61354a;
        synchronized (((e0.g) aVar.f18212c).f10235f) {
            ((HashMap) ((e0.g) aVar.f18212c).f10236g).put(Long.valueOf(j3), file);
        }
        ((Handler) ((e0.g) aVar.f18212c).d).post(new org.telegram.messenger.u0(aVar, j3, (ke) aVar.f18211b, file, 1));
    }

    @Override
    public final void run() {
        Exception runtimeException;
        byte[] bArr;
        switch (this.f59846a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f59847b;
                x10 x10Var = (x10) this.f59848c;
                x10 x10Var2 = (x10) this.d;
                if (tL_error != null) {
                    x10Var.a(tL_error);
                    return;
                } else {
                    x10Var2.a(null);
                    return;
                }
            case 1:
                ((ug.z) this.f59847b).a(new Pair((HashMap) this.f59848c, (ArrayList) this.d));
                return;
            case 2:
                xh.l lVar = (xh.l) this.f59847b;
                n80 n80Var = (n80) this.f59848c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                l80 l80Var = lVar.H;
                if (l80Var != null && lVar.I == n80Var) {
                    l80Var.a(clickableSpan);
                    lVar.I = null;
                    lVar.f60645y.f(true);
                    return;
                }
                return;
            case 3:
                a();
                return;
            case 4:
                yf.e eVar = (yf.e) this.f59848c;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f59847b;
                String str = eVar.f61239b;
                int i7 = eVar.f61238a;
                if (tLObject != null) {
                    ri.d0(i7).l1(str, (TLRPC.Document) tLObject, false);
                } else {
                    eVar.a();
                    ri.d0(i7).l1(str, null, true);
                    if (tL_error2 != null) {
                        ks.f(i7).d(new q(18, eVar, tL_error2));
                    }
                }
                eVar.a();
                return;
            case 5:
                yi.j jVar = (yi.j) this.f59847b;
                byte[] bArr2 = (byte[]) this.d;
                File file = ((yi.h) this.f59848c).f61355b;
                if (jVar.G == 4) {
                    jVar.B = bArr2;
                    try {
                        jVar.p();
                        if (jVar.f61361e) {
                            l2.f0 a10 = new l2.n(jVar.f61358a).a();
                            jVar.A = a10;
                            a10.I0(jVar.F);
                            jVar.A.m0(e2.l0.b(Uri.fromFile(file)));
                            jVar.A.a();
                        }
                        jVar.s(5);
                        ji.l lVar2 = jVar.f61362f;
                        long j3 = jVar.j();
                        byte[] bArr3 = jVar.B;
                        if (bArr3 == null) {
                            bArr = null;
                        } else {
                            bArr = (byte[]) bArr3.clone();
                        }
                        lVar2.Q(j3, bArr);
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
            case 6:
                b();
                return;
            case 7:
                zi.t tVar = (zi.t) this.f59847b;
                HandlerThread handlerThread = (HandlerThread) this.f59848c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                tVar.getClass();
                try {
                    tVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 8:
                zi.u0 u0Var = (zi.u0) this.f59847b;
                zi.x xVar = (zi.x) this.f59848c;
                File file2 = (File) this.d;
                Handler handler = u0Var.f62358i;
                try {
                    xVar.c(file2);
                    u0Var.g();
                    long h = xVar.h();
                    zi.o oVar = u0Var.f62362m;
                    oVar.b("preview snapshot completed: durationMs=" + h + ", size=" + file2.length() + ", elapsedMs=" + zi.u0.f(u0Var.N));
                    handler.post(new zi.f0(u0Var, h, 1));
                    return;
                } catch (Exception e10) {
                    handler.post(new zi.e0(u0Var, e10, 3));
                    return;
                }
            default:
                File file3 = (File) this.d;
                zi.r0 r0Var = ((zi.u0) this.f59847b).f62355e;
                long j10 = ((zi.q0) this.f59848c).f62285a;
                sy0 sy0Var = (sy0) r0Var;
                synchronized (sy0Var) {
                    if (!sy0Var.d) {
                        sy0Var.f39733c.put(Long.valueOf(j10), new qy0(file3));
                        return;
                    }
                    return;
                }
        }
    }

    public p(yf.e eVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f59846a = 4;
        this.f59848c = eVar;
        this.d = tLObject;
        this.f59847b = tL_error;
    }
}
