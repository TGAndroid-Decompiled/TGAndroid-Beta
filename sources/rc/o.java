package rc;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class o extends w {
    public static final byte[] f56644e = {0, 0, -1, -1};
    public int f56645c;
    public b3.j d;

    public static byte[] a(byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: rc.o.a(byte[]):byte[]");
    }

    public final byte[] b(byte[] bArr) {
        int i7 = this.f56645c;
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
                throw new v(42, p5.c.k("Failed to compress the message: ", e10.getMessage()), e10);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        b3.j jVar = new b3.j(bArr.length + 4, 13);
        jVar.q(bArr);
        jVar.q(f56644e);
        if (this.d == null) {
            this.d = new b3.j(0, 13);
        }
        b3.j jVar2 = this.d;
        int i7 = jVar2.f2873b;
        try {
            c.a(jVar, jVar2);
            b3.j jVar3 = this.d;
            byte[] u10 = jVar3.u(i7, jVar3.f2873b);
            b3.j jVar4 = this.d;
            if (((ByteBuffer) jVar4.f2874c).capacity() > 0) {
                int i10 = jVar4.f2873b;
                byte[] u11 = jVar4.u(i10, i10);
                ByteBuffer wrap = ByteBuffer.wrap(u11);
                jVar4.f2874c = wrap;
                wrap.position(u11.length);
                jVar4.f2873b = u11.length;
            }
            return u10;
        } catch (Exception e10) {
            throw new v(43, p5.c.k("Failed to decompress the message: ", e10.getMessage()), e10);
        }
    }
}
