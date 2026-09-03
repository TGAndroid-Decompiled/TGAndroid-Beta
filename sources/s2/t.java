package s2;

import androidx.biometric.f0;
import j7.l5;
import java.nio.ByteBuffer;
public final class t extends c {
    public static final f0 h;
    public static final f0 f46933n;
    public long[] f46934f;

    static {
        de.a aVar = new de.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f46933n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = l5.a(r2.b.i(byteBuffer));
        this.f46934f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f46934f[i10] = r2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f46934f.length);
        for (long j10 : this.f46934f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46934f.length * 4) + 8;
    }
}
