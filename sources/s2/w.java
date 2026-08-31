package s2;

import androidx.biometric.f0;
import j7.l5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
public final class w extends com.googlecode.mp4parser.c {
    public static final f0 f46908f;
    public static final f0 h;
    public List f46909e;

    static {
        de.a aVar = new de.a(w.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f46908f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = l5.a(r2.b.i(byteBuffer));
        this.f46909e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f46909e.add(new v(r2.b.i(byteBuffer), r2.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f46909e.size());
        for (v vVar : this.f46909e) {
            byteBuffer.putInt((int) vVar.f46906a);
            byteBuffer.putInt((int) vVar.f46907b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46909e.size() * 8) + 8;
    }

    public final String toString() {
        sf.e b10 = de.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "TimeToSampleBox[entryCount=" + this.f46909e.size() + "]";
    }
}
