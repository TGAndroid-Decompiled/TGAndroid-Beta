package wi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class r implements Runnable {
    public final int f58038a;
    public final u f58039b;
    public final Size f58040c;
    public final int d;
    public final boolean f58041e;
    public final RuntimeException[] f58042f;
    public final CountDownLatch h;

    public r(u uVar, Size size, int i7, boolean z9, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.f58038a = i10;
        this.f58039b = uVar;
        this.f58040c = size;
        this.d = i7;
        this.f58041e = z9;
        this.f58042f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f58038a) {
            case 0:
                Size size = this.f58040c;
                int i7 = this.d;
                boolean z9 = this.f58041e;
                RuntimeException[] runtimeExceptionArr = this.f58042f;
                countDownLatch = this.h;
                u uVar = this.f58039b;
                uVar.getClass();
                try {
                    try {
                        uVar.f58059c = size;
                        uVar.f58075l = i7;
                        uVar.f58080o = z9;
                        SurfaceTexture surfaceTexture = uVar.f58097x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = uVar.E;
                        if (i10 != 0) {
                            uVar.k(i10, i7);
                        }
                        o oVar = uVar.f58069i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i7);
                        sb2.append(", filter=");
                        if (i7 == uVar.f58066g) {
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
                u uVar2 = this.f58039b;
                Size size2 = this.f58040c;
                int i11 = this.d;
                boolean z10 = this.f58041e;
                RuntimeException[] runtimeExceptionArr2 = this.f58042f;
                countDownLatch = this.h;
                try {
                    try {
                        uVar2.f58055a = size2;
                        uVar2.f58057b = size2;
                        uVar2.f58059c = size2;
                        uVar2.f58071j = i11;
                        uVar2.f58073k = i11;
                        uVar2.f58075l = i11;
                        uVar2.f58077m = z10;
                        uVar2.f58078n = z10;
                        uVar2.f58080o = z10;
                        SurfaceTexture surfaceTexture2 = uVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = uVar2.f58097x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        uVar2.k(uVar2.D, uVar2.f58073k);
                        int i12 = uVar2.E;
                        if (i12 != 0) {
                            uVar2.k(i12, uVar2.f58075l);
                        }
                        e0 e0Var = uVar2.N;
                        if (e0Var != null) {
                            e0Var.f57845c = size2;
                            e0Var.d = i11;
                            e0Var.v();
                            e0Var.B = false;
                            e0Var.A = 0L;
                        }
                        o oVar2 = uVar2.f58069i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        if (uVar2.f58071j == uVar2.f58066g) {
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
