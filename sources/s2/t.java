package s2;

import j7.k5;
import java.nio.ByteBuffer;
public final class t extends c {
    public static final a3.c h;
    public static final a3.c f43946n;
    public long[] f43947f;

    static {
        de.a aVar = new de.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f43946n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = k5.a(r2.b.i(byteBuffer));
        this.f43947f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f43947f[i10] = r2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f43947f.length);
        for (long j10 : this.f43947f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f43947f.length * 4) + 8;
    }
}
