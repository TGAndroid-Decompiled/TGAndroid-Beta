package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f50758b = new c(0);
    public final int f50759a;

    public c(int i10) {
        this.f50759a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f50759a) {
            case 0:
                return ((Scope) obj).f6343b.compareTo(((Scope) obj2).f6343b);
            default:
                return ((Scope) obj).f6343b.compareTo(((Scope) obj2).f6343b);
        }
    }
}
