package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Cells.c5;
import p4.z;
public final class x implements l {
    public final MediaCodec f58427a;
    public final j f58428b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f58427a = mediaCodec;
        this.f58428b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void b(int i7, int i10, int i11, long j3) {
        this.f58427a.queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override
    public final void c(int i7, k2.d dVar, long j3, int i10) {
        this.f58427a.queueSecureInputBuffer(i7, 0, dVar.f18151i, j3, i10);
    }

    @Override
    public final void d(z zVar) {
        zVar.run();
    }

    @Override
    public final void e(int i7) {
        this.f58427a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void f() {
        this.f58427a.detachOutputSurface();
    }

    @Override
    public final void flush() {
        this.f58427a.flush();
    }

    @Override
    public final void g(int i7, long j3) {
        this.f58427a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f58427a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f58427a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f58427a.getOutputFormat();
    }

    @Override
    public final int h() {
        return this.f58427a.dequeueInputBuffer(0L);
    }

    @Override
    public final boolean i(c5 c5Var) {
        return false;
    }

    @Override
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f58427a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void k(d3.k kVar, Handler handler) {
        this.f58427a.setOnFrameRenderedListener(new a(this, kVar, 1), handler);
    }

    @Override
    public final void l(int i7) {
        this.f58427a.setVideoScalingMode(i7);
    }

    @Override
    public final void m(Surface surface) {
        this.f58427a.setOutputSurface(surface);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f58427a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void o(ArrayList arrayList) {
        this.f58427a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f58428b;
        MediaCodec mediaCodec = this.f58427a;
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && i7 < 33) {
                mediaCodec.stop();
            }
            if (i7 >= 35 && jVar != null) {
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
        this.f58427a.setParameters(bundle);
    }
}
