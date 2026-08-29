package s2;

import java.nio.ByteBuffer;
public final class u extends com.googlecode.mp4parser.c {
    public static final m5.i f47536f;
    public static final m5.i h;
    public long[] f47537e;

    static {
        be.a aVar = new be.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f47536f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = h7.o.a(r2.b.i(byteBuffer));
        this.f47537e = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f47537e[i10] = r2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f47537e.length);
        for (long j10 : this.f47537e) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f47537e.length * 4) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(f47536f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return a4.w.l(this.f47537e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
