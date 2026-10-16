package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f49328b = new c(0);
    public final int f49329a;

    public c(int i10) {
        this.f49329a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f49329a) {
            case 0:
                return ((Scope) obj).f4884b.compareTo(((Scope) obj2).f4884b);
            default:
                return ((Scope) obj).f4884b.compareTo(((Scope) obj2).f4884b);
        }
    }
}
