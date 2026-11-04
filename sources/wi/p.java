package wi;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class p implements Runnable {
    public final int f57987a;
    public final s f57988b;
    public final Size f57989c;
    public final int d;
    public final boolean f57990e;
    public final RuntimeException[] f57991f;
    public final CountDownLatch h;

    public p(s sVar, Size size, int i3, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i10) {
        this.f57987a = i10;
        this.f57988b = sVar;
        this.f57989c = size;
        this.d = i3;
        this.f57990e = z10;
        this.f57991f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f57987a) {
            case 0:
                Size size = this.f57989c;
                int i3 = this.d;
                boolean z10 = this.f57990e;
                RuntimeException[] runtimeExceptionArr = this.f57991f;
                countDownLatch = this.h;
                s sVar = this.f57988b;
                sVar.getClass();
                try {
                    try {
                        sVar.f58005c = size;
                        sVar.f58021l = i3;
                        sVar.f58026o = z10;
                        SurfaceTexture surfaceTexture = sVar.f58043x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i10 = sVar.E;
                        if (i10 != 0) {
                            sVar.k(i10, i3);
                        }
                        n nVar = sVar.f58015i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i3);
                        sb2.append(", filter=");
                        if (i3 == sVar.f58012g) {
                            str = "NEAREST";
                        } else {
                            str = "LINEAR";
                        }
                        sb2.append(str);
                        sb2.append(", timestampRealtime=");
                        sb2.append(z10);
                        nVar.b(sb2.toString());
                    } catch (RuntimeException e10) {
                        runtimeExceptionArr[0] = e10;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                s sVar2 = this.f57988b;
                Size size2 = this.f57989c;
                int i11 = this.d;
                boolean z11 = this.f57990e;
                RuntimeException[] runtimeExceptionArr2 = this.f57991f;
                countDownLatch = this.h;
                try {
                    try {
                        sVar2.f58001a = size2;
                        sVar2.f58003b = size2;
                        sVar2.f58005c = size2;
                        sVar2.f58017j = i11;
                        sVar2.f58019k = i11;
                        sVar2.f58021l = i11;
                        sVar2.f58023m = z11;
                        sVar2.f58024n = z11;
                        sVar2.f58026o = z11;
                        SurfaceTexture surfaceTexture2 = sVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = sVar2.f58043x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        sVar2.k(sVar2.D, sVar2.f58019k);
                        int i12 = sVar2.E;
                        if (i12 != 0) {
                            sVar2.k(i12, sVar2.f58021l);
                        }
                        c0 c0Var = sVar2.N;
                        if (c0Var != null) {
                            c0Var.f57797c = size2;
                            c0Var.d = i11;
                            c0Var.f57809q = c0.j(size2, i11, false);
                            c0Var.f57810r = c0.j(size2, i11, true);
                            c0Var.A = false;
                            c0Var.f57817z = 0L;
                        }
                        n nVar2 = sVar2.f58015i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i11);
                        sb3.append(", filter=");
                        if (sVar2.f58017j == sVar2.f58012g) {
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
