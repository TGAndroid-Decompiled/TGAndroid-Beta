package s2;

import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.th;
public final class y extends com.googlecode.mp4parser.c {
    public static final m5.i A;
    public static final m5.i B;
    public static final m5.i C;
    public static final m5.i D;
    public static final m5.i E;
    public static final m5.i F;
    public static final m5.i G;
    public static final m5.i H;
    public static final m5.i I;
    public static final m5.i J;
    public static final m5.i K;
    public static final m5.i L;
    public static final m5.i M;
    public static final m5.i N;
    public static final m5.i O;
    public static final m5.i P;
    public static final m5.i Q;
    public static final m5.i R;
    public static final m5.i S;
    public static final m5.i T;
    public static final m5.i U;
    public static final m5.i V;
    public static final m5.i W;
    public static final m5.i X;
    public Date f47542e;
    public Date f47543f;
    public long h;
    public long f47544n;
    public int f47545r;
    public int f47546s;
    public float v;
    public ac.d f47547w;
    public double f47548x;
    public double f47549y;

    static {
        be.a aVar = new be.a(y.class, "TrackHeaderBox.java");
        A = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        B = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        J = aVar.e(aVar.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        K = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"));
        L = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        M = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        N = aVar.e(aVar.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "void"));
        O = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "void"));
        P = aVar.e(aVar.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"));
        Q = aVar.e(aVar.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"));
        R = aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"));
        S = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        C = aVar.e(aVar.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        T = aVar.e(aVar.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"));
        U = aVar.e(aVar.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"));
        aVar.e(aVar.d("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        V = aVar.e(aVar.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        W = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        X = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
        aVar.e(aVar.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"));
        D = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        E = aVar.e(aVar.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        F = aVar.e(aVar.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        G = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        H = aVar.e(aVar.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
        I = aVar.e(aVar.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.f47542e = h7.p.b(r2.b.j(byteBuffer));
            this.f47543f = h7.p.b(r2.b.j(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            r2.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.f47544n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f47542e = h7.p.b(r2.b.i(byteBuffer));
            this.f47543f = h7.p.b(r2.b.i(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            r2.b.i(byteBuffer);
            this.f47544n = r2.b.i(byteBuffer);
        }
        r2.b.i(byteBuffer);
        r2.b.i(byteBuffer);
        this.f47545r = r2.b.h(byteBuffer);
        this.f47546s = r2.b.h(byteBuffer);
        this.v = r2.b.g(byteBuffer);
        r2.b.h(byteBuffer);
        this.f47547w = ac.d.a(byteBuffer);
        this.f47548x = r2.b.f(byteBuffer);
        this.f47549y = r2.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        com.google.firebase.messaging.s c3 = be.a.c(J, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c3);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(h7.p.a(this.f47542e));
            byteBuffer.putLong(h7.p.a(this.f47543f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f47544n);
        } else {
            byteBuffer.putInt((int) h7.p.a(this.f47542e));
            byteBuffer.putInt((int) h7.p.a(this.f47543f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f47544n);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        r2.b.p(this.f47545r, byteBuffer);
        r2.b.p(this.f47546s, byteBuffer);
        r2.b.o(byteBuffer, this.v);
        r2.b.p(0, byteBuffer);
        this.f47547w.b(byteBuffer);
        r2.b.n(byteBuffer, this.f47548x);
        r2.b.n(byteBuffer, this.f47549y);
    }

    @Override
    public final long getContentSize() {
        long j10;
        if (e() == 1) {
            j10 = 36;
        } else {
            j10 = 24;
        }
        return j10 + 60;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(K, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        th.u(be.a.b(A, this, this));
        sb2.append(this.f47542e);
        sb2.append(";modificationTime=");
        th.u(be.a.b(B, this, this));
        sb2.append(this.f47543f);
        sb2.append(";trackId=");
        th.u(be.a.b(C, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        th.u(be.a.b(D, this, this));
        sb2.append(this.f47544n);
        sb2.append(";layer=");
        th.u(be.a.b(E, this, this));
        sb2.append(this.f47545r);
        sb2.append(";alternateGroup=");
        th.u(be.a.b(F, this, this));
        sb2.append(this.f47546s);
        sb2.append(";volume=");
        th.u(be.a.b(G, this, this));
        sb2.append(this.v);
        sb2.append(";matrix=");
        sb2.append(this.f47547w);
        sb2.append(";width=");
        th.u(be.a.b(H, this, this));
        sb2.append(this.f47548x);
        sb2.append(";height=");
        th.u(be.a.b(I, this, this));
        sb2.append(this.f47549y);
        sb2.append("]");
        return sb2.toString();
    }
}
