package rc;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class o extends w {
    public static final byte[] f54463e = {0, 0, -1, -1};
    public int f54464c;
    public f5.u d;

    public static byte[] a(byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: rc.o.a(byte[]):byte[]");
    }

    public final byte[] b(byte[] bArr) {
        int i7 = this.f54464c;
        if (i7 == 32768 || bArr.length < i7) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Deflater deflater = new Deflater(-1, true);
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                deflaterOutputStream.write(bArr, 0, bArr.length);
                deflaterOutputStream.close();
                deflater.end();
                return a(byteArrayOutputStream.toByteArray());
            } catch (Exception e10) {
                throw new v(42, rf.b.i("Failed to compress the message: ", e10.getMessage()), e10);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        f5.u uVar = new f5.u(bArr.length + 4, 14);
        uVar.r(bArr);
        uVar.r(f54463e);
        if (this.d == null) {
            this.d = new f5.u(0, 14);
        }
        f5.u uVar2 = this.d;
        int i7 = uVar2.f11190b;
        try {
            c.a(uVar, uVar2);
            f5.u uVar3 = this.d;
            byte[] w10 = uVar3.w(i7, uVar3.f11190b);
            f5.u uVar4 = this.d;
            if (((ByteBuffer) uVar4.f11191c).capacity() > 0) {
                int i10 = uVar4.f11190b;
                byte[] w11 = uVar4.w(i10, i10);
                ByteBuffer wrap = ByteBuffer.wrap(w11);
                uVar4.f11191c = wrap;
                wrap.position(w11.length);
                uVar4.f11190b = w11.length;
            }
            return w10;
        } catch (Exception e10) {
            throw new v(43, rf.b.i("Failed to decompress the message: ", e10.getMessage()), e10);
        }
    }
}
