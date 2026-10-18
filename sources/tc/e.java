package tc;

import javax.security.auth.x500.X500Principal;
public final class e {
    public final String f46934a;
    public final int f46935b;
    public int f46936c;
    public int d;
    public int e;
    public int f46937f;
    public char[] f46938g;

    public e(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f46934a = name;
        this.f46935b = name.length();
    }

    public final int a(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        int i14 = this.f46935b;
        String str = this.f46934a;
        if (i13 < i14) {
            char[] cArr = this.f46938g;
            char c10 = cArr[i10];
            if (c10 >= '0' && c10 <= '9') {
                i11 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i11 = c10 - 'W';
            } else if (c10 >= 'A' && c10 <= 'F') {
                i11 = c10 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            char c11 = cArr[i13];
            if (c11 >= '0' && c11 <= '9') {
                i12 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i12 = c11 - 'W';
            } else if (c11 >= 'A' && c11 <= 'F') {
                i12 = c11 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            return (i11 << 4) + i12;
        }
        throw new IllegalStateException("Malformed DN: " + str);
    }

    public final char b() {
        int i10;
        int i11;
        int i12 = this.f46936c + 1;
        this.f46936c = i12;
        int i13 = this.f46935b;
        if (i12 != i13) {
            char c10 = this.f46938g[i12];
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
                                int a2 = a(i12);
                                this.f46936c++;
                                if (a2 < 128) {
                                    return (char) a2;
                                }
                                if (a2 >= 192 && a2 <= 247) {
                                    if (a2 <= 223) {
                                        i10 = a2 & 31;
                                        i11 = 1;
                                    } else if (a2 <= 239) {
                                        i10 = a2 & 15;
                                        i11 = 2;
                                    } else {
                                        i10 = a2 & 7;
                                        i11 = 3;
                                    }
                                    for (int i14 = 0; i14 < i11; i14++) {
                                        int i15 = this.f46936c;
                                        int i16 = i15 + 1;
                                        this.f46936c = i16;
                                        if (i16 != i13 && this.f46938g[i16] == '\\') {
                                            int i17 = i15 + 2;
                                            this.f46936c = i17;
                                            int a10 = a(i17);
                                            this.f46936c++;
                                            if ((a10 & 192) == 128) {
                                                i10 = (i10 << 6) + (a10 & 63);
                                            } else {
                                                return '?';
                                            }
                                        } else {
                                            return '?';
                                        }
                                    }
                                    return (char) i10;
                                }
                                return '?';
                        }
                }
            }
            return c10;
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f46934a);
    }

    public final String c() {
        int i10;
        int i11;
        int i12;
        char c10;
        int i13;
        char c11;
        char c12;
        while (true) {
            i10 = this.f46936c;
            i11 = this.f46935b;
            if (i10 >= i11 || this.f46938g[i10] != ' ') {
                break;
            }
            this.f46936c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.d = i10;
        this.f46936c = i10 + 1;
        while (true) {
            i12 = this.f46936c;
            if (i12 >= i11 || (c12 = this.f46938g[i12]) == '=' || c12 == ' ') {
                break;
            }
            this.f46936c = i12 + 1;
        }
        String str = this.f46934a;
        if (i12 < i11) {
            this.e = i12;
            if (this.f46938g[i12] == ' ') {
                while (true) {
                    i13 = this.f46936c;
                    if (i13 >= i11 || (c11 = this.f46938g[i13]) == '=' || c11 != ' ') {
                        break;
                    }
                    this.f46936c = i13 + 1;
                }
                if (this.f46938g[i13] != '=' || i13 == i11) {
                    throw new IllegalStateException("Unexpected end of DN: " + str);
                }
            }
            this.f46936c++;
            while (true) {
                int i14 = this.f46936c;
                if (i14 >= i11 || this.f46938g[i14] != ' ') {
                    break;
                }
                this.f46936c = i14 + 1;
            }
            int i15 = this.e;
            int i16 = this.d;
            if (i15 - i16 > 4) {
                char[] cArr = this.f46938g;
                if (cArr[i16 + 3] == '.' && (((c10 = cArr[i16]) == 'O' || c10 == 'o') && ((cArr[i16 + 1] == 'I' || cArr[i16 + 1] == 'i') && (cArr[i16 + 2] == 'D' || cArr[i16 + 2] == 'd')))) {
                    this.d = i16 + 4;
                }
            }
            char[] cArr2 = this.f46938g;
            int i17 = this.d;
            return new String(cArr2, i17, i15 - i17);
        }
        throw new IllegalStateException("Unexpected end of DN: " + str);
    }
}
