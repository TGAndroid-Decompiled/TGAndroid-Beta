package s2;

import androidx.biometric.f0;
import j7.l5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class r extends com.googlecode.mp4parser.c {
    public static final f0 f46928f;
    public static final f0 h;
    public static final f0 f46929n;
    public List f46930e;

    static {
        de.a aVar = new de.a(r.class, "SampleToChunkBox.java");
        f46928f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f46929n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = l5.a(r2.b.i(byteBuffer));
        this.f46930e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f46930e.add(new q(r2.b.i(byteBuffer), r2.b.i(byteBuffer), r2.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f46930e.size());
        for (q qVar : this.f46930e) {
            byteBuffer.putInt((int) qVar.f46925a);
            byteBuffer.putInt((int) qVar.f46926b);
            byteBuffer.putInt((int) qVar.f46927c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46930e.size() * 12) + 8;
    }

    public final String toString() {
        sf.f b10 = de.a.b(f46929n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.f46930e.size() + "]";
    }
}
