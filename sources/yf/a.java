package yf;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class a {
    public final b f46926a;
    public final long f46927b;

    public a(long j3, b bVar) {
        this.f46926a = bVar;
        this.f46927b = j3;
    }

    public static a g(long j3, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j3 * 1000000000, bVar);
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

    public static a i(long j3, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j3, bVar);
    }

    public static a j(double d, b bVar) {
        b bVar2 = b.f46929b;
        if (bVar == bVar2) {
            return new a((long) ((d / MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get()) * 1000000000), bVar2).n(2);
        }
        b bVar3 = b.f46928a;
        if (bVar == bVar3) {
            return new a((long) (((d * 100000.0d) / MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000) * 1000000000), bVar3).n(0);
        }
        return g(0L, bVar);
    }

    public static a l(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return i((starsAmount.amount * 1000000000) + starsAmount.nanos, b.f46928a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return i(starsAmount.amount, b.f46929b);
        }
        return null;
    }

    public static a m(TL_stars.StarsAmount starsAmount) {
        a l4 = l(starsAmount);
        if (l4 != null) {
            return l4;
        }
        return i(0L, b.f46928a);
    }

    public final long a() {
        return this.f46927b / 1000000000;
    }

    public final String b() {
        BigDecimal stripTrailingZeros;
        BigDecimal divide = new BigDecimal(this.f46927b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        if (divide.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = divide.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public final double c() {
        return this.f46927b / 1000000000;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder(LocaleController.formatNumber(a(), ','));
        long j3 = this.f46927b % 1000000000;
        if (j3 == 0) {
            return sb2.toString();
        }
        sb2.append('.');
        String l4 = Long.toString(j3);
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
        b bVar2 = this.f46926a;
        if (bVar2 == bVar) {
            return this;
        }
        if (bVar2 == b.f46928a) {
            d = ((c() / 1000.0d) * MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000) / 100.0d;
        } else if (bVar2 == b.f46929b) {
            d = c() * MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get();
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
        if ((obj instanceof a) && (this == (aVar = (a) obj) || (this.f46926a == aVar.f46926a && this.f46927b == aVar.f46927b))) {
            return true;
        }
        return false;
    }

    public final String f() {
        b bVar = this.f46926a;
        if (this.f46927b % 1000000000 == 0) {
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return LocaleController.formatPluralStringSpaced("TonCount", (int) a());
                }
                return "";
            }
            return LocaleController.formatPluralStringSpaced("StarsCount", (int) a());
        }
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                return "";
            }
            return LocaleController.formatString(R.string.TonCountX, b());
        }
        return LocaleController.formatString(R.string.StarsCountX, b());
    }

    public final boolean k() {
        if (this.f46927b == 0) {
            return true;
        }
        return false;
    }

    public final a n(int i10) {
        long j3 = 9 - i10;
        if (j3 <= 0) {
            return this;
        }
        long j10 = 1;
        for (int i11 = 0; i11 < j3; i11++) {
            j10 *= 10;
        }
        return i((this.f46927b / j10) * j10, this.f46926a);
    }

    public final TL_stars.StarsAmount o() {
        b bVar = b.f46928a;
        long j3 = this.f46927b;
        b bVar2 = this.f46926a;
        if (bVar2 == bVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j3 / 1000000000;
            tL_starsAmount.nanos = (int) (j3 % 1000000000);
            return tL_starsAmount;
        } else if (bVar2 == b.f46929b) {
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            tL_starsTonAmount.amount = j3;
            return tL_starsTonAmount;
        } else {
            return null;
        }
    }
}
