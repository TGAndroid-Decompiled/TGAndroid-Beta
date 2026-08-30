package s2;

import j7.k5;
import java.nio.ByteBuffer;
import org.telegram.ui.yh;
public final class o extends com.googlecode.mp4parser.c {
    public static final a3.c f43936n;
    public static final a3.c f43937r;
    public static final a3.c f43938s;
    public static final a3.c v;
    public long e;
    public long[] f43939f;
    public int h;

    static {
        de.a aVar = new de.a(o.class, "SampleSizeBox.java");
        f43936n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f43937r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f43938s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = r2.b.i(byteBuffer);
        int a2 = k5.a(r2.b.i(byteBuffer));
        this.h = a2;
        if (this.e == 0) {
            this.f43939f = new long[a2];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f43939f[i10] = r2.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.e);
        if (this.e == 0) {
            byteBuffer.putInt(this.f43939f.length);
            for (long j10 : this.f43939f) {
                byteBuffer.putInt((int) j10);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i10;
        if (this.e == 0) {
            i10 = this.f43939f.length * 4;
        } else {
            i10 = 0;
        }
        return i10 + 12;
    }

    public final String toString() {
        int length;
        com.google.firebase.messaging.r b10 = de.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("SampleSizeBox[sampleSize=");
        yh.v(de.a.b(f43936n, this, this));
        sb.append(this.e);
        sb.append(";sampleCount=");
        yh.v(de.a.b(f43937r, this, this));
        if (this.e > 0) {
            length = this.h;
        } else {
            length = this.f43939f.length;
        }
        return android.support.v4.media.a.q(sb, length, "]");
    }
}
