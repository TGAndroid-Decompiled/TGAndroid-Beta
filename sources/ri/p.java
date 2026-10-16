package ri;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class p implements Runnable {
    public final int f44662a;
    public final s f44663b;
    public final Size f44664c;
    public final int d;
    public final boolean e;
    public final RuntimeException[] f44665f;
    public final CountDownLatch h;

    public p(s sVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.f44662a = i11;
        this.f44663b = sVar;
        this.f44664c = size;
        this.d = i10;
        this.e = z10;
        this.f44665f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f44662a) {
            case 0:
                Size size = this.f44664c;
                int i10 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f44665f;
                countDownLatch = this.h;
                s sVar = this.f44663b;
                sVar.getClass();
                try {
                    try {
                        sVar.f44701c = size;
                        sVar.f44716l = i10;
                        sVar.f44721o = z10;
                        SurfaceTexture surfaceTexture = sVar.f44738x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i11 = sVar.E;
                        if (i11 != 0) {
                            sVar.k(i11, i10);
                        }
                        n nVar = sVar.f44710i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        if (i10 == sVar.f44707g) {
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
                s sVar2 = this.f44663b;
                Size size2 = this.f44664c;
                int i12 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f44665f;
                countDownLatch = this.h;
                try {
                    try {
                        sVar2.f44697a = size2;
                        sVar2.f44699b = size2;
                        sVar2.f44701c = size2;
                        sVar2.f44712j = i12;
                        sVar2.f44714k = i12;
                        sVar2.f44716l = i12;
                        sVar2.f44718m = z11;
                        sVar2.f44719n = z11;
                        sVar2.f44721o = z11;
                        SurfaceTexture surfaceTexture2 = sVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = sVar2.f44738x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        sVar2.k(sVar2.D, sVar2.f44714k);
                        int i13 = sVar2.E;
                        if (i13 != 0) {
                            sVar2.k(i13, sVar2.f44716l);
                        }
                        b0 b0Var = sVar2.N;
                        if (b0Var != null) {
                            b0Var.f44482c = size2;
                            b0Var.d = i12;
                            b0Var.f44493q = b0.j(size2, i12, false);
                            b0Var.f44494r = b0.j(size2, i12, true);
                            b0Var.A = false;
                            b0Var.f44501z = 0L;
                        }
                        n nVar2 = sVar2.f44710i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        if (sVar2.f44712j == sVar2.f44707g) {
                            str2 = "NEAREST";
                        } else {
                            str2 = "LINEAR";
                        }
                        sb3.append(str2);
                        nVar2.b(sb3.toString());
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
