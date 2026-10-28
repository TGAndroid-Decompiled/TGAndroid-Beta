package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import li.h5;
import org.telegram.ui.Wallet.a6;
public interface l {
    void d(long j10, int i10, int i11, int i12);

    void e(int i10, h2.d dVar, long j10, int i11);

    void f(int i10);

    void flush();

    void g(a3.m mVar, Handler handler);

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    void h();

    void i(int i10, long j10);

    int j();

    int k(MediaCodec.BufferInfo bufferInfo);

    boolean l(h5 h5Var);

    void m(int i10);

    void n(Surface surface);

    void o(a6 a6Var);

    void p(ArrayList arrayList);

    void q(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
