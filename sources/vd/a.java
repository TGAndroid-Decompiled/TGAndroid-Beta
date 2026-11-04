package vd;

import k2.p1;
import kotlin.jvm.internal.j;
import x7.m5;
public final class a implements Comparable {
    public static final long f56556b;
    public static final long f56557c;
    public static final int d = 0;
    public final long f56558a;

    static {
        int i3 = b.f56559a;
        f56556b = m5.a(4611686018427387903L);
        f56557c = m5.a(-4611686018427387903L);
    }

    public static final void a(StringBuilder sb2, int i3, int i10, int i11, String str, boolean z10) {
        CharSequence charSequence;
        sb2.append(i3);
        if (i10 != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(i10);
            j.e(valueOf, "<this>");
            if (i11 >= 0) {
                if (i11 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb3 = new StringBuilder(i11);
                    int length = i11 - valueOf.length();
                    int i12 = 1;
                    if (1 <= length) {
                        while (true) {
                            sb3.append('0');
                            if (i12 == length) {
                                break;
                            }
                            i12++;
                        }
                    }
                    sb3.append((CharSequence) valueOf);
                    charSequence = sb3;
                }
                String obj = charSequence.toString();
                int i13 = -1;
                int length2 = obj.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i14 = length2 - 1;
                        if (obj.charAt(length2) != '0') {
                            i13 = length2;
                            break;
                        } else if (i14 < 0) {
                            break;
                        } else {
                            length2 = i14;
                        }
                    }
                }
                int i15 = i13 + 1;
                if (!z10 && i15 < 3) {
                    sb2.append((CharSequence) obj, 0, i15);
                } else {
                    sb2.append((CharSequence) obj, 0, ((i13 + 3) / 3) * 3);
                }
            } else {
                throw new IllegalArgumentException(p1.j(i11, "Desired length ", " is less than zero."));
            }
        }
        sb2.append(str);
    }

    public static int b(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i3 = (((int) j10) & 1) - (((int) j11) & 1);
            if (j10 < 0) {
                return -i3;
            }
            return i3;
        }
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 != 0) {
            return 1;
        }
        return 0;
    }

    public static final boolean c(long j10) {
        if (j10 != f56556b && j10 != f56557c) {
            return false;
        }
        return true;
    }

    public static final long d(long j10, c unit) {
        c sourceUnit;
        j.e(unit, "unit");
        if (j10 == f56556b) {
            return Long.MAX_VALUE;
        }
        if (j10 == f56557c) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        if ((((int) j10) & 1) == 0) {
            sourceUnit = c.f56560b;
        } else {
            sourceUnit = c.f56561c;
        }
        j.e(sourceUnit, "sourceUnit");
        return unit.f56565a.convert(j11, sourceUnit.f56565a);
    }

    @Override
    public final int compareTo(Object obj) {
        return b(this.f56558a, ((a) obj).f56558a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f56558a != ((a) obj).f56558a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f56558a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        boolean z10;
        int d10;
        long j10;
        int d11;
        int d12;
        int i3;
        long j11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j12 = this.f56558a;
        int i16 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i16 == 0) {
            return "0s";
        }
        if (j12 == f56556b) {
            return "Infinity";
        }
        if (j12 == f56557c) {
            return "-Infinity";
        }
        if (i16 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (i16 < 0) {
            j12 = (((int) j12) & 1) + ((-(j12 >> 1)) << 1);
            int i17 = b.f56559a;
        }
        long d13 = d(j12, c.h);
        if (c(j12)) {
            d10 = 0;
        } else {
            d10 = (int) (d(j12, c.f56563f) % 24);
        }
        if (c(j12)) {
            j10 = 0;
            d11 = 0;
        } else {
            j10 = 0;
            d11 = (int) (d(j12, c.f56562e) % 60);
        }
        if (c(j12)) {
            d12 = 0;
        } else {
            d12 = (int) (d(j12, c.d) % 60);
        }
        if (c(j12)) {
            i3 = 1;
            i10 = 0;
        } else {
            if ((((int) j12) & 1) == 1) {
                i3 = 1;
                j11 = ((j12 >> 1) % 1000) * 1000000;
            } else {
                i3 = 1;
                j11 = (j12 >> 1) % 1000000000;
            }
            i10 = (int) j11;
        }
        if (d13 != j10) {
            i11 = i3;
        } else {
            i11 = 0;
        }
        if (d10 != 0) {
            i12 = i3;
        } else {
            i12 = 0;
        }
        if (d11 != 0) {
            i13 = i3;
        } else {
            i13 = 0;
        }
        if (d12 == 0 && i10 == 0) {
            i14 = 0;
        } else {
            i14 = i3;
        }
        if (i11 != 0) {
            sb2.append(d13);
            sb2.append('d');
            i15 = i3;
        } else {
            i15 = 0;
        }
        if (i12 != 0 || (i11 != 0 && (i13 != 0 || i14 != 0))) {
            int i18 = i15 + 1;
            if (i15 > 0) {
                sb2.append(' ');
            }
            sb2.append(d10);
            sb2.append('h');
            i15 = i18;
        }
        if (i13 != 0 || (i14 != 0 && (i12 != 0 || i11 != 0))) {
            int i19 = i15 + 1;
            if (i15 > 0) {
                sb2.append(' ');
            }
            sb2.append(d11);
            sb2.append('m');
            i15 = i19;
        }
        if (i14 != 0) {
            int i20 = i15 + 1;
            if (i15 > 0) {
                sb2.append(' ');
            }
            if (d12 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
                if (i10 >= 1000000) {
                    a(sb2, i10 / 1000000, i10 % 1000000, 6, "ms", false);
                } else if (i10 >= 1000) {
                    a(sb2, i10 / 1000, i10 % 1000, 3, "us", false);
                } else {
                    sb2.append(i10);
                    sb2.append("ns");
                }
            } else {
                a(sb2, d12, i10, 9, "s", false);
            }
            i15 = i20;
        }
        if (z10 && i15 > i3) {
            sb2.insert(i3, '(').append(')');
        }
        return sb2.toString();
    }
}
