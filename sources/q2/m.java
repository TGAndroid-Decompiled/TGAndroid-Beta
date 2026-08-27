package q2;

import h7.x8;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Cells.pa;

public final class m extends com.googlecode.mp4parser.c {
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
    public int A;
    public int B;
    public int C;
    public int D;

    public Date f46106e;

    public Date f46107f;
    public long h;

    public long f46108n;

    public double f46109r;

    public float f46110s;
    public zb.d v;

    public long f46111w;

    public int f46112x;

    public int f46113y;

    static {
        ae.a aVar = new ae.a(m.class, "MovieHeaderBox.java");
        E = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        F = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        N = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "void"));
        O = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "void"));
        P = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "void"));
        aVar.e(aVar.d("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "void"));
        aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "void"));
        Q = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        R = aVar.e(aVar.d("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "void"));
        aVar.e(aVar.d("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "void"));
        aVar.e(aVar.d("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        G = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        aVar.e(aVar.d("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "void"));
        aVar.e(aVar.d("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "void"));
        aVar.e(aVar.d("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "void"));
        aVar.e(aVar.d("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "void"));
        aVar.e(aVar.d("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "void"));
        H = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        I = aVar.e(aVar.d("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "double"));
        J = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        K = aVar.e(aVar.d("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        L = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.lang.String"));
        M = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.f46106e = x8.b(p2.b.j(byteBuffer));
            this.f46107f = x8.b(p2.b.j(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            this.f46108n = p2.b.j(byteBuffer);
        } else {
            this.f46106e = x8.b(p2.b.i(byteBuffer));
            this.f46107f = x8.b(p2.b.i(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            this.f46108n = p2.b.i(byteBuffer);
        }
        this.f46109r = p2.b.f(byteBuffer);
        this.f46110s = p2.b.g(byteBuffer);
        p2.b.h(byteBuffer);
        p2.b.i(byteBuffer);
        p2.b.i(byteBuffer);
        this.v = zb.d.a(byteBuffer);
        this.f46112x = byteBuffer.getInt();
        this.f46113y = byteBuffer.getInt();
        this.A = byteBuffer.getInt();
        this.B = byteBuffer.getInt();
        this.C = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.f46111w = p2.b.i(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(x8.a(this.f46106e));
            byteBuffer.putLong(x8.a(this.f46107f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f46108n);
        } else {
            byteBuffer.putInt((int) x8.a(this.f46106e));
            byteBuffer.putInt((int) x8.a(this.f46107f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f46108n);
        }
        p2.b.n(byteBuffer, this.f46109r);
        p2.b.o(byteBuffer, this.f46110s);
        p2.b.p(0, byteBuffer);
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        this.v.b(byteBuffer);
        byteBuffer.putInt(this.f46112x);
        byteBuffer.putInt(this.f46113y);
        byteBuffer.putInt(this.A);
        byteBuffer.putInt(this.B);
        byteBuffer.putInt(this.C);
        byteBuffer.putInt(this.D);
        byteBuffer.putInt((int) this.f46111w);
    }

    @Override
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 80;
    }

    public final String toString() {
        com.google.firebase.messaging.t tVarB = ae.a.b(L, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarB);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        pa.u(ae.a.b(E, this, this));
        sb2.append(this.f46106e);
        sb2.append(";modificationTime=");
        pa.u(ae.a.b(F, this, this));
        sb2.append(this.f46107f);
        sb2.append(";timescale=");
        pa.u(ae.a.b(G, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        pa.u(ae.a.b(H, this, this));
        sb2.append(this.f46108n);
        sb2.append(";rate=");
        pa.u(ae.a.b(I, this, this));
        sb2.append(this.f46109r);
        sb2.append(";volume=");
        pa.u(ae.a.b(J, this, this));
        sb2.append(this.f46110s);
        sb2.append(";matrix=");
        sb2.append(this.v);
        sb2.append(";nextTrackId=");
        pa.u(ae.a.b(K, this, this));
        return a9.p.o(sb2, this.f46111w, "]");
    }
}
