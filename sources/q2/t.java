package q2;

import h7.w8;
import java.nio.ByteBuffer;

public final class t extends c {
    public static final ae.b h;

    public static final ae.b f46127n;

    public long[] f46128f;

    static {
        ae.a aVar = new ae.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f46127n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int iA = w8.a(p2.b.i(byteBuffer));
        this.f46128f = new long[iA];
        for (int i10 = 0; i10 < iA; i10++) {
            this.f46128f[i10] = p2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f46128f.length);
        for (long j10 : this.f46128f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46128f.length * 4) + 8;
    }
}
