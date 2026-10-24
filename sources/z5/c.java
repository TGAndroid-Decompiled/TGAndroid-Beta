package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f51182b = new c(0);
    public final int f51183a;

    public c(int i10) {
        this.f51183a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f51183a) {
            case 0:
                return ((Scope) obj).f6352b.compareTo(((Scope) obj2).f6352b);
            default:
                return ((Scope) obj).f6352b.compareTo(((Scope) obj2).f6352b);
        }
    }
}
