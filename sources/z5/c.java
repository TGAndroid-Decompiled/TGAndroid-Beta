package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f52445b = new c(0);
    public final int f52446a;

    public c(int i10) {
        this.f52446a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f52446a) {
            case 0:
                return ((Scope) obj).f6468b.compareTo(((Scope) obj2).f6468b);
            default:
                return ((Scope) obj).f6468b.compareTo(((Scope) obj2).f6468b);
        }
    }
}
