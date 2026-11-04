package zb;

import java.util.Arrays;
public final class b implements Cloneable {
    public int f60350a;
    public int f60351b;
    public int f60352c;
    public int[] d;

    public b(int i3, int i10) {
        if (i3 >= 1 && i10 >= 1) {
            this.f60350a = i3;
            this.f60351b = i10;
            int i11 = (i3 + 31) / 32;
            this.f60352c = i11;
            this.d = new int[i11 * i10];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public final void a(int i3, int i10) {
        int i11 = (i3 / 32) + (i10 * this.f60352c);
        int[] iArr = this.d;
        iArr[i11] = (1 << (i3 & 31)) ^ iArr[i11];
    }

    public final boolean b(int i3, int i10) {
        if (((this.d[(i3 / 32) + (i10 * this.f60352c)] >>> (i3 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void c(int i3, int i10) {
        int i11 = (i3 / 32) + (i10 * this.f60352c);
        int[] iArr = this.d;
        iArr[i11] = (1 << (i3 & 31)) | iArr[i11];
    }

    public final Object clone() {
        int i3 = this.f60350a;
        int i10 = this.f60351b;
        int i11 = this.f60352c;
        ?? obj = new Object();
        obj.f60350a = i3;
        obj.f60351b = i10;
        obj.f60352c = i11;
        obj.d = (int[]) this.d.clone();
        return obj;
    }

    public final void d(int i3, int i10, int i11, int i12) {
        if (i10 >= 0 && i3 >= 0) {
            if (i12 >= 1 && i11 >= 1) {
                int i13 = i11 + i3;
                int i14 = i12 + i10;
                if (i14 <= this.f60351b && i13 <= this.f60350a) {
                    while (i10 < i14) {
                        int i15 = this.f60352c * i10;
                        for (int i16 = i3; i16 < i13; i16++) {
                            int[] iArr = this.d;
                            int i17 = (i16 / 32) + i15;
                            iArr[i17] = iArr[i17] | (1 << (i16 & 31));
                        }
                        i10++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f60350a != bVar.f60350a || this.f60351b != bVar.f60351b || this.f60352c != bVar.f60352c || !Arrays.equals(this.d, bVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i3 = this.f60350a;
        return Arrays.hashCode(this.d) + (((((((i3 * 31) + i3) * 31) + this.f60351b) * 31) + this.f60352c) * 31);
    }

    public final String toString() {
        String str;
        int i3 = this.f60351b;
        int i10 = this.f60350a;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i3);
        for (int i11 = 0; i11 < i3; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (b(i12, i11)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb2.append(str);
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
