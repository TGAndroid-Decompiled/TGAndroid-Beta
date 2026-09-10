package zd;
public final class x extends kotlin.jvm.internal.j implements rd.p {
    public static final x f48063c = new x(2, 0);
    public static final x d = new x(2, 1);
    public final int f48064b;

    public x(int i10, int i11) {
        super(i10);
        this.f48064b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48064b) {
            case 0:
                return ((id.h) obj).plus((id.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                id.f fVar = (id.f) obj2;
                return bool;
            default:
                return ((id.h) obj).plus((id.f) obj2);
        }
    }
}
