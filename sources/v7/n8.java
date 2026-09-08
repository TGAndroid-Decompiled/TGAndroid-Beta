package v7;
public abstract class n8 {
    public static id.f a(id.f fVar, id.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static id.h b(id.f fVar, id.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return id.i.f11980a;
        }
        return fVar;
    }

    public static id.h c(id.f fVar, id.h context) {
        kotlin.jvm.internal.i.e(context, "context");
        if (context == id.i.f11980a) {
            return fVar;
        }
        return (id.h) context.fold(fVar, new b1.e(5));
    }
}
