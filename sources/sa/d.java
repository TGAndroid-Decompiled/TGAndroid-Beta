package sa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
public final class d implements pa.v {
    public final int f44177a;
    public final q5.g0 f44178b;

    public d(int i10, q5.g0 g0Var) {
        this.f44177a = i10;
        this.f44178b = g0Var;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Type[] actualTypeArguments;
        pa.u uVar;
        int i10 = this.f44177a;
        q5.g0 g0Var = this.f44178b;
        Type type = Object.class;
        switch (i10) {
            case 0:
                Type type2 = aVar.f46506b;
                Class cls = aVar.f46505a;
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
                return new c(gVar, type, gVar.b(new wa.a(type)), g0Var.I(aVar));
            default:
                Type type3 = aVar.f46506b;
                Class cls2 = aVar.f46505a;
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
                    uVar = h1.f44186c;
                }
                pa.u b10 = gVar.b(new wa.a(actualTypeArguments[1]));
                ra.m I = g0Var.I(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], uVar, typeArr[1], b10, I);
        }
    }
}
