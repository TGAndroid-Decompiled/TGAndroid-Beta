package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
public final class x implements l {
    public final MediaCodec f42292a;
    public final j f42293b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f42292a = mediaCodec;
        this.f42293b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(long j3, int i10, int i11, int i12) {
        this.f42292a.queueInputBuffer(i10, 0, i11, j3, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.f42292a.queueSecureInputBuffer(i10, 0, dVar.f10074i, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f42292a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f42292a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void e() {
        this.f42292a.detachOutputSurface();
    }

    @Override
    public final void f(int i10, long j3) {
        this.f42292a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final void flush() {
        this.f42292a.flush();
    }

    @Override
    public final int g() {
        return this.f42292a.dequeueInputBuffer(0L);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f42292a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f42292a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f42292a.getOutputFormat();
    }

    @Override
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f42292a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void i(int i10) {
        this.f42292a.setVideoScalingMode(i10);
    }

    @Override
    public final void j(Surface surface) {
        this.f42292a.setOutputSurface(surface);
    }

    @Override
    public final boolean k(k2.u uVar) {
        return false;
    }

    @Override
    public final void release() {
        j jVar = this.f42293b;
        MediaCodec mediaCodec = this.f42292a;
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
        this.f42292a.setParameters(bundle);
    }
}
