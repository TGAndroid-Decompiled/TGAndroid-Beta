package q2;

import g7.u8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class e extends com.googlecode.mp4parser.c {
    public static final zd.b f45918f;
    public List f45919e;

    static {
        zd.a aVar = new zd.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f45918f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = u8.a(p2.b.i(byteBuffer));
        this.f45919e = new ArrayList(a2);
        for (int i9 = 0; i9 < a2; i9++) {
            this.f45919e.add(new d(u8.a(p2.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f45919e.size());
        for (d dVar : this.f45919e) {
            byteBuffer.putInt(dVar.f45916a);
            byteBuffer.putInt(dVar.f45917b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f45919e.size() * 8) + 8;
    }
}
