package yd;

import kotlin.jvm.internal.i;
public final class a implements Comparable {
    public static final long f46850b;
    public static final long f46851c;
    public static final int d = 0;
    public final long f46852a;

    static {
        int i10 = b.f46853a;
        f46850b = Long.MAX_VALUE;
        f46851c = -9223372036854775805L;
    }

    public static final void a(StringBuilder sb2, int i10, int i11, int i12, String str) {
        CharSequence charSequence;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(i11);
            i.e(valueOf, "<this>");
            if (i12 >= 0) {
                if (i12 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb3 = new StringBuilder(i12);
                    int length = i12 - valueOf.length();
                    int i13 = 1;
                    if (1 <= length) {
                        while (true) {
                            sb3.append('0');
                            if (i13 == length) {
                                break;
                            }
                            i13++;
                        }
                    }
                    sb3.append((CharSequence) valueOf);
                    charSequence = sb3;
                }
                String obj = charSequence.toString();
                int i14 = -1;
                int length2 = obj.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i15 = length2 - 1;
                        if (obj.charAt(length2) != '0') {
                            i14 = length2;
                            break;
                        } else if (i15 < 0) {
                            break;
                        } else {
                            length2 = i15;
                        }
                    }
                }
                int i16 = i14 + 1;
                if (i16 < 3) {
                    sb2.append((CharSequence) obj, 0, i16);
                } else {
                    sb2.append((CharSequence) obj, 0, ((i14 + 3) / 3) * 3);
                }
            } else {
                throw new IllegalArgumentException(hc.b.k(i12, "Desired length ", " is less than zero."));
            }
        }
        sb2.append(str);
    }

    public static final boolean b(long j3) {
        if (j3 != f46850b && j3 != f46851c) {
            return false;
        }
        return true;
    }

    public static final long c(long j3, c unit) {
        c sourceUnit;
        i.e(unit, "unit");
        if (j3 == f46850b) {
            return Long.MAX_VALUE;
        }
        if (j3 == f46851c) {
            return Long.MIN_VALUE;
        }
        long j10 = j3 >> 1;
        if ((((int) j3) & 1) == 0) {
            sourceUnit = c.f46854b;
        } else {
            sourceUnit = c.f46855c;
        }
        i.e(sourceUnit, "sourceUnit");
        return unit.f46858a.convert(j10, sourceUnit.f46858a);
    }

    @Override
    public final int compareTo(Object obj) {
        long j3 = ((a) obj).f46852a;
        long j10 = this.f46852a;
        long j11 = j10 ^ j3;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i10 = (((int) j10) & 1) - (1 & ((int) j3));
            if (j10 < 0) {
                return -i10;
            }
            return i10;
        }
        int i11 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
        if (i11 < 0) {
            return -1;
        }
        if (i11 != 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f46852a != ((a) obj).f46852a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46852a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        boolean z10;
        int c10;
        long j3;
        int c11;
        int c12;
        int i10;
        long j10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        long j11 = this.f46852a;
        int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i13 == 0) {
            return "0s";
        }
        if (j11 == f46850b) {
            return "Infinity";
        }
        if (j11 == f46851c) {
            return "-Infinity";
        }
        if (i13 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (i13 < 0) {
            j11 = (((int) j11) & 1) + ((-(j11 >> 1)) << 1);
            int i14 = b.f46853a;
        }
        long c13 = c(j11, c.h);
        if (b(j11)) {
            c10 = 0;
        } else {
            c10 = (int) (c(j11, c.f46856f) % 24);
        }
        if (b(j11)) {
            j3 = 0;
            c11 = 0;
        } else {
            j3 = 0;
            c11 = (int) (c(j11, c.e) % 60);
        }
        if (b(j11)) {
            c12 = 0;
        } else {
            c12 = (int) (c(j11, c.d) % 60);
        }
        if (b(j11)) {
            i11 = 0;
            i10 = 1;
        } else {
            if ((((int) j11) & 1) == 1) {
                i10 = 1;
                j10 = ((j11 >> 1) % 1000) * 1000000;
            } else {
                i10 = 1;
                j10 = (j11 >> 1) % 1000000000;
            }
            i11 = (int) j10;
        }
        if (c13 != j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c11 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c12 == 0 && i11 == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z11) {
            sb2.append(c13);
            sb2.append('d');
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i15 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(c10);
            sb2.append('h');
            i12 = i15;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i16 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(c11);
            sb2.append('m');
            i12 = i16;
        }
        if (z14) {
            int i17 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            if (c12 == 0 && !z11 && !z12 && !z13) {
                if (i11 >= 1000000) {
                    a(sb2, i11 / 1000000, i11 % 1000000, 6, "ms");
                } else if (i11 >= 1000) {
                    a(sb2, i11 / 1000, i11 % 1000, 3, "us");
                } else {
                    sb2.append(i11);
                    sb2.append("ns");
                }
            } else {
                a(sb2, c12, i11, 9, "s");
            }
            i12 = i17;
        }
        if (z10 && i12 > i10) {
            sb2.insert(i10, '(').append(')');
        }
        return sb2.toString();
    }
}
