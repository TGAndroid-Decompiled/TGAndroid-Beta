package sa;
public class c1 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p10 = aVar.p();
            if (p10 <= 65535 && p10 >= -32768) {
                return Short.valueOf((short) p10);
            }
            StringBuilder m9 = l.d.m(p10, "Lossy conversion from ", " to short; at path ");
            m9.append(aVar.j());
            throw new RuntimeException(m9.toString());
        } catch (NumberFormatException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.o(number.shortValue());
        }
    }
}
