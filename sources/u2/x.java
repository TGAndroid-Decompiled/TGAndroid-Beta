package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.web.t1;
public final class x implements l {
    public final MediaCodec f58511a;
    public final j f58512b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f58511a = mediaCodec;
        this.f58512b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void flush() {
        this.f58511a.flush();
    }

    @Override
    public final void g(int i7, int i10, int i11, long j3) {
        this.f58511a.queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f58511a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f58511a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f58511a.getOutputFormat();
    }

    @Override
    public final void h(int i7, k2.d dVar, long j3, int i10) {
        this.f58511a.queueSecureInputBuffer(i7, 0, dVar.f18219i, j3, i10);
    }

    @Override
    public final void i(int i7) {
        this.f58511a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void j() {
        this.f58511a.detachOutputSurface();
    }

    @Override
    public final void k(int i7, long j3) {
        this.f58511a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final int l() {
        return this.f58511a.dequeueInputBuffer(0L);
    }

    @Override
    public final void m(t1 t1Var) {
        t1Var.run();
    }

    @Override
    public final int n(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f58511a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void o(d3.k kVar, Handler handler) {
        this.f58511a.setOnFrameRenderedListener(new a(this, kVar, 1), handler);
    }

    @Override
    public final boolean p(nd0 nd0Var) {
        return false;
    }

    @Override
    public final void q(int i7) {
        this.f58511a.setVideoScalingMode(i7);
    }

    @Override
    public final void r(Surface surface) {
        this.f58511a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        j jVar = this.f58512b;
        MediaCodec mediaCodec = this.f58511a;
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
    public final void s(ArrayList arrayList) {
        this.f58511a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f58511a.setParameters(bundle);
    }

    @Override
    public final void t(ArrayList arrayList) {
        this.f58511a.unsubscribeFromVendorParameters(arrayList);
    }
}
