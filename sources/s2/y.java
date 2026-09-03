package s2;

import j7.l5;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.ai;
public final class y extends com.googlecode.mp4parser.c {
    public static final bb.b B;
    public static final bb.b C;
    public static final bb.b D;
    public static final bb.b E;
    public static final bb.b F;
    public static final bb.b G;
    public static final bb.b H;
    public static final bb.b I;
    public static final bb.b J;
    public static final bb.b K;
    public static final bb.b L;
    public static final bb.b M;
    public static final bb.b N;
    public static final bb.b O;
    public static final bb.b P;
    public static final bb.b Q;
    public static final bb.b R;
    public static final bb.b S;
    public static final bb.b T;
    public static final bb.b U;
    public static final bb.b V;
    public static final bb.b W;
    public static final bb.b X;
    public static final bb.b Y;
    public Date e;
    public Date f44017f;
    public long h;
    public long f44018n;
    public int f44019r;
    public int f44020s;
    public float v;
    public cc.d f44021w;
    public double f44022x;
    public double f44023y;

    static {
        de.a aVar = new de.a(y.class, "TrackHeaderBox.java");
        B = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        C = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        K = aVar.e(aVar.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        L = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"));
        M = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        N = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        O = aVar.e(aVar.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "void"));
        P = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "void"));
        Q = aVar.e(aVar.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"));
        R = aVar.e(aVar.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"));
        S = aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"));
        T = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        D = aVar.e(aVar.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        U = aVar.e(aVar.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"));
        V = aVar.e(aVar.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"));
        aVar.e(aVar.d("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        W = aVar.e(aVar.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        X = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        Y = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
        aVar.e(aVar.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"));
        E = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        F = aVar.e(aVar.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        G = aVar.e(aVar.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        H = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        I = aVar.e(aVar.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
        J = aVar.e(aVar.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = l5.b(r2.b.j(byteBuffer));
            this.f44017f = l5.b(r2.b.j(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            r2.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.f44018n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.e = l5.b(r2.b.i(byteBuffer));
            this.f44017f = l5.b(r2.b.i(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            r2.b.i(byteBuffer);
            this.f44018n = r2.b.i(byteBuffer);
        }
        r2.b.i(byteBuffer);
        r2.b.i(byteBuffer);
        this.f44019r = r2.b.h(byteBuffer);
        this.f44020s = r2.b.h(byteBuffer);
        this.v = r2.b.g(byteBuffer);
        r2.b.h(byteBuffer);
        this.f44021w = cc.d.a(byteBuffer);
        this.f44022x = r2.b.f(byteBuffer);
        this.f44023y = r2.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        rf.f c3 = de.a.c(K, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c3);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(l5.a(this.e));
            byteBuffer.putLong(l5.a(this.f44017f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f44018n);
        } else {
            byteBuffer.putInt((int) l5.a(this.e));
            byteBuffer.putInt((int) l5.a(this.f44017f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f44018n);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        r2.b.p(this.f44019r, byteBuffer);
        r2.b.p(this.f44020s, byteBuffer);
        r2.b.o(byteBuffer, this.v);
        r2.b.p(0, byteBuffer);
        this.f44021w.b(byteBuffer);
        r2.b.n(byteBuffer, this.f44022x);
        r2.b.n(byteBuffer, this.f44023y);
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
        rf.f b10 = de.a.b(L, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("TrackHeaderBox[creationTime=");
        ai.x(de.a.b(B, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        ai.x(de.a.b(C, this, this));
        sb.append(this.f44017f);
        sb.append(";trackId=");
        ai.x(de.a.b(D, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        ai.x(de.a.b(E, this, this));
        sb.append(this.f44018n);
        sb.append(";layer=");
        ai.x(de.a.b(F, this, this));
        sb.append(this.f44019r);
        sb.append(";alternateGroup=");
        ai.x(de.a.b(G, this, this));
        sb.append(this.f44020s);
        sb.append(";volume=");
        ai.x(de.a.b(H, this, this));
        sb.append(this.v);
        sb.append(";matrix=");
        sb.append(this.f44021w);
        sb.append(";width=");
        ai.x(de.a.b(I, this, this));
        sb.append(this.f44022x);
        sb.append(";height=");
        ai.x(de.a.b(J, this, this));
        sb.append(this.f44023y);
        sb.append("]");
        return sb.toString();
    }
}
