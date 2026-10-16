package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class x implements l {
    public final MediaCodec f43649a;
    public final j f43650b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f43649a = mediaCodec;
        this.f43650b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void b(long j10, int i10, int i11, int i12) {
        this.f43649a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void d(int i10, h2.d dVar, long j10, int i11) {
        this.f43649a.queueSecureInputBuffer(i10, 0, dVar.f10326i, j10, i11);
    }

    @Override
    public final void e(int i10) {
        this.f43649a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void f(a3.m mVar, Handler handler) {
        this.f43649a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void flush() {
        this.f43649a.flush();
    }

    @Override
    public final void g() {
        this.f43649a.detachOutputSurface();
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f43649a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f43649a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f43649a.getOutputFormat();
    }

    @Override
    public final void h(int i10, long j10) {
        this.f43649a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int i() {
        return this.f43649a.dequeueInputBuffer(0L);
    }

    @Override
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f43649a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void k(int i10) {
        this.f43649a.setVideoScalingMode(i10);
    }

    @Override
    public final void l(org.telegram.ui.web.v vVar) {
        vVar.run();
    }

    @Override
    public final void m(Surface surface) {
        this.f43649a.setOutputSurface(surface);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f43649a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final boolean o(m.l lVar) {
        return false;
    }

    @Override
    public final void p(ArrayList arrayList) {
        this.f43649a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f43650b;
        MediaCodec mediaCodec = this.f43649a;
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
        this.f43649a.setParameters(bundle);
    }
}
