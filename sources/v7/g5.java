package v7;
public abstract class g5 {
    public static cd.f a(cd.f fVar, cd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static cd.h b(cd.f fVar, cd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return cd.i.f4123a;
        }
        return fVar;
    }

    public static cd.h c(cd.f fVar, cd.h context) {
        kotlin.jvm.internal.i.e(context, "context");
        if (context == cd.i.f4123a) {
            return fVar;
        }
        return (cd.h) context.fold(fVar, new b1.e(3));
    }
}
