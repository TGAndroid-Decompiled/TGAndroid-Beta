package xa;

import j$.util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import kf.k0;
import vh.w2;
public class a implements Closeable {
    public final Reader f46934a;
    public long f46938n;
    public int f46939r;
    public String f46940s;
    public int[] v;
    public String[] f46942x;
    public int[] f46943y;
    public final char[] f46935b = new char[1024];
    public int f46936c = 0;
    public int d = 0;
    public int e = 0;
    public int f46937f = 0;
    public int h = 0;
    public int f46941w = 1;

    static {
        ab.a.f146b = new ab.a(25);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.v = iArr;
        iArr[0] = 6;
        this.f46942x = new String[32];
        this.f46943y = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f46934a = reader;
    }

    public final void A(char c3) {
        do {
            int i10 = this.f46936c;
            int i11 = this.d;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c10 = this.f46935b[i10];
                if (c10 == c3) {
                    this.f46936c = i12;
                    return;
                } else if (c10 == '\\') {
                    this.f46936c = i12;
                    z();
                    i10 = this.f46936c;
                    i11 = this.d;
                } else {
                    if (c10 == '\n') {
                        this.e++;
                        this.f46937f = i12;
                    }
                    i10 = i12;
                }
            }
            this.f46936c = i10;
        } while (g(1));
        D("Unterminated string");
        throw null;
    }

    public final void B() {
        throw new UnsupportedOperationException("Method not decompiled: xa.a.B():void");
    }

    public void C() {
        int i10 = 0;
        do {
            int i11 = this.h;
            if (i11 == 0) {
                i11 = d();
            }
            switch (i11) {
                case 1:
                    y(3);
                    i10++;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f46942x[this.f46941w - 1] = null;
                    }
                    this.f46941w--;
                    i10--;
                    break;
                case 3:
                    y(1);
                    i10++;
                    break;
                case 4:
                    this.f46941w--;
                    i10--;
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
                    if (i10 == 0) {
                        this.f46942x[this.f46941w - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    A('\"');
                    if (i10 == 0) {
                        this.f46942x[this.f46941w - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    B();
                    if (i10 == 0) {
                        this.f46942x[this.f46941w - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.f46936c += this.f46939r;
                    break;
                case 17:
                    return;
            }
            this.h = 0;
        } while (i10 > 0);
        int[] iArr = this.f46943y;
        int i12 = this.f46941w - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public final void D(String str) {
        StringBuilder l10 = e2.c.l(str);
        l10.append(m());
        l10.append("\nSee ");
        l10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new IOException(l10.toString());
    }

    public final IllegalStateException E(String str) {
        String str2;
        if (x() == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        StringBuilder t6 = android.support.v4.media.a.t("Expected ", str, " but was ");
        t6.append(w2.m(x()));
        t6.append(m());
        t6.append("\nSee ");
        t6.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(t6.toString());
    }

    public void a() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 3) {
            y(1);
            this.f46943y[this.f46941w - 1] = 0;
            this.h = 0;
            return;
        }
        throw E("BEGIN_ARRAY");
    }

    public void b() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 1) {
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
        this.f46941w = 1;
        this.f46934a.close();
    }

    public final int d() {
        throw new UnsupportedOperationException("Method not decompiled: xa.a.d():int");
    }

    public void e() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 4) {
            int i11 = this.f46941w;
            this.f46941w = i11 - 1;
            int[] iArr = this.f46943y;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.h = 0;
            return;
        }
        throw E("END_ARRAY");
    }

    public void f() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 2) {
            int i11 = this.f46941w;
            int i12 = i11 - 1;
            this.f46941w = i12;
            this.f46942x[i12] = null;
            int[] iArr = this.f46943y;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.h = 0;
            return;
        }
        throw E("END_OBJECT");
    }

    public final boolean g(int i10) {
        int i11;
        int i12;
        int i13 = this.f46937f;
        int i14 = this.f46936c;
        this.f46937f = i13 - i14;
        int i15 = this.d;
        char[] cArr = this.f46935b;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.d = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.d = 0;
        }
        this.f46936c = 0;
        do {
            int i17 = this.d;
            int read = this.f46934a.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.d + read;
            this.d = i11;
            if (this.e == 0 && (i12 = this.f46937f) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f46936c++;
                this.f46937f = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    public String h() {
        return i(false);
    }

    public final String i(boolean z4) {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f46941w;
            if (i10 < i11) {
                int i12 = this.v[i10];
                switch (i12) {
                    case 1:
                    case 2:
                        int i13 = this.f46943y[i10];
                        if (z4 && i13 > 0 && i10 == i11 - 1) {
                            i13--;
                        }
                        sb.append('[');
                        sb.append(i13);
                        sb.append(']');
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb.append('.');
                        String str = this.f46942x[i10];
                        if (str == null) {
                            break;
                        } else {
                            sb.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError(k0.j(i12, "Unknown scope value: "));
                }
                i10++;
            } else {
                return sb.toString();
            }
        }
    }

    public String j() {
        return i(true);
    }

    public boolean k() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 != 2 && i10 != 4 && i10 != 17) {
            return true;
        }
        return false;
    }

    public final boolean l(char c3) {
        if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
            if (c3 != '#') {
                if (c3 != ',') {
                    if (c3 != '/' && c3 != '=') {
                        if (c3 != '{' && c3 != '}' && c3 != ':') {
                            if (c3 != ';') {
                                switch (c3) {
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
        StringBuilder m9 = e2.c.m(" at line ", this.e + 1, " column ", (this.f46936c - this.f46937f) + 1, " path ");
        m9.append(h());
        return m9.toString();
    }

    public boolean n() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 5) {
            this.h = 0;
            int[] iArr = this.f46943y;
            int i11 = this.f46941w - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.h = 0;
            int[] iArr2 = this.f46943y;
            int i12 = this.f46941w - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw E("a boolean");
        }
    }

    public double o() {
        char c3;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 15) {
            this.h = 0;
            int[] iArr = this.f46943y;
            int i11 = this.f46941w - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f46938n;
        }
        if (i10 == 16) {
            this.f46940s = new String(this.f46935b, this.f46936c, this.f46939r);
            this.f46936c += this.f46939r;
        } else if (i10 != 8 && i10 != 9) {
            if (i10 == 10) {
                this.f46940s = w();
            } else if (i10 != 11) {
                throw E("a double");
            }
        } else {
            if (i10 == 8) {
                c3 = '\'';
            } else {
                c3 = '\"';
            }
            this.f46940s = u(c3);
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f46940s);
        if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
            this.f46940s = null;
            this.h = 0;
            int[] iArr2 = this.f46943y;
            int i12 = this.f46941w - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        D("JSON forbids NaN and infinities: " + parseDouble);
        throw null;
    }

    public int p() {
        char c3;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 15) {
            long j10 = this.f46938n;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.h = 0;
                int[] iArr = this.f46943y;
                int i12 = this.f46941w - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f46938n + m());
        }
        if (i10 == 16) {
            this.f46940s = new String(this.f46935b, this.f46936c, this.f46939r);
            this.f46936c += this.f46939r;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw E("an int");
        } else {
            if (i10 == 10) {
                this.f46940s = w();
            } else {
                if (i10 == 8) {
                    c3 = '\'';
                } else {
                    c3 = '\"';
                }
                this.f46940s = u(c3);
            }
            try {
                int parseInt = Integer.parseInt(this.f46940s);
                this.h = 0;
                int[] iArr2 = this.f46943y;
                int i13 = this.f46941w - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f46940s);
        int i14 = (int) parseDouble;
        if (i14 == parseDouble) {
            this.f46940s = null;
            this.h = 0;
            int[] iArr3 = this.f46943y;
            int i15 = this.f46941w - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f46940s + m());
    }

    public long q() {
        char c3;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 15) {
            this.h = 0;
            int[] iArr = this.f46943y;
            int i11 = this.f46941w - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f46938n;
        }
        if (i10 == 16) {
            this.f46940s = new String(this.f46935b, this.f46936c, this.f46939r);
            this.f46936c += this.f46939r;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw E("a long");
        } else {
            if (i10 == 10) {
                this.f46940s = w();
            } else {
                if (i10 == 8) {
                    c3 = '\'';
                } else {
                    c3 = '\"';
                }
                this.f46940s = u(c3);
            }
            try {
                long parseLong = Long.parseLong(this.f46940s);
                this.h = 0;
                int[] iArr2 = this.f46943y;
                int i12 = this.f46941w - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f46940s);
        long j10 = (long) parseDouble;
        if (j10 == parseDouble) {
            this.f46940s = null;
            this.h = 0;
            int[] iArr3 = this.f46943y;
            int i13 = this.f46941w - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.f46940s + m());
    }

    public String r() {
        String u10;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 14) {
            u10 = w();
        } else if (i10 == 12) {
            u10 = u('\'');
        } else if (i10 == 13) {
            u10 = u('\"');
        } else {
            throw E("a name");
        }
        this.h = 0;
        this.f46942x[this.f46941w - 1] = u10;
        return u10;
    }

    public final int s(boolean z4) {
        int i10 = this.f46936c;
        int i11 = this.d;
        while (true) {
            if (i10 == i11) {
                this.f46936c = i10;
                if (!g(1)) {
                    if (!z4) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m());
                }
                i10 = this.f46936c;
                i11 = this.d;
            }
            int i12 = i10 + 1;
            char c3 = this.f46935b[i10];
            if (c3 == '\n') {
                this.e++;
                this.f46937f = i12;
            } else if (c3 != ' ' && c3 != '\r' && c3 != '\t') {
                if (c3 == '/') {
                    this.f46936c = i12;
                    if (i12 == i11) {
                        this.f46936c = i10;
                        boolean g10 = g(2);
                        this.f46936c++;
                        if (!g10) {
                            return c3;
                        }
                    }
                    c();
                    throw null;
                } else if (c3 != '#') {
                    this.f46936c = i12;
                    return c3;
                } else {
                    this.f46936c = i12;
                    c();
                    throw null;
                }
            }
            i10 = i12;
        }
    }

    public void t() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 7) {
            this.h = 0;
            int[] iArr = this.f46943y;
            int i11 = this.f46941w - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw E("null");
    }

    public String toString() {
        return getClass().getSimpleName() + m();
    }

    public final java.lang.String u(char r11) {
        throw new UnsupportedOperationException("Method not decompiled: xa.a.u(char):java.lang.String");
    }

    public String v() {
        String str;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 10) {
            str = w();
        } else if (i10 == 8) {
            str = u('\'');
        } else if (i10 == 9) {
            str = u('\"');
        } else if (i10 == 11) {
            str = this.f46940s;
            this.f46940s = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f46938n);
        } else if (i10 == 16) {
            str = new String(this.f46935b, this.f46936c, this.f46939r);
            this.f46936c += this.f46939r;
        } else {
            throw E("a string");
        }
        this.h = 0;
        int[] iArr = this.f46943y;
        int i11 = this.f46941w - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public final java.lang.String w() {
        throw new UnsupportedOperationException("Method not decompiled: xa.a.w():java.lang.String");
    }

    public int x() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        switch (i10) {
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

    public final void y(int i10) {
        int i11 = this.f46941w;
        int[] iArr = this.v;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.v = Arrays.copyOf(iArr, i12);
            this.f46943y = Arrays.copyOf(this.f46943y, i12);
            this.f46942x = (String[]) Arrays.copyOf(this.f46942x, i12);
        }
        int[] iArr2 = this.v;
        int i13 = this.f46941w;
        this.f46941w = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char z() {
        int i10;
        if (this.f46936c == this.d && !g(1)) {
            D("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f46936c;
        int i12 = i11 + 1;
        this.f46936c = i12;
        char[] cArr = this.f46935b;
        char c3 = cArr[i11];
        if (c3 != '\n') {
            if (c3 != '\"' && c3 != '\'' && c3 != '/' && c3 != '\\') {
                if (c3 != 'b') {
                    if (c3 != 'f') {
                        if (c3 == 'n') {
                            return '\n';
                        }
                        if (c3 != 'r') {
                            if (c3 != 't') {
                                if (c3 == 'u') {
                                    if (i11 + 5 > this.d && !g(4)) {
                                        D("Unterminated escape sequence");
                                        throw null;
                                    }
                                    int i13 = this.f46936c;
                                    int i14 = i13 + 4;
                                    int i15 = 0;
                                    while (i13 < i14) {
                                        char c10 = cArr[i13];
                                        int i16 = i15 << 4;
                                        if (c10 >= '0' && c10 <= '9') {
                                            i10 = c10 - '0';
                                        } else if (c10 >= 'a' && c10 <= 'f') {
                                            i10 = c10 - 'W';
                                        } else if (c10 >= 'A' && c10 <= 'F') {
                                            i10 = c10 - '7';
                                        } else {
                                            D("Malformed Unicode escape \\u".concat(new String(cArr, this.f46936c, 4)));
                                            throw null;
                                        }
                                        i15 = i10 + i16;
                                        i13++;
                                    }
                                    this.f46936c += 4;
                                    return (char) i15;
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
            return c3;
        }
        this.e++;
        this.f46937f = i12;
        return c3;
    }
}
