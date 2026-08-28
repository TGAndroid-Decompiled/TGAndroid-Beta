package q2;

import g7.u8;
import java.nio.ByteBuffer;
import org.telegram.ui.Cells.j2;
public final class o extends com.googlecode.mp4parser.c {
    public static final zd.b f45950n;
    public static final zd.b f45951r;
    public static final zd.b f45952s;
    public static final zd.b v;
    public long f45953e;
    public long[] f45954f;
    public int h;

    static {
        zd.a aVar = new zd.a(o.class, "SampleSizeBox.java");
        f45950n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f45951r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f45952s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f45953e = p2.b.i(byteBuffer);
        int a2 = u8.a(p2.b.i(byteBuffer));
        this.h = a2;
        if (this.f45953e == 0) {
            this.f45954f = new long[a2];
            for (int i9 = 0; i9 < this.h; i9++) {
                this.f45954f[i9] = p2.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f45953e);
        if (this.f45953e == 0) {
            byteBuffer.putInt(this.f45954f.length);
            for (long j10 : this.f45954f) {
                byteBuffer.putInt((int) j10);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i9;
        if (this.f45953e == 0) {
            i9 = this.f45954f.length * 4;
        } else {
            i9 = 0;
        }
        return i9 + 12;
    }

    public final String toString() {
        int length;
        com.google.firebase.messaging.t b10 = zd.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        j2.t(zd.a.b(f45950n, this, this));
        sb2.append(this.f45953e);
        sb2.append(";sampleCount=");
        j2.t(zd.a.b(f45951r, this, this));
        if (this.f45953e > 0) {
            length = this.h;
        } else {
            length = this.f45954f.length;
        }
        return aa.d.q(sb2, length, "]");
    }
}
