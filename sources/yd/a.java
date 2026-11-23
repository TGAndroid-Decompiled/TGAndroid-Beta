package yd;

import c8.he;
import kotlin.jvm.internal.j;
public final class a implements Comparable {
    public static final long f61217b;
    public static final long f61218c;
    public static final int d = 0;
    public final long f61219a;

    static {
        int i7 = b.f61220a;
        f61217b = he.a(4611686018427387903L);
        f61218c = he.a(-4611686018427387903L);
    }

    public static final void a(StringBuilder sb2, int i7, int i10, int i11, String str, boolean z10) {
        CharSequence charSequence;
        sb2.append(i7);
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
                throw new IllegalArgumentException(i5.c.j(i11, "Desired length ", " is less than zero."));
            }
        }
        sb2.append(str);
    }

    public static int b(long j3, long j10) {
        long j11 = j3 ^ j10;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i7 = (((int) j3) & 1) - (((int) j10) & 1);
            if (j3 < 0) {
                return -i7;
            }
            return i7;
        }
        int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 != 0) {
            return 1;
        }
        return 0;
    }

    public static final boolean c(long j3) {
        if (j3 != f61217b && j3 != f61218c) {
            return false;
        }
        return true;
    }

    public static final long d(long j3, c unit) {
        c sourceUnit;
        j.e(unit, "unit");
        if (j3 == f61217b) {
            return Long.MAX_VALUE;
        }
        if (j3 == f61218c) {
            return Long.MIN_VALUE;
        }
        long j10 = j3 >> 1;
        if ((((int) j3) & 1) == 0) {
            sourceUnit = c.f61221b;
        } else {
            sourceUnit = c.f61222c;
        }
        j.e(sourceUnit, "sourceUnit");
        return unit.f61226a.convert(j10, sourceUnit.f61226a);
    }

    @Override
    public final int compareTo(Object obj) {
        return b(this.f61219a, ((a) obj).f61219a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f61219a != ((a) obj).f61219a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f61219a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        boolean z10;
        int d2;
        long j3;
        int d10;
        int d11;
        int i7;
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11 = this.f61219a;
        int i16 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i16 == 0) {
            return "0s";
        }
        if (j11 == f61217b) {
            return "Infinity";
        }
        if (j11 == f61218c) {
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
            j11 = (((int) j11) & 1) + ((-(j11 >> 1)) << 1);
            int i17 = b.f61220a;
        }
        long d12 = d(j11, c.h);
        if (c(j11)) {
            d2 = 0;
        } else {
            d2 = (int) (d(j11, c.f61224f) % 24);
        }
        if (c(j11)) {
            j3 = 0;
            d10 = 0;
        } else {
            j3 = 0;
            d10 = (int) (d(j11, c.f61223e) % 60);
        }
        if (c(j11)) {
            d11 = 0;
        } else {
            d11 = (int) (d(j11, c.d) % 60);
        }
        if (c(j11)) {
            i7 = 1;
            i10 = 0;
        } else {
            if ((((int) j11) & 1) == 1) {
                i7 = 1;
                j10 = ((j11 >> 1) % 1000) * 1000000;
            } else {
                i7 = 1;
                j10 = (j11 >> 1) % 1000000000;
            }
            i10 = (int) j10;
        }
        if (d12 != j3) {
            i11 = i7;
        } else {
            i11 = 0;
        }
        if (d2 != 0) {
            i12 = i7;
        } else {
            i12 = 0;
        }
        if (d10 != 0) {
            i13 = i7;
        } else {
            i13 = 0;
        }
        if (d11 == 0 && i10 == 0) {
            i14 = 0;
        } else {
            i14 = i7;
        }
        if (i11 != 0) {
            sb2.append(d12);
            sb2.append('d');
            i15 = i7;
        } else {
            i15 = 0;
        }
        if (i12 != 0 || (i11 != 0 && (i13 != 0 || i14 != 0))) {
            int i18 = i15 + 1;
            if (i15 > 0) {
                sb2.append(' ');
            }
            sb2.append(d2);
            sb2.append('h');
            i15 = i18;
        }
        if (i13 != 0 || (i14 != 0 && (i12 != 0 || i11 != 0))) {
            int i19 = i15 + 1;
            if (i15 > 0) {
                sb2.append(' ');
            }
            sb2.append(d10);
            sb2.append('m');
            i15 = i19;
        }
        if (i14 != 0) {
            int i20 = i15 + 1;
            if (i15 > 0) {
                sb2.append(' ');
            }
            if (d11 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
                if (i10 >= 1000000) {
                    a(sb2, i10 / 1000000, i10 % 1000000, 6, "ms", false);
                } else if (i10 >= 1000) {
                    a(sb2, i10 / 1000, i10 % 1000, 3, "us", false);
                } else {
                    sb2.append(i10);
                    sb2.append("ns");
                }
            } else {
                a(sb2, d11, i10, 9, "s", false);
            }
            i15 = i20;
        }
        if (z10 && i15 > i7) {
            sb2.insert(i7, '(').append(')');
        }
        return sb2.toString();
    }
}
