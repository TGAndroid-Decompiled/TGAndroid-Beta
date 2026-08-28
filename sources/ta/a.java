package ta;

import j$.util.Objects;
import j3.r0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
public class a implements Closeable {
    public final Reader f47745a;
    public long f47750n;
    public int f47751r;
    public String f47752s;
    public int[] v;
    public String[] f47754x;
    public int[] f47755y;
    public final char[] f47746b = new char[1024];
    public int f47747c = 0;
    public int d = 0;
    public int f47748e = 0;
    public int f47749f = 0;
    public int h = 0;
    public int f47753w = 1;

    static {
        wa.a.f48783c = new wa.a(22);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.v = iArr;
        iArr[0] = 6;
        this.f47754x = new String[32];
        this.f47755y = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f47745a = reader;
    }

    public final void A(char c10) {
        do {
            int i9 = this.f47747c;
            int i10 = this.d;
            while (i9 < i10) {
                int i11 = i9 + 1;
                char c11 = this.f47746b[i9];
                if (c11 == c10) {
                    this.f47747c = i11;
                    return;
                } else if (c11 == '\\') {
                    this.f47747c = i11;
                    z();
                    i9 = this.f47747c;
                    i10 = this.d;
                } else {
                    if (c11 == '\n') {
                        this.f47748e++;
                        this.f47749f = i11;
                    }
                    i9 = i11;
                }
            }
            this.f47747c = i9;
        } while (g(1));
        D("Unterminated string");
        throw null;
    }

    public final void B() {
        throw new UnsupportedOperationException("Method not decompiled: ta.a.B():void");
    }

