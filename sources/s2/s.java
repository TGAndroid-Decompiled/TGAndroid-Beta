package s2;

import androidx.biometric.f0;
import java.nio.ByteBuffer;
import org.telegram.ui.yh;
public final class s extends a {
    public static final f0 f46900f;
    public static final f0 h;
    public float f46901e;

    static {
        de.a aVar = new de.a(s.class, "SoundMediaHeaderBox.java");
        f46900f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f46901e = r2.b.g(byteBuffer);
        r2.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        r2.b.o(byteBuffer, this.f46901e);
        r2.b.p(0, byteBuffer);
    }

    @Override
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        sf.e b10 = de.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("SoundMediaHeaderBox[balance=");
        yh.x(de.a.b(f46900f, this, this));
        sb.append(this.f46901e);
        sb.append("]");
        return sb.toString();
    }
}
