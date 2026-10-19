package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f50711b = new c(0);
    public final int f50712a;

    public c(int i10) {
        this.f50712a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f50712a) {
            case 0:
                return ((Scope) obj).f6342b.compareTo(((Scope) obj2).f6342b);
            default:
                return ((Scope) obj).f6342b.compareTo(((Scope) obj2).f6342b);
        }
    }
}
