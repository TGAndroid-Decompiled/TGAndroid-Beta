package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f48414b = new c(0);
    public final int f48415a;

    public c(int i10) {
        this.f48415a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f48415a) {
            case 0:
                return ((Scope) obj).f6018b.compareTo(((Scope) obj2).f6018b);
            default:
                return ((Scope) obj).f6018b.compareTo(((Scope) obj2).f6018b);
        }
    }
}
