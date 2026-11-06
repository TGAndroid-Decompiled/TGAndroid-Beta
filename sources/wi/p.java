package wi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class p implements Runnable {
    public final int f58004a;
    public final t f58005b;
    public final Size f58006c;
    public final int d;
    public final boolean f58007e;
    public final RuntimeException[] f58008f;
    public final CountDownLatch h;

    public p(t tVar, Size size, int i7, boolean z9, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.f58004a = i10;
        this.f58005b = tVar;
        this.f58006c = size;
        this.d = i7;
        this.f58007e = z9;
        this.f58008f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f58004a) {
            case 0:
                Size size = this.f58006c;
                int i7 = this.d;
                boolean z9 = this.f58007e;
                RuntimeException[] runtimeExceptionArr = this.f58008f;
                countDownLatch = this.h;
                t tVar = this.f58005b;
                tVar.getClass();
                try {
                    try {
                        tVar.f58031c = size;
                        tVar.f58047l = i7;
                        tVar.f58052o = z9;
                        SurfaceTexture surfaceTexture = tVar.f58069x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = tVar.E;
                        if (i10 != 0) {
                            tVar.k(i10, i7);
                        }
                        n nVar = tVar.f58041i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i7);
                        sb2.append(", filter=");
                        if (i7 == tVar.f58038g) {
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
                t tVar2 = this.f58005b;
                Size size2 = this.f58006c;
                int i11 = this.d;
                boolean z10 = this.f58007e;
                RuntimeException[] runtimeExceptionArr2 = this.f58008f;
                countDownLatch = this.h;
                try {
                    try {
                        tVar2.f58027a = size2;
                        tVar2.f58029b = size2;
                        tVar2.f58031c = size2;
                        tVar2.f58043j = i11;
                        tVar2.f58045k = i11;
                        tVar2.f58047l = i11;
                        tVar2.f58049m = z10;
                        tVar2.f58050n = z10;
                        tVar2.f58052o = z10;
                        SurfaceTexture surfaceTexture2 = tVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = tVar2.f58069x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        tVar2.k(tVar2.D, tVar2.f58045k);
                        int i12 = tVar2.E;
                        if (i12 != 0) {
                            tVar2.k(i12, tVar2.f58047l);
                        }
                        d0 d0Var = tVar2.N;
                        if (d0Var != null) {
                            d0Var.f57819c = size2;
                            d0Var.d = i11;
                            d0Var.f57831q = d0.j(size2, i11, false);
                            d0Var.f57832r = d0.j(size2, i11, true);
                            d0Var.A = false;
                            d0Var.f57839z = 0L;
                        }
                        n nVar2 = tVar2.f58041i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        if (tVar2.f58043j == tVar2.f58038g) {
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
