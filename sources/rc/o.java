package rc;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public final class o extends w {
    public static final byte[] f55947e = {0, 0, -1, -1};
    public int f55948c;
    public f5.v d;

    public static byte[] a(byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: rc.o.a(byte[]):byte[]");
    }

    public final byte[] b(byte[] bArr) {
        int i7 = this.f55948c;
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
                throw new v(42, r.b.k("Failed to compress the message: ", e10.getMessage()), e10);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        f5.v vVar = new f5.v(bArr.length + 4, 14);
        vVar.r(bArr);
        vVar.r(f55947e);
        if (this.d == null) {
            this.d = new f5.v(0, 14);
        }
        f5.v vVar2 = this.d;
        int i7 = vVar2.f11018b;
        try {
            c.a(vVar, vVar2);
            f5.v vVar3 = this.d;
            byte[] v = vVar3.v(i7, vVar3.f11018b);
            f5.v vVar4 = this.d;
            if (((ByteBuffer) vVar4.f11019c).capacity() > 0) {
                int i10 = vVar4.f11018b;
                byte[] v10 = vVar4.v(i10, i10);
                ByteBuffer wrap = ByteBuffer.wrap(v10);
                vVar4.f11019c = wrap;
                wrap.position(v10.length);
                vVar4.f11018b = v10.length;
            }
            return v;
        } catch (Exception e10) {
            throw new v(43, r.b.k("Failed to decompress the message: ", e10.getMessage()), e10);
        }
    }
}
