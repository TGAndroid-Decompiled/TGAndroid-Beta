package q2;

import java.nio.ByteBuffer;
import org.telegram.ui.Cells.j2;
public final class s extends a {
    public static final zd.b f45961f;
    public static final zd.b h;
    public float f45962e;

    static {
        zd.a aVar = new zd.a(s.class, "SoundMediaHeaderBox.java");
        f45961f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f45962e = p2.b.g(byteBuffer);
        p2.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        p2.b.o(byteBuffer, this.f45962e);
        p2.b.p(0, byteBuffer);
    }

    @Override
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = zd.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        j2.t(zd.a.b(f45961f, this, this));
        sb2.append(this.f45962e);
        sb2.append("]");
        return sb2.toString();
    }
}
