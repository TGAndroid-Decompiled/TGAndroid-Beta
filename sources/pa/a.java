package pa;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public class a implements ma.v {
    @Override
    public final ma.u create(ma.g gVar, ta.a aVar) {
        Type type = aVar.f48152b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new b(gVar, gVar.b(new ta.a(genericComponentType)), oa.d.h(genericComponentType));
    }
}
