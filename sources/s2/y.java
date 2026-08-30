package s2;

import j7.l5;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.yh;
public final class y extends com.googlecode.mp4parser.c {
    public static final a3.c B;
    public static final a3.c C;
    public static final a3.c D;
    public static final a3.c E;
    public static final a3.c F;
    public static final a3.c G;
    public static final a3.c H;
    public static final a3.c I;
    public static final a3.c J;
    public static final a3.c K;
    public static final a3.c L;
    public static final a3.c M;
    public static final a3.c N;
    public static final a3.c O;
    public static final a3.c P;
    public static final a3.c Q;
    public static final a3.c R;
    public static final a3.c S;
    public static final a3.c T;
    public static final a3.c U;
    public static final a3.c V;
    public static final a3.c W;
    public static final a3.c X;
    public static final a3.c Y;
    public Date e;
    public Date f43952f;
    public long h;
    public long f43953n;
    public int f43954r;
    public int f43955s;
    public float v;
    public cc.d f43956w;
    public double f43957x;
    public double f43958y;

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
            this.f43952f = l5.b(r2.b.j(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            r2.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.f43953n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.e = l5.b(r2.b.i(byteBuffer));
            this.f43952f = l5.b(r2.b.i(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            r2.b.i(byteBuffer);
            this.f43953n = r2.b.i(byteBuffer);
        }
        r2.b.i(byteBuffer);
        r2.b.i(byteBuffer);
        this.f43954r = r2.b.h(byteBuffer);
        this.f43955s = r2.b.h(byteBuffer);
        this.v = r2.b.g(byteBuffer);
        r2.b.h(byteBuffer);
        this.f43956w = cc.d.a(byteBuffer);
        this.f43957x = r2.b.f(byteBuffer);
        this.f43958y = r2.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        com.google.firebase.messaging.r c3 = de.a.c(K, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c3);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(l5.a(this.e));
            byteBuffer.putLong(l5.a(this.f43952f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f43953n);
        } else {
            byteBuffer.putInt((int) l5.a(this.e));
            byteBuffer.putInt((int) l5.a(this.f43952f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f43953n);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        r2.b.p(this.f43954r, byteBuffer);
        r2.b.p(this.f43955s, byteBuffer);
        r2.b.o(byteBuffer, this.v);
        r2.b.p(0, byteBuffer);
        this.f43956w.b(byteBuffer);
        r2.b.n(byteBuffer, this.f43957x);
        r2.b.n(byteBuffer, this.f43958y);
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
        com.google.firebase.messaging.r b10 = de.a.b(L, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("TrackHeaderBox[creationTime=");
        yh.v(de.a.b(B, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        yh.v(de.a.b(C, this, this));
        sb.append(this.f43952f);
        sb.append(";trackId=");
        yh.v(de.a.b(D, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        yh.v(de.a.b(E, this, this));
        sb.append(this.f43953n);
        sb.append(";layer=");
        yh.v(de.a.b(F, this, this));
        sb.append(this.f43954r);
        sb.append(";alternateGroup=");
        yh.v(de.a.b(G, this, this));
        sb.append(this.f43955s);
        sb.append(";volume=");
        yh.v(de.a.b(H, this, this));
        sb.append(this.v);
        sb.append(";matrix=");
        sb.append(this.f43956w);
        sb.append(";width=");
        yh.v(de.a.b(I, this, this));
        sb.append(this.f43957x);
        sb.append(";height=");
        yh.v(de.a.b(J, this, this));
        sb.append(this.f43958y);
        sb.append("]");
        return sb.toString();
    }
}
