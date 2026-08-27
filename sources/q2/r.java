package q2;

import h7.w8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class r extends com.googlecode.mp4parser.c {

    public static final ae.b f46122f;
    public static final ae.b h;

    public static final ae.b f46123n;

    public List f46124e;

    static {
        ae.a aVar = new ae.a(r.class, "SampleToChunkBox.java");
        f46122f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f46123n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int iA = w8.a(p2.b.i(byteBuffer));
        this.f46124e = new ArrayList(iA);
        for (int i10 = 0; i10 < iA; i10++) {
            this.f46124e.add(new q(p2.b.i(byteBuffer), p2.b.i(byteBuffer), p2.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f46124e.size());
        for (q qVar : this.f46124e) {
            byteBuffer.putInt((int) qVar.f46119a);
            byteBuffer.putInt((int) qVar.f46120b);
            byteBuffer.putInt((int) qVar.f46121c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46124e.size() * 12) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.t tVarB = ae.a.b(f46123n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarB);
        return "SampleToChunkBox[entryCount=" + this.f46124e.size() + "]";
    }
}
