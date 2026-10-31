package v7;

import java.io.Serializable;
public abstract class v6 {
    public static d9.t a(d9.t tVar) {
        if (!(tVar instanceof d9.v)) {
            if (tVar instanceof d9.u) {
                return tVar;
            }
            if (tVar instanceof Serializable) {
                return new d9.u(tVar);
            }
            return new d9.v(tVar);
        }
        return tVar;
    }
}
