package tc;

import c5.c0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class o extends w {
    public static final byte[] e = {0, 0, -1, -1};
    public int f45590c;
    public c0 d;

    public static byte[] a(byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: tc.o.a(byte[]):byte[]");
    }

    public final byte[] b(byte[] bArr) {
        int i10 = this.f45590c;
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
                throw new v(42, t8.b.h("Failed to compress the message: ", e7.getMessage()), e7);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        c0 c0Var = new c0(bArr.length + 4, 10);
        c0Var.m(bArr);
        c0Var.m(e);
        if (this.d == null) {
            this.d = new c0(0, 10);
        }
        c0 c0Var2 = this.d;
        int i10 = c0Var2.f4355b;
        try {
            c.a(c0Var, c0Var2);
            c0 c0Var3 = this.d;
            byte[] r10 = c0Var3.r(i10, c0Var3.f4355b);
            c0 c0Var4 = this.d;
            if (((ByteBuffer) c0Var4.f4356c).capacity() > 0) {
                int i11 = c0Var4.f4355b;
                byte[] r11 = c0Var4.r(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(r11);
                c0Var4.f4356c = wrap;
                wrap.position(r11.length);
                c0Var4.f4355b = r11.length;
            }
            return r10;
        } catch (Exception e7) {
            throw new v(43, t8.b.h("Failed to decompress the message: ", e7.getMessage()), e7);
        }
    }
}
