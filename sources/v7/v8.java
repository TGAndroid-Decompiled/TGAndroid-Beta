package v7;
public abstract class v8 {
    public static jd.f a(jd.f fVar, jd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static jd.h b(jd.f fVar, jd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return jd.i.f14129a;
        }
        return fVar;
    }

    public static jd.h c(jd.f fVar, jd.h context) {
        kotlin.jvm.internal.i.e(context, "context");
        if (context == jd.i.f14129a) {
            return fVar;
        }
        return (jd.h) context.fold(fVar, new b1.e(5));
    }
}
