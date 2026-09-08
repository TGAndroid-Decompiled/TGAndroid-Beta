package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import k2.g0;
public final class x implements l {
    public final MediaCodec f44905a;
    public final j f44906b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f44905a = mediaCodec;
        this.f44906b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(long j3, int i10, int i11, int i12) {
        this.f44905a.queueInputBuffer(i10, 0, i11, j3, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.f44905a.queueSecureInputBuffer(i10, 0, dVar.f10872i, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f44905a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f44905a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void e() {
        this.f44905a.detachOutputSurface();
    }

    @Override
    public final void f(int i10, long j3) {
        this.f44905a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final void flush() {
        this.f44905a.flush();
    }

    @Override
    public final int g() {
        return this.f44905a.dequeueInputBuffer(0L);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f44905a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f44905a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f44905a.getOutputFormat();
    }

    @Override
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f44905a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void i(int i10) {
        this.f44905a.setVideoScalingMode(i10);
    }

    @Override
    public final boolean j(g0 g0Var) {
        return false;
    }

    @Override
    public final void k(Surface surface) {
        this.f44905a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        j jVar = this.f44906b;
        MediaCodec mediaCodec = this.f44905a;
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
        this.f44905a.setParameters(bundle);
    }
}
