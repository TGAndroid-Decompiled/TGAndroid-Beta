package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f54647b = new c(0);
    public final int f54648a;

    public c(int i10) {
        this.f54648a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f54648a) {
            case 0:
                return ((Scope) obj).f4330b.compareTo(((Scope) obj2).f4330b);
            default:
                return ((Scope) obj).f4330b.compareTo(((Scope) obj2).f4330b);
        }
    }
}
