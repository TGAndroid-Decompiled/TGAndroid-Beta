package rh;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g1 implements Predicate {
    public final int f43526a;
    public final Object f43527b;

    public g1(Object obj, int i10) {
        this.f43526a = i10;
        this.f43527b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f43526a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f43526a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f43526a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z4;
        switch (this.f43526a) {
            case 0:
                contains = ((HashSet) this.f43527b).contains(Long.valueOf(((i1) obj).f43560b));
                break;
            case 1:
                contains = ((HashSet) this.f43527b).contains(Long.valueOf(((i1) obj).f43560b));
                break;
            default:
                kh.h2 h2Var = (kh.h2) this.f43527b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z4 = h2Var.Y.disallow_unique_stargifts;
                } else {
                    h2Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = h2Var.Y;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z4 = h2Var.Y.disallow_unlimited_stargifts;
                }
                return true ^ z4;
        }
        return !contains;
    }
}
