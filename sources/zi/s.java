package zi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class s implements Runnable {
    public final int f61683a;
    public final u f61684b;
    public final Size f61685c;
    public final int d;
    public final boolean f61686e;
    public final RuntimeException[] f61687f;
    public final CountDownLatch h;

    public s(u uVar, Size size, int i7, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.f61683a = i10;
        this.f61684b = uVar;
        this.f61685c = size;
        this.d = i7;
        this.f61686e = z10;
        this.f61687f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f61683a) {
            case 0:
                Size size = this.f61685c;
                int i7 = this.d;
                boolean z10 = this.f61686e;
                RuntimeException[] runtimeExceptionArr = this.f61687f;
                countDownLatch = this.h;
                u uVar = this.f61684b;
                uVar.getClass();
                try {
                    try {
                        uVar.f61695c = size;
                        uVar.f61711l = i7;
                        uVar.f61716o = z10;
                        SurfaceTexture surfaceTexture = uVar.f61733x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = uVar.E;
                        if (i10 != 0) {
                            uVar.k(i10, i7);
                        }
                        p pVar = uVar.f61705i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i7);
                        sb2.append(", filter=");
                        if (i7 == uVar.f61702g) {
                            str = "NEAREST";
                        } else {
                            str = "LINEAR";
                        }
                        sb2.append(str);
                        sb2.append(", timestampRealtime=");
                        sb2.append(z10);
                        pVar.b(sb2.toString());
                    } catch (RuntimeException e10) {
                        runtimeExceptionArr[0] = e10;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                u uVar2 = this.f61684b;
                Size size2 = this.f61685c;
                int i11 = this.d;
                boolean z11 = this.f61686e;
                RuntimeException[] runtimeExceptionArr2 = this.f61687f;
                countDownLatch = this.h;
                try {
                    try {
                        uVar2.f61691a = size2;
                        uVar2.f61693b = size2;
                        uVar2.f61695c = size2;
                        uVar2.f61707j = i11;
                        uVar2.f61709k = i11;
                        uVar2.f61711l = i11;
                        uVar2.f61713m = z11;
                        uVar2.f61714n = z11;
                        uVar2.f61716o = z11;
                        SurfaceTexture surfaceTexture2 = uVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = uVar2.f61733x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        uVar2.k(uVar2.D, uVar2.f61709k);
                        int i12 = uVar2.E;
                        if (i12 != 0) {
                            uVar2.k(i12, uVar2.f61711l);
                        }
                        e0 e0Var = uVar2.N;
                        if (e0Var != null) {
                            e0Var.f61491c = size2;
                            e0Var.d = i11;
                            e0Var.v();
                            e0Var.B = false;
                            e0Var.A = 0L;
                        }
                        p pVar2 = uVar2.f61705i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        if (uVar2.f61707j == uVar2.f61702g) {
                            str2 = "NEAREST";
                        } else {
                            str2 = "LINEAR";
                        }
                        sb3.append(str2);
                        pVar2.b(sb3.toString());
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
