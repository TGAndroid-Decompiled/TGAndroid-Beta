package q2;

import java.nio.ByteBuffer;
import org.telegram.ui.Cells.pa;

public final class z extends a {
    public static final ae.b h;

    public static final ae.b f46143n;

    public static final ae.b f46144r;

    public int f46145e;

    public int[] f46146f;

    static {
        ae.a aVar = new ae.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f46143n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f46144r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f46145e = p2.b.h(byteBuffer);
        this.f46146f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f46146f[i10] = p2.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        p2.b.p(this.f46145e, byteBuffer);
        for (int i10 : this.f46146f) {
            p2.b.p(i10, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.t tVarB = ae.a.b(f46144r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVarB);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        pa.u(ae.a.b(h, this, this));
        sb2.append(this.f46145e);
        sb2.append(";opcolor0=");
        ae.b bVar = f46143n;
        pa.u(ae.a.b(bVar, this, this));
        sb2.append(this.f46146f[0]);
        sb2.append(";opcolor1=");
        pa.u(ae.a.b(bVar, this, this));
        sb2.append(this.f46146f[1]);
        sb2.append(";opcolor2=");
        pa.u(ae.a.b(bVar, this, this));
        return a9.p.k(this.f46146f[2], "]", sb2);
    }
}
