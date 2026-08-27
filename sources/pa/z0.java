package pa;

import java.io.IOException;

public class z0 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        int iX = aVar.x();
        if (iX != 9) {
            return iX == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.v())) : Boolean.valueOf(aVar.n());
        }
        aVar.t();
        return null;
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        bVar.p((Boolean) obj);
    }
}
