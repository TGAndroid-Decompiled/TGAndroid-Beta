package s2;

import java.nio.ByteBuffer;
import org.telegram.ui.th;
public final class z extends a {
    public static final m5.i h;
    public static final m5.i f47550n;
    public static final m5.i f47551r;
    public int f47552e;
    public int[] f47553f;

    static {
        be.a aVar = new be.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f47550n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f47551r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f47552e = r2.b.h(byteBuffer);
        this.f47553f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f47553f[i10] = r2.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        r2.b.p(this.f47552e, byteBuffer);
        for (int i10 : this.f47553f) {
            r2.b.p(i10, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(f47551r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        th.u(be.a.b(h, this, this));
        sb2.append(this.f47552e);
        sb2.append(";opcolor0=");
        m5.i iVar = f47550n;
        th.u(be.a.b(iVar, this, this));
        sb2.append(this.f47553f[0]);
        sb2.append(";opcolor1=");
        th.u(be.a.b(iVar, this, this));
        sb2.append(this.f47553f[1]);
        sb2.append(";opcolor2=");
        th.u(be.a.b(iVar, this, this));
        return a4.w.l(this.f47553f[2], "]", sb2);
    }
}
