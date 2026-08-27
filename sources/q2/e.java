package q2;

import h7.w8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class e extends com.googlecode.mp4parser.c {

    public static final ae.b f46082f;

    public List f46083e;

    static {
        ae.a aVar = new ae.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f46082f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int iA = w8.a(p2.b.i(byteBuffer));
        this.f46083e = new ArrayList(iA);
        for (int i10 = 0; i10 < iA; i10++) {
            this.f46083e.add(new d(w8.a(p2.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f46083e.size());
        for (d dVar : this.f46083e) {
            byteBuffer.putInt(dVar.f46080a);
            byteBuffer.putInt(dVar.f46081b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46083e.size() * 8) + 8;
    }
}
