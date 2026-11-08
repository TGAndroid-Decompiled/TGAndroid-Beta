package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.rt;
public interface l {
    void a(int i7, int i10, int i11, long j3);

    void b(int i7, k2.d dVar, long j3, int i10);

    void c(int i7);

    void d(org.telegram.ui.web.w wVar);

    void e();

    void f(int i7, long j3);

    void flush();

    int g();

    ByteBuffer getInputBuffer(int i7);

    ByteBuffer getOutputBuffer(int i7);

    MediaFormat getOutputFormat();

    int h(MediaCodec.BufferInfo bufferInfo);

    void i(d3.k kVar, Handler handler);

    void j(int i7);

    void k(Surface surface);

    boolean l(rt rtVar);

    void m(ArrayList arrayList);

    void n(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
