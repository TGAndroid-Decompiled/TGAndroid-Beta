package q2;

import h7.w8;
import java.nio.ByteBuffer;

public final class u extends com.googlecode.mp4parser.c {

    public static final ae.b f46129f;
    public static final ae.b h;

    public long[] f46130e;

    static {
        ae.a aVar = new ae.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f46129f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int iA = w8.a(p2.b.i(byteBuffer));
        this.f46130e = new long[iA];
        for (int i10 = 0; i10 < iA; i10++) {
            this.f46130e[i10] = p2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f46130e.length);
        for (long j10 : this.f46130e) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46130e.length * 4) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.t tVarB = ae.a.b(f46129f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarB);
        return a9.p.k(this.f46130e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
