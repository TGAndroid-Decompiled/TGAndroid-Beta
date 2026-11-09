package p3;

import c8.ca;
import d4.f;
import e2.q0;
import h2.x;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
public final class b extends ca {
    public final int f53172a;

    public static q3.a c(x xVar) {
        String v = xVar.v();
        v.getClass();
        String v10 = xVar.v();
        v10.getClass();
        return new q3.a(v, v10, xVar.u(), xVar.u(), Arrays.copyOfRange(xVar.f14162a, xVar.f14163b, xVar.f14164c));
    }

    @Override
    public final q0 b(o3.a aVar, ByteBuffer byteBuffer) {
        switch (this.f53172a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                f fVar = new f(byteBuffer.array(), byteBuffer.limit());
                int i7 = 12;
                fVar.L(12);
                int d = (fVar.d() + fVar.j(12)) - 4;
                fVar.L(44);
                fVar.M(fVar.j(12));
                fVar.L(16);
                ArrayList arrayList = new ArrayList();
                while (fVar.d() < d) {
                    fVar.L(48);
                    int j3 = fVar.j(8);
                    fVar.L(4);
                    int d2 = fVar.d() + fVar.j(i7);
                    String str = null;
                    String str2 = null;
                    while (fVar.d() < d2) {
                        int j10 = fVar.j(8);
                        int j11 = fVar.j(8);
                        int d10 = fVar.d() + j11;
                        if (j10 == 2) {
                            int j12 = fVar.j(16);
                            fVar.L(8);
                            if (j12 == 3) {
                                while (fVar.d() < d10) {
                                    int j13 = fVar.j(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[j13];
                                    fVar.o(j13, bArr);
                                    String str3 = new String(bArr, charset);
                                    int j14 = fVar.j(8);
                                    for (int i10 = 0; i10 < j14; i10++) {
                                        fVar.M(fVar.j(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (j10 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[j11];
                            fVar.o(j11, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        fVar.J(d10 * 8);
                    }
                    fVar.J(d2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(j3, str.concat(str2)));
                    }
                    i7 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new q0(arrayList);
            default:
                return new q0(c(new x(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
