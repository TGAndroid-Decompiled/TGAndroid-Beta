package wi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class r implements Runnable {
    public final int f58131a;
    public final t f58132b;
    public final Size f58133c;
    public final int d;
    public final boolean f58134e;
    public final RuntimeException[] f58135f;
    public final CountDownLatch h;

    public r(t tVar, Size size, int i7, boolean z9, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.f58131a = i10;
        this.f58132b = tVar;
        this.f58133c = size;
        this.d = i7;
        this.f58134e = z9;
        this.f58135f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f58131a) {
            case 0:
                Size size = this.f58133c;
                int i7 = this.d;
                boolean z9 = this.f58134e;
                RuntimeException[] runtimeExceptionArr = this.f58135f;
                countDownLatch = this.h;
                t tVar = this.f58132b;
                tVar.getClass();
                try {
                    try {
                        tVar.f58149c = size;
                        tVar.f58165l = i7;
                        tVar.f58170o = z9;
                        SurfaceTexture surfaceTexture = tVar.f58187x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = tVar.E;
                        if (i10 != 0) {
                            tVar.k(i10, i7);
                        }
                        o oVar = tVar.f58159i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i7);
                        sb2.append(", filter=");
                        if (i7 == tVar.f58156g) {
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
                t tVar2 = this.f58132b;
                Size size2 = this.f58133c;
                int i11 = this.d;
                boolean z10 = this.f58134e;
                RuntimeException[] runtimeExceptionArr2 = this.f58135f;
                countDownLatch = this.h;
                try {
                    try {
                        tVar2.f58145a = size2;
                        tVar2.f58147b = size2;
                        tVar2.f58149c = size2;
                        tVar2.f58161j = i11;
                        tVar2.f58163k = i11;
                        tVar2.f58165l = i11;
                        tVar2.f58167m = z10;
                        tVar2.f58168n = z10;
                        tVar2.f58170o = z10;
                        SurfaceTexture surfaceTexture2 = tVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = tVar2.f58187x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        tVar2.k(tVar2.D, tVar2.f58163k);
                        int i12 = tVar2.E;
                        if (i12 != 0) {
                            tVar2.k(i12, tVar2.f58165l);
                        }
                        d0 d0Var = tVar2.N;
                        if (d0Var != null) {
                            d0Var.f57936c = size2;
                            d0Var.d = i11;
                            d0Var.v();
                            d0Var.B = false;
                            d0Var.A = 0L;
                        }
                        o oVar2 = tVar2.f58159i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        if (tVar2.f58161j == tVar2.f58156g) {
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
