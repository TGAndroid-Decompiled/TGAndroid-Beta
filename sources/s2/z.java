package s2;

import java.nio.ByteBuffer;
import org.telegram.ui.yh;
public final class z extends a {
    public static final a3.c h;
    public static final a3.c f43959n;
    public static final a3.c f43960r;
    public int e;
    public int[] f43961f;

    static {
        de.a aVar = new de.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f43959n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f43960r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = r2.b.h(byteBuffer);
        this.f43961f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f43961f[i10] = r2.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        r2.b.p(this.e, byteBuffer);
        for (int i10 : this.f43961f) {
            r2.b.p(i10, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.r b10 = de.a.b(f43960r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        yh.v(de.a.b(h, this, this));
        sb.append(this.e);
        sb.append(";opcolor0=");
        a3.c cVar = f43959n;
        yh.v(de.a.b(cVar, this, this));
        sb.append(this.f43961f[0]);
        sb.append(";opcolor1=");
        yh.v(de.a.b(cVar, this, this));
        sb.append(this.f43961f[1]);
        sb.append(";opcolor2=");
        yh.v(de.a.b(cVar, this, this));
        return android.support.v4.media.a.m(this.f43961f[2], "]", sb);
    }
}
