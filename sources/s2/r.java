package s2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class r extends com.googlecode.mp4parser.c {
    public static final m5.i f47529f;
    public static final m5.i h;
    public static final m5.i f47530n;
    public List f47531e;

    static {
        be.a aVar = new be.a(r.class, "SampleToChunkBox.java");
        f47529f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f47530n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = h7.o.a(r2.b.i(byteBuffer));
        this.f47531e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f47531e.add(new q(r2.b.i(byteBuffer), r2.b.i(byteBuffer), r2.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f47531e.size());
        for (q qVar : this.f47531e) {
            byteBuffer.putInt((int) qVar.f47526a);
            byteBuffer.putInt((int) qVar.f47527b);
            byteBuffer.putInt((int) qVar.f47528c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f47531e.size() * 12) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(f47530n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.f47531e.size() + "]";
    }
}
