package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import org.telegram.ui.Cells.ia;
public interface l {
    void a(long j3, int i10, int i11, int i12);

    void b(int i10, h2.d dVar, long j3, int i11);

    void c(int i10);

    boolean d(ia iaVar);

    void e(a3.m mVar, Handler handler);

    void f();

    void flush();

    void g(int i10, long j3);

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    int h();

    int i(MediaCodec.BufferInfo bufferInfo);

    void j(int i10);

    void k(Surface surface);

    void release();

    void setParameters(Bundle bundle);
}
