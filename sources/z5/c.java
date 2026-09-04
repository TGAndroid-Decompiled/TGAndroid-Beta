package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f50767b = new c(0);
    public final int f50768a;

    public c(int i10) {
        this.f50768a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f50768a) {
            case 0:
                return ((Scope) obj).f4941b.compareTo(((Scope) obj2).f4941b);
            default:
                return ((Scope) obj).f4941b.compareTo(((Scope) obj2).f4941b);
        }
    }
}
