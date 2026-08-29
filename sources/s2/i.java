package s2;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.telegram.ui.th;
public final class i extends com.googlecode.mp4parser.a {
    public static final m5.i d;
    public static final m5.i f47493e;
    public String f47494a;
    public long f47495b;
    public LinkedList f47496c;

    static {
        be.a aVar = new be.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        f47493e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f47494a = r2.b.d(byteBuffer);
        this.f47495b = r2.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f47496c = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.f47496c.add(r2.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(r2.c.d(this.f47494a));
        byteBuffer.putInt((int) this.f47495b);
        for (String str : this.f47496c) {
            byteBuffer.put(r2.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f47496c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        th.u(be.a.b(d, this, this));
        sb2.append(this.f47494a);
        sb2.append(";minorVersion=");
        th.u(be.a.b(f47493e, this, this));
        sb2.append(this.f47495b);
        for (String str : this.f47496c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
