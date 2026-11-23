package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.web.t1;
public interface l {
    void flush();

    void g(int i7, int i10, int i11, long j3);

    ByteBuffer getInputBuffer(int i7);

    ByteBuffer getOutputBuffer(int i7);

    MediaFormat getOutputFormat();

    void h(int i7, k2.d dVar, long j3, int i10);

    void i(int i7);

    void j();

    void k(int i7, long j3);

    int l();

    void m(t1 t1Var);

    int n(MediaCodec.BufferInfo bufferInfo);

    void o(d3.k kVar, Handler handler);

    boolean p(nd0 nd0Var);

    void q(int i7);

    void r(Surface surface);

    void release();

    void s(ArrayList arrayList);

    void setParameters(Bundle bundle);

    void t(ArrayList arrayList);
}
