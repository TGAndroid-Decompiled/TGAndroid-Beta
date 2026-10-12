package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f49329b = new c(0);
    public final int f49330a;

    public c(int i10) {
        this.f49330a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f49330a) {
            case 0:
                return ((Scope) obj).f4881b.compareTo(((Scope) obj2).f4881b);
            default:
                return ((Scope) obj).f4881b.compareTo(((Scope) obj2).f4881b);
        }
    }
}
