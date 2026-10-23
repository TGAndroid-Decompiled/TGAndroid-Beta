package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f51183b = new c(0);
    public final int f51184a;

    public c(int i10) {
        this.f51184a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f51184a) {
            case 0:
                return ((Scope) obj).f6352b.compareTo(((Scope) obj2).f6352b);
            default:
                return ((Scope) obj).f6352b.compareTo(((Scope) obj2).f6352b);
        }
    }
}
