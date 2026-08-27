package pa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class d implements ma.v {

    public final int f45617a;

    public final g5.b f45618b;

    public d(g5.b bVar, int i10) {
        this.f45617a = i10;
        this.f45618b = bVar;
    }

    @Override
    public final ma.u create(ma.g gVar, ta.a aVar) {
        Type[] actualTypeArguments;
        int i10 = this.f45617a;
        g5.b bVar = this.f45618b;
        Type type = Object.class;
        switch (i10) {
            case 0:
                Type type2 = aVar.f48152b;
                Class cls = aVar.f48151a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                oa.d.b(Collection.class.isAssignableFrom(cls));
                Type typeJ = oa.d.j(type2, cls, oa.d.g(type2, cls, Collection.class), new HashMap());
                type = typeJ instanceof ParameterizedType ? ((ParameterizedType) typeJ).getActualTypeArguments()[0] : Object.class;
                return new c(gVar, type, gVar.b(new ta.a(type)), bVar.l(aVar));
            default:
                Type type3 = aVar.f48152b;
                Class cls2 = aVar.f48151a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    oa.d.b(Map.class.isAssignableFrom(cls2));
                    Type typeJ2 = oa.d.j(type3, cls2, oa.d.g(type3, cls2, Map.class), new HashMap());
                    actualTypeArguments = typeJ2 instanceof ParameterizedType ? ((ParameterizedType) typeJ2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                ma.u uVarB = (type4 == Boolean.TYPE || type4 == Boolean.class) ? h1.f45626c : gVar.b(new ta.a(type4));
                ma.u uVarB2 = gVar.b(new ta.a(actualTypeArguments[1]));
                oa.m mVarL = bVar.l(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], uVarB, typeArr[1], uVarB2, mVarL);
        }
    }
}
