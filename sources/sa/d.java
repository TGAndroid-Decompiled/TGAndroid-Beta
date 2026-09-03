package sa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
public final class d implements pa.v {
    public final int f47195a;
    public final q5.c0 f47196b;

    public d(int i10, q5.c0 c0Var) {
        this.f47195a = i10;
        this.f47196b = c0Var;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Type[] actualTypeArguments;
        pa.u uVar;
        int i10 = this.f47195a;
        q5.c0 c0Var = this.f47196b;
        Type type = Object.class;
        switch (i10) {
            case 0:
                Type type2 = aVar.f49521b;
                Class cls = aVar.f49520a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                ra.d.b(Collection.class.isAssignableFrom(cls));
                Type j10 = ra.d.j(type2, cls, ra.d.g(type2, cls, Collection.class), new HashMap());
                if (j10 instanceof ParameterizedType) {
                    type = ((ParameterizedType) j10).getActualTypeArguments()[0];
                }
                return new c(gVar, type, gVar.b(new wa.a(type)), c0Var.z(aVar));
            default:
                Type type3 = aVar.f49521b;
                Class cls2 = aVar.f49520a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    ra.d.b(Map.class.isAssignableFrom(cls2));
                    Type j11 = ra.d.j(type3, cls2, ra.d.g(type3, cls2, Map.class), new HashMap());
                    actualTypeArguments = j11 instanceof ParameterizedType ? ((ParameterizedType) j11).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    uVar = gVar.b(new wa.a(type4));
                } else {
                    uVar = h1.f47204c;
                }
                pa.u b10 = gVar.b(new wa.a(actualTypeArguments[1]));
                ra.m z4 = c0Var.z(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], uVar, typeArr[1], b10, z4);
        }
    }
}