    public void C() {
        int i9 = 0;
        do {
            int i10 = this.h;
            if (i10 == 0) {
                i10 = d();
            }
            switch (i10) {
                case 1:
                    y(3);
                    i9++;
                    break;
                case 2:
                    if (i9 == 0) {
                        this.f47754x[this.f47753w - 1] = null;
                    }
                    this.f47753w--;
                    i9--;
                    break;
                case 3:
                    y(1);
                    i9++;
                    break;
                case 4:
                    this.f47753w--;
                    i9--;
                    break;
                case 8:
                    A('\'');
                    break;
                case 9:
                    A('\"');
                    break;
                case 10:
                    B();
                    break;
                case 12:
                    A('\'');
                    if (i9 == 0) {
                        this.f47754x[this.f47753w - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    A('\"');
                    if (i9 == 0) {
                        this.f47754x[this.f47753w - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    B();
                    if (i9 == 0) {
                        this.f47754x[this.f47753w - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.f47747c += this.f47751r;
                    break;
                case 17:
                    return;
            }
            this.h = 0;
        } while (i9 > 0);
        int[] iArr = this.f47755y;
        int i11 = this.f47753w - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void D(String str) {
        StringBuilder n10 = e2.c.n(str);
        n10.append(m());
        n10.append("\nSee ");
        n10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new IOException(n10.toString());
    }

    public final IllegalStateException E(String str) {
        String str2;
        if (x() == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        StringBuilder t10 = aa.d.t("Expected ", str, " but was ");
        t10.append(b.k(x()));
        t10.append(m());
        t10.append("\nSee ");
        t10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(t10.toString());
    }

    public void a() {
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 == 3) {
            y(1);
            this.f47755y[this.f47753w - 1] = 0;
            this.h = 0;
            return;
        }
        throw E("BEGIN_ARRAY");
    }

    public void b() {
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 == 1) {
            y(3);
            this.h = 0;
            return;
        }
        throw E("BEGIN_OBJECT");
    }

    public final void c() {
        D("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    @Override
    public void close() {
        this.h = 0;
        this.v[0] = 8;
        this.f47753w = 1;
        this.f47745a.close();
    }

    public final int d() {
        throw new UnsupportedOperationException("Method not decompiled: ta.a.d():int");
    }

    public void e() {
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 == 4) {
            int i10 = this.f47753w;
            this.f47753w = i10 - 1;
            int[] iArr = this.f47755y;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.h = 0;
            return;
        }
        throw E("END_ARRAY");
    }

    public void f() {
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 == 2) {
            int i10 = this.f47753w;
            int i11 = i10 - 1;
            this.f47753w = i11;
            this.f47754x[i11] = null;
            int[] iArr = this.f47755y;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.h = 0;
            return;
        }
        throw E("END_OBJECT");
    }

    public final boolean g(int i9) {
        int i10;
        int i11;
        int i12 = this.f47749f;
        int i13 = this.f47747c;
        this.f47749f = i12 - i13;
        int i14 = this.d;
        char[] cArr = this.f47746b;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.d = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.d = 0;
        }
        this.f47747c = 0;
        do {
            int i16 = this.d;
            int read = this.f47745a.read(cArr, i16, cArr.length - i16);
            if (read == -1) {
                return false;
            }
            i10 = this.d + read;
            this.d = i10;
            if (this.f47748e == 0 && (i11 = this.f47749f) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f47747c++;
                this.f47749f = i11 + 1;
                i9++;
                continue;
            }
        } while (i10 < i9);
        return true;
    }

    public String h() {
        return i(false);
    }

    public final String i(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i9 = 0;
        while (true) {
            int i10 = this.f47753w;
            if (i9 < i10) {
                int i11 = this.v[i9];
                switch (i11) {
                    case 1:
                    case 2:
                        int i12 = this.f47755y[i9];
                        if (z10 && i12 > 0 && i9 == i10 - 1) {
                            i12--;
                        }
                        sb2.append('[');
                        sb2.append(i12);
                        sb2.append(']');
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb2.append('.');
                        String str = this.f47754x[i9];
                        if (str == null) {
                            break;
                        } else {
                            sb2.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError(r0.l(i11, "Unknown scope value: "));
                }
                i9++;
            } else {
                return sb2.toString();
            }
        }
    }

    public String j() {
        return i(true);
    }

    public boolean k() {
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 != 2 && i9 != 4 && i9 != 17) {
            return true;
        }
        return false;
    }

    public final boolean l(char c10) {
        if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
            if (c10 != '#') {
                if (c10 != ',') {
                    if (c10 != '/' && c10 != '=') {
                        if (c10 != '{' && c10 != '}' && c10 != ':') {
                            if (c10 != ';') {
                                switch (c10) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            c();
            throw null;
        }
        return false;
    }

    final String m() {
        StringBuilder o6 = e2.c.o(" at line ", this.f47748e + 1, " column ", (this.f47747c - this.f47749f) + 1, " path ");
        o6.append(h());
        return o6.toString();
    }

    public boolean n() {
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 == 5) {
            this.h = 0;
            int[] iArr = this.f47755y;
            int i10 = this.f47753w - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        } else if (i9 == 6) {
            this.h = 0;
            int[] iArr2 = this.f47755y;
            int i11 = this.f47753w - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        } else {
            throw E("a boolean");
        }
    }

    public double o() {
        char c10;
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 == 15) {
            this.h = 0;
            int[] iArr = this.f47755y;
            int i10 = this.f47753w - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f47750n;
        }
        if (i9 == 16) {
            this.f47752s = new String(this.f47746b, this.f47747c, this.f47751r);
            this.f47747c += this.f47751r;
        } else if (i9 != 8 && i9 != 9) {
            if (i9 == 10) {
                this.f47752s = w();
            } else if (i9 != 11) {
                throw E("a double");
            }
        } else {
            if (i9 == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.f47752s = u(c10);
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f47752s);
        if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
            this.f47752s = null;
            this.h = 0;
            int[] iArr2 = this.f47755y;
            int i11 = this.f47753w - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return parseDouble;
        }
        D("JSON forbids NaN and infinities: " + parseDouble);
        throw null;
    }

    public int p() {
        char c10;
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 == 15) {
            long j10 = this.f47750n;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.h = 0;
                int[] iArr = this.f47755y;
                int i11 = this.f47753w - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f47750n + m());
        }
        if (i9 == 16) {
            this.f47752s = new String(this.f47746b, this.f47747c, this.f47751r);
            this.f47747c += this.f47751r;
        } else if (i9 != 8 && i9 != 9 && i9 != 10) {
            throw E("an int");
        } else {
            if (i9 == 10) {
                this.f47752s = w();
            } else {
                if (i9 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f47752s = u(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.f47752s);
                this.h = 0;
                int[] iArr2 = this.f47755y;
                int i12 = this.f47753w - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f47752s);
        int i13 = (int) parseDouble;
        if (i13 == parseDouble) {
            this.f47752s = null;
            this.h = 0;
            int[] iArr3 = this.f47755y;
            int i14 = this.f47753w - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        }
        throw new NumberFormatException("Expected an int but was " + this.f47752s + m());
    }

    public long q() {
        char c10;
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 == 15) {
            this.h = 0;
            int[] iArr = this.f47755y;
            int i10 = this.f47753w - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f47750n;
        }
        if (i9 == 16) {
            this.f47752s = new String(this.f47746b, this.f47747c, this.f47751r);
            this.f47747c += this.f47751r;
        } else if (i9 != 8 && i9 != 9 && i9 != 10) {
            throw E("a long");
        } else {
            if (i9 == 10) {
                this.f47752s = w();
            } else {
                if (i9 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f47752s = u(c10);
            }
            try {
                long parseLong = Long.parseLong(this.f47752s);
                this.h = 0;
                int[] iArr2 = this.f47755y;
                int i11 = this.f47753w - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f47752s);
        long j10 = (long) parseDouble;
        if (j10 == parseDouble) {
            this.f47752s = null;
            this.h = 0;
            int[] iArr3 = this.f47755y;
            int i12 = this.f47753w - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.f47752s + m());
    }

    public String r() {
        String u10;
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 == 14) {
            u10 = w();
        } else if (i9 == 12) {
            u10 = u('\'');
        } else if (i9 == 13) {
            u10 = u('\"');
        } else {
            throw E("a name");
        }
        this.h = 0;
        this.f47754x[this.f47753w - 1] = u10;
        return u10;
    }

    public final int s(boolean z10) {
        int i9 = this.f47747c;
        int i10 = this.d;
        while (true) {
            if (i9 == i10) {
                this.f47747c = i9;
                if (!g(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m());
                }
                i9 = this.f47747c;
                i10 = this.d;
            }
            int i11 = i9 + 1;
            char c10 = this.f47746b[i9];
            if (c10 == '\n') {
                this.f47748e++;
                this.f47749f = i11;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f47747c = i11;
                    if (i11 == i10) {
                        this.f47747c = i9;
                        boolean g10 = g(2);
                        this.f47747c++;
                        if (!g10) {
                            return c10;
                        }
                    }
                    c();
                    throw null;
                } else if (c10 != '#') {
                    this.f47747c = i11;
                    return c10;
                } else {
                    this.f47747c = i11;
                    c();
                    throw null;
                }
            }
            i9 = i11;
        }
    }

    public void t() {
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 == 7) {
            this.h = 0;
            int[] iArr = this.f47755y;
            int i10 = this.f47753w - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw E("null");
    }

    public String toString() {
        return getClass().getSimpleName() + m();
    }

    public final java.lang.String u(char r11) {
        throw new UnsupportedOperationException("Method not decompiled: ta.a.u(char):java.lang.String");
    }

    public String v() {
        String str;
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        if (i9 == 10) {
            str = w();
        } else if (i9 == 8) {
            str = u('\'');
        } else if (i9 == 9) {
            str = u('\"');
        } else if (i9 == 11) {
            str = this.f47752s;
            this.f47752s = null;
        } else if (i9 == 15) {
            str = Long.toString(this.f47750n);
        } else if (i9 == 16) {
            str = new String(this.f47746b, this.f47747c, this.f47751r);
            this.f47747c += this.f47751r;
        } else {
            throw E("a string");
        }
        this.h = 0;
        int[] iArr = this.f47755y;
        int i10 = this.f47753w - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final java.lang.String w() {
        throw new UnsupportedOperationException("Method not decompiled: ta.a.w():java.lang.String");
    }

    public int x() {
        int i9 = this.h;
        if (i9 == 0) {
            i9 = d();
        }
        switch (i9) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void y(int i9) {
        int i10 = this.f47753w;
        int[] iArr = this.v;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.v = Arrays.copyOf(iArr, i11);
            this.f47755y = Arrays.copyOf(this.f47755y, i11);
            this.f47754x = (String[]) Arrays.copyOf(this.f47754x, i11);
        }
        int[] iArr2 = this.v;
        int i12 = this.f47753w;
        this.f47753w = i12 + 1;
        iArr2[i12] = i9;
    }

    public final char z() {
        int i9;
        if (this.f47747c == this.d && !g(1)) {
            D("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f47747c;
        int i11 = i10 + 1;
        this.f47747c = i11;
        char[] cArr = this.f47746b;
        char c10 = cArr[i10];
        if (c10 != '\n') {
            if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
                if (c10 != 'b') {
                    if (c10 != 'f') {
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 != 'r') {
                            if (c10 != 't') {
                                if (c10 == 'u') {
                                    if (i10 + 5 > this.d && !g(4)) {
                                        D("Unterminated escape sequence");
                                        throw null;
                                    }
                                    int i12 = this.f47747c;
                                    int i13 = i12 + 4;
                                    int i14 = 0;
                                    while (i12 < i13) {
                                        char c11 = cArr[i12];
                                        int i15 = i14 << 4;
                                        if (c11 >= '0' && c11 <= '9') {
                                            i9 = c11 - '0';
                                        } else if (c11 >= 'a' && c11 <= 'f') {
                                            i9 = c11 - 'W';
                                        } else if (c11 >= 'A' && c11 <= 'F') {
                                            i9 = c11 - '7';
                                        } else {
                                            D("Malformed Unicode escape \\u".concat(new String(cArr, this.f47747c, 4)));
                                            throw null;
                                        }
                                        i14 = i9 + i15;
                                        i12++;
                                    }
                                    this.f47747c += 4;
                                    return (char) i14;
                                }
                                D("Invalid escape sequence");
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return c10;
        }
        this.f47748e++;
        this.f47749f = i11;
        return c10;
    }
}
