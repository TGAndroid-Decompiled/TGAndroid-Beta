package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
public final class y implements m {
    public final MediaCodec f47066a;
    public final k f47067b;

    public y(MediaCodec mediaCodec, k kVar) {
        this.f47066a = mediaCodec;
        this.f47067b = kVar;
        if (Build.VERSION.SDK_INT >= 35 && kVar != null) {
            kVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(long j3, int i10, int i11, int i12) {
        this.f47066a.queueInputBuffer(i10, 0, i11, j3, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.f47066a.queueSecureInputBuffer(i10, 0, dVar.f10980i, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f47066a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f47066a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void e() {
        this.f47066a.detachOutputSurface();
    }

    @Override
    public final void f(int i10, long j3) {
        this.f47066a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final void flush() {
        this.f47066a.flush();
    }

    @Override
    public final int g() {
        return this.f47066a.dequeueInputBuffer(0L);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f47066a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f47066a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f47066a.getOutputFormat();
    }

    @Override
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f47066a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void i(int i10) {
        this.f47066a.setVideoScalingMode(i10);
    }

    @Override
    public final void j(Surface surface) {
        this.f47066a.setOutputSurface(surface);
    }

    @Override
    public final boolean k(l2.f fVar) {
        return false;
    }

    @Override
    public final void release() {
        k kVar = this.f47067b;
        MediaCodec mediaCodec = this.f47066a;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                mediaCodec.stop();
            }
            if (i10 >= 35 && kVar != null) {
                kVar.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && kVar != null) {
                kVar.c(mediaCodec);
            }
            mediaCodec.release();
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f47066a.setParameters(bundle);
    }
}
