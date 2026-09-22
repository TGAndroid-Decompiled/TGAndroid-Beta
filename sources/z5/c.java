package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f48153b = new c(0);
    public final int f48154a;

    public c(int i10) {
        this.f48154a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f48154a) {
            case 0:
                return ((Scope) obj).f6015b.compareTo(((Scope) obj2).f6015b);
            default:
                return ((Scope) obj).f6015b.compareTo(((Scope) obj2).f6015b);
        }
    }
}
