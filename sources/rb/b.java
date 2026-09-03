package rb;
public final class b {
    public final a f46827a;
    public final int[] f46828b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f46827a = aVar;
            int length = iArr.length;
            int i10 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i10 < length && iArr[i10] == 0) {
                    i10++;
                }
                if (i10 == length) {
                    this.f46828b = new int[]{0};
                    return;
                }
                int i11 = length - i10;
                int[] iArr2 = new int[i11];
                this.f46828b = iArr2;
                System.arraycopy(iArr, i10, iArr2, 0, i11);
                return;
            }
            this.f46828b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final b a(b bVar) {
        a aVar = bVar.f46827a;
        a aVar2 = this.f46827a;
        if (aVar2.equals(aVar)) {
            if (e()) {
                return bVar;
            }
            if (bVar.e()) {
                return this;
            }
            int[] iArr = bVar.f46828b;
            int[] iArr2 = this.f46828b;
            if (iArr2.length > iArr.length) {
                iArr2 = iArr;
                iArr = iArr2;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr3[i10] = iArr2[i10 - length] ^ iArr[i10];
            }
            return new b(aVar2, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final int b(int i10) {
        if (i10 == 0) {
            return c(0);
        }
        int[] iArr = this.f46828b;
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : iArr) {
                a aVar = a.h;
                i11 ^= i12;
            }
            return i11;
        }
        int i13 = iArr[0];
        int length = iArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            i13 = this.f46827a.c(i10, i13) ^ iArr[i14];
        }
        return i13;
    }

    public final int c(int i10) {
        int[] iArr = this.f46828b;
        return iArr[(iArr.length - 1) - i10];
    }

    public final int d() {
        return this.f46828b.length - 1;
    }

    public final boolean e() {
        if (this.f46828b[0] != 0) {
            return false;
        }
        return true;
    }

    public final b f(int i10) {
        a aVar = this.f46827a;
        if (i10 == 0) {
            return aVar.f46823c;
        }
        if (i10 == 1) {
            return this;
        }
        int[] iArr = this.f46828b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = aVar.c(iArr[i11], i10);
        }
        return new b(aVar, iArr2);
    }

    public final b g(b bVar) {
        a aVar = bVar.f46827a;
        a aVar2 = this.f46827a;
        if (aVar2.equals(aVar)) {
            if (!e() && !bVar.e()) {
                int[] iArr = this.f46828b;
                int length = iArr.length;
                int[] iArr2 = bVar.f46828b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = iArr[i10];
                    for (int i12 = 0; i12 < length2; i12++) {
                        int i13 = i10 + i12;
                        iArr3[i13] = iArr3[i13] ^ aVar2.c(i11, iArr2[i12]);
                    }
                }
                return new b(aVar2, iArr3);
            }
            return aVar2.f46823c;
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final b h(int i10, int i11) {
        if (i10 >= 0) {
            a aVar = this.f46827a;
            if (i11 == 0) {
                return aVar.f46823c;
            }
            int[] iArr = this.f46828b;
            int length = iArr.length;
            int[] iArr2 = new int[i10 + length];
            for (int i12 = 0; i12 < length; i12++) {
                iArr2[i12] = aVar.c(iArr[i12], i11);
            }
            return new b(aVar, iArr2);
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int d = d(); d >= 0; d--) {
            int c3 = c(d);
            if (c3 != 0) {
                if (c3 < 0) {
                    if (d == d()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    c3 = -c3;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c3 != 1) {
                    a aVar = this.f46827a;
                    if (c3 != 0) {
                        int i10 = aVar.f46822b[c3];
                        if (i10 == 0) {
                            sb.append('1');
                        } else if (i10 == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i10);
                        }
                    } else {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
