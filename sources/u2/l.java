package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Cells.c5;
import p4.o0;
public interface l {
    void b(int i7, int i10, int i11, long j3);

    void c(int i7, k2.d dVar, long j3, int i10);

    void d(int i7);

    void e();

    void f(int i7, long j3);

    void flush();

    int g();

    ByteBuffer getInputBuffer(int i7);

    ByteBuffer getOutputBuffer(int i7);

    MediaFormat getOutputFormat();

    void h(o0 o0Var);

    boolean i(c5 c5Var);

    int j(MediaCodec.BufferInfo bufferInfo);

    void k(d3.k kVar, Handler handler);

    void l(int i7);

    void m(Surface surface);

    void n(ArrayList arrayList);

    void o(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
