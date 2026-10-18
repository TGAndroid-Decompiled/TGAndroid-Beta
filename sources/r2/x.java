package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import ki.t1;
import org.telegram.ui.web.g2;
public final class x implements l {
    public final MediaCodec f44979a;
    public final j f44980b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f44979a = mediaCodec;
        this.f44980b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(long j10, int i10, int i11, int i12) {
        this.f44979a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        this.f44979a.queueSecureInputBuffer(i10, 0, dVar.f11631i, j10, i11);
    }

    @Override
    public final boolean c(t1 t1Var) {
        return false;
    }

    @Override
    public final void d(int i10) {
        this.f44979a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void e(a3.m mVar, Handler handler) {
        this.f44979a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void f() {
        this.f44979a.detachOutputSurface();
    }

    @Override
    public final void flush() {
        this.f44979a.flush();
    }

    @Override
    public final void g(g2 g2Var) {
        g2Var.run();
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f44979a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f44979a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f44979a.getOutputFormat();
    }

    @Override
    public final void h(int i10, long j10) {
        this.f44979a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int i() {
        return this.f44979a.dequeueInputBuffer(0L);
    }

    @Override
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f44979a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void k(int i10) {
        this.f44979a.setVideoScalingMode(i10);
    }

    @Override
    public final void l(Surface surface) {
        this.f44979a.setOutputSurface(surface);
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f44979a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f44979a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f44980b;
        MediaCodec mediaCodec = this.f44979a;
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
        this.f44979a.setParameters(bundle);
    }
}
