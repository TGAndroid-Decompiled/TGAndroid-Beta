package zi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class r implements Runnable {
    public final int f62258a;
    public final t f62259b;
    public final Size f62260c;
    public final int d;
    public final boolean f62261e;
    public final RuntimeException[] f62262f;
    public final CountDownLatch h;

    public r(t tVar, Size size, int i7, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.f62258a = i10;
        this.f62259b = tVar;
        this.f62260c = size;
        this.d = i7;
        this.f62261e = z10;
        this.f62262f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f62258a) {
            case 0:
                Size size = this.f62260c;
                int i7 = this.d;
                boolean z10 = this.f62261e;
                RuntimeException[] runtimeExceptionArr = this.f62262f;
                countDownLatch = this.h;
                t tVar = this.f62259b;
                tVar.getClass();
                try {
                    try {
                        tVar.f62270c = size;
                        tVar.f62286l = i7;
                        tVar.f62291o = z10;
                        SurfaceTexture surfaceTexture = tVar.f62308x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = tVar.E;
                        if (i10 != 0) {
                            tVar.k(i10, i7);
                        }
                        o oVar = tVar.f62280i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i7);
                        sb2.append(", filter=");
                        if (i7 == tVar.f62277g) {
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
                t tVar2 = this.f62259b;
                Size size2 = this.f62260c;
                int i11 = this.d;
                boolean z11 = this.f62261e;
                RuntimeException[] runtimeExceptionArr2 = this.f62262f;
                countDownLatch = this.h;
                try {
                    try {
                        tVar2.f62266a = size2;
                        tVar2.f62268b = size2;
                        tVar2.f62270c = size2;
                        tVar2.f62282j = i11;
                        tVar2.f62284k = i11;
                        tVar2.f62286l = i11;
                        tVar2.f62288m = z11;
                        tVar2.f62289n = z11;
                        tVar2.f62291o = z11;
                        SurfaceTexture surfaceTexture2 = tVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = tVar2.f62308x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        tVar2.k(tVar2.D, tVar2.f62284k);
                        int i12 = tVar2.E;
                        if (i12 != 0) {
                            tVar2.k(i12, tVar2.f62286l);
                        }
                        d0 d0Var = tVar2.N;
                        if (d0Var != null) {
                            d0Var.f62065c = size2;
                            d0Var.d = i11;
                            d0Var.v();
                            d0Var.B = false;
                            d0Var.A = 0L;
                        }
                        o oVar2 = tVar2.f62280i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        if (tVar2.f62282j == tVar2.f62277g) {
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
