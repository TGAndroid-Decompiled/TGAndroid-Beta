package wi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class p implements Runnable {
    public final int f58029a;
    public final t f58030b;
    public final Size f58031c;
    public final int d;
    public final boolean f58032e;
    public final RuntimeException[] f58033f;
    public final CountDownLatch h;

    public p(t tVar, Size size, int i7, boolean z9, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.f58029a = i10;
        this.f58030b = tVar;
        this.f58031c = size;
        this.d = i7;
        this.f58032e = z9;
        this.f58033f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f58029a) {
            case 0:
                Size size = this.f58031c;
                int i7 = this.d;
                boolean z9 = this.f58032e;
                RuntimeException[] runtimeExceptionArr = this.f58033f;
                countDownLatch = this.h;
                t tVar = this.f58030b;
                tVar.getClass();
                try {
                    try {
                        tVar.f58056c = size;
                        tVar.f58072l = i7;
                        tVar.f58077o = z9;
                        SurfaceTexture surfaceTexture = tVar.f58094x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = tVar.E;
                        if (i10 != 0) {
                            tVar.k(i10, i7);
                        }
                        n nVar = tVar.f58066i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i7);
                        sb2.append(", filter=");
                        if (i7 == tVar.f58063g) {
                            str = "NEAREST";
                        } else {
                            str = "LINEAR";
                        }
                        sb2.append(str);
                        sb2.append(", timestampRealtime=");
                        sb2.append(z9);
                        nVar.b(sb2.toString());
                    } catch (RuntimeException e10) {
                        runtimeExceptionArr[0] = e10;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                t tVar2 = this.f58030b;
                Size size2 = this.f58031c;
                int i11 = this.d;
                boolean z10 = this.f58032e;
                RuntimeException[] runtimeExceptionArr2 = this.f58033f;
                countDownLatch = this.h;
                try {
                    try {
                        tVar2.f58052a = size2;
                        tVar2.f58054b = size2;
                        tVar2.f58056c = size2;
                        tVar2.f58068j = i11;
                        tVar2.f58070k = i11;
                        tVar2.f58072l = i11;
                        tVar2.f58074m = z10;
                        tVar2.f58075n = z10;
                        tVar2.f58077o = z10;
                        SurfaceTexture surfaceTexture2 = tVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = tVar2.f58094x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        tVar2.k(tVar2.D, tVar2.f58070k);
                        int i12 = tVar2.E;
                        if (i12 != 0) {
                            tVar2.k(i12, tVar2.f58072l);
                        }
                        d0 d0Var = tVar2.N;
                        if (d0Var != null) {
                            d0Var.f57844c = size2;
                            d0Var.d = i11;
                            d0Var.f57856q = d0.j(size2, i11, false);
                            d0Var.f57857r = d0.j(size2, i11, true);
                            d0Var.A = false;
                            d0Var.f57864z = 0L;
                        }
                        n nVar2 = tVar2.f58066i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        if (tVar2.f58068j == tVar2.f58063g) {
                            str2 = "NEAREST";
                        } else {
                            str2 = "LINEAR";
                        }
                        sb3.append(str2);
                        nVar2.b(sb3.toString());
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
