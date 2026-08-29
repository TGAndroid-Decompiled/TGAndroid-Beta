package vb;

import java.nio.ByteBuffer;
import m5.i;
import org.telegram.ui.th;
public final class b extends a {
    public static final i f49499n;
    public static final i f49500r;

    static {
        be.a aVar = new be.a(b.class, "ESDescriptorBox.java");
        aVar.e(aVar.d("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"));
        aVar.e(aVar.d("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "void"));
        f49499n = aVar.e(aVar.d("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "boolean"));
        f49500r = aVar.e(aVar.d("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "int"));
    }

    public final boolean equals(Object obj) {
        th.u(be.a.c(f49499n, this, this, obj));
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                ByteBuffer byteBuffer = this.f49498e;
                ByteBuffer byteBuffer2 = ((b) obj).f49498e;
                if (byteBuffer != null) {
                    if (byteBuffer.equals(byteBuffer2)) {
                        return true;
                    }
                    return false;
                } else if (byteBuffer2 == null) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        th.u(be.a.b(f49500r, this, this));
        ByteBuffer byteBuffer = this.f49498e;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
