package q2;

import java.nio.ByteBuffer;
import org.telegram.ui.Cells.pa;

public final class s extends a {

    public static final ae.b f46125f;
    public static final ae.b h;

    public float f46126e;

    static {
        ae.a aVar = new ae.a(s.class, "SoundMediaHeaderBox.java");
        f46125f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f46126e = p2.b.g(byteBuffer);
        p2.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        p2.b.o(byteBuffer, this.f46126e);
        p2.b.p(0, byteBuffer);
    }

    @Override
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        com.google.firebase.messaging.t tVarB = ae.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarB);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        pa.u(ae.a.b(f46125f, this, this));
        sb2.append(this.f46126e);
        sb2.append("]");
        return sb2.toString();
    }
}
