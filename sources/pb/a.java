package pb;

import java.util.Arrays;
public final class a implements Cloneable {
    public static final int[] f41093c = new int[0];
    public int f41095b = 0;
    public int[] f41094a = f41093c;

    public final void a(boolean z4) {
        c(this.f41095b + 1);
        if (z4) {
            int[] iArr = this.f41094a;
            int i10 = this.f41095b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f41095b++;
    }

    public final void b(int i10, int i11) {
        if (i11 >= 0 && i11 <= 32) {
            int i12 = this.f41095b;
            c(i12 + i11);
            for (int i13 = i11 - 1; i13 >= 0; i13--) {
                if (((1 << i13) & i10) != 0) {
                    int[] iArr = this.f41094a;
                    int i14 = i12 / 32;
                    iArr[i14] = iArr[i14] | (1 << (i12 & 31));
                }
                i12++;
            }
            this.f41095b = i12;
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void c(int i10) {
        if (i10 > this.f41094a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i10 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f41094a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f41094a = iArr;
        }
    }

    public final Object clone() {
        int i10 = this.f41095b;
        ?? obj = new Object();
        obj.f41094a = (int[]) this.f41094a.clone();
        obj.f41095b = i10;
        return obj;
    }

    public final boolean d(int i10) {
        if (((1 << (i10 & 31)) & this.f41094a[i10 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (this.f41095b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f41095b != aVar.f41095b || !Arrays.equals(this.f41094a, aVar.f41094a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41094a) + (this.f41095b * 31);
    }

    public final String toString() {
        char c3;
        int i10 = this.f41095b;
        StringBuilder sb = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f41095b; i11++) {
            if ((i11 & 7) == 0) {
                sb.append(' ');
            }
            if (d(i11)) {
                c3 = 'X';
            } else {
                c3 = '.';
            }
            sb.append(c3);
        }
        return sb.toString();
    }
}
