package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import org.telegram.ui.Cells.ia;
public final class x implements l {
    public final MediaCodec f42007a;
    public final j f42008b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f42007a = mediaCodec;
        this.f42008b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(long j3, int i10, int i11, int i12) {
        this.f42007a.queueInputBuffer(i10, 0, i11, j3, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.f42007a.queueSecureInputBuffer(i10, 0, dVar.f10088i, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f42007a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final boolean d(ia iaVar) {
        return false;
    }

    @Override
    public final void e(a3.m mVar, Handler handler) {
        this.f42007a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void f() {
        this.f42007a.detachOutputSurface();
    }

    @Override
    public final void flush() {
        this.f42007a.flush();
    }

    @Override
    public final void g(int i10, long j3) {
        this.f42007a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f42007a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f42007a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f42007a.getOutputFormat();
    }

    @Override
    public final int h() {
        return this.f42007a.dequeueInputBuffer(0L);
    }

    @Override
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f42007a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void j(int i10) {
        this.f42007a.setVideoScalingMode(i10);
    }

    @Override
    public final void k(Surface surface) {
        this.f42007a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        j jVar = this.f42008b;
        MediaCodec mediaCodec = this.f42007a;
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
        this.f42007a.setParameters(bundle);
    }
}
