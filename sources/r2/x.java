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
    public final MediaCodec f44987a;
    public final j f44988b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f44987a = mediaCodec;
        this.f44988b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(long j10, int i10, int i11, int i12) {
        this.f44987a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        this.f44987a.queueSecureInputBuffer(i10, 0, dVar.f11630i, j10, i11);
    }

    @Override
    public final void c(int i10) {
        this.f44987a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f44987a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void e(p2.b bVar) {
        bVar.run();
    }

    @Override
    public final void f() {
        this.f44987a.detachOutputSurface();
    }

    @Override
    public final void flush() {
        this.f44987a.flush();
    }

    @Override
    public final void g(int i10, long j10) {
        this.f44987a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f44987a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f44987a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f44987a.getOutputFormat();
    }

    @Override
    public final int h() {
        return this.f44987a.dequeueInputBuffer(0L);
    }

    @Override
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f44987a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void j(int i10) {
        this.f44987a.setVideoScalingMode(i10);
    }

    @Override
    public final void k(Surface surface) {
        this.f44987a.setOutputSurface(surface);
    }

    @Override
    public final void l(ArrayList arrayList) {
        this.f44987a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f44987a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final boolean n(l2.f fVar) {
        return false;
    }

    @Override
    public final void release() {
        j jVar = this.f44988b;
        MediaCodec mediaCodec = this.f44987a;
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
        this.f44987a.setParameters(bundle);
    }
}
