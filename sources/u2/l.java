package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.qt;
public interface l {
    void a(int i7, int i10, int i11, long j3);

    void b(int i7, k2.d dVar, long j3, int i10);

    void c(int i7);

    void d();

    void e(int i7, long j3);

    int f();

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer getInputBuffer(int i7);

    ByteBuffer getOutputBuffer(int i7);

    MediaFormat getOutputFormat();

    void h(d3.k kVar, Handler handler);

    void i(int i7);

    void j(org.telegram.ui.web.s sVar);

    void k(Surface surface);

    boolean l(qt qtVar);

    void m(ArrayList arrayList);

    void n(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
