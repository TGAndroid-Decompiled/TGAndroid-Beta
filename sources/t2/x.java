package t2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.i9;
import org.telegram.ui.hc1;
public final class x implements l {
    public final MediaCodec f54900a;
    public final j f54901b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f54900a = mediaCodec;
        this.f54901b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(int i3, j2.d dVar, long j10, int i10) {
        this.f54900a.queueSecureInputBuffer(i3, 0, dVar.f16153i, j10, i10);
    }

    @Override
    public final void b(int i3, int i10, int i11, long j10) {
        this.f54900a.queueInputBuffer(i3, 0, i10, j10, i11);
    }

    @Override
    public final void c(int i3) {
        this.f54900a.releaseOutputBuffer(i3, false);
    }

    @Override
    public final void d() {
        this.f54900a.detachOutputSurface();
    }

    @Override
    public final void e(int i3, long j10) {
        this.f54900a.releaseOutputBuffer(i3, j10);
    }

    @Override
    public final int f() {
        return this.f54900a.dequeueInputBuffer(0L);
    }

    @Override
    public final void flush() {
        this.f54900a.flush();
    }

    @Override
    public final void g(hc1 hc1Var) {
        hc1Var.run();
    }

    @Override
    public final ByteBuffer getInputBuffer(int i3) {
        return this.f54900a.getInputBuffer(i3);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i3) {
        return this.f54900a.getOutputBuffer(i3);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f54900a.getOutputFormat();
    }

    @Override
    public final void h(c3.k kVar, Handler handler) {
        this.f54900a.setOnFrameRenderedListener(new a(this, kVar, 1), handler);
    }

    @Override
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f54900a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void j(int i3) {
        this.f54900a.setVideoScalingMode(i3);
    }

    @Override
    public final boolean k(i9 i9Var) {
        return false;
    }

    @Override
    public final void l(Surface surface) {
        this.f54900a.setOutputSurface(surface);
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f54900a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f54900a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f54901b;
        MediaCodec mediaCodec = this.f54900a;
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30 && i3 < 33) {
                mediaCodec.stop();
            }
            if (i3 >= 35 && jVar != null) {
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
        this.f54900a.setParameters(bundle);
    }
}
