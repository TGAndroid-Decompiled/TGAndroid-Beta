package sa;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
public class a implements pa.v {
    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Type componentType;
        Type type = aVar.f46588b;
        boolean z4 = type instanceof GenericArrayType;
        if (!z4 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z4) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new b(gVar, gVar.b(new wa.a(componentType)), ra.d.h(componentType));
    }
}
