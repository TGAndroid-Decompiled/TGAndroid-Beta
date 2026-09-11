package v7;

import java.io.Serializable;
public abstract class v6 {
    public static d9.j a(d9.j jVar) {
        if (!(jVar instanceof d9.l)) {
            if (jVar instanceof d9.k) {
                return jVar;
            }
            if (jVar instanceof Serializable) {
                return new d9.k(jVar);
            }
            return new d9.l(jVar);
        }
        return jVar;
    }
}
