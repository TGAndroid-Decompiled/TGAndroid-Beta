package sc;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class o extends x {
    public static final byte[] f48008e = {0, 0, -1, -1};
    public int f48009c;
    public c5.b0 d;

    public static byte[] a(byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: sc.o.a(byte[]):byte[]");
    }

    public final byte[] b(byte[] bArr) {
        int i10 = this.f48009c;
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
                throw new w(42, v.i("Failed to compress the message: ", e7.getMessage()), e7);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        c5.b0 b0Var = new c5.b0(bArr.length + 4, 8);
        b0Var.n(bArr);
        b0Var.n(f48008e);
        if (this.d == null) {
            this.d = new c5.b0(0, 8);
        }
        c5.b0 b0Var2 = this.d;
        int i10 = b0Var2.f4202b;
        try {
            c.a(b0Var, b0Var2);
            c5.b0 b0Var3 = this.d;
            byte[] r10 = b0Var3.r(i10, b0Var3.f4202b);
            c5.b0 b0Var4 = this.d;
            if (((ByteBuffer) b0Var4.f4203c).capacity() > 0) {
                int i11 = b0Var4.f4202b;
                byte[] r11 = b0Var4.r(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(r11);
                b0Var4.f4203c = wrap;
                wrap.position(r11.length);
                b0Var4.f4202b = r11.length;
            }
            return r10;
        } catch (Exception e7) {
            throw new w(43, v.i("Failed to decompress the message: ", e7.getMessage()), e7);
        }
    }
}
