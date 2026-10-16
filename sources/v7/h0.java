package v7;
public abstract class h0 {
    public static c0.l a(c0.j jVar) {
        ?? obj = new Object();
        obj.f4104c = new Object();
        c0.l lVar = new c0.l(obj);
        obj.f4103b = lVar;
        obj.f4102a = jVar.getClass();
        try {
            obj.f4102a = jVar.b(obj);
            return lVar;
        } catch (Exception e) {
            lVar.f4107b.l(e);
            return lVar;
        }
    }
}
