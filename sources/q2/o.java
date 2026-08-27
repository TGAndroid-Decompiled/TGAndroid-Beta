package q2;

import h7.w8;
import java.nio.ByteBuffer;
import org.telegram.ui.Cells.pa;

public final class o extends com.googlecode.mp4parser.c {

    public static final ae.b f46114n;

    public static final ae.b f46115r;

    public static final ae.b f46116s;
    public static final ae.b v;

    public long f46117e;

    public long[] f46118f;
    public int h;

    static {
        ae.a aVar = new ae.a(o.class, "SampleSizeBox.java");
        f46114n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f46115r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f46116s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f46117e = p2.b.i(byteBuffer);
        int iA = w8.a(p2.b.i(byteBuffer));
        this.h = iA;
        if (this.f46117e == 0) {
            this.f46118f = new long[iA];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f46118f[i10] = p2.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f46117e);
        if (this.f46117e != 0) {
            byteBuffer.putInt(this.h);
            return;
        }
        byteBuffer.putInt(this.f46118f.length);
        for (long j10 : this.f46118f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46117e == 0 ? this.f46118f.length * 4 : 0) + 12;
    }

    public final String toString() {
        com.google.firebase.messaging.t tVarB = ae.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarB);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        pa.u(ae.a.b(f46114n, this, this));
        sb2.append(this.f46117e);
        sb2.append(";sampleCount=");
        pa.u(ae.a.b(f46115r, this, this));
        return a9.p.o(sb2, this.f46117e > 0 ? this.h : this.f46118f.length, "]");
    }
}
