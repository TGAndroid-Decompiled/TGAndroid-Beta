package y3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

public interface k {
    void a(long j10, int i10, int i11, int i12);

    void b(int i10, long j10);

    int c();

    int d(MediaCodec.BufferInfo bufferInfo);

    void e(int i10, k3.d dVar, long j10);

    void f(int i10);

    void flush();

    void g(Surface surface);

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    void h(e5.h hVar, Handler handler);

    void release();

    void releaseOutputBuffer(int i10, boolean z10);

    void setParameters(Bundle bundle);
}
