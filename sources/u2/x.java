package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.cf;
import org.telegram.ui.web.e1;
public final class x implements l {
    public final MediaCodec f57818a;
    public final j f57819b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f57818a = mediaCodec;
        this.f57819b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void d(int i7, int i10, int i11, long j3) {
        this.f57818a.queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override
    public final void e(int i7, k2.d dVar, long j3, int i10) {
        this.f57818a.queueSecureInputBuffer(i7, 0, dVar.f17728i, j3, i10);
    }

    @Override
    public final void f(int i7) {
        this.f57818a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void flush() {
        this.f57818a.flush();
    }

    @Override
    public final void g() {
        this.f57818a.detachOutputSurface();
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f57818a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f57818a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f57818a.getOutputFormat();
    }

    @Override
    public final void h(int i7, long j3) {
        this.f57818a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final int i() {
        return this.f57818a.dequeueInputBuffer(0L);
    }

    @Override
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f57818a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void k(d3.k kVar, Handler handler) {
        this.f57818a.setOnFrameRenderedListener(new a(this, kVar, 1), handler);
    }

    @Override
    public final void l(int i7) {
        this.f57818a.setVideoScalingMode(i7);
    }

    @Override
    public final boolean m(cf cfVar) {
        return false;
    }

    @Override
    public final void n(Surface surface) {
        this.f57818a.setOutputSurface(surface);
    }

    @Override
    public final void o(e1 e1Var) {
        e1Var.run();
    }

    @Override
    public final void p(ArrayList arrayList) {
        this.f57818a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void q(ArrayList arrayList) {
        this.f57818a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f57819b;
        MediaCodec mediaCodec = this.f57818a;
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
        this.f57818a.setParameters(bundle);
    }
}
