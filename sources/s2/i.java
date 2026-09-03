package s2;

import androidx.biometric.f0;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.telegram.ui.yh;
public final class i extends com.googlecode.mp4parser.a {
    public static final f0 d;
    public static final f0 f46892e;
    public String f46893a;
    public long f46894b;
    public LinkedList f46895c;

    static {
        de.a aVar = new de.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        f46892e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f46893a = r2.b.d(byteBuffer);
        this.f46894b = r2.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f46895c = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.f46895c.add(r2.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(r2.c.d(this.f46893a));
        byteBuffer.putInt((int) this.f46894b);
        for (String str : this.f46895c) {
            byteBuffer.put(r2.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f46895c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileTypeBox[majorBrand=");
        yh.x(de.a.b(d, this, this));
        sb.append(this.f46893a);
        sb.append(";minorVersion=");
        yh.x(de.a.b(f46892e, this, this));
        sb.append(this.f46894b);
        for (String str : this.f46895c) {
            sb.append(";compatibleBrand=");
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }
}
