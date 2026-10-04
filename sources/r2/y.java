package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
public final class y implements l {
    public final MediaCodec f45778a;
    public final j f45779b;

    public y(MediaCodec mediaCodec, j jVar) {
        this.f45778a = mediaCodec;
        this.f45779b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(long j3, int i10, int i11, int i12) {
        this.f45778a.queueInputBuffer(i10, 0, i11, j3, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.f45778a.queueSecureInputBuffer(i10, 0, dVar.f10975i, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f45778a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f45778a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void e() {
        this.f45778a.detachOutputSurface();
    }

    @Override
    public final boolean f(n2.c cVar) {
        return false;
    }

    @Override
    public final void flush() {
        this.f45778a.flush();
    }

    @Override
    public final void g(int i10, long j3) {
        this.f45778a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f45778a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f45778a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f45778a.getOutputFormat();
    }

    @Override
    public final int h() {
        return this.f45778a.dequeueInputBuffer(0L);
    }

    @Override
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f45778a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void j(int i10) {
        this.f45778a.setVideoScalingMode(i10);
    }

    @Override
    public final void k(Surface surface) {
        this.f45778a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        j jVar = this.f45779b;
        MediaCodec mediaCodec = this.f45778a;
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
        this.f45778a.setParameters(bundle);
    }
}
