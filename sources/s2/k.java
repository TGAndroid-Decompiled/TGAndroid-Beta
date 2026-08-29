package s2;

import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.th;
public final class k extends com.googlecode.mp4parser.c {
    public static final m5.i A;
    public static final m5.i B;
    public static final m5.i C;
    public static final m5.i D;
    public static final m5.i E;
    public static final m5.i f47505s;
    public static final m5.i v;
    public static final m5.i f47506w;
    public static final m5.i f47507x;
    public static final m5.i f47508y;
    public Date f47509e;
    public Date f47510f;
    public long h;
    public long f47511n;
    public String f47512r;

    static {
        be.a aVar = new be.a(k.class, "MediaHeaderBox.java");
        f47505s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        E = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f47506w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f47507x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f47508y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.f47509e = h7.p.b(r2.b.j(byteBuffer));
            this.f47510f = h7.p.b(r2.b.j(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.f47511n = r2.b.j(byteBuffer);
        } else {
            this.f47509e = h7.p.b(r2.b.i(byteBuffer));
            this.f47510f = h7.p.b(r2.b.i(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.f47511n = r2.b.i(byteBuffer);
        }
        int h = r2.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f47512r = sb2.toString();
        r2.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(h7.p.a(this.f47509e));
            byteBuffer.putLong(h7.p.a(this.f47510f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f47511n);
        } else {
            byteBuffer.putInt((int) h7.p.a(this.f47509e));
            byteBuffer.putInt((int) h7.p.a(this.f47510f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f47511n);
        }
        String str = this.f47512r;
        if (str.getBytes().length == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
            }
            r2.b.p(i10, byteBuffer);
            r2.b.p(0, byteBuffer);
            return;
        }
        throw new IllegalArgumentException(a4.w.n("\"", str, "\" language string isn't exactly 3 characters long!"));
    }

    @Override
    public final long getContentSize() {
        long j10;
        if (e() == 1) {
            j10 = 32;
        } else {
            j10 = 20;
        }
        return j10 + 4;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(E, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        th.u(be.a.b(f47505s, this, this));
        sb2.append(this.f47509e);
        sb2.append(";modificationTime=");
        th.u(be.a.b(v, this, this));
        sb2.append(this.f47510f);
        sb2.append(";timescale=");
        th.u(be.a.b(f47506w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        th.u(be.a.b(f47507x, this, this));
        sb2.append(this.f47511n);
        sb2.append(";language=");
        th.u(be.a.b(f47508y, this, this));
        return a4.w.q(sb2, this.f47512r, "]");
    }
}
