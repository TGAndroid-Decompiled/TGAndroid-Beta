package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import ki.t1;
import org.telegram.ui.web.g2;
public interface l {
    void a(long j10, int i10, int i11, int i12);

    void b(int i10, h2.d dVar, long j10, int i11);

    boolean c(t1 t1Var);

    void d(int i10);

    void e(a3.m mVar, Handler handler);

    void f();

    void flush();

    void g(g2 g2Var);

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    void h(int i10, long j10);

    int i();

    int j(MediaCodec.BufferInfo bufferInfo);

    void k(int i10);

    void l(Surface surface);

    void m(ArrayList arrayList);

    void n(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
