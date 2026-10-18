package tc;

import c5.b0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class o extends w {
    public static final byte[] e = {0, 0, -1, -1};
    public int f46999c;
    public b0 d;

    public static byte[] a(byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: tc.o.a(byte[]):byte[]");
    }

    public final byte[] b(byte[] bArr) {
        int i10 = this.f46999c;
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
        b0 b0Var = new b0(bArr.length + 4, 10);
        b0Var.q(bArr);
        b0Var.q(e);
        if (this.d == null) {
            this.d = new b0(0, 10);
        }
        b0 b0Var2 = this.d;
        int i10 = b0Var2.f4703b;
        try {
            c.a(b0Var, b0Var2);
            b0 b0Var3 = this.d;
            byte[] w9 = b0Var3.w(i10, b0Var3.f4703b);
            b0 b0Var4 = this.d;
            if (((ByteBuffer) b0Var4.f4704c).capacity() > 0) {
                int i11 = b0Var4.f4703b;
                byte[] w10 = b0Var4.w(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(w10);
                b0Var4.f4704c = wrap;
                wrap.position(w10.length);
                b0Var4.f4703b = w10.length;
            }
            return w9;
        } catch (Exception e7) {
            throw new v(43, r4.c.h("Failed to decompress the message: ", e7.getMessage()), e7);
        }
    }
}
