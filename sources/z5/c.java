package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f48420b = new c(0);
    public final int f48421a;

    public c(int i10) {
        this.f48421a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f48421a) {
            case 0:
                return ((Scope) obj).f6001b.compareTo(((Scope) obj2).f6001b);
            default:
                return ((Scope) obj).f6001b.compareTo(((Scope) obj2).f6001b);
        }
    }
}
