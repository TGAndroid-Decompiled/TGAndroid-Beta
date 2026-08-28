package q2;

import g7.u8;
import java.nio.ByteBuffer;
public final class t extends c {
    public static final zd.b h;
    public static final zd.b f45963n;
    public long[] f45964f;

    static {
        zd.a aVar = new zd.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f45963n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = u8.a(p2.b.i(byteBuffer));
        this.f45964f = new long[a2];
        for (int i9 = 0; i9 < a2; i9++) {
            this.f45964f[i9] = p2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f45964f.length);
        for (long j10 : this.f45964f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f45964f.length * 4) + 8;
    }
}
