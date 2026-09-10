package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f47276b = new c(0);
    public final int f47277a;

    public c(int i10) {
        this.f47277a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f47277a) {
            case 0:
                return ((Scope) obj).f4792b.compareTo(((Scope) obj2).f4792b);
            default:
                return ((Scope) obj).f4792b.compareTo(((Scope) obj2).f4792b);
        }
    }
}
