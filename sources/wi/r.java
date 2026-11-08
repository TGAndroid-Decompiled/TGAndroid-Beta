package wi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class r implements Runnable {
    public final int f58130a;
    public final t f58131b;
    public final Size f58132c;
    public final int d;
    public final boolean f58133e;
    public final RuntimeException[] f58134f;
    public final CountDownLatch h;

    public r(t tVar, Size size, int i7, boolean z9, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.f58130a = i10;
        this.f58131b = tVar;
        this.f58132c = size;
        this.d = i7;
        this.f58133e = z9;
        this.f58134f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f58130a) {
            case 0:
                Size size = this.f58132c;
                int i7 = this.d;
                boolean z9 = this.f58133e;
                RuntimeException[] runtimeExceptionArr = this.f58134f;
                countDownLatch = this.h;
                t tVar = this.f58131b;
                tVar.getClass();
                try {
                    try {
                        tVar.f58148c = size;
                        tVar.f58164l = i7;
                        tVar.f58169o = z9;
                        SurfaceTexture surfaceTexture = tVar.f58186x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = tVar.E;
                        if (i10 != 0) {
                            tVar.k(i10, i7);
                        }
                        o oVar = tVar.f58158i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i7);
                        sb2.append(", filter=");
                        if (i7 == tVar.f58155g) {
                            str = "NEAREST";
                        } else {
                            str = "LINEAR";
                        }
                        sb2.append(str);
                        sb2.append(", timestampRealtime=");
                        sb2.append(z9);
                        oVar.b(sb2.toString());
                    } catch (RuntimeException e10) {
                        runtimeExceptionArr[0] = e10;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                t tVar2 = this.f58131b;
                Size size2 = this.f58132c;
                int i11 = this.d;
                boolean z10 = this.f58133e;
                RuntimeException[] runtimeExceptionArr2 = this.f58134f;
                countDownLatch = this.h;
                try {
                    try {
                        tVar2.f58144a = size2;
                        tVar2.f58146b = size2;
                        tVar2.f58148c = size2;
                        tVar2.f58160j = i11;
                        tVar2.f58162k = i11;
                        tVar2.f58164l = i11;
                        tVar2.f58166m = z10;
                        tVar2.f58167n = z10;
                        tVar2.f58169o = z10;
                        SurfaceTexture surfaceTexture2 = tVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = tVar2.f58186x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        tVar2.k(tVar2.D, tVar2.f58162k);
                        int i12 = tVar2.E;
                        if (i12 != 0) {
                            tVar2.k(i12, tVar2.f58164l);
                        }
                        d0 d0Var = tVar2.N;
                        if (d0Var != null) {
                            d0Var.f57935c = size2;
                            d0Var.d = i11;
                            d0Var.v();
                            d0Var.B = false;
                            d0Var.A = 0L;
                        }
                        o oVar2 = tVar2.f58158i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        if (tVar2.f58160j == tVar2.f58155g) {
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
