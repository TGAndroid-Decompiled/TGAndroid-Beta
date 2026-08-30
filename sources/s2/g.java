package s2;

import org.telegram.ui.yh;
public final class g extends com.googlecode.mp4parser.c {
    public static final a3.c e;

    static {
        de.a aVar = new de.a(g.class, "DataEntryUrlBox.java");
        e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.DataEntryUrlBox", "", "", "java.lang.String"));
    }

    @Override
    public final long getContentSize() {
        return 4L;
    }

    public final String toString() {
        yh.v(de.a.b(e, this, this));
        return "DataEntryUrlBox[]";
    }
}
