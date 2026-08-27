package pa;

import java.io.IOException;

public class b1 extends ma.u {
    @Override
    public final Object read(ua.a aVar) throws IOException {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int iP = aVar.p();
            if (iP <= 255 && iP >= -128) {
                return Byte.valueOf((byte) iP);
            }
            StringBuilder sbO = i0.a.o(iP, "Lossy conversion from ", " to byte; at path ");
            sbO.append(aVar.j());
            throw new ma.j(sbO.toString());
        } catch (NumberFormatException e9) {
            throw new ma.j(e9);
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.o(number.byteValue());
        }
    }
}
