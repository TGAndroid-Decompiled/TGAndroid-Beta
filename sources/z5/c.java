package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f50713b = new c(0);
    public final int f50714a;

    public c(int i10) {
        this.f50714a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f50714a) {
            case 0:
                return ((Scope) obj).f6340b.compareTo(((Scope) obj2).f6340b);
            default:
                return ((Scope) obj).f6340b.compareTo(((Scope) obj2).f6340b);
        }
    }
}
