package rc;

import javax.security.auth.x500.X500Principal;
public final class e {
    public final String f54352a;
    public final int f54353b;
    public int f54354c;
    public int d;
    public int f54355e;
    public int f54356f;
    public char[] f54357g;

    public e(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f54352a = name;
        this.f54353b = name.length();
    }

    public final int a(int i7) {
        int i10;
        int i11;
        int i12 = i7 + 1;
        int i13 = this.f54353b;
        String str = this.f54352a;
        if (i12 < i13) {
            char[] cArr = this.f54357g;
            char c10 = cArr[i7];
            if (c10 >= '0' && c10 <= '9') {
                i10 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i10 = c10 - 'W';
            } else if (c10 >= 'A' && c10 <= 'F') {
                i10 = c10 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            char c11 = cArr[i12];
            if (c11 >= '0' && c11 <= '9') {
                i11 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i11 = c11 - 'W';
            } else if (c11 >= 'A' && c11 <= 'F') {
                i11 = c11 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            return (i10 << 4) + i11;
        }
        throw new IllegalStateException("Malformed DN: " + str);
    }

    public final char b() {
        int i7;
        int i10;
        int i11 = this.f54354c + 1;
        this.f54354c = i11;
        int i12 = this.f54353b;
        if (i11 != i12) {
            char c10 = this.f54357g[i11];
            if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
                switch (c10) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c10) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                int a10 = a(i11);
                                this.f54354c++;
                                if (a10 < 128) {
                                    return (char) a10;
                                }
                                if (a10 >= 192 && a10 <= 247) {
                                    if (a10 <= 223) {
                                        i7 = a10 & 31;
                                        i10 = 1;
                                    } else if (a10 <= 239) {
                                        i7 = a10 & 15;
                                        i10 = 2;
                                    } else {
                                        i7 = a10 & 7;
                                        i10 = 3;
                                    }
                                    for (int i13 = 0; i13 < i10; i13++) {
                                        int i14 = this.f54354c;
                                        int i15 = i14 + 1;
                                        this.f54354c = i15;
                                        if (i15 != i12 && this.f54357g[i15] == '\\') {
                                            int i16 = i14 + 2;
                                            this.f54354c = i16;
                                            int a11 = a(i16);
                                            this.f54354c++;
                                            if ((a11 & 192) == 128) {
                                                i7 = (i7 << 6) + (a11 & 63);
                                            } else {
                                                return '?';
                                            }
                                        } else {
                                            return '?';
                                        }
                                    }
                                    return (char) i7;
                                }
                                return '?';
                        }
                }
            }
            return c10;
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f54352a);
    }

    public final String c() {
        int i7;
        int i10;
        int i11;
        char c10;
        int i12;
        char c11;
        char c12;
        while (true) {
            i7 = this.f54354c;
            i10 = this.f54353b;
            if (i7 >= i10 || this.f54357g[i7] != ' ') {
                break;
            }
            this.f54354c = i7 + 1;
        }
        if (i7 == i10) {
            return null;
        }
        this.d = i7;
        this.f54354c = i7 + 1;
        while (true) {
            i11 = this.f54354c;
            if (i11 >= i10 || (c12 = this.f54357g[i11]) == '=' || c12 == ' ') {
                break;
            }
            this.f54354c = i11 + 1;
        }
        String str = this.f54352a;
        if (i11 < i10) {
            this.f54355e = i11;
            if (this.f54357g[i11] == ' ') {
                while (true) {
                    i12 = this.f54354c;
                    if (i12 >= i10 || (c11 = this.f54357g[i12]) == '=' || c11 != ' ') {
                        break;
                    }
                    this.f54354c = i12 + 1;
                }
                if (this.f54357g[i12] != '=' || i12 == i10) {
                    throw new IllegalStateException("Unexpected end of DN: " + str);
                }
            }
            this.f54354c++;
            while (true) {
                int i13 = this.f54354c;
                if (i13 >= i10 || this.f54357g[i13] != ' ') {
                    break;
                }
                this.f54354c = i13 + 1;
            }
            int i14 = this.f54355e;
            int i15 = this.d;
            if (i14 - i15 > 4) {
                char[] cArr = this.f54357g;
                if (cArr[i15 + 3] == '.' && (((c10 = cArr[i15]) == 'O' || c10 == 'o') && ((cArr[i15 + 1] == 'I' || cArr[i15 + 1] == 'i') && (cArr[i15 + 2] == 'D' || cArr[i15 + 2] == 'd')))) {
                    this.d = i15 + 4;
                }
            }
            char[] cArr2 = this.f54357g;
            int i16 = this.d;
            return new String(cArr2, i16, i14 - i16);
        }
        throw new IllegalStateException("Unexpected end of DN: " + str);
    }
}
