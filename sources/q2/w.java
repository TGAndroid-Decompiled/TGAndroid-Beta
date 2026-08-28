package q2;

import g7.u8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
public final class w extends com.googlecode.mp4parser.c {
    public static final zd.b f45969f;
    public static final zd.b h;
    public List f45970e;

    static {
        zd.a aVar = new zd.a(w.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f45969f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = u8.a(p2.b.i(byteBuffer));
        this.f45970e = new ArrayList(a2);
        for (int i9 = 0; i9 < a2; i9++) {
            this.f45970e.add(new v(p2.b.i(byteBuffer), p2.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f45970e.size());
        for (v vVar : this.f45970e) {
            byteBuffer.putInt((int) vVar.f45967a);
            byteBuffer.putInt((int) vVar.f45968b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f45970e.size() * 8) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = zd.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "TimeToSampleBox[entryCount=" + this.f45970e.size() + "]";
    }
}
