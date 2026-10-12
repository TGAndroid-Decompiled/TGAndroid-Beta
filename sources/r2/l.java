package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import ji.w4;
import org.telegram.ui.Wallet.t8;
public interface l {
    void b(long j10, int i10, int i11, int i12);

    void e(int i10, h2.d dVar, long j10, int i11);

    void f(int i10);

    void flush();

    void g(t8 t8Var);

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    void h(a3.m mVar, Handler handler);

    void i();

    void j(int i10, long j10);

    int k();

    int l(MediaCodec.BufferInfo bufferInfo);

    void m(int i10);

    void n(Surface surface);

    boolean o(w4 w4Var);

    void p(ArrayList arrayList);

    void q(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
