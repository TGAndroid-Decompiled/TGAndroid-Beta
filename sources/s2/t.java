package s2;

import java.nio.ByteBuffer;
public final class t extends c {
    public static final m5.i h;
    public static final m5.i f47534n;
    public long[] f47535f;

    static {
        be.a aVar = new be.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f47534n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = h7.o.a(r2.b.i(byteBuffer));
        this.f47535f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f47535f[i10] = r2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f47535f.length);
        for (long j10 : this.f47535f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f47535f.length * 4) + 8;
    }
}
