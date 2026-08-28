package y3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import d5.f0;
import java.nio.ByteBuffer;
public final class x implements k {
    public final MediaCodec f49558a;
    public ByteBuffer[] f49559b;
    public ByteBuffer[] f49560c;

    public x(MediaCodec mediaCodec) {
        this.f49558a = mediaCodec;
        if (f0.f4349a < 21) {
            this.f49559b = mediaCodec.getInputBuffers();
            this.f49560c = mediaCodec.getOutputBuffers();
        }
    }

    @Override
    public final void a(long j10, int i9, int i10, int i11) {
        this.f49558a.queueInputBuffer(i9, 0, i10, j10, i11);
    }

    @Override
    public final void b(int i9, long j10) {
        this.f49558a.releaseOutputBuffer(i9, j10);
    }

    @Override
    public final int c() {
        return this.f49558a.dequeueInputBuffer(0L);
    }

    @Override
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f49558a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && f0.f4349a < 21) {
                this.f49560c = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void e(int i9, k3.d dVar, long j10) {
        this.f49558a.queueSecureInputBuffer(i9, 0, dVar.f14595i, j10, 0);
    }

    @Override
    public final void f(int i9) {
        this.f49558a.setVideoScalingMode(i9);
    }

    @Override
    public final void flush() {
        this.f49558a.flush();
    }

    @Override
    public final void g(Surface surface) {
        this.f49558a.setOutputSurface(surface);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i9) {
        if (f0.f4349a >= 21) {
            return this.f49558a.getInputBuffer(i9);
        }
        return this.f49559b[i9];
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i9) {
        if (f0.f4349a >= 21) {
            return this.f49558a.getOutputBuffer(i9);
        }
        return this.f49560c[i9];
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f49558a.getOutputFormat();
    }

    @Override
    public final void h(e5.i iVar, Handler handler) {
        this.f49558a.setOnFrameRenderedListener(new a(this, iVar, 1), handler);
    }

    @Override
    public final void release() {
        this.f49559b = null;
        this.f49560c = null;
        this.f49558a.release();
    }

    @Override
    public final void releaseOutputBuffer(int i9, boolean z10) {
        this.f49558a.releaseOutputBuffer(i9, z10);
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f49558a.setParameters(bundle);
    }
}
