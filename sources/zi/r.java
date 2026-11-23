package zi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class r implements Runnable {
    public final int f62378a;
    public final t f62379b;
    public final Size f62380c;
    public final int d;
    public final boolean f62381e;
    public final RuntimeException[] f62382f;
    public final CountDownLatch h;

    public r(t tVar, Size size, int i7, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.f62378a = i10;
        this.f62379b = tVar;
        this.f62380c = size;
        this.d = i7;
        this.f62381e = z10;
        this.f62382f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f62378a) {
            case 0:
                Size size = this.f62380c;
                int i7 = this.d;
                boolean z10 = this.f62381e;
                RuntimeException[] runtimeExceptionArr = this.f62382f;
                countDownLatch = this.h;
                t tVar = this.f62379b;
                tVar.getClass();
                try {
                    try {
                        tVar.f62390c = size;
                        tVar.f62406l = i7;
                        tVar.f62411o = z10;
                        SurfaceTexture surfaceTexture = tVar.f62428x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = tVar.E;
                        if (i10 != 0) {
                            tVar.k(i10, i7);
                        }
                        o oVar = tVar.f62400i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i7);
                        sb2.append(", filter=");
                        if (i7 == tVar.f62397g) {
                            str = "NEAREST";
                        } else {
                            str = "LINEAR";
                        }
                        sb2.append(str);
                        sb2.append(", timestampRealtime=");
                        sb2.append(z10);
                        oVar.b(sb2.toString());
                    } catch (RuntimeException e10) {
                        runtimeExceptionArr[0] = e10;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                t tVar2 = this.f62379b;
                Size size2 = this.f62380c;
                int i11 = this.d;
                boolean z11 = this.f62381e;
                RuntimeException[] runtimeExceptionArr2 = this.f62382f;
                countDownLatch = this.h;
                try {
                    try {
                        tVar2.f62386a = size2;
                        tVar2.f62388b = size2;
                        tVar2.f62390c = size2;
                        tVar2.f62402j = i11;
                        tVar2.f62404k = i11;
                        tVar2.f62406l = i11;
                        tVar2.f62408m = z11;
                        tVar2.f62409n = z11;
                        tVar2.f62411o = z11;
                        SurfaceTexture surfaceTexture2 = tVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = tVar2.f62428x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        tVar2.k(tVar2.D, tVar2.f62404k);
                        int i12 = tVar2.E;
                        if (i12 != 0) {
                            tVar2.k(i12, tVar2.f62406l);
                        }
                        d0 d0Var = tVar2.N;
                        if (d0Var != null) {
                            d0Var.f62183c = size2;
                            d0Var.d = i11;
                            d0Var.v();
                            d0Var.B = false;
                            d0Var.A = 0L;
                        }
                        o oVar2 = tVar2.f62400i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        if (tVar2.f62402j == tVar2.f62397g) {
                            str2 = "NEAREST";
                        } else {
                            str2 = "LINEAR";
                        }
                        sb3.append(str2);
                        oVar2.b(sb3.toString());
                    } catch (RuntimeException e11) {
                        runtimeExceptionArr2[0] = e11;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
        }
    }
}
