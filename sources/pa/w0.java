package pa;

import java.io.IOException;
import java.util.BitSet;

public class w0 extends ma.u {
    @Override
    public final Object read(ua.a aVar) throws IOException {
        boolean zN;
        BitSet bitSet = new BitSet();
        aVar.a();
        int iX = aVar.x();
        int i10 = 0;
        while (iX != 2) {
            int iB = m1.j.b(iX);
            if (iB == 5 || iB == 6) {
                int iP = aVar.p();
                if (iP == 0) {
                    zN = false;
                } else {
                    if (iP != 1) {
                        StringBuilder sbO = i0.a.o(iP, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbO.append(aVar.j());
                        throw new ma.j(sbO.toString());
                    }
                    zN = true;
                }
            } else {
                if (iB != 7) {
                    throw new ma.j("Invalid bitset value type: " + s3.c.n(iX) + "; at path " + aVar.h());
                }
                zN = aVar.n();
            }
            if (zN) {
                bitSet.set(i10);
            }
            i10++;
            iX = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        bVar.b();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.e();
    }
}
