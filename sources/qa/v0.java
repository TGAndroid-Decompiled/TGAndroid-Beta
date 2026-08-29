package qa;
public class v0 implements na.v {
    @Override
    public final na.u create(na.g gVar, ua.a aVar) {
        Class cls = aVar.f49163a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new o(cls);
        }
        return null;
    }
}
