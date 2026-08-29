package qa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
public final class d implements na.v {
    public final int f46524a;
    public final oc.i f46525b;

    public d(int i10, oc.i iVar) {
        this.f46524a = i10;
        this.f46525b = iVar;
    }

    @Override
    public final na.u create(na.g gVar, ua.a aVar) {
        Type[] actualTypeArguments;
        na.u uVar;
        int i10 = this.f46524a;
        oc.i iVar = this.f46525b;
        Type type = Object.class;
        switch (i10) {
            case 0:
                Type type2 = aVar.f49164b;
                Class cls = aVar.f49163a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                pa.d.b(Collection.class.isAssignableFrom(cls));
                Type j10 = pa.d.j(type2, cls, pa.d.g(type2, cls, Collection.class), new HashMap());
                if (j10 instanceof ParameterizedType) {
                    type = ((ParameterizedType) j10).getActualTypeArguments()[0];
                }
                return new c(gVar, type, gVar.b(new ua.a(type)), iVar.d2(aVar));
            default:
                Type type3 = aVar.f49164b;
                Class cls2 = aVar.f49163a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    pa.d.b(Map.class.isAssignableFrom(cls2));
                    Type j11 = pa.d.j(type3, cls2, pa.d.g(type3, cls2, Map.class), new HashMap());
                    actualTypeArguments = j11 instanceof ParameterizedType ? ((ParameterizedType) j11).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    uVar = gVar.b(new ua.a(type4));
                } else {
                    uVar = h1.f46533c;
                }
                na.u b10 = gVar.b(new ua.a(actualTypeArguments[1]));
                pa.m d22 = iVar.d2(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], uVar, typeArr[1], b10, d22);
        }
    }
}
