package q2;

import h7.x8;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Cells.pa;

public final class y extends com.googlecode.mp4parser.c {
    public static final ae.b A;
    public static final ae.b B;
    public static final ae.b C;
    public static final ae.b D;
    public static final ae.b E;
    public static final ae.b F;
    public static final ae.b G;
    public static final ae.b H;
    public static final ae.b I;
    public static final ae.b J;
    public static final ae.b K;
    public static final ae.b L;
    public static final ae.b M;
    public static final ae.b N;
    public static final ae.b O;
    public static final ae.b P;
    public static final ae.b Q;
    public static final ae.b R;
    public static final ae.b S;
    public static final ae.b T;
    public static final ae.b U;
    public static final ae.b V;
    public static final ae.b W;
    public static final ae.b X;

    public Date f46135e;

    public Date f46136f;
    public long h;

    public long f46137n;

    public int f46138r;

    public int f46139s;
    public float v;

    public zb.d f46140w;

    public double f46141x;

    public double f46142y;

    static {
        ae.a aVar = new ae.a(y.class, "TrackHeaderBox.java");
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
            this.f46135e = x8.b(p2.b.j(byteBuffer));
            this.f46136f = x8.b(p2.b.j(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            p2.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.f46137n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f46135e = x8.b(p2.b.i(byteBuffer));
            this.f46136f = x8.b(p2.b.i(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            p2.b.i(byteBuffer);
            this.f46137n = p2.b.i(byteBuffer);
        }
        p2.b.i(byteBuffer);
        p2.b.i(byteBuffer);
        this.f46138r = p2.b.h(byteBuffer);
        this.f46139s = p2.b.h(byteBuffer);
        this.v = p2.b.g(byteBuffer);
        p2.b.h(byteBuffer);
        this.f46140w = zb.d.a(byteBuffer);
        this.f46141x = p2.b.f(byteBuffer);
        this.f46142y = p2.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        com.google.firebase.messaging.t tVarC = ae.a.c(J, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarC);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(x8.a(this.f46135e));
            byteBuffer.putLong(x8.a(this.f46136f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f46137n);
        } else {
            byteBuffer.putInt((int) x8.a(this.f46135e));
            byteBuffer.putInt((int) x8.a(this.f46136f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f46137n);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        p2.b.p(this.f46138r, byteBuffer);
        p2.b.p(this.f46139s, byteBuffer);
        p2.b.o(byteBuffer, this.v);
        p2.b.p(0, byteBuffer);
        this.f46140w.b(byteBuffer);
        p2.b.n(byteBuffer, this.f46141x);
        p2.b.n(byteBuffer, this.f46142y);
    }

    @Override
    public final long getContentSize() {
        return (e() == 1 ? 36L : 24L) + 60;
    }

    public final String toString() {
        com.google.firebase.messaging.t tVarB = ae.a.b(K, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarB);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        pa.u(ae.a.b(A, this, this));
        sb2.append(this.f46135e);
        sb2.append(";modificationTime=");
        pa.u(ae.a.b(B, this, this));
        sb2.append(this.f46136f);
        sb2.append(";trackId=");
        pa.u(ae.a.b(C, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        pa.u(ae.a.b(D, this, this));
        sb2.append(this.f46137n);
        sb2.append(";layer=");
        pa.u(ae.a.b(E, this, this));
        sb2.append(this.f46138r);
        sb2.append(";alternateGroup=");
        pa.u(ae.a.b(F, this, this));
        sb2.append(this.f46139s);
        sb2.append(";volume=");
        pa.u(ae.a.b(G, this, this));
        sb2.append(this.v);
        sb2.append(";matrix=");
        sb2.append(this.f46140w);
        sb2.append(";width=");
        pa.u(ae.a.b(H, this, this));
        sb2.append(this.f46141x);
        sb2.append(";height=");
        pa.u(ae.a.b(I, this, this));
        sb2.append(this.f46142y);
        sb2.append("]");
        return sb2.toString();
    }
}
