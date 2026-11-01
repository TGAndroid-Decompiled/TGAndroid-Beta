package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.web.v1;
public final class x implements l {
    public final MediaCodec f46298a;
    public final j f46299b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f46298a = mediaCodec;
        this.f46299b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(int i10, int i11, int i12, long j10) {
        this.f46298a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        this.f46298a.queueSecureInputBuffer(i10, 0, dVar.f7583i, j10, i11);
    }

    @Override
    public final void c(int i10) {
        this.f46298a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f46298a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void e() {
        this.f46298a.detachOutputSurface();
    }

    @Override
    public final void f(int i10, long j10) {
        this.f46298a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final void flush() {
        this.f46298a.flush();
    }

    @Override
    public final int g() {
        return this.f46298a.dequeueInputBuffer(0L);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f46298a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f46298a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f46298a.getOutputFormat();
    }

    @Override
    public final void h(v1 v1Var) {
        v1Var.run();
    }

    @Override
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f46298a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final boolean j(n2.u uVar) {
        return false;
    }

    @Override
    public final void k(int i10) {
        this.f46298a.setVideoScalingMode(i10);
    }

    @Override
    public final void l(Surface surface) {
        this.f46298a.setOutputSurface(surface);
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f46298a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f46298a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f46299b;
        MediaCodec mediaCodec = this.f46298a;
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
        this.f46298a.setParameters(bundle);
    }
}
