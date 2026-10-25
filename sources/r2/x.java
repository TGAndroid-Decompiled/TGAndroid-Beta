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
import org.telegram.ui.Wallet.q6;
public final class x implements l {
    public final MediaCodec f47267a;
    public final j f47268b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f47267a = mediaCodec;
        this.f47268b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void d(long j10, int i10, int i11, int i12) {
        this.f47267a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void e(int i10, h2.d dVar, long j10, int i11) {
        this.f47267a.queueSecureInputBuffer(i10, 0, dVar.f12566i, j10, i11);
    }

    @Override
    public final void f(int i10) {
        this.f47267a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void flush() {
        this.f47267a.flush();
    }

    @Override
    public final void g(a3.m mVar, Handler handler) {
        this.f47267a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f47267a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f47267a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f47267a.getOutputFormat();
    }

    @Override
    public final void h() {
        this.f47267a.detachOutputSurface();
    }

    @Override
    public final void i(int i10, long j10) {
        this.f47267a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int j() {
        return this.f47267a.dequeueInputBuffer(0L);
    }

    @Override
    public final int k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f47267a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final boolean l(h5 h5Var) {
        return false;
    }

    @Override
    public final void m(int i10) {
        this.f47267a.setVideoScalingMode(i10);
    }

    @Override
    public final void n(Surface surface) {
        this.f47267a.setOutputSurface(surface);
    }

    @Override
    public final void o(ArrayList arrayList) {
        this.f47267a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void p(q6 q6Var) {
        q6Var.run();
    }

    @Override
    public final void q(ArrayList arrayList) {
        this.f47267a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f47268b;
        MediaCodec mediaCodec = this.f47267a;
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
        this.f47267a.setParameters(bundle);
    }
}
