package s2;

import org.telegram.ui.yh;
public abstract class c extends com.googlecode.mp4parser.c {
    public static final a3.c e;

    static {
        de.a aVar = new de.a(c.class, "ChunkOffsetBox.java");
        e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        com.google.firebase.messaging.r b10 = de.a.b(e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("[entryCount=");
        t tVar = (t) this;
        yh.v(de.a.b(t.h, tVar, tVar));
        return android.support.v4.media.a.m(tVar.f43947f.length, "]", sb);
    }
}
