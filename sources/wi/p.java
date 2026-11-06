package wi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class p implements Runnable {
    public final int f58028a;
    public final t f58029b;
    public final Size f58030c;
    public final int d;
    public final boolean f58031e;
    public final RuntimeException[] f58032f;
    public final CountDownLatch h;

    public p(t tVar, Size size, int i7, boolean z9, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.f58028a = i10;
        this.f58029b = tVar;
        this.f58030c = size;
        this.d = i7;
        this.f58031e = z9;
        this.f58032f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f58028a) {
            case 0:
                Size size = this.f58030c;
                int i7 = this.d;
                boolean z9 = this.f58031e;
                RuntimeException[] runtimeExceptionArr = this.f58032f;
                countDownLatch = this.h;
                t tVar = this.f58029b;
                tVar.getClass();
                try {
                    try {
                        tVar.f58055c = size;
                        tVar.f58071l = i7;
                        tVar.f58076o = z9;
                        SurfaceTexture surfaceTexture = tVar.f58093x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = tVar.E;
                        if (i10 != 0) {
                            tVar.k(i10, i7);
                        }
                        n nVar = tVar.f58065i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i7);
                        sb2.append(", filter=");
                        if (i7 == tVar.f58062g) {
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
                t tVar2 = this.f58029b;
                Size size2 = this.f58030c;
                int i11 = this.d;
                boolean z10 = this.f58031e;
                RuntimeException[] runtimeExceptionArr2 = this.f58032f;
                countDownLatch = this.h;
                try {
                    try {
                        tVar2.f58051a = size2;
                        tVar2.f58053b = size2;
                        tVar2.f58055c = size2;
                        tVar2.f58067j = i11;
                        tVar2.f58069k = i11;
                        tVar2.f58071l = i11;
                        tVar2.f58073m = z10;
                        tVar2.f58074n = z10;
                        tVar2.f58076o = z10;
                        SurfaceTexture surfaceTexture2 = tVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = tVar2.f58093x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        tVar2.k(tVar2.D, tVar2.f58069k);
                        int i12 = tVar2.E;
                        if (i12 != 0) {
                            tVar2.k(i12, tVar2.f58071l);
                        }
                        d0 d0Var = tVar2.N;
                        if (d0Var != null) {
                            d0Var.f57843c = size2;
                            d0Var.d = i11;
                            d0Var.f57855q = d0.j(size2, i11, false);
                            d0Var.f57856r = d0.j(size2, i11, true);
                            d0Var.A = false;
                            d0Var.f57863z = 0L;
                        }
                        n nVar2 = tVar2.f58065i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        if (tVar2.f58067j == tVar2.f58062g) {
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
