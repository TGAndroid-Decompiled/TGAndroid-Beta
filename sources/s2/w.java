package s2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
public final class w extends com.googlecode.mp4parser.c {
    public static final m5.i f47540f;
    public static final m5.i h;
    public List f47541e;

    static {
        be.a aVar = new be.a(w.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f47540f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = h7.o.a(r2.b.i(byteBuffer));
        this.f47541e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f47541e.add(new v(r2.b.i(byteBuffer), r2.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f47541e.size());
        for (v vVar : this.f47541e) {
            byteBuffer.putInt((int) vVar.f47538a);
            byteBuffer.putInt((int) vVar.f47539b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f47541e.size() * 8) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "TimeToSampleBox[entryCount=" + this.f47541e.size() + "]";
    }
}
