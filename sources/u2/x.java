package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.qt;
public final class x implements l {
    public final MediaCodec f56218a;
    public final j f56219b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f56218a = mediaCodec;
        this.f56219b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(int i7, int i10, int i11, long j3) {
        this.f56218a.queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override
    public final void b(int i7, k2.d dVar, long j3, int i10) {
        this.f56218a.queueSecureInputBuffer(i7, 0, dVar.f17168i, j3, i10);
    }

    @Override
    public final void c(int i7) {
        this.f56218a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void d() {
        this.f56218a.detachOutputSurface();
    }

    @Override
    public final void e(int i7, long j3) {
        this.f56218a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final int f() {
        return this.f56218a.dequeueInputBuffer(0L);
    }

    @Override
    public final void flush() {
        this.f56218a.flush();
    }

    @Override
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f56218a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f56218a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f56218a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f56218a.getOutputFormat();
    }

    @Override
    public final void h(d3.k kVar, Handler handler) {
        this.f56218a.setOnFrameRenderedListener(new a(this, kVar, 1), handler);
    }

    @Override
    public final void i(int i7) {
        this.f56218a.setVideoScalingMode(i7);
    }

    @Override
    public final void j(Surface surface) {
        this.f56218a.setOutputSurface(surface);
    }

    @Override
    public final boolean k(qt qtVar) {
        return false;
    }

    @Override
    public final void l(ti.p pVar) {
        pVar.run();
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f56218a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f56218a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f56219b;
        MediaCodec mediaCodec = this.f56218a;
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
        this.f56218a.setParameters(bundle);
    }
}
