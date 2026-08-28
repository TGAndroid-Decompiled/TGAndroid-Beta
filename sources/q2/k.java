package q2;

import g7.v8;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Cells.j2;
public final class k extends com.googlecode.mp4parser.c {
    public static final zd.b A;
    public static final zd.b B;
    public static final zd.b C;
    public static final zd.b D;
    public static final zd.b E;
    public static final zd.b f45934s;
    public static final zd.b v;
    public static final zd.b f45935w;
    public static final zd.b f45936x;
    public static final zd.b f45937y;
    public Date f45938e;
    public Date f45939f;
    public long h;
    public long f45940n;
    public String f45941r;

    static {
        zd.a aVar = new zd.a(k.class, "MediaHeaderBox.java");
        f45934s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        E = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f45935w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f45936x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f45937y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.f45938e = v8.b(p2.b.j(byteBuffer));
            this.f45939f = v8.b(p2.b.j(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            this.f45940n = p2.b.j(byteBuffer);
        } else {
            this.f45938e = v8.b(p2.b.i(byteBuffer));
            this.f45939f = v8.b(p2.b.i(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            this.f45940n = p2.b.i(byteBuffer);
        }
        int h = p2.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i9 = 0; i9 < 3; i9++) {
            sb2.append((char) (((h >> ((2 - i9) * 5)) & 31) + 96));
        }
        this.f45941r = sb2.toString();
        p2.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(v8.a(this.f45938e));
            byteBuffer.putLong(v8.a(this.f45939f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f45940n);
        } else {
            byteBuffer.putInt((int) v8.a(this.f45938e));
            byteBuffer.putInt((int) v8.a(this.f45939f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f45940n);
        }
        String str = this.f45941r;
        if (str.getBytes().length == 3) {
            int i9 = 0;
            for (int i10 = 0; i10 < 3; i10++) {
                i9 += (str.getBytes()[i10] - 96) << ((2 - i10) * 5);
            }
            p2.b.p(i9, byteBuffer);
            p2.b.p(0, byteBuffer);
            return;
        }
        throw new IllegalArgumentException(aa.d.o("\"", str, "\" language string isn't exactly 3 characters long!"));
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
        com.google.firebase.messaging.t b10 = zd.a.b(E, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        j2.t(zd.a.b(f45934s, this, this));
        sb2.append(this.f45938e);
        sb2.append(";modificationTime=");
        j2.t(zd.a.b(v, this, this));
        sb2.append(this.f45939f);
        sb2.append(";timescale=");
        j2.t(zd.a.b(f45935w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        j2.t(zd.a.b(f45936x, this, this));
        sb2.append(this.f45940n);
        sb2.append(";language=");
        j2.t(zd.a.b(f45937y, this, this));
        return aa.d.r(sb2, this.f45941r, "]");
    }
}
