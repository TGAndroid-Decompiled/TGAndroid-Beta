package sf;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.k0;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_stars;
public final class a {
    public final b f48254a;
    public final long f48255b;

    public a(long j10, b bVar) {
        this.f48254a = bVar;
        this.f48255b = j10;
    }

    public static a g(long j10, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j10 * 1000000000, bVar);
    }

    public static a h(String str, b bVar) {
        try {
            BigDecimal multiply = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000000L));
            if (multiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return i(multiply.longValue(), bVar);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static a i(long j10, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j10, bVar);
    }

    public static a j(double d, b bVar) {
        b bVar2 = b.f48257b;
        if (bVar == bVar2) {
            return new a((long) ((d / ((k0) vp.r1(d20.f15147s0).f18957y7.f17844l.f13480b).f16499a) * 1000000000), bVar2).n(2);
        }
        b bVar3 = b.f48256a;
        if (bVar == bVar3) {
            return new a((long) (((d * 100000.0d) / vp.r1(d20.f15147s0).f18759c6) * 1000000000), bVar3).n(0);
        }
        return g(0L, bVar);
    }

    public static a l(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return i((starsAmount.amount * 1000000000) + starsAmount.nanos, b.f48256a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return i(starsAmount.amount, b.f48257b);
        }
        return null;
    }

    public static a m(TL_stars.StarsAmount starsAmount) {
        a l4 = l(starsAmount);
        if (l4 != null) {
            return l4;
        }
        return i(0L, b.f48256a);
    }

    public final long a() {
        return this.f48255b / 1000000000;
    }

    public final String b() {
        BigDecimal stripTrailingZeros;
        BigDecimal divide = new BigDecimal(this.f48255b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        if (divide.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = divide.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public final double c() {
        return this.f48255b / 1000000000;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder(cd.E(a(), ','));
        long j10 = this.f48255b % 1000000000;
        if (j10 == 0) {
            return sb2.toString();
        }
        sb2.append('.');
        String l4 = Long.toString(j10);
        int length = 9 - l4.length();
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append('0');
        }
        int length2 = l4.length();
        while (length2 > 0 && l4.charAt(length2 - 1) == '0') {
            length2--;
        }
        sb2.append((CharSequence) l4, 0, length2);
        return sb2.toString();
    }

    public final a e(b bVar) {
        double d;
        b bVar2 = this.f48254a;
        if (bVar2 == bVar) {
            return this;
        }
        if (bVar2 == b.f48256a) {
            d = ((c() / 1000.0d) * vp.r1(d20.f15147s0).f18759c6) / 100.0d;
        } else if (bVar2 == b.f48257b) {
            d = c() * ((k0) vp.r1(d20.f15147s0).f18957y7.f17844l.f13480b).f16499a;
        } else {
            d = 0.0d;
        }
        return j(d, bVar);
    }

    public final boolean equals(Object obj) {
        a aVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && (this == (aVar = (a) obj) || (this.f48254a == aVar.f48254a && this.f48255b == aVar.f48255b))) {
            return true;
        }
        return false;
    }

    public final String f() {
        int i10 = ((this.f48255b % 1000000000) > 0L ? 1 : ((this.f48255b % 1000000000) == 0L ? 0 : -1));
        b bVar = this.f48254a;
        if (i10 == 0) {
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return cd.H(' ', "TonCount", (int) a());
                }
                return "";
            }
            return cd.H(' ', "StarsCount", (int) a());
        }
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                return "";
            }
            return cd.a0(null, null, 2131744075, b());
        }
        return cd.a0(null, null, 2131745131, b());
    }

    public final boolean k() {
        if (this.f48255b == 0) {
            return true;
        }
        return false;
    }

    public final a n(int i10) {
        long j10 = 9 - i10;
        if (j10 <= 0) {
            return this;
        }
        long j11 = 1;
        for (int i11 = 0; i11 < j10; i11++) {
            j11 *= 10;
        }
        return i((this.f48255b / j11) * j11, this.f48254a);
    }

    public final TL_stars.StarsAmount o() {
        b bVar = b.f48256a;
        long j10 = this.f48255b;
        b bVar2 = this.f48254a;
        if (bVar2 == bVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j10 / 1000000000;
            tL_starsAmount.nanos = (int) (j10 % 1000000000);
            return tL_starsAmount;
        } else if (bVar2 == b.f48257b) {
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            tL_starsTonAmount.amount = j10;
            return tL_starsTonAmount;
        } else {
            return null;
        }
    }
}
