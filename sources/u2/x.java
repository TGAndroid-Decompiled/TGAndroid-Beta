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
import p4.o0;
public final class x implements l {
    public final MediaCodec f58396a;
    public final j f58397b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f58396a = mediaCodec;
        this.f58397b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void b(int i7, int i10, int i11, long j3) {
        this.f58396a.queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override
    public final void c(int i7, k2.d dVar, long j3, int i10) {
        this.f58396a.queueSecureInputBuffer(i7, 0, dVar.f18117i, j3, i10);
    }

    @Override
    public final void d(int i7) {
        this.f58396a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void e() {
        this.f58396a.detachOutputSurface();
    }

    @Override
    public final void f(int i7, long j3) {
        this.f58396a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final void flush() {
        this.f58396a.flush();
    }

    @Override
    public final int g() {
        return this.f58396a.dequeueInputBuffer(0L);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f58396a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f58396a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f58396a.getOutputFormat();
    }

    @Override
    public final void h(o0 o0Var) {
        o0Var.run();
    }

    @Override
    public final boolean i(c5 c5Var) {
        return false;
    }

    @Override
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f58396a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void k(d3.k kVar, Handler handler) {
        this.f58396a.setOnFrameRenderedListener(new a(this, kVar, 1), handler);
    }

    @Override
    public final void l(int i7) {
        this.f58396a.setVideoScalingMode(i7);
    }

    @Override
    public final void m(Surface surface) {
        this.f58396a.setOutputSurface(surface);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f58396a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void o(ArrayList arrayList) {
        this.f58396a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f58397b;
        MediaCodec mediaCodec = this.f58396a;
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
        this.f58396a.setParameters(bundle);
    }
}
