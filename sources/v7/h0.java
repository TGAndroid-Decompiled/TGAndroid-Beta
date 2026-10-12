package v7;
public abstract class h0 {
    public static c0.l a(c0.j jVar) {
        ?? obj = new Object();
        obj.f4100c = new Object();
        c0.l lVar = new c0.l(obj);
        obj.f4099b = lVar;
        obj.f4098a = jVar.getClass();
        try {
            obj.f4098a = jVar.b(obj);
            return lVar;
        } catch (Exception e) {
            lVar.f4103b.l(e);
            return lVar;
        }
    }
}
