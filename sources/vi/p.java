package vi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class p implements Runnable {
    public final int f50565a;
    public final s f50566b;
    public final Size f50567c;
    public final int d;
    public final boolean e;
    public final RuntimeException[] f50568f;
    public final CountDownLatch h;

    public p(s sVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.f50565a = i11;
        this.f50566b = sVar;
        this.f50567c = size;
        this.d = i10;
        this.e = z10;
        this.f50568f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f50565a) {
            case 0:
                Size size = this.f50567c;
                int i10 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f50568f;
                countDownLatch = this.h;
                s sVar = this.f50566b;
                sVar.getClass();
                try {
                    try {
                        sVar.f50581c = size;
                        sVar.f50596l = i10;
                        sVar.f50601o = z10;
                        SurfaceTexture surfaceTexture = sVar.f50618x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i11 = sVar.E;
                        if (i11 != 0) {
                            sVar.k(i11, i10);
                        }
                        n nVar = sVar.f50590i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        if (i10 == sVar.f50587g) {
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
                s sVar2 = this.f50566b;
                Size size2 = this.f50567c;
                int i12 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f50568f;
                countDownLatch = this.h;
                try {
                    try {
                        sVar2.f50577a = size2;
                        sVar2.f50579b = size2;
                        sVar2.f50581c = size2;
                        sVar2.f50592j = i12;
                        sVar2.f50594k = i12;
                        sVar2.f50596l = i12;
                        sVar2.f50598m = z11;
                        sVar2.f50599n = z11;
                        sVar2.f50601o = z11;
                        SurfaceTexture surfaceTexture2 = sVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = sVar2.f50618x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        sVar2.k(sVar2.D, sVar2.f50594k);
                        int i13 = sVar2.E;
                        if (i13 != 0) {
                            sVar2.k(i13, sVar2.f50596l);
                        }
                        d0 d0Var = sVar2.N;
                        if (d0Var != null) {
                            d0Var.f50386c = size2;
                            d0Var.d = i12;
                            d0Var.f50397q = d0.j(size2, i12, false);
                            d0Var.f50398r = d0.j(size2, i12, true);
                            d0Var.A = false;
                            d0Var.f50405z = 0L;
                        }
                        n nVar2 = sVar2.f50590i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        if (sVar2.f50592j == sVar2.f50587g) {
                            str2 = "NEAREST";
                        } else {
                            str2 = "LINEAR";
                        }
                        sb3.append(str2);
                        nVar2.b(sb3.toString());
                    } catch (RuntimeException e10) {
                        runtimeExceptionArr2[0] = e10;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
        }
    }
}
