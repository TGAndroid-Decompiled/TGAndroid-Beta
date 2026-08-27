package q2;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import org.telegram.ui.Cells.pa;

public final class i extends com.googlecode.mp4parser.a {
    public static final ae.b d;

    public static final ae.b f46086e;

    public String f46087a;

    public long f46088b;

    public LinkedList f46089c;

    static {
        ae.a aVar = new ae.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        f46086e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f46087a = p2.b.d(byteBuffer);
        this.f46088b = p2.b.i(byteBuffer);
        int iRemaining = byteBuffer.remaining() / 4;
        this.f46089c = new LinkedList();
        for (int i10 = 0; i10 < iRemaining; i10++) {
            this.f46089c.add(p2.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(p2.c.d(this.f46087a));
        byteBuffer.putInt((int) this.f46088b);
        Iterator it = this.f46089c.iterator();
        while (it.hasNext()) {
            byteBuffer.put(p2.c.d((String) it.next()));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46089c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        pa.u(ae.a.b(d, this, this));
        sb2.append(this.f46087a);
        sb2.append(";minorVersion=");
        pa.u(ae.a.b(f46086e, this, this));
        sb2.append(this.f46088b);
        for (String str : this.f46089c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
