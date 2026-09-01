package sa;
public class v0 implements pa.v {
    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Class cls = aVar.f49484a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new o(cls);
        }
        return null;
    }
}
