package zi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class r implements Runnable {
    public final int f62247a;
    public final t f62248b;
    public final Size f62249c;
    public final int d;
    public final boolean f62250e;
    public final RuntimeException[] f62251f;
    public final CountDownLatch h;

    public r(t tVar, Size size, int i7, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.f62247a = i10;
        this.f62248b = tVar;
        this.f62249c = size;
        this.d = i7;
        this.f62250e = z10;
        this.f62251f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f62247a) {
            case 0:
                Size size = this.f62249c;
                int i7 = this.d;
                boolean z10 = this.f62250e;
                RuntimeException[] runtimeExceptionArr = this.f62251f;
                countDownLatch = this.h;
                t tVar = this.f62248b;
                tVar.getClass();
                try {
                    try {
                        tVar.f62259c = size;
                        tVar.f62275l = i7;
                        tVar.f62280o = z10;
                        SurfaceTexture surfaceTexture = tVar.f62297x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = tVar.E;
                        if (i10 != 0) {
                            tVar.k(i10, i7);
                        }
                        o oVar = tVar.f62269i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i7);
                        sb2.append(", filter=");
                        if (i7 == tVar.f62266g) {
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
                t tVar2 = this.f62248b;
                Size size2 = this.f62249c;
                int i11 = this.d;
                boolean z11 = this.f62250e;
                RuntimeException[] runtimeExceptionArr2 = this.f62251f;
                countDownLatch = this.h;
                try {
                    try {
                        tVar2.f62255a = size2;
                        tVar2.f62257b = size2;
                        tVar2.f62259c = size2;
                        tVar2.f62271j = i11;
                        tVar2.f62273k = i11;
                        tVar2.f62275l = i11;
                        tVar2.f62277m = z11;
                        tVar2.f62278n = z11;
                        tVar2.f62280o = z11;
                        SurfaceTexture surfaceTexture2 = tVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = tVar2.f62297x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        tVar2.k(tVar2.D, tVar2.f62273k);
                        int i12 = tVar2.E;
                        if (i12 != 0) {
                            tVar2.k(i12, tVar2.f62275l);
                        }
                        d0 d0Var = tVar2.N;
                        if (d0Var != null) {
                            d0Var.f62054c = size2;
                            d0Var.d = i11;
                            d0Var.v();
                            d0Var.B = false;
                            d0Var.A = 0L;
                        }
                        o oVar2 = tVar2.f62269i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        if (tVar2.f62271j == tVar2.f62266g) {
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
