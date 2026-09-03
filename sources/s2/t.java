package s2;

import j7.k5;
import java.nio.ByteBuffer;
public final class t extends c {
    public static final bb.b h;
    public static final bb.b f44011n;
    public long[] f44012f;

    static {
        de.a aVar = new de.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f44011n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = k5.a(r2.b.i(byteBuffer));
        this.f44012f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f44012f[i10] = r2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f44012f.length);
        for (long j10 : this.f44012f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f44012f.length * 4) + 8;
    }
}
