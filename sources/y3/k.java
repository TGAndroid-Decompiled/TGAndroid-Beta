package y3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
public interface k {
    void a(long j10, int i9, int i10, int i11);

    void b(int i9, long j10);

    int c();

    int d(MediaCodec.BufferInfo bufferInfo);

    void e(int i9, k3.d dVar, long j10);

    void f(int i9);

    void flush();

    void g(Surface surface);

    ByteBuffer getInputBuffer(int i9);

    ByteBuffer getOutputBuffer(int i9);

    MediaFormat getOutputFormat();

    void h(e5.i iVar, Handler handler);

    void release();

    void releaseOutputBuffer(int i9, boolean z10);

    void setParameters(Bundle bundle);
}
