package v7;

import java.io.Serializable;
public abstract class v6 {
    public static d9.i a(d9.i iVar) {
        if (!(iVar instanceof d9.k)) {
            if (iVar instanceof d9.j) {
                return iVar;
            }
            if (iVar instanceof Serializable) {
                return new d9.j(iVar);
            }
            return new d9.k(iVar);
        }
        return iVar;
    }
}
