package s2;

import java.nio.ByteBuffer;
import org.telegram.ui.ai;
public final class s extends a {
    public static final bb.b f44010f;
    public static final bb.b h;
    public float e;

    static {
        de.a aVar = new de.a(s.class, "SoundMediaHeaderBox.java");
        f44010f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
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
        rf.f b10 = de.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("SoundMediaHeaderBox[balance=");
        ai.x(de.a.b(f44010f, this, this));
        sb.append(this.e);
        sb.append("]");
        return sb.toString();
    }
}
