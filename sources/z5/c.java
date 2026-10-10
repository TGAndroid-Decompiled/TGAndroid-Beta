package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f53616b = new c(0);
    public final int f53617a;

    public c(int i10) {
        this.f53617a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f53617a) {
            case 0:
                return ((Scope) obj).f6520b.compareTo(((Scope) obj2).f6520b);
            default:
                return ((Scope) obj).f6520b.compareTo(((Scope) obj2).f6520b);
        }
    }
}
