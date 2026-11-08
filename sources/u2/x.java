package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.rt;
public final class x implements l {
    public final MediaCodec f56308a;
    public final j f56309b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f56308a = mediaCodec;
        this.f56309b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(int i7, int i10, int i11, long j3) {
        this.f56308a.queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override
    public final void b(int i7, k2.d dVar, long j3, int i10) {
        this.f56308a.queueSecureInputBuffer(i7, 0, dVar.f17171i, j3, i10);
    }

    @Override
    public final void c(int i7) {
        this.f56308a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void d(org.telegram.ui.web.w wVar) {
        wVar.run();
    }

    @Override
    public final void e() {
        this.f56308a.detachOutputSurface();
    }

    @Override
    public final void f(int i7, long j3) {
        this.f56308a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final void flush() {
        this.f56308a.flush();
    }

    @Override
    public final int g() {
        return this.f56308a.dequeueInputBuffer(0L);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f56308a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f56308a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f56308a.getOutputFormat();
    }

    @Override
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f56308a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void i(d3.k kVar, Handler handler) {
        this.f56308a.setOnFrameRenderedListener(new a(this, kVar, 1), handler);
    }

    @Override
    public final void j(int i7) {
        this.f56308a.setVideoScalingMode(i7);
    }

    @Override
    public final void k(Surface surface) {
        this.f56308a.setOutputSurface(surface);
    }

    @Override
    public final boolean l(rt rtVar) {
        return false;
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f56308a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f56308a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f56309b;
        MediaCodec mediaCodec = this.f56308a;
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
        this.f56308a.setParameters(bundle);
    }
}
