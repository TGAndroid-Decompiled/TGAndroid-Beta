package y3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import d5.g0;
import java.nio.ByteBuffer;

public final class x implements k {

    public final MediaCodec f49548a;

    public ByteBuffer[] f49549b;

    public ByteBuffer[] f49550c;

    public x(MediaCodec mediaCodec) {
        this.f49548a = mediaCodec;
        if (g0.f4795a < 21) {
            this.f49549b = mediaCodec.getInputBuffers();
            this.f49550c = mediaCodec.getOutputBuffers();
        }
    }

    @Override
    public final void a(long j10, int i10, int i11, int i12) {
        this.f49548a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void b(int i10, long j10) {
        this.f49548a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int c() {
        return this.f49548a.dequeueInputBuffer(0L);
    }

    @Override
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f49548a;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && g0.f4795a < 21) {
                this.f49550c = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override
    public final void e(int i10, k3.d dVar, long j10) {
        this.f49548a.queueSecureInputBuffer(i10, 0, dVar.f14416i, j10, 0);
    }

    @Override
    public final void f(int i10) {
        this.f49548a.setVideoScalingMode(i10);
    }

    @Override
    public final void flush() {
        this.f49548a.flush();
    }

    @Override
    public final void g(Surface surface) {
        this.f49548a.setOutputSurface(surface);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return g0.f4795a >= 21 ? this.f49548a.getInputBuffer(i10) : this.f49549b[i10];
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return g0.f4795a >= 21 ? this.f49548a.getOutputBuffer(i10) : this.f49550c[i10];
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f49548a.getOutputFormat();
    }

    @Override
    public final void h(e5.h hVar, Handler handler) {
        this.f49548a.setOnFrameRenderedListener(new a(this, hVar, 1), handler);
    }

    @Override
    public final void release() {
        this.f49549b = null;
        this.f49550c = null;
        this.f49548a.release();
    }

    @Override
    public final void releaseOutputBuffer(int i10, boolean z10) {
        this.f49548a.releaseOutputBuffer(i10, z10);
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f49548a.setParameters(bundle);
    }
}
