package xc;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.i;
public final class a extends ByteArrayOutputStream {
    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        i.d(buf, "buf");
        return buf;
    }
}
