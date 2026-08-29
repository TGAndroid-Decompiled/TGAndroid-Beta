package qa;

import j7.l1;
public class b1 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p10 = aVar.p();
            if (p10 <= 255 && p10 >= -128) {
                return Byte.valueOf((byte) p10);
            }
            StringBuilder o10 = l1.o(p10, "Lossy conversion from ", " to byte; at path ");
            o10.append(aVar.j());
            throw new RuntimeException(o10.toString());
        } catch (NumberFormatException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.o(number.byteValue());
        }
    }
}
