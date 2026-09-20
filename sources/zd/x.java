package zd;
public final class x extends kotlin.jvm.internal.j implements rd.p {
    public static final x f49244c = new x(2, 0);
    public static final x d = new x(2, 1);
    public final int f49245b;

    public x(int i10, int i11) {
        super(i10);
        this.f49245b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49245b) {
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
