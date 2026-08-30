package wa;

import j$.util.Objects;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import ra.d;
public class a<T> {
    public final Class f46505a;
    public final Type f46506b;
    public final int f46507c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type a2 = d.a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    a(a2);
                }
                this.f46506b = a2;
                this.f46505a = d.h(a2);
                this.f46507c = a2.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static void a(Type type) {
        if (!(type instanceof TypeVariable)) {
            if (type instanceof GenericArrayType) {
                a(((GenericArrayType) type).getGenericComponentType());
                return;
            }
            int i10 = 0;
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType != null) {
                    a(ownerType);
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i10 < length) {
                    a(actualTypeArguments[i10]);
                    i10++;
                }
                return;
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                for (Type type2 : wildcardType.getLowerBounds()) {
                    a(type2);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i10 < length2) {
                    a(upperBounds[i10]);
                    i10++;
                }
                return;
            } else if (type != null) {
                return;
            } else {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
        }
        TypeVariable typeVariable = (TypeVariable) type;
        throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (d.e(this.f46506b, ((a) obj).f46506b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46507c;
    }

    public final String toString() {
        return d.k(this.f46506b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a2 = d.a(type);
        this.f46506b = a2;
        this.f46505a = d.h(a2);
        this.f46507c = a2.hashCode();
    }
}
