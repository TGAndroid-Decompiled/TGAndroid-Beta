package v7;

import java.io.Serializable;
public abstract class w6 {
    public static d9.u a(d9.u uVar) {
        if (!(uVar instanceof d9.w)) {
            if (uVar instanceof d9.v) {
                return uVar;
            }
            if (uVar instanceof Serializable) {
                return new d9.v(uVar);
            }
            return new d9.w(uVar);
        }
        return uVar;
    }
}
