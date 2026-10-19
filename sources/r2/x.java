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
    public final MediaCodec f44977a;
    public final j f44978b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f44977a = mediaCodec;
        this.f44978b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(long j10, int i10, int i11, int i12) {
        this.f44977a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        this.f44977a.queueSecureInputBuffer(i10, 0, dVar.f11632i, j10, i11);
    }

    @Override
    public final void c(int i10) {
        this.f44977a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f44977a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void e(p2.b bVar) {
        bVar.run();
    }

    @Override
    public final void f() {
        this.f44977a.detachOutputSurface();
    }

    @Override
    public final void flush() {
        this.f44977a.flush();
    }

    @Override
    public final void g(int i10, long j10) {
        this.f44977a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f44977a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f44977a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f44977a.getOutputFormat();
    }

    @Override
    public final int h() {
        return this.f44977a.dequeueInputBuffer(0L);
    }

    @Override
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f44977a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void j(int i10) {
        this.f44977a.setVideoScalingMode(i10);
    }

    @Override
    public final void k(Surface surface) {
        this.f44977a.setOutputSurface(surface);
    }

    @Override
    public final void l(ArrayList arrayList) {
        this.f44977a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f44977a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final boolean n(l2.f fVar) {
        return false;
    }

    @Override
    public final void release() {
        j jVar = this.f44978b;
        MediaCodec mediaCodec = this.f44977a;
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
        this.f44977a.setParameters(bundle);
    }
}
