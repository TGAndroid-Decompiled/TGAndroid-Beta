package s2;

import java.nio.ByteBuffer;
import org.telegram.ui.th;
public final class o extends com.googlecode.mp4parser.c {
    public static final m5.i f47521n;
    public static final m5.i f47522r;
    public static final m5.i f47523s;
    public static final m5.i v;
    public long f47524e;
    public long[] f47525f;
    public int h;

    static {
        be.a aVar = new be.a(o.class, "SampleSizeBox.java");
        f47521n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f47522r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f47523s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f47524e = r2.b.i(byteBuffer);
        int a2 = h7.o.a(r2.b.i(byteBuffer));
        this.h = a2;
        if (this.f47524e == 0) {
            this.f47525f = new long[a2];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f47525f[i10] = r2.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f47524e);
        if (this.f47524e == 0) {
            byteBuffer.putInt(this.f47525f.length);
            for (long j10 : this.f47525f) {
                byteBuffer.putInt((int) j10);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i10;
        if (this.f47524e == 0) {
            i10 = this.f47525f.length * 4;
        } else {
            i10 = 0;
        }
        return i10 + 12;
    }

    public final String toString() {
        int length;
        com.google.firebase.messaging.s b10 = be.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        th.u(be.a.b(f47521n, this, this));
        sb2.append(this.f47524e);
        sb2.append(";sampleCount=");
        th.u(be.a.b(f47522r, this, this));
        if (this.f47524e > 0) {
            length = this.h;
        } else {
            length = this.f47525f.length;
        }
        return a4.w.p(sb2, length, "]");
    }
}
