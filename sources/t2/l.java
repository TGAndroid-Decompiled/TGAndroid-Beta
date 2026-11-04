package t2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.i9;
import org.telegram.ui.hc1;
public interface l {
    void a(int i3, j2.d dVar, long j10, int i10);

    void b(int i3, int i10, int i11, long j10);

    void c(int i3);

    void d();

    void e(int i3, long j10);

    int f();

    void flush();

    void g(hc1 hc1Var);

    ByteBuffer getInputBuffer(int i3);

    ByteBuffer getOutputBuffer(int i3);

    MediaFormat getOutputFormat();

    void h(c3.k kVar, Handler handler);

    int i(MediaCodec.BufferInfo bufferInfo);

    void j(int i3);

    boolean k(i9 i9Var);

    void l(Surface surface);

    void m(ArrayList arrayList);

    void n(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
