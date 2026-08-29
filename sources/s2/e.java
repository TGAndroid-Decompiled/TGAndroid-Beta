package s2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class e extends com.googlecode.mp4parser.c {
    public static final m5.i f47489f;
    public List f47490e;

    static {
        be.a aVar = new be.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f47489f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = h7.o.a(r2.b.i(byteBuffer));
        this.f47490e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f47490e.add(new d(h7.o.a(r2.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f47490e.size());
        for (d dVar : this.f47490e) {
            byteBuffer.putInt(dVar.f47487a);
            byteBuffer.putInt(dVar.f47488b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f47490e.size() * 8) + 8;
    }
}
