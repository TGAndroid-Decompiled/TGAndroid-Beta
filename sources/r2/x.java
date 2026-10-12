package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import ji.w4;
import org.telegram.ui.Wallet.t8;
public final class x implements l {
    public final MediaCodec f43890a;
    public final j f43891b;

    public x(MediaCodec mediaCodec, j jVar) {
        this.f43890a = mediaCodec;
        this.f43891b = jVar;
        if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
            jVar.a(mediaCodec);
        }
    }

    @Override
    public final void b(long j10, int i10, int i11, int i12) {
        this.f43890a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void e(int i10, h2.d dVar, long j10, int i11) {
        this.f43890a.queueSecureInputBuffer(i10, 0, dVar.f10322i, j10, i11);
    }

    @Override
    public final void f(int i10) {
        this.f43890a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void flush() {
        this.f43890a.flush();
    }

    @Override
    public final void g(t8 t8Var) {
        t8Var.run();
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f43890a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f43890a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f43890a.getOutputFormat();
    }

    @Override
    public final void h(a3.m mVar, Handler handler) {
        this.f43890a.setOnFrameRenderedListener(new a(this, mVar, 1), handler);
    }

    @Override
    public final void i() {
        this.f43890a.detachOutputSurface();
    }

    @Override
    public final void j(int i10, long j10) {
        this.f43890a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int k() {
        return this.f43890a.dequeueInputBuffer(0L);
    }

    @Override
    public final int l(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f43890a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void m(int i10) {
        this.f43890a.setVideoScalingMode(i10);
    }

    @Override
    public final void n(Surface surface) {
        this.f43890a.setOutputSurface(surface);
    }

    @Override
    public final boolean o(w4 w4Var) {
        return false;
    }

    @Override
    public final void p(ArrayList arrayList) {
        this.f43890a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void q(ArrayList arrayList) {
        this.f43890a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar = this.f43891b;
        MediaCodec mediaCodec = this.f43890a;
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
        this.f43890a.setParameters(bundle);
    }
}
