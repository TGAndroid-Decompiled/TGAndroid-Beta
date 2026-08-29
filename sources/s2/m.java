package s2;

import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.th;
public final class m extends com.googlecode.mp4parser.c {
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
    public int A;
    public int B;
    public int C;
    public int D;
    public Date f47513e;
    public Date f47514f;
    public long h;
    public long f47515n;
    public double f47516r;
    public float f47517s;
    public ac.d v;
    public long f47518w;
    public int f47519x;
    public int f47520y;

    static {
        be.a aVar = new be.a(m.class, "MovieHeaderBox.java");
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
            this.f47513e = h7.p.b(r2.b.j(byteBuffer));
            this.f47514f = h7.p.b(r2.b.j(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.f47515n = r2.b.j(byteBuffer);
        } else {
            this.f47513e = h7.p.b(r2.b.i(byteBuffer));
            this.f47514f = h7.p.b(r2.b.i(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.f47515n = r2.b.i(byteBuffer);
        }
        this.f47516r = r2.b.f(byteBuffer);
        this.f47517s = r2.b.g(byteBuffer);
        r2.b.h(byteBuffer);
        r2.b.i(byteBuffer);
        r2.b.i(byteBuffer);
        this.v = ac.d.a(byteBuffer);
        this.f47519x = byteBuffer.getInt();
        this.f47520y = byteBuffer.getInt();
        this.A = byteBuffer.getInt();
        this.B = byteBuffer.getInt();
        this.C = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.f47518w = r2.b.i(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(h7.p.a(this.f47513e));
            byteBuffer.putLong(h7.p.a(this.f47514f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f47515n);
        } else {
            byteBuffer.putInt((int) h7.p.a(this.f47513e));
            byteBuffer.putInt((int) h7.p.a(this.f47514f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f47515n);
        }
        r2.b.n(byteBuffer, this.f47516r);
        r2.b.o(byteBuffer, this.f47517s);
        r2.b.p(0, byteBuffer);
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        this.v.b(byteBuffer);
        byteBuffer.putInt(this.f47519x);
        byteBuffer.putInt(this.f47520y);
        byteBuffer.putInt(this.A);
        byteBuffer.putInt(this.B);
        byteBuffer.putInt(this.C);
        byteBuffer.putInt(this.D);
        byteBuffer.putInt((int) this.f47518w);
    }

    @Override
    public final long getContentSize() {
        long j10;
        if (e() == 1) {
            j10 = 32;
        } else {
            j10 = 20;
        }
        return j10 + 80;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(L, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        th.u(be.a.b(E, this, this));
        sb2.append(this.f47513e);
        sb2.append(";modificationTime=");
        th.u(be.a.b(F, this, this));
        sb2.append(this.f47514f);
        sb2.append(";timescale=");
        th.u(be.a.b(G, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        th.u(be.a.b(H, this, this));
        sb2.append(this.f47515n);
        sb2.append(";rate=");
        th.u(be.a.b(I, this, this));
        sb2.append(this.f47516r);
        sb2.append(";volume=");
        th.u(be.a.b(J, this, this));
        sb2.append(this.f47517s);
        sb2.append(";matrix=");
        sb2.append(this.v);
        sb2.append(";nextTrackId=");
        th.u(be.a.b(K, this, this));
        return a4.w.p(sb2, this.f47518w, "]");
    }
}
