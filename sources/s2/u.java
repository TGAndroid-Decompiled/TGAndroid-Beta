package s2;

import j7.k5;
import java.nio.ByteBuffer;
public final class u extends com.googlecode.mp4parser.c {
    public static final a3.c f43948f;
    public static final a3.c h;
    public long[] e;

    static {
        de.a aVar = new de.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f43948f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = k5.a(r2.b.i(byteBuffer));
        this.e = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.e[i10] = r2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.length);
        for (long j10 : this.e) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.length * 4) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.r b10 = de.a.b(f43948f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return android.support.v4.media.a.m(this.e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
