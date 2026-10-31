package v7;
public abstract class e5 {
    public static c0.l a(c0.j jVar) {
        ?? obj = new Object();
        obj.f3510c = new Object();
        c0.l lVar = new c0.l(obj);
        obj.f3509b = lVar;
        obj.f3508a = jVar.getClass();
        try {
            obj.f3508a = jVar.d(obj);
            return lVar;
        } catch (Exception e) {
            lVar.f3513b.l(e);
            return lVar;
        }
    }
}
