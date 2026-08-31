package s2;

import androidx.biometric.f0;
import j7.l5;
import java.nio.ByteBuffer;
public final class t extends c {
    public static final f0 h;
    public static final f0 f46902n;
    public long[] f46903f;

    static {
        de.a aVar = new de.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f46902n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = l5.a(r2.b.i(byteBuffer));
        this.f46903f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f46903f[i10] = r2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f46903f.length);
        for (long j10 : this.f46903f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46903f.length * 4) + 8;
    }
}
