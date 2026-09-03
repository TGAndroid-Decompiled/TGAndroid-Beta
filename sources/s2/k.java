package s2;

import j7.l5;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.ai;
public final class k extends com.googlecode.mp4parser.c {
    public static final bb.b B;
    public static final bb.b C;
    public static final bb.b D;
    public static final bb.b E;
    public static final bb.b F;
    public static final bb.b f43987s;
    public static final bb.b v;
    public static final bb.b f43988w;
    public static final bb.b f43989x;
    public static final bb.b f43990y;
    public Date e;
    public Date f43991f;
    public long h;
    public long f43992n;
    public String f43993r;

    static {
        de.a aVar = new de.a(k.class, "MediaHeaderBox.java");
        f43987s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        F = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f43988w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f43989x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f43990y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        B = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        C = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "void"));
        D = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "void"));
        E = aVar.e(aVar.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = l5.b(r2.b.j(byteBuffer));
            this.f43991f = l5.b(r2.b.j(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.f43992n = r2.b.j(byteBuffer);
        } else {
            this.e = l5.b(r2.b.i(byteBuffer));
            this.f43991f = l5.b(r2.b.i(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.f43992n = r2.b.i(byteBuffer);
        }
        int h = r2.b.h(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f43993r = sb.toString();
        r2.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(l5.a(this.e));
            byteBuffer.putLong(l5.a(this.f43991f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f43992n);
        } else {
            byteBuffer.putInt((int) l5.a(this.e));
            byteBuffer.putInt((int) l5.a(this.f43991f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f43992n);
        }
        String str = this.f43993r;
        if (str.getBytes().length == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
            }
            r2.b.p(i10, byteBuffer);
            r2.b.p(0, byteBuffer);
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.o("\"", str, "\" language string isn't exactly 3 characters long!"));
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
        rf.f b10 = de.a.b(F, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("MediaHeaderBox[creationTime=");
        ai.x(de.a.b(f43987s, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        ai.x(de.a.b(v, this, this));
        sb.append(this.f43991f);
        sb.append(";timescale=");
        ai.x(de.a.b(f43988w, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        ai.x(de.a.b(f43989x, this, this));
        sb.append(this.f43992n);
        sb.append(";language=");
        ai.x(de.a.b(f43990y, this, this));
        return android.support.v4.media.a.r(sb, this.f43993r, "]");
    }
}
