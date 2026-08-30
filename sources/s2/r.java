package s2;

import j7.k5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class r extends com.googlecode.mp4parser.c {
    public static final a3.c f43943f;
    public static final a3.c h;
    public static final a3.c f43944n;
    public List e;

    static {
        de.a aVar = new de.a(r.class, "SampleToChunkBox.java");
        f43943f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f43944n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = k5.a(r2.b.i(byteBuffer));
        this.e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.e.add(new q(r2.b.i(byteBuffer), r2.b.i(byteBuffer), r2.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (q qVar : this.e) {
            byteBuffer.putInt((int) qVar.f43940a);
            byteBuffer.putInt((int) qVar.f43941b);
            byteBuffer.putInt((int) qVar.f43942c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() * 12) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.r b10 = de.a.b(f43944n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.e.size() + "]";
    }
}
