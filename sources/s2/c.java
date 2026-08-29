package s2;

import org.telegram.ui.th;
public abstract class c extends com.googlecode.mp4parser.c {
    public static final m5.i f47486e;

    static {
        be.a aVar = new be.a(c.class, "ChunkOffsetBox.java");
        f47486e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(f47486e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        th.u(be.a.b(t.h, tVar, tVar));
        return a4.w.l(tVar.f47535f.length, "]", sb2);
    }
}
