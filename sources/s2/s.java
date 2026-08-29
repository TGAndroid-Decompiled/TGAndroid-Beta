package s2;

import java.nio.ByteBuffer;
import org.telegram.ui.th;
public final class s extends a {
    public static final m5.i f47532f;
    public static final m5.i h;
    public float f47533e;

    static {
        be.a aVar = new be.a(s.class, "SoundMediaHeaderBox.java");
        f47532f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f47533e = r2.b.g(byteBuffer);
        r2.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        r2.b.o(byteBuffer, this.f47533e);
        r2.b.p(0, byteBuffer);
    }

    @Override
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        th.u(be.a.b(f47532f, this, this));
        sb2.append(this.f47533e);
        sb2.append("]");
        return sb2.toString();
    }
}
