package xh;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d1 implements Predicate {
    public final int f53744a;
    public final Object f53745b;

    public d1(Object obj, int i10) {
        this.f53744a = i10;
        this.f53745b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f53744a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f53744a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f53744a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.f53744a) {
            case 0:
                contains = ((HashSet) this.f53745b).contains(Long.valueOf(((f1) obj).f53776b));
                break;
            case 1:
                contains = ((HashSet) this.f53745b).contains(Long.valueOf(((f1) obj).f53776b));
                break;
            default:
                ph.l1 l1Var = (ph.l1) this.f53745b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = l1Var.S1.disallow_unique_stargifts;
                } else {
                    l1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = l1Var.S1;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z10 = l1Var.S1.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
