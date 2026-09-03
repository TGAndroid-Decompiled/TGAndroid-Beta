package rh;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f1 implements Predicate {
    public final int f43578a;
    public final Object f43579b;

    public f1(Object obj, int i10) {
        this.f43578a = i10;
        this.f43579b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f43578a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f43578a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f43578a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        boolean z4;
        switch (this.f43578a) {
            case 0:
                contains = ((HashSet) this.f43579b).contains(Long.valueOf(((h1) obj).f43612b));
                break;
            case 1:
                contains = ((HashSet) this.f43579b).contains(Long.valueOf(((h1) obj).f43612b));
                break;
            default:
                kh.g2 g2Var = (kh.g2) this.f43579b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z4 = g2Var.Y.disallow_unique_stargifts;
                } else {
                    g2Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = g2Var.Y;
                        if (!disallowedGiftsSettings.disallow_limited_stargifts) {
                            return true;
                        }
                        if (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts) {
                            return true;
                        }
                        return false;
                    }
                    z4 = g2Var.Y.disallow_unlimited_stargifts;
                }
                return true ^ z4;
        }
        return !contains;
    }
}
