package sa;

import java.util.BitSet;
import kh.a2;
import vh.v2;
public class w0 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        boolean z4;
        BitSet bitSet = new BitSet();
        aVar.a();
        int x10 = aVar.x();
        int i10 = 0;
        while (x10 != 2) {
            int b10 = m1.j.b(x10);
            if (b10 != 5 && b10 != 6) {
                if (b10 == 7) {
                    z4 = aVar.n();
                } else {
                    throw new RuntimeException("Invalid bitset value type: " + v2.m(x10) + "; at path " + aVar.h());
                }
            } else {
                int p10 = aVar.p();
                if (p10 == 0) {
                    z4 = false;
                } else if (p10 == 1) {
                    z4 = true;
                } else {
                    StringBuilder m9 = a2.m(p10, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    m9.append(aVar.j());
                    throw new RuntimeException(m9.toString());
                }
            }
            if (z4) {
                bitSet.set(i10);
            }
            i10++;
            x10 = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.b();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.e();
    }
}
