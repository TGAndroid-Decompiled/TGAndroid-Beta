package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f53796b = new c(0);
    public final int f53797a;

    public c(int i10) {
        this.f53797a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f53797a) {
            case 0:
                return ((Scope) obj).f6518b.compareTo(((Scope) obj2).f6518b);
            default:
                return ((Scope) obj).f6518b.compareTo(((Scope) obj2).f6518b);
        }
    }
}
