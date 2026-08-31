package s2;

import androidx.biometric.f0;
import org.telegram.ui.yh;
public abstract class c extends com.googlecode.mp4parser.c {
    public static final f0 f46854e;

    static {
        de.a aVar = new de.a(c.class, "ChunkOffsetBox.java");
        f46854e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        sf.e b10 = de.a.b(f46854e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("[entryCount=");
        t tVar = (t) this;
        yh.x(de.a.b(t.h, tVar, tVar));
        return android.support.v4.media.a.m(tVar.f46903f.length, "]", sb);
    }
}
