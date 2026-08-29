package qa;

import j7.l1;
import java.util.BitSet;
public class w0 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        boolean z10;
        BitSet bitSet = new BitSet();
        aVar.a();
        int x4 = aVar.x();
        int i10 = 0;
        while (x4 != 2) {
            int b10 = m1.j.b(x4);
            if (b10 != 5 && b10 != 6) {
                if (b10 == 7) {
                    z10 = aVar.n();
                } else {
                    throw new RuntimeException("Invalid bitset value type: " + u3.c.m(x4) + "; at path " + aVar.h());
                }
            } else {
                int p10 = aVar.p();
                if (p10 == 0) {
                    z10 = false;
                } else if (p10 == 1) {
                    z10 = true;
                } else {
                    StringBuilder o10 = l1.o(p10, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    o10.append(aVar.j());
                    throw new RuntimeException(o10.toString());
                }
            }
            if (z10) {
                bitSet.set(i10);
            }
            i10++;
            x4 = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.b();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.e();
    }
}
