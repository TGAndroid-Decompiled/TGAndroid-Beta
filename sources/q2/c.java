package q2;

import org.telegram.ui.Cells.j2;
public abstract class c extends com.googlecode.mp4parser.c {
    public static final zd.b f45915e;

    static {
        zd.a aVar = new zd.a(c.class, "ChunkOffsetBox.java");
        f45915e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = zd.a.b(f45915e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        j2.t(zd.a.b(t.h, tVar, tVar));
        return aa.d.l(tVar.f45964f.length, "]", sb2);
    }
}
