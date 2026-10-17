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
public final class x implements l {
    public final MediaCodec f45005a;
    public final j f45006b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f45005a = mediaCodec;
        this.f45006b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void a(long j10, int i10, int i11, int i12) {
        this.f45005a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        this.f45005a.queueSecureInputBuffer(i10, 0, dVar.f11631i, j10, i11);
    }

    @Override
    public final boolean c(t1 t1Var) {
        return false;
    }

    @Override
    public final void d(int i10) {
        this.f45005a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void e(a3.m mVar, Handler handler) {
        this.f45005a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void f(p2.b bVar) {
        bVar.run();
    }

    @Override
    public final void flush() {
        this.f45005a.flush();
    }

    @Override
    public final void g() {
        this.f45005a.detachOutputSurface();
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f45005a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f45005a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f45005a.getOutputFormat();
    }

    @Override
    public final void h(int i10, long j10) {
        this.f45005a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int i() {
        return this.f45005a.dequeueInputBuffer(0L);
    }

    @Override
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f45005a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void k(int i10) {
        this.f45005a.setVideoScalingMode(i10);
    }

    @Override
    public final void l(Surface surface) {
        this.f45005a.setOutputSurface(surface);
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f45005a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f45005a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f45006b;
        MediaCodec mediaCodec = this.f45005a;
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
        this.f45005a.setParameters(bundle);
    }
}
