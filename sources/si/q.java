package si;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class q implements Runnable {
    public final int f47184a;
    public final t f47185b;
    public final Size f47186c;
    public final int d;
    public final boolean e;
    public final RuntimeException[] f47187f;
    public final CountDownLatch h;

    public q(t tVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.f47184a = i11;
        this.f47185b = tVar;
        this.f47186c = size;
        this.d = i10;
        this.e = z10;
        this.f47187f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f47184a) {
            case 0:
                Size size = this.f47186c;
                int i10 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f47187f;
                countDownLatch = this.h;
                t tVar = this.f47185b;
                tVar.getClass();
                try {
                    try {
                        tVar.f47200c = size;
                        tVar.f47215l = i10;
                        tVar.f47220o = z10;
                        SurfaceTexture surfaceTexture = tVar.f47237x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i11 = tVar.E;
                        if (i11 != 0) {
                            tVar.k(i11, i10);
                        }
                        n nVar = tVar.f47209i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        if (i10 == tVar.f47206g) {
                            str = "NEAREST";
                        } else {
                            str = "LINEAR";
                        }
                        sb2.append(str);
                        sb2.append(", timestampRealtime=");
                        sb2.append(z10);
                        nVar.b(sb2.toString());
                    } catch (RuntimeException e) {
                        runtimeExceptionArr[0] = e;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                t tVar2 = this.f47185b;
                Size size2 = this.f47186c;
                int i12 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f47187f;
                countDownLatch = this.h;
                try {
                    try {
                        tVar2.f47196a = size2;
                        tVar2.f47198b = size2;
                        tVar2.f47200c = size2;
                        tVar2.f47211j = i12;
                        tVar2.f47213k = i12;
                        tVar2.f47215l = i12;
                        tVar2.f47217m = z11;
                        tVar2.f47218n = z11;
                        tVar2.f47220o = z11;
                        SurfaceTexture surfaceTexture2 = tVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = tVar2.f47237x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        tVar2.k(tVar2.D, tVar2.f47213k);
                        int i13 = tVar2.E;
                        if (i13 != 0) {
                            tVar2.k(i13, tVar2.f47215l);
                        }
                        d0 d0Var = tVar2.N;
                        if (d0Var != null) {
                            d0Var.f47007c = size2;
                            d0Var.d = i12;
                            d0Var.f47018q = d0.j(size2, i12, false);
                            d0Var.f47019r = d0.j(size2, i12, true);
                            d0Var.A = false;
                            d0Var.f47026z = 0L;
                        }
                        n nVar2 = tVar2.f47209i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        if (tVar2.f47211j == tVar2.f47206g) {
                            str2 = "NEAREST";
                        } else {
                            str2 = "LINEAR";
                        }
                        sb3.append(str2);
                        nVar2.b(sb3.toString());
                    } catch (RuntimeException e7) {
                        runtimeExceptionArr2[0] = e7;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
        }
    }
}
