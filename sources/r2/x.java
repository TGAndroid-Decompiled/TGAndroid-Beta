package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import li.h5;
import org.telegram.ui.Wallet.a6;
public final class x implements l {
    public final MediaCodec f47305a;
    public final j f47306b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f47305a = mediaCodec;
        this.f47306b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void d(long j10, int i10, int i11, int i12) {
        this.f47305a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void e(int i10, h2.d dVar, long j10, int i11) {
        this.f47305a.queueSecureInputBuffer(i10, 0, dVar.f12565i, j10, i11);
    }

    @Override
    public final void f(int i10) {
        this.f47305a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void flush() {
        this.f47305a.flush();
    }

    @Override
    public final void g(a3.m mVar, Handler handler) {
        this.f47305a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f47305a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f47305a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f47305a.getOutputFormat();
    }

    @Override
    public final void h() {
        this.f47305a.detachOutputSurface();
    }

    @Override
    public final void i(int i10, long j10) {
        this.f47305a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int j() {
        return this.f47305a.dequeueInputBuffer(0L);
    }

    @Override
    public final int k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f47305a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final boolean l(h5 h5Var) {
        return false;
    }

    @Override
    public final void m(int i10) {
        this.f47305a.setVideoScalingMode(i10);
    }

    @Override
    public final void n(Surface surface) {
        this.f47305a.setOutputSurface(surface);
    }

    @Override
    public final void o(a6 a6Var) {
        a6Var.run();
    }

    @Override
    public final void p(ArrayList arrayList) {
        this.f47305a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void q(ArrayList arrayList) {
        this.f47305a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f47306b;
        MediaCodec mediaCodec = this.f47305a;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                mediaCodec.stop();
            }
            if (i10 >= 35 && jVar != null) {
                jVar.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
                jVar.c(mediaCodec);
            }
            mediaCodec.release();
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f47305a.setParameters(bundle);
    }
}
