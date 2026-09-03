package s2;

import androidx.biometric.f0;
import j7.m5;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.yh;
public final class k extends com.googlecode.mp4parser.c {
    public static final f0 B;
    public static final f0 C;
    public static final f0 D;
    public static final f0 E;
    public static final f0 F;
    public static final f0 f46904s;
    public static final f0 v;
    public static final f0 f46905w;
    public static final f0 f46906x;
    public static final f0 f46907y;
    public Date f46908e;
    public Date f46909f;
    public long h;
    public long f46910n;
    public String f46911r;

    static {
        de.a aVar = new de.a(k.class, "MediaHeaderBox.java");
        f46904s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        F = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f46905w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f46906x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f46907y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.f46908e = m5.b(r2.b.j(byteBuffer));
            this.f46909f = m5.b(r2.b.j(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.f46910n = r2.b.j(byteBuffer);
        } else {
            this.f46908e = m5.b(r2.b.i(byteBuffer));
            this.f46909f = m5.b(r2.b.i(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.f46910n = r2.b.i(byteBuffer);
        }
        int h = r2.b.h(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f46911r = sb.toString();
        r2.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(m5.a(this.f46908e));
            byteBuffer.putLong(m5.a(this.f46909f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f46910n);
        } else {
            byteBuffer.putInt((int) m5.a(this.f46908e));
            byteBuffer.putInt((int) m5.a(this.f46909f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f46910n);
        }
        String str = this.f46911r;
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
        sf.f b10 = de.a.b(F, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("MediaHeaderBox[creationTime=");
        yh.x(de.a.b(f46904s, this, this));
        sb.append(this.f46908e);
        sb.append(";modificationTime=");
        yh.x(de.a.b(v, this, this));
        sb.append(this.f46909f);
        sb.append(";timescale=");
        yh.x(de.a.b(f46905w, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        yh.x(de.a.b(f46906x, this, this));
        sb.append(this.f46910n);
        sb.append(";language=");
        yh.x(de.a.b(f46907y, this, this));
        return android.support.v4.media.a.r(sb, this.f46911r, "]");
    }
}
