package s2;

import androidx.biometric.f0;
import j7.l5;
import java.nio.ByteBuffer;
import org.telegram.ui.yh;
public final class o extends com.googlecode.mp4parser.c {
    public static final f0 f46920n;
    public static final f0 f46921r;
    public static final f0 f46922s;
    public static final f0 v;
    public long f46923e;
    public long[] f46924f;
    public int h;

    static {
        de.a aVar = new de.a(o.class, "SampleSizeBox.java");
        f46920n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f46921r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f46922s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f46923e = r2.b.i(byteBuffer);
        int a2 = l5.a(r2.b.i(byteBuffer));
        this.h = a2;
        if (this.f46923e == 0) {
            this.f46924f = new long[a2];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f46924f[i10] = r2.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f46923e);
        if (this.f46923e == 0) {
            byteBuffer.putInt(this.f46924f.length);
            for (long j10 : this.f46924f) {
                byteBuffer.putInt((int) j10);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i10;
        if (this.f46923e == 0) {
            i10 = this.f46924f.length * 4;
        } else {
            i10 = 0;
        }
        return i10 + 12;
    }

    public final String toString() {
        int length;
        sf.f b10 = de.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("SampleSizeBox[sampleSize=");
        yh.x(de.a.b(f46920n, this, this));
        sb.append(this.f46923e);
        sb.append(";sampleCount=");
        yh.x(de.a.b(f46921r, this, this));
        if (this.f46923e > 0) {
            length = this.h;
        } else {
            length = this.f46924f.length;
        }
        return android.support.v4.media.a.q(sb, length, "]");
    }
}
