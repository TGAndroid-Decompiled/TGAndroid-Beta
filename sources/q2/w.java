package q2;

import h7.w8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public final class w extends com.googlecode.mp4parser.c {

    public static final ae.b f46133f;
    public static final ae.b h;

    public List f46134e;

    static {
        ae.a aVar = new ae.a(w.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f46133f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int iA = w8.a(p2.b.i(byteBuffer));
        this.f46134e = new ArrayList(iA);
        for (int i10 = 0; i10 < iA; i10++) {
            this.f46134e.add(new v(p2.b.i(byteBuffer), p2.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f46134e.size());
        for (v vVar : this.f46134e) {
            byteBuffer.putInt((int) vVar.f46131a);
            byteBuffer.putInt((int) vVar.f46132b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46134e.size() * 8) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.t tVarB = ae.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarB);
        return "TimeToSampleBox[entryCount=" + this.f46134e.size() + "]";
    }
}
