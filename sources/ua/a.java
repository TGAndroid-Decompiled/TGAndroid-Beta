package ua;

import a9.p;
import j$.util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class a implements Closeable {

    public final Reader f48467a;

    public long f48472n;

    public int f48473r;

    public String f48474s;
    public int[] v;

    public String[] f48476x;

    public int[] f48477y;

    public final char[] f48468b = new char[1024];

    public int f48469c = 0;
    public int d = 0;

    public int f48470e = 0;

    public int f48471f = 0;
    public int h = 0;

    public int f48475w = 1;

    static {
        xa.a.d = new xa.a(22);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.v = iArr;
        iArr[0] = 6;
        this.f48476x = new String[32];
        this.f48477y = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f48467a = reader;
    }

    public final void A(char c10) throws c {
        do {
            int i10 = this.f48469c;
            int i11 = this.d;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.f48468b[i10];
                if (c11 == c10) {
                    this.f48469c = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f48469c = i12;
                    z();
                    i10 = this.f48469c;
                    i11 = this.d;
                } else {
                    if (c11 == '\n') {
                        this.f48470e++;
                        this.f48471f = i12;
                    }
                    i10 = i12;
                }
            }
            this.f48469c = i10;
        } while (g(1));
        D("Unterminated string");
        throw null;
    }

    public final void B() throws c {
        int i10;
        do {
            int i11 = 0;
            while (true) {
                i10 = this.f48469c;
                if (i10 + i11 < this.d) {
                    char c10 = this.f48468b[i10 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c();
                        throw null;
                    }
                    this.f48469c = i10 + i11;
                    return;
                }
            }
            this.f48469c = i10 + i11;
        } while (g(1));
    }

    public void C() throws IOException {
        int i10 = 0;
        do {
            int iD = this.h;
            if (iD == 0) {
                iD = d();
            }
            switch (iD) {
                case 1:
                    y(3);
                    i10++;
                    this.h = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f48476x[this.f48475w - 1] = null;
                    }
                    this.f48475w--;
                    i10--;
                    this.h = 0;
                    break;
                case 3:
                    y(1);
                    i10++;
                    this.h = 0;
                    break;
                case 4:
                    this.f48475w--;
                    i10--;
                    this.h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.h = 0;
                    break;
                case 8:
                    A('\'');
                    this.h = 0;
                    break;
                case 9:
                    A('\"');
                    this.h = 0;
                    break;
                case 10:
                    B();
                    this.h = 0;
                    break;
                case 12:
                    A('\'');
                    if (i10 == 0) {
                        this.f48476x[this.f48475w - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 13:
                    A('\"');
                    if (i10 == 0) {
                        this.f48476x[this.f48475w - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 14:
                    B();
                    if (i10 == 0) {
                        this.f48476x[this.f48475w - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 16:
                    this.f48469c += this.f48473r;
                    this.h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f48477y;
        int i11 = this.f48475w - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void D(String str) throws c {
        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(str);
        sbO.append(m());
        sbO.append("\nSee ");
        sbO.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new c(sbO.toString());
    }

    public final IllegalStateException E(String str) {
        String str2 = x() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbR = p.r("Expected ", str, " but was ");
        sbR.append(s3.c.n(x()));
        sbR.append(m());
        sbR.append("\nSee ");
        sbR.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbR.toString());
    }

    public void a() {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 3) {
            throw E("BEGIN_ARRAY");
        }
        y(1);
        this.f48477y[this.f48475w - 1] = 0;
        this.h = 0;
    }

    public void b() {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 1) {
            throw E("BEGIN_OBJECT");
        }
        y(3);
        this.h = 0;
    }

    public final void c() throws c {
        D("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    @Override
    public void close() throws IOException {
        this.h = 0;
        this.v[0] = 8;
        this.f48475w = 1;
        this.f48467a.close();
    }

    public final int d() throws IOException {
        int iS;
        String str;
        String str2;
        int i10;
        char c10;
        int i11;
        int i12;
        int i13;
        char c11;
        char c12;
        int i14;
        int[] iArr = this.v;
        int i15 = this.f48475w - 1;
        int i16 = iArr[i15];
        if (i16 == 1) {
            iArr[i15] = 2;
        } else if (i16 == 2) {
            int iS2 = s(true);
            if (iS2 != 44) {
                if (iS2 == 59) {
                    c();
                    throw null;
                }
                if (iS2 == 93) {
                    this.h = 4;
                    return 4;
                }
                D("Unterminated array");
                throw null;
            }
        } else {
            if (i16 == 3 || i16 == 5) {
                iArr[i15] = 4;
                if (i16 == 5 && (iS = s(true)) != 44) {
                    if (iS == 59) {
                        c();
                        throw null;
                    }
                    if (iS == 125) {
                        this.h = 2;
                        return 2;
                    }
                    D("Unterminated object");
                    throw null;
                }
                int iS3 = s(true);
                if (iS3 == 34) {
                    this.h = 13;
                    return 13;
                }
                if (iS3 == 39) {
                    c();
                    throw null;
                }
                if (iS3 != 125) {
                    c();
                    throw null;
                }
                if (i16 != 5) {
                    this.h = 2;
                    return 2;
                }
                D("Expected name");
                throw null;
            }
            if (i16 == 4) {
                iArr[i15] = 5;
                int iS4 = s(true);
                if (iS4 != 58) {
                    if (iS4 != 61) {
                        D("Expected ':'");
                        throw null;
                    }
                    c();
                    throw null;
                }
            } else if (i16 == 6) {
                iArr[i15] = 7;
            } else {
                if (i16 == 7) {
                    if (s(false) == -1) {
                        this.h = 17;
                        return 17;
                    }
                    c();
                    throw null;
                }
                if (i16 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iS5 = s(true);
        if (iS5 == 34) {
            this.h = 9;
            return 9;
        }
        if (iS5 == 39) {
            c();
            throw null;
        }
        if (iS5 != 44 && iS5 != 59) {
            if (iS5 == 91) {
                this.h = 3;
                return 3;
            }
            if (iS5 != 93) {
                if (iS5 == 123) {
                    this.h = 1;
                    return 1;
                }
                int i17 = this.f48469c - 1;
                this.f48469c = i17;
                char[] cArr = this.f48468b;
                char c13 = cArr[i17];
                if (c13 == 't' || c13 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i10 = 5;
                } else {
                    if (c13 != 'f' && c13 != 'F') {
                        if (c13 != 'n' && c13 != 'N') {
                            i10 = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i10 = 7;
                        if (i10 != 0) {
                            return i10;
                        }
                        i11 = this.f48469c;
                        i12 = this.d;
                        long j10 = 0;
                        i13 = 0;
                        c11 = 0;
                        boolean z10 = true;
                        boolean z11 = false;
                        while (true) {
                            if (i11 + i13 != i12) {
                                c12 = cArr[i11 + i13];
                                if (c12 != '+') {
                                    if (c12 != 'E' || c12 == 'e') {
                                        if (c11 != 2 || c11 == 4) {
                                            c11 = 5;
                                            i13++;
                                        }
                                    } else if (c12 == '-') {
                                        if (c11 == 0) {
                                            c11 = 1;
                                            z11 = true;
                                        } else {
                                            if (c11 != 5) {
                                            }
                                            c11 = 6;
                                        }
                                        i13++;
                                    } else if (c12 != '.') {
                                        if (c12 >= '0' && c12 <= '9') {
                                            if (c11 == 1 || c11 == 0) {
                                                j10 = -(c12 - '0');
                                                c11 = 2;
                                            } else if (c11 == 2) {
                                                if (j10 != 0) {
                                                    long j11 = (10 * j10) - ((long) (c12 - '0'));
                                                    z10 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                                    j10 = j11;
                                                }
                                            } else if (c11 == 3) {
                                                c11 = 4;
                                            } else if (c11 == 5 || c11 == 6) {
                                                c11 = 7;
                                            }
                                            i13++;
                                        } else if (!l(c12)) {
                                            if (c11 != 2 && z10 && ((j10 != Long.MIN_VALUE || z11) && (j10 != 0 || !z11))) {
                                                if (!z11) {
                                                    j10 = -j10;
                                                }
                                                this.f48472n = j10;
                                                this.f48469c += i13;
                                                i14 = 15;
                                                this.h = 15;
                                            } else if (c11 != 2 || c11 == 4 || c11 == 7) {
                                                this.f48473r = i13;
                                                i14 = 16;
                                                this.h = 16;
                                            }
                                        }
                                    } else if (c11 == 2) {
                                        c11 = 3;
                                        i13++;
                                    }
                                    if (i14 != 0) {
                                        return i14;
                                    }
                                    if (l(cArr[this.f48469c])) {
                                        c();
                                        throw null;
                                    }
                                    D("Expected value");
                                    throw null;
                                }
                                if (c11 != 5) {
                                }
                                c11 = 6;
                                i13++;
                            } else if (i13 != cArr.length) {
                                if (!g(i13 + 1)) {
                                    i11 = this.f48469c;
                                    i12 = this.d;
                                    c12 = cArr[i11 + i13];
                                    if (c12 != '+') {
                                        if (c12 != 'E') {
                                            if (c11 != 2) {
                                            }
                                            c11 = 5;
                                            i13++;
                                        } else {
                                            if (c11 != 2) {
                                            }
                                            c11 = 5;
                                            i13++;
                                        }
                                        if (i14 != 0) {
                                            return i14;
                                        }
                                        if (l(cArr[this.f48469c])) {
                                            D("Expected value");
                                            throw null;
                                        }
                                        c();
                                        throw null;
                                    }
                                    if (c11 != 5) {
                                    }
                                    c11 = 6;
                                    i13++;
                                }
                                if (c11 != 2) {
                                    if (c11 != 2) {
                                    }
                                    this.f48473r = i13;
                                    i14 = 16;
                                    this.h = 16;
                                } else {
                                    if (c11 != 2) {
                                    }
                                    this.f48473r = i13;
                                    i14 = 16;
                                    this.h = 16;
                                }
                                if (i14 != 0) {
                                    return i14;
                                }
                                if (l(cArr[this.f48469c])) {
                                    D("Expected value");
                                    throw null;
                                }
                                c();
                                throw null;
                            }
                            i14 = 0;
                            if (i14 != 0) {
                                return i14;
                            }
                            if (l(cArr[this.f48469c])) {
                                D("Expected value");
                                throw null;
                            }
                            c();
                            throw null;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i10 = 6;
                }
                int length = str.length();
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        if ((this.f48469c + length >= this.d && !g(length + 1)) || !l(cArr[this.f48469c + length])) {
                            this.f48469c += length;
                            this.h = i10;
                            break;
                        }
                        break;
                    }
                    if ((this.f48469c + i18 < this.d || g(i18 + 1)) && ((c10 = cArr[this.f48469c + i18]) == str.charAt(i18) || c10 == str2.charAt(i18))) {
                        i18++;
                    }
                    i10 = 0;
                    break;
                }
                if (i10 != 0) {
                    return i10;
                }
                i11 = this.f48469c;
                i12 = this.d;
                long j12 = 0;
                i13 = 0;
                c11 = 0;
                boolean z12 = true;
                boolean z13 = false;
                while (true) {
                    if (i11 + i13 != i12) {
                        c12 = cArr[i11 + i13];
                        if (c12 != '+') {
                            if (c12 != 'E') {
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i13++;
                            } else {
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i13++;
                            }
                            if (i14 != 0) {
                                return i14;
                            }
                            if (l(cArr[this.f48469c])) {
                                D("Expected value");
                                throw null;
                            }
                            c();
                            throw null;
                        }
                        if (c11 != 5) {
                        }
                        c11 = 6;
                        i13++;
                    } else if (i13 != cArr.length) {
                        if (!g(i13 + 1)) {
                            i11 = this.f48469c;
                            i12 = this.d;
                            c12 = cArr[i11 + i13];
                            if (c12 != '+') {
                                if (c12 != 'E') {
                                    if (c11 != 2) {
                                    }
                                    c11 = 5;
                                    i13++;
                                } else {
                                    if (c11 != 2) {
                                    }
                                    c11 = 5;
                                    i13++;
                                }
                                if (i14 != 0) {
                                    return i14;
                                }
                                if (l(cArr[this.f48469c])) {
                                    D("Expected value");
                                    throw null;
                                }
                                c();
                                throw null;
                            }
                            if (c11 != 5) {
                            }
                            c11 = 6;
                            i13++;
                        }
                        if (c11 != 2) {
                            if (c11 != 2) {
                            }
                            this.f48473r = i13;
                            i14 = 16;
                            this.h = 16;
                        } else {
                            if (c11 != 2) {
                            }
                            this.f48473r = i13;
                            i14 = 16;
                            this.h = 16;
                        }
                        if (i14 != 0) {
                            return i14;
                        }
                        if (l(cArr[this.f48469c])) {
                            D("Expected value");
                            throw null;
                        }
                        c();
                        throw null;
                    }
                    i14 = 0;
                    if (i14 != 0) {
                        return i14;
                    }
                    if (l(cArr[this.f48469c])) {
                        D("Expected value");
                        throw null;
                    }
                    c();
                    throw null;
                }
            }
            if (i16 == 1) {
                this.h = 4;
                return 4;
            }
        }
        if (i16 == 1 || i16 == 2) {
            c();
            throw null;
        }
        D("Unexpected value");
        throw null;
    }

    public void e() {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 4) {
            throw E("END_ARRAY");
        }
        int i10 = this.f48475w;
        this.f48475w = i10 - 1;
        int[] iArr = this.f48477y;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.h = 0;
    }

    public void f() {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 2) {
            throw E("END_OBJECT");
        }
        int i10 = this.f48475w;
        int i11 = i10 - 1;
        this.f48475w = i11;
        this.f48476x[i11] = null;
        int[] iArr = this.f48477y;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.h = 0;
    }

    public final boolean g(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f48471f;
        int i14 = this.f48469c;
        this.f48471f = i13 - i14;
        int i15 = this.d;
        char[] cArr = this.f48468b;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.d = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.d = 0;
        }
        this.f48469c = 0;
        do {
            int i17 = this.d;
            int i18 = this.f48467a.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.d + i18;
            this.d = i11;
            if (this.f48470e == 0 && (i12 = this.f48471f) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f48469c++;
                this.f48471f = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public String h() {
        return i(false);
    }

    public final String i(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f48475w;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.v[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f48477y[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f48476x[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(i0.a.k(i12, "Unknown scope value: "));
            }
            i10++;
        }
    }

    public String j() {
        return i(true);
    }

    public boolean k() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        return (iD == 2 || iD == 4 || iD == 17) ? false : true;
    }

    public final boolean l(char c10) throws c {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
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
            }
        }
        c();
        throw null;
    }

    final String m() {
        StringBuilder sbP = com.google.android.recaptcha.internal.a.p(" at line ", this.f48470e + 1, " column ", (this.f48469c - this.f48471f) + 1, " path ");
        sbP.append(h());
        return sbP.toString();
    }

    public boolean n() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 5) {
            this.h = 0;
            int[] iArr = this.f48477y;
            int i10 = this.f48475w - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iD != 6) {
            throw E("a boolean");
        }
        this.h = 0;
        int[] iArr2 = this.f48477y;
        int i11 = this.f48475w - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public double o() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.h = 0;
            int[] iArr = this.f48477y;
            int i10 = this.f48475w - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f48472n;
        }
        if (iD == 16) {
            this.f48474s = new String(this.f48468b, this.f48469c, this.f48473r);
            this.f48469c += this.f48473r;
        } else if (iD == 8 || iD == 9) {
            this.f48474s = u(iD == 8 ? '\'' : '\"');
        } else if (iD == 10) {
            this.f48474s = w();
        } else if (iD != 11) {
            throw E("a double");
        }
        this.h = 11;
        double d = Double.parseDouble(this.f48474s);
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            D("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.f48474s = null;
        this.h = 0;
        int[] iArr2 = this.f48477y;
        int i11 = this.f48475w - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d;
    }

    public int p() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            long j10 = this.f48472n;
            int i10 = (int) j10;
            if (j10 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f48472n + m());
            }
            this.h = 0;
            int[] iArr = this.f48477y;
            int i11 = this.f48475w - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iD == 16) {
            this.f48474s = new String(this.f48468b, this.f48469c, this.f48473r);
            this.f48469c += this.f48473r;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw E("an int");
            }
            if (iD == 10) {
                this.f48474s = w();
            } else {
                this.f48474s = u(iD == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f48474s);
                this.h = 0;
                int[] iArr2 = this.f48477y;
                int i13 = this.f48475w - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double d = Double.parseDouble(this.f48474s);
        int i14 = (int) d;
        if (i14 != d) {
            throw new NumberFormatException("Expected an int but was " + this.f48474s + m());
        }
        this.f48474s = null;
        this.h = 0;
        int[] iArr3 = this.f48477y;
        int i15 = this.f48475w - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long q() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.h = 0;
            int[] iArr = this.f48477y;
            int i10 = this.f48475w - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f48472n;
        }
        if (iD == 16) {
            this.f48474s = new String(this.f48468b, this.f48469c, this.f48473r);
            this.f48469c += this.f48473r;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw E("a long");
            }
            if (iD == 10) {
                this.f48474s = w();
            } else {
                this.f48474s = u(iD == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f48474s);
                this.h = 0;
                int[] iArr2 = this.f48477y;
                int i11 = this.f48475w - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double d = Double.parseDouble(this.f48474s);
        long j11 = (long) d;
        if (j11 != d) {
            throw new NumberFormatException("Expected a long but was " + this.f48474s + m());
        }
        this.f48474s = null;
        this.h = 0;
        int[] iArr3 = this.f48477y;
        int i12 = this.f48475w - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String r() throws IOException {
        String strU;
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 14) {
            strU = w();
        } else if (iD == 12) {
            strU = u('\'');
        } else {
            if (iD != 13) {
                throw E("a name");
            }
            strU = u('\"');
        }
        this.h = 0;
        this.f48476x[this.f48475w - 1] = strU;
        return strU;
    }

    public final int s(boolean z10) throws IOException {
        int i10 = this.f48469c;
        int i11 = this.d;
        while (true) {
            if (i10 == i11) {
                this.f48469c = i10;
                if (!g(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m());
                }
                i10 = this.f48469c;
                i11 = this.d;
            }
            int i12 = i10 + 1;
            char c10 = this.f48468b[i10];
            if (c10 == '\n') {
                this.f48470e++;
                this.f48471f = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 != '/') {
                    if (c10 != '#') {
                        this.f48469c = i12;
                        return c10;
                    }
                    this.f48469c = i12;
                    c();
                    throw null;
                }
                this.f48469c = i12;
                if (i12 == i11) {
                    this.f48469c = i10;
                    boolean zG = g(2);
                    this.f48469c++;
                    if (!zG) {
                        return c10;
                    }
                }
                c();
                throw null;
            }
            i10 = i12;
        }
    }

    public void t() {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 7) {
            throw E("null");
        }
        this.h = 0;
        int[] iArr = this.f48477y;
        int i10 = this.f48475w - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + m();
    }

    public final String u(char c10) throws c {
        int i10;
        char[] cArr;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f48469c;
            int i12 = this.d;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    cArr = this.f48468b;
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (c11 == c10) {
                            this.f48469c = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c11 == '\\') {
                            this.f48469c = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb2.append(cArr, i10, i17);
                            sb2.append(z());
                            i11 = this.f48469c;
                            i12 = this.d;
                        } else {
                            if (c11 == '\n') {
                                this.f48470e++;
                                this.f48471f = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb2.append(cArr, i10, i11 - i10);
            this.f48469c = i11;
        } while (g(1));
        D("Unterminated string");
        throw null;
    }

    public String v() {
        String str;
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 10) {
            str = w();
        } else if (iD == 8) {
            str = u('\'');
        } else if (iD == 9) {
            str = u('\"');
        } else if (iD == 11) {
            str = this.f48474s;
            this.f48474s = null;
        } else if (iD == 15) {
            str = Long.toString(this.f48472n);
        } else {
            if (iD != 16) {
                throw E("a string");
            }
            str = new String(this.f48468b, this.f48469c, this.f48473r);
            this.f48469c += this.f48473r;
        }
        this.h = 0;
        int[] iArr = this.f48477y;
        int i10 = this.f48475w - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final String w() throws c {
        char[] cArr;
        String string;
        int i10 = 0;
        StringBuilder sb2 = null;
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.f48469c;
                int i13 = i12 + i11;
                int i14 = this.d;
                cArr = this.f48468b;
                if (i13 < i14) {
                    char c10 = cArr[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c();
                        throw null;
                    }
                    i10 = i11;
                } else if (i11 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(cArr, this.f48469c, i11);
                    this.f48469c += i11;
                } else if (!g(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(cArr, this.f48469c, i10);
                } else {
                    sb2.append(cArr, this.f48469c, i10);
                    string = sb2.toString();
                }
                this.f48469c += i10;
                return string;
            }
        } while (g(1));
        if (sb2 == null) {
            string = new String(cArr, this.f48469c, i10);
        } else {
            sb2.append(cArr, this.f48469c, i10);
            string = sb2.toString();
        }
        this.f48469c += i10;
        return string;
    }

    public int x() {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        switch (iD) {
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
        int i11 = this.f48475w;
        int[] iArr = this.v;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.v = Arrays.copyOf(iArr, i12);
            this.f48477y = Arrays.copyOf(this.f48477y, i12);
            this.f48476x = (String[]) Arrays.copyOf(this.f48476x, i12);
        }
        int[] iArr2 = this.v;
        int i13 = this.f48475w;
        this.f48475w = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char z() throws c {
        int i10;
        if (this.f48469c == this.d && !g(1)) {
            D("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f48469c;
        int i12 = i11 + 1;
        this.f48469c = i12;
        char[] cArr = this.f48468b;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f48470e++;
            this.f48471f = i12;
            return c10;
        }
        if (c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            D("Invalid escape sequence");
            throw null;
        }
        if (i11 + 5 > this.d && !g(4)) {
            D("Unterminated escape sequence");
            throw null;
        }
        int i13 = this.f48469c;
        int i14 = i13 + 4;
        int i15 = 0;
        while (i13 < i14) {
            char c11 = cArr[i13];
            int i16 = i15 << 4;
            if (c11 >= '0' && c11 <= '9') {
                i10 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i10 = c11 - 'W';
            } else {
                if (c11 < 'A' || c11 > 'F') {
                    D("Malformed Unicode escape \\u".concat(new String(cArr, this.f48469c, 4)));
                    throw null;
                }
                i10 = c11 - '7';
            }
            i15 = i10 + i16;
            i13++;
        }
        this.f48469c += 4;
        return (char) i15;
    }
}
