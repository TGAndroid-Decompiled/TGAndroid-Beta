package q2;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.telegram.ui.Cells.j2;
public final class i extends com.googlecode.mp4parser.a {
    public static final zd.b d;
    public static final zd.b f45922e;
    public String f45923a;
    public long f45924b;
    public LinkedList f45925c;

    static {
        zd.a aVar = new zd.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        f45922e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f45923a = p2.b.d(byteBuffer);
        this.f45924b = p2.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f45925c = new LinkedList();
        for (int i9 = 0; i9 < remaining; i9++) {
            this.f45925c.add(p2.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(p2.c.d(this.f45923a));
        byteBuffer.putInt((int) this.f45924b);
        for (String str : this.f45925c) {
            byteBuffer.put(p2.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f45925c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        j2.t(zd.a.b(d, this, this));
        sb2.append(this.f45923a);
        sb2.append(";minorVersion=");
        j2.t(zd.a.b(f45922e, this, this));
        sb2.append(this.f45924b);
        for (String str : this.f45925c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
