package s2;

import androidx.biometric.f0;
import j7.l5;
import java.nio.ByteBuffer;
public final class u extends com.googlecode.mp4parser.c {
    public static final f0 f46904f;
    public static final f0 h;
    public long[] f46905e;

    static {
        de.a aVar = new de.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f46904f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = l5.a(r2.b.i(byteBuffer));
        this.f46905e = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f46905e[i10] = r2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f46905e.length);
        for (long j10 : this.f46905e) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46905e.length * 4) + 8;
    }

    public final String toString() {
        sf.e b10 = de.a.b(f46904f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return android.support.v4.media.a.m(this.f46905e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
