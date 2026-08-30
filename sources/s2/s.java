package s2;

import java.nio.ByteBuffer;
import org.telegram.ui.yh;
public final class s extends a {
    public static final a3.c f43945f;
    public static final a3.c h;
    public float e;

    static {
        de.a aVar = new de.a(s.class, "SoundMediaHeaderBox.java");
        f43945f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = r2.b.g(byteBuffer);
        r2.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        r2.b.o(byteBuffer, this.e);
        r2.b.p(0, byteBuffer);
    }

    @Override
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        com.google.firebase.messaging.r b10 = de.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("SoundMediaHeaderBox[balance=");
        yh.v(de.a.b(f43945f, this, this));
        sb.append(this.e);
        sb.append("]");
        return sb.toString();
    }
}
