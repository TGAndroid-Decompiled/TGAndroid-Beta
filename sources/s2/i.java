package s2;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.telegram.ui.yh;
public final class i extends com.googlecode.mp4parser.a {
    public static final a3.c d;
    public static final a3.c e;
    public String f43912a;
    public long f43913b;
    public LinkedList f43914c;

    static {
        de.a aVar = new de.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f43912a = r2.b.d(byteBuffer);
        this.f43913b = r2.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f43914c = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.f43914c.add(r2.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(r2.c.d(this.f43912a));
        byteBuffer.putInt((int) this.f43913b);
        for (String str : this.f43914c) {
            byteBuffer.put(r2.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f43914c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileTypeBox[majorBrand=");
        yh.v(de.a.b(d, this, this));
        sb.append(this.f43912a);
        sb.append(";minorVersion=");
        yh.v(de.a.b(e, this, this));
        sb.append(this.f43913b);
        for (String str : this.f43914c) {
            sb.append(";compatibleBrand=");
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }
}
