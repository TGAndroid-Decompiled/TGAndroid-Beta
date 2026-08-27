package q2;

import h7.x8;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Cells.pa;

public final class k extends com.googlecode.mp4parser.c {
    public static final ae.b A;
    public static final ae.b B;
    public static final ae.b C;
    public static final ae.b D;
    public static final ae.b E;

    public static final ae.b f46098s;
    public static final ae.b v;

    public static final ae.b f46099w;

    public static final ae.b f46100x;

    public static final ae.b f46101y;

    public Date f46102e;

    public Date f46103f;
    public long h;

    public long f46104n;

    public String f46105r;

    static {
        ae.a aVar = new ae.a(k.class, "MediaHeaderBox.java");
        f46098s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        E = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f46099w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f46100x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f46101y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        A = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        B = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "void"));
        C = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "void"));
        D = aVar.e(aVar.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.f46102e = x8.b(p2.b.j(byteBuffer));
            this.f46103f = x8.b(p2.b.j(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            this.f46104n = p2.b.j(byteBuffer);
        } else {
            this.f46102e = x8.b(p2.b.i(byteBuffer));
            this.f46103f = x8.b(p2.b.i(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            this.f46104n = p2.b.i(byteBuffer);
        }
        int iH = p2.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((iH >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f46105r = sb2.toString();
        p2.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(x8.a(this.f46102e));
            byteBuffer.putLong(x8.a(this.f46103f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f46104n);
        } else {
            byteBuffer.putInt((int) x8.a(this.f46102e));
            byteBuffer.putInt((int) x8.a(this.f46103f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f46104n);
        }
        String str = this.f46105r;
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(a9.p.m("\"", str, "\" language string isn't exactly 3 characters long!"));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
        }
        p2.b.p(i10, byteBuffer);
        p2.b.p(0, byteBuffer);
    }

    @Override
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 4;
    }

    public final String toString() {
        com.google.firebase.messaging.t tVarB = ae.a.b(E, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarB);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        pa.u(ae.a.b(f46098s, this, this));
        sb2.append(this.f46102e);
        sb2.append(";modificationTime=");
        pa.u(ae.a.b(v, this, this));
        sb2.append(this.f46103f);
        sb2.append(";timescale=");
        pa.u(ae.a.b(f46099w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        pa.u(ae.a.b(f46100x, this, this));
        sb2.append(this.f46104n);
        sb2.append(";language=");
        pa.u(ae.a.b(f46101y, this, this));
        return a9.p.p(sb2, this.f46105r, "]");
    }
}
