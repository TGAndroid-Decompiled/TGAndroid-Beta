package vi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class p implements Runnable {
    public final int f50525a;
    public final s f50526b;
    public final Size f50527c;
    public final int d;
    public final boolean e;
    public final RuntimeException[] f50528f;
    public final CountDownLatch h;

    public p(s sVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.f50525a = i11;
        this.f50526b = sVar;
        this.f50527c = size;
        this.d = i10;
        this.e = z10;
        this.f50528f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f50525a) {
            case 0:
                Size size = this.f50527c;
                int i10 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f50528f;
                countDownLatch = this.h;
                s sVar = this.f50526b;
                sVar.getClass();
                try {
                    try {
                        sVar.f50542c = size;
                        sVar.f50557l = i10;
                        sVar.f50562o = z10;
                        SurfaceTexture surfaceTexture = sVar.f50579x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i11 = sVar.E;
                        if (i11 != 0) {
                            sVar.k(i11, i10);
                        }
                        n nVar = sVar.f50551i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        if (i10 == sVar.f50548g) {
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
                s sVar2 = this.f50526b;
                Size size2 = this.f50527c;
                int i12 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f50528f;
                countDownLatch = this.h;
                try {
                    try {
                        sVar2.f50538a = size2;
                        sVar2.f50540b = size2;
                        sVar2.f50542c = size2;
                        sVar2.f50553j = i12;
                        sVar2.f50555k = i12;
                        sVar2.f50557l = i12;
                        sVar2.f50559m = z11;
                        sVar2.f50560n = z11;
                        sVar2.f50562o = z11;
                        SurfaceTexture surfaceTexture2 = sVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = sVar2.f50579x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        sVar2.k(sVar2.D, sVar2.f50555k);
                        int i13 = sVar2.E;
                        if (i13 != 0) {
                            sVar2.k(i13, sVar2.f50557l);
                        }
                        c0 c0Var = sVar2.N;
                        if (c0Var != null) {
                            c0Var.f50345c = size2;
                            c0Var.d = i12;
                            c0Var.f50356q = c0.j(size2, i12, false);
                            c0Var.f50357r = c0.j(size2, i12, true);
                            c0Var.A = false;
                            c0Var.f50364z = 0L;
                        }
                        n nVar2 = sVar2.f50551i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        if (sVar2.f50553j == sVar2.f50548g) {
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
