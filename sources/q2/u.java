package q2;

import g7.u8;
import java.nio.ByteBuffer;
public final class u extends com.googlecode.mp4parser.c {
    public static final zd.b f45965f;
    public static final zd.b h;
    public long[] f45966e;

    static {
        zd.a aVar = new zd.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f45965f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = u8.a(p2.b.i(byteBuffer));
        this.f45966e = new long[a2];
        for (int i9 = 0; i9 < a2; i9++) {
            this.f45966e[i9] = p2.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f45966e.length);
        for (long j10 : this.f45966e) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f45966e.length * 4) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = zd.a.b(f45965f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return aa.d.l(this.f45966e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
