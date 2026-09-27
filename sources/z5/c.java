package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f48475b = new c(0);
    public final int f48476a;

    public c(int i10) {
        this.f48476a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f48476a) {
            case 0:
                return ((Scope) obj).f6002b.compareTo(((Scope) obj2).f6002b);
            default:
                return ((Scope) obj).f6002b.compareTo(((Scope) obj2).f6002b);
        }
    }
}
