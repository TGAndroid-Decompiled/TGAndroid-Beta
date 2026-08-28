package q2;

import g7.v8;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Cells.j2;
public final class y extends com.googlecode.mp4parser.c {
    public static final zd.b A;
    public static final zd.b B;
    public static final zd.b C;
    public static final zd.b D;
    public static final zd.b E;
    public static final zd.b F;
    public static final zd.b G;
    public static final zd.b H;
    public static final zd.b I;
    public static final zd.b J;
    public static final zd.b K;
    public static final zd.b L;
    public static final zd.b M;
    public static final zd.b N;
    public static final zd.b O;
    public static final zd.b P;
    public static final zd.b Q;
    public static final zd.b R;
    public static final zd.b S;
    public static final zd.b T;
    public static final zd.b U;
    public static final zd.b V;
    public static final zd.b W;
    public static final zd.b X;
    public Date f45971e;
    public Date f45972f;
    public long h;
    public long f45973n;
    public int f45974r;
    public int f45975s;
    public float v;
    public yb.d f45976w;
    public double f45977x;
    public double f45978y;

    static {
        zd.a aVar = new zd.a(y.class, "TrackHeaderBox.java");
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
            this.f45971e = v8.b(p2.b.j(byteBuffer));
            this.f45972f = v8.b(p2.b.j(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            p2.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.f45973n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f45971e = v8.b(p2.b.i(byteBuffer));
            this.f45972f = v8.b(p2.b.i(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            p2.b.i(byteBuffer);
            this.f45973n = p2.b.i(byteBuffer);
        }
        p2.b.i(byteBuffer);
        p2.b.i(byteBuffer);
        this.f45974r = p2.b.h(byteBuffer);
        this.f45975s = p2.b.h(byteBuffer);
        this.v = p2.b.g(byteBuffer);
        p2.b.h(byteBuffer);
        this.f45976w = yb.d.a(byteBuffer);
        this.f45977x = p2.b.f(byteBuffer);
        this.f45978y = p2.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        com.google.firebase.messaging.t c10 = zd.a.c(J, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(v8.a(this.f45971e));
            byteBuffer.putLong(v8.a(this.f45972f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f45973n);
        } else {
            byteBuffer.putInt((int) v8.a(this.f45971e));
            byteBuffer.putInt((int) v8.a(this.f45972f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f45973n);
        }
        int i9 = (int) 0;
        byteBuffer.putInt(i9);
        byteBuffer.putInt(i9);
        p2.b.p(this.f45974r, byteBuffer);
        p2.b.p(this.f45975s, byteBuffer);
        p2.b.o(byteBuffer, this.v);
        p2.b.p(0, byteBuffer);
        this.f45976w.b(byteBuffer);
        p2.b.n(byteBuffer, this.f45977x);
        p2.b.n(byteBuffer, this.f45978y);
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
        com.google.firebase.messaging.t b10 = zd.a.b(K, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        j2.t(zd.a.b(A, this, this));
        sb2.append(this.f45971e);
        sb2.append(";modificationTime=");
        j2.t(zd.a.b(B, this, this));
        sb2.append(this.f45972f);
        sb2.append(";trackId=");
        j2.t(zd.a.b(C, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        j2.t(zd.a.b(D, this, this));
        sb2.append(this.f45973n);
        sb2.append(";layer=");
        j2.t(zd.a.b(E, this, this));
        sb2.append(this.f45974r);
        sb2.append(";alternateGroup=");
        j2.t(zd.a.b(F, this, this));
        sb2.append(this.f45975s);
        sb2.append(";volume=");
        j2.t(zd.a.b(G, this, this));
        sb2.append(this.v);
        sb2.append(";matrix=");
        sb2.append(this.f45976w);
        sb2.append(";width=");
        j2.t(zd.a.b(H, this, this));
        sb2.append(this.f45977x);
        sb2.append(";height=");
        j2.t(zd.a.b(I, this, this));
        sb2.append(this.f45978y);
        sb2.append("]");
        return sb2.toString();
    }
}
