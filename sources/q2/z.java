package q2;

import java.nio.ByteBuffer;
import org.telegram.ui.Cells.j2;
public final class z extends a {
    public static final zd.b h;
    public static final zd.b f45979n;
    public static final zd.b f45980r;
    public int f45981e;
    public int[] f45982f;

    static {
        zd.a aVar = new zd.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f45979n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f45980r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f45981e = p2.b.h(byteBuffer);
        this.f45982f = new int[3];
        for (int i9 = 0; i9 < 3; i9++) {
            this.f45982f[i9] = p2.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        p2.b.p(this.f45981e, byteBuffer);
        for (int i9 : this.f45982f) {
            p2.b.p(i9, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = zd.a.b(f45980r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        j2.t(zd.a.b(h, this, this));
        sb2.append(this.f45981e);
        sb2.append(";opcolor0=");
        zd.b bVar = f45979n;
        j2.t(zd.a.b(bVar, this, this));
        sb2.append(this.f45982f[0]);
        sb2.append(";opcolor1=");
        j2.t(zd.a.b(bVar, this, this));
        sb2.append(this.f45982f[1]);
        sb2.append(";opcolor2=");
        j2.t(zd.a.b(bVar, this, this));
        return aa.d.l(this.f45982f[2], "]", sb2);
    }
}
