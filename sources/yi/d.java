package yi;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import e2.l0;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import l2.f0;
import l2.n;
import org.telegram.messenger.le;
import org.telegram.messenger.u0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.jy0;
import zi.g0;
import zi.p;
import zi.r0;
import zi.s0;
import zi.u;
import zi.v0;
import zi.y;
public final class d implements Runnable {
    public final int f60737a;
    public final Object f60738b;
    public final Object f60739c;
    public final Object d;

    public d(Object obj, Object obj2, Object obj3, int i7) {
        this.f60737a = i7;
        this.f60738b = obj;
        this.f60739c = obj2;
        this.d = obj3;
    }

    private final void a() {
        File file = (File) this.d;
        k8.a aVar = ((j) this.f60738b).f60757g;
        long j3 = ((i) this.f60739c).f60748a;
        synchronized (((e0.g) aVar.f17789c).f9891f) {
            ((HashMap) ((e0.g) aVar.f17789c).f9892g).put(Long.valueOf(j3), file);
        }
        ((Handler) ((e0.g) aVar.f17789c).d).post(new u0(aVar, j3, (le) aVar.f17788b, file, 1));
    }

    @Override
    public final void run() {
        Exception runtimeException;
        byte[] bArr;
        switch (this.f60737a) {
            case 0:
                j jVar = (j) this.f60738b;
                byte[] bArr2 = (byte[]) this.d;
                File file = ((i) this.f60739c).f60749b;
                if (jVar.G == 4) {
                    jVar.B = bArr2;
                    try {
                        jVar.p();
                        if (jVar.f60755e) {
                            f0 a10 = new n(jVar.f60752a).a();
                            jVar.A = a10;
                            a10.I0(jVar.F);
                            jVar.A.m0(l0.b(Uri.fromFile(file)));
                            jVar.A.a();
                        }
                        jVar.s(5);
                        ji.j jVar2 = jVar.f60756f;
                        long j3 = jVar.j();
                        byte[] bArr3 = jVar.B;
                        if (bArr3 == null) {
                            bArr = null;
                        } else {
                            bArr = (byte[]) bArr3.clone();
                        }
                        jVar2.l0(j3, bArr);
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
            case 1:
                a();
                return;
            case 2:
                u uVar = (u) this.f60738b;
                HandlerThread handlerThread = (HandlerThread) this.f60739c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                uVar.getClass();
                try {
                    uVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 3:
                v0 v0Var = (v0) this.f60738b;
                y yVar = (y) this.f60739c;
                File file2 = (File) this.d;
                Handler handler = v0Var.f61752i;
                try {
                    yVar.c(file2);
                    v0Var.g();
                    long h = yVar.h();
                    p pVar = v0Var.f61756m;
                    pVar.b("preview snapshot completed: durationMs=" + h + ", size=" + file2.length() + ", elapsedMs=" + v0.f(v0Var.N));
                    handler.post(new g0(v0Var, h, 1));
                    return;
                } catch (Exception e10) {
                    handler.post(new zi.f0(v0Var, e10, 3));
                    return;
                }
            default:
                File file3 = (File) this.d;
                s0 s0Var = ((v0) this.f60738b).f61749e;
                long j10 = ((r0) this.f60739c).f61679a;
                jy0 jy0Var = (jy0) s0Var;
                synchronized (jy0Var) {
                    if (!jy0Var.d) {
                        jy0Var.f36193c.put(Long.valueOf(j10), new hy0(file3));
                        return;
                    }
                    return;
                }
        }
    }
}
