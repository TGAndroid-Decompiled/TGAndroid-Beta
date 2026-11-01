package td;
public final class x extends kotlin.jvm.internal.j implements ld.p {
    public static final x f48688c = new x(2, 0);
    public static final x d = new x(2, 1);
    public final int f48689b;

    public x(int i10, int i11) {
        super(i10);
        this.f48689b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48689b) {
            case 0:
                return ((cd.h) obj).plus((cd.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                cd.f fVar = (cd.f) obj2;
                return bool;
            default:
                return ((cd.h) obj).plus((cd.f) obj2);
        }
    }
}
