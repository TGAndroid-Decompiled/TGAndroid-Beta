package si;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class r implements Runnable {
    public final int f46773a;
    public final u f46774b;
    public final Size f46775c;
    public final int d;
    public final boolean e;
    public final RuntimeException[] f46776f;
    public final CountDownLatch h;

    public r(u uVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.f46773a = i11;
        this.f46774b = uVar;
        this.f46775c = size;
        this.d = i10;
        this.e = z10;
        this.f46776f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f46773a) {
            case 0:
                Size size = this.f46775c;
                int i10 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f46776f;
                countDownLatch = this.h;
                u uVar = this.f46774b;
                uVar.getClass();
                try {
                    try {
                        uVar.f46812c = size;
                        uVar.f46827l = i10;
                        uVar.f46832o = z10;
                        SurfaceTexture surfaceTexture = uVar.f46849x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i11 = uVar.E;
                        if (i11 != 0) {
                            uVar.k(i11, i10);
                        }
                        o oVar = uVar.f46821i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        if (i10 == uVar.f46818g) {
                            str = "NEAREST";
                        } else {
                            str = "LINEAR";
                        }
                        sb2.append(str);
                        sb2.append(", timestampRealtime=");
                        sb2.append(z10);
                        oVar.b(sb2.toString());
                    } catch (RuntimeException e) {
                        runtimeExceptionArr[0] = e;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                u uVar2 = this.f46774b;
                Size size2 = this.f46775c;
                int i12 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f46776f;
                countDownLatch = this.h;
                try {
                    try {
                        uVar2.f46808a = size2;
                        uVar2.f46810b = size2;
                        uVar2.f46812c = size2;
                        uVar2.f46823j = i12;
                        uVar2.f46825k = i12;
                        uVar2.f46827l = i12;
                        uVar2.f46829m = z11;
                        uVar2.f46830n = z11;
                        uVar2.f46832o = z11;
                        SurfaceTexture surfaceTexture2 = uVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = uVar2.f46849x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        uVar2.k(uVar2.D, uVar2.f46825k);
                        int i13 = uVar2.E;
                        if (i13 != 0) {
                            uVar2.k(i13, uVar2.f46827l);
                        }
                        d0 d0Var = uVar2.N;
                        if (d0Var != null) {
                            d0Var.f46590c = size2;
                            d0Var.d = i12;
                            d0Var.f46601q = d0.j(size2, i12, false);
                            d0Var.f46602r = d0.j(size2, i12, true);
                            d0Var.A = false;
                            d0Var.f46609z = 0L;
                        }
                        o oVar2 = uVar2.f46821i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        if (uVar2.f46823j == uVar2.f46818g) {
                            str2 = "NEAREST";
                        } else {
                            str2 = "LINEAR";
                        }
                        sb3.append(str2);
                        oVar2.b(sb3.toString());
                    } catch (RuntimeException e7) {
                        runtimeExceptionArr2[0] = e7;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
        }
    }
}
