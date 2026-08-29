package ph;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f1 implements Predicate {
    public final int f45791a;
    public final Object f45792b;

    public f1(Object obj, int i10) {
        this.f45791a = i10;
        this.f45792b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f45791a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f45791a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f45791a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f45791a) {
            case 0:
                contains = ((HashSet) this.f45792b).contains(Long.valueOf(((h1) obj).f45827b));
                break;
            case 1:
                contains = ((HashSet) this.f45792b).contains(Long.valueOf(((h1) obj).f45827b));
                break;
            default:
                ih.h2 h2Var = (ih.h2) this.f45792b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = h2Var.X.disallow_unique_stargifts;
                } else {
                    h2Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = h2Var.X;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = h2Var.X.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
