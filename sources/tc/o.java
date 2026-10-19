package tc;

import c5.c0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class o extends w {
    public static final byte[] e = {0, 0, -1, -1};
    public int f46951c;
    public c0 d;

    public static byte[] a(byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: tc.o.a(byte[]):byte[]");
    }

    public final byte[] b(byte[] bArr) {
        int i10 = this.f46951c;
        if (i10 == 32768 || bArr.length < i10) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Deflater deflater = new Deflater(-1, true);
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                deflaterOutputStream.write(bArr, 0, bArr.length);
                deflaterOutputStream.close();
                deflater.end();
                return a(byteArrayOutputStream.toByteArray());
            } catch (Exception e7) {
                throw new v(42, r4.c.h("Failed to compress the message: ", e7.getMessage()), e7);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        c0 c0Var = new c0(bArr.length + 4, 11);
        c0Var.r(bArr);
        c0Var.r(e);
        if (this.d == null) {
            this.d = new c0(0, 11);
        }
        c0 c0Var2 = this.d;
        int i10 = c0Var2.f4723b;
        try {
            c.a(c0Var, c0Var2);
            c0 c0Var3 = this.d;
            byte[] x10 = c0Var3.x(i10, c0Var3.f4723b);
            c0 c0Var4 = this.d;
            if (((ByteBuffer) c0Var4.f4724c).capacity() > 0) {
                int i11 = c0Var4.f4723b;
                byte[] x11 = c0Var4.x(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(x11);
                c0Var4.f4724c = wrap;
                wrap.position(x11.length);
                c0Var4.f4723b = x11.length;
            }
            return x10;
        } catch (Exception e7) {
            throw new v(43, r4.c.h("Failed to decompress the message: ", e7.getMessage()), e7);
        }
    }
}
