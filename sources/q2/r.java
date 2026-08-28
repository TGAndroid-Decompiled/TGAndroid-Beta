package q2;

import g7.u8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class r extends com.googlecode.mp4parser.c {
    public static final zd.b f45958f;
    public static final zd.b h;
    public static final zd.b f45959n;
    public List f45960e;

    static {
        zd.a aVar = new zd.a(r.class, "SampleToChunkBox.java");
        f45958f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f45959n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = u8.a(p2.b.i(byteBuffer));
        this.f45960e = new ArrayList(a2);
        for (int i9 = 0; i9 < a2; i9++) {
            this.f45960e.add(new q(p2.b.i(byteBuffer), p2.b.i(byteBuffer), p2.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f45960e.size());
        for (q qVar : this.f45960e) {
            byteBuffer.putInt((int) qVar.f45955a);
            byteBuffer.putInt((int) qVar.f45956b);
            byteBuffer.putInt((int) qVar.f45957c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f45960e.size() * 12) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = zd.a.b(f45959n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.f45960e.size() + "]";
    }
}
