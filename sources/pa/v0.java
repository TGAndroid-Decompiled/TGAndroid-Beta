package pa;

public class v0 implements ma.v {
    @Override
    public final ma.u create(ma.g gVar, ta.a aVar) {
        Class superclass = aVar.f48151a;
        if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
            return null;
        }
        if (!superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        return new o(superclass);
    }
}
