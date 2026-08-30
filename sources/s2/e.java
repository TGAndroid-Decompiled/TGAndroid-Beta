package s2;

import j7.k5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class e extends com.googlecode.mp4parser.c {
    public static final a3.c f43910f;
    public List e;

    static {
        de.a aVar = new de.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f43910f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = k5.a(r2.b.i(byteBuffer));
        this.e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.e.add(new d(k5.a(r2.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (d dVar : this.e) {
            byteBuffer.putInt(dVar.f43908a);
            byteBuffer.putInt(dVar.f43909b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() * 8) + 8;
    }
}
