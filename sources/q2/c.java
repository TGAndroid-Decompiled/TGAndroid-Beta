package q2;

import org.telegram.ui.Cells.pa;

public abstract class c extends com.googlecode.mp4parser.c {

    public static final ae.b f46079e;

    static {
        ae.a aVar = new ae.a(c.class, "ChunkOffsetBox.java");
        f46079e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        com.google.firebase.messaging.t tVarB = ae.a.b(f46079e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarB);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        pa.u(ae.a.b(t.h, tVar, tVar));
        return a9.p.k(tVar.f46128f.length, "]", sb2);
    }
}
