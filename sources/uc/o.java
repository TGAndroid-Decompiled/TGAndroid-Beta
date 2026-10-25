package uc;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.telegram.ui.Components.b10;
public final class o extends w {
    public static final byte[] e = {0, 0, -1, -1};
    public int f49663c;
    public d5.z d;

    public static byte[] a(byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: uc.o.a(byte[]):byte[]");
    }

    public final byte[] b(byte[] bArr) {
        int i10 = this.f49663c;
        if (i10 == 32768 || bArr.length < i10) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Deflater deflater = new Deflater(-1, true);
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                deflaterOutputStream.write(bArr, 0, bArr.length);
                deflaterOutputStream.close();
                deflater.end();
                return a(byteArrayOutputStream.toByteArray());
            } catch (Exception e10) {
                throw new v(42, b10.j("Failed to compress the message: ", e10.getMessage()), e10);
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr) {
        d5.z zVar = new d5.z(bArr.length + 4, 12);
        zVar.n(bArr);
        zVar.n(e);
        if (this.d == null) {
            this.d = new d5.z(0, 12);
        }
        d5.z zVar2 = this.d;
        int i10 = zVar2.f8026b;
        try {
            c.a(zVar, zVar2);
            d5.z zVar3 = this.d;
            byte[] s10 = zVar3.s(i10, zVar3.f8026b);
            d5.z zVar4 = this.d;
            if (((ByteBuffer) zVar4.f8027c).capacity() > 0) {
                int i11 = zVar4.f8026b;
                byte[] s11 = zVar4.s(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(s11);
                zVar4.f8027c = wrap;
                wrap.position(s11.length);
                zVar4.f8026b = s11.length;
            }
            return s10;
        } catch (Exception e10) {
            throw new v(43, b10.j("Failed to decompress the message: ", e10.getMessage()), e10);
        }
    }
}
