package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f53659b = new c(0);
    public final int f53660a;

    public c(int i10) {
        this.f53660a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f53660a) {
            case 0:
                return ((Scope) obj).f6519b.compareTo(((Scope) obj2).f6519b);
            default:
                return ((Scope) obj).f6519b.compareTo(((Scope) obj2).f6519b);
        }
    }
}
