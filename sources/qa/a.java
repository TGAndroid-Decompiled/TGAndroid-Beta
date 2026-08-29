package qa;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
public class a implements na.v {
    @Override
    public final na.u create(na.g gVar, ua.a aVar) {
        Type componentType;
        Type type = aVar.f49164b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z10) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new b(gVar, gVar.b(new ua.a(componentType)), pa.d.h(componentType));
    }
}
