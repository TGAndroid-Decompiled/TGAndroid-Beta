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
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.ke;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.ry0;
public final class p implements Runnable {
    public final int f59917a;
    public final Object f59918b;
    public final Object f59919c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i7) {
        this.f59917a = i7;
        this.f59918b = obj;
        this.f59919c = obj2;
        this.d = obj3;
    }

    private final void a() {
        xi.i iVar = (xi.i) this.f59918b;
        WebView webView = (WebView) this.f59919c;
        e5.f fVar = (e5.f) this.d;
        synchronized (iVar.f60760a) {
            if (!iVar.f60778u && iVar.f60772o == webView && iVar.f60773p == fVar && !iVar.f60775r) {
                if (iVar.f60776s) {
                    a8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                    iVar.q();
                    return;
                }
                iVar.f60776s = true;
                a8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                iVar.h();
            }
        }
    }

    private final void b() {
        File file = (File) this.d;
        jb.m mVar = ((yi.j) this.f59918b).f61451g;
        long j3 = ((yi.h) this.f59919c).f61442a;
        synchronized (((e0.g) mVar.f17465c).f10199f) {
            ((HashMap) ((e0.g) mVar.f17465c).f10200g).put(Long.valueOf(j3), file);
        }
        ((Handler) ((e0.g) mVar.f17465c).d).post(new org.telegram.messenger.u0(mVar, j3, (ke) mVar.f17464b, file, 1));
    }

    @Override
    public final void run() {
        TLRPC.User c22;
        Exception runtimeException;
        byte[] bArr;
        switch (this.f59917a) {
            case 0:
                TLObject tLObject = (TLObject) this.f59918b;
                mp mpVar = (mp) this.f59919c;
                t0 t0Var = (t0) this.d;
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    mpVar.f4(tL_channels_channelParticipants.users, false);
                    mpVar.Z3(tL_channels_channelParticipants.chats, false);
                    long e10 = i10.i(i10.f24637t0).e();
                    ArrayList arrayList = new ArrayList();
                    for (int i7 = 0; i7 < tL_channels_channelParticipants.participants.size(); i7++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i7).peer;
                        if (peer != null && fj.B1(peer) != e10 && (c22 = mpVar.c2(Long.valueOf(peer.user_id))) != null && !n10.y(c22) && !c22.bot) {
                            arrayList.add(mpVar.o1(peer));
                        }
                    }
                    t0Var.a(arrayList);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f59918b;
                w10 w10Var = (w10) this.f59919c;
                w10 w10Var2 = (w10) this.d;
                if (tL_error != null) {
                    w10Var.a(tL_error);
                    return;
                } else {
                    w10Var2.a(null);
                    return;
                }
            case 2:
                ((ug.z) this.f59918b).a(new Pair((HashMap) this.f59919c, (ArrayList) this.d));
                return;
            case 3:
                xh.l lVar = (xh.l) this.f59918b;
                k80 k80Var = (k80) this.f59919c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                i80 i80Var = lVar.H;
                if (i80Var != null && lVar.I == k80Var) {
                    i80Var.a(clickableSpan);
                    lVar.I = null;
                    lVar.f60732y.f(true);
                    return;
                }
                return;
            case 4:
                a();
                return;
            case 5:
                yf.e eVar = (yf.e) this.f59919c;
                TLObject tLObject2 = (TLObject) this.f59918b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                String str = eVar.f61327b;
                int i10 = eVar.f61326a;
                if (tLObject2 != null) {
                    ri.d0(i10).l1(str, (TLRPC.Document) tLObject2, false);
                } else {
                    eVar.a();
                    ri.d0(i10).l1(str, null, true);
                    if (tL_error2 != null) {
                        ks.f(i10).d(new v9.b(22, eVar, tL_error2));
                    }
                }
                eVar.a();
                return;
            case 6:
                yi.j jVar = (yi.j) this.f59918b;
                byte[] bArr2 = (byte[]) this.d;
                File file = ((yi.h) this.f59919c).f61443b;
                if (jVar.G == 4) {
                    jVar.B = bArr2;
                    try {
                        jVar.p();
                        if (jVar.f61449e) {
                            l2.g0 a10 = new l2.o(jVar.f61446a).a();
                            jVar.A = a10;
                            a10.J0(jVar.F);
                            jVar.A.n0(e2.l0.b(Uri.fromFile(file)));
                            jVar.A.a();
                        }
                        jVar.s(5);
                        j6.k kVar = jVar.f61450f;
                        long j3 = jVar.j();
                        byte[] bArr3 = jVar.B;
                        if (bArr3 == null) {
                            bArr = null;
                        } else {
                            bArr = (byte[]) bArr3.clone();
                        }
                        kVar.k0(j3, bArr);
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
            case 7:
                b();
                return;
            case 8:
                zi.t tVar = (zi.t) this.f59918b;
                HandlerThread handlerThread = (HandlerThread) this.f59919c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                tVar.getClass();
                try {
                    tVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 9:
                zi.u0 u0Var = (zi.u0) this.f59918b;
                zi.x xVar = (zi.x) this.f59919c;
                File file2 = (File) this.d;
                Handler handler = u0Var.f62447i;
                try {
                    xVar.c(file2);
                    u0Var.g();
                    long h = xVar.h();
                    zi.o oVar = u0Var.f62451m;
                    oVar.b("preview snapshot completed: durationMs=" + h + ", size=" + file2.length() + ", elapsedMs=" + zi.u0.f(u0Var.N));
                    handler.post(new zi.f0(u0Var, h, 1));
                    return;
                } catch (Exception e11) {
                    handler.post(new zi.e0(u0Var, e11, 3));
                    return;
                }
            default:
                File file3 = (File) this.d;
                zi.r0 r0Var = ((zi.u0) this.f59918b).f62444e;
                long j10 = ((zi.q0) this.f59919c).f62374a;
                ry0 ry0Var = (ry0) r0Var;
                synchronized (ry0Var) {
                    if (!ry0Var.d) {
                        ry0Var.f39436c.put(Long.valueOf(j10), new py0(file3));
                        return;
                    }
                    return;
                }
        }
    }

    public p(yf.e eVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f59917a = 5;
        this.f59919c = eVar;
        this.f59918b = tLObject;
        this.d = tL_error;
    }
}
