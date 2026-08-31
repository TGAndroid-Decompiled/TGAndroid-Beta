package pb;

import java.util.Arrays;
public final class a implements Cloneable {
    public static final int[] f44252c = new int[0];
    public int f44254b = 0;
    public int[] f44253a = f44252c;

    public final void a(boolean z4) {
        c(this.f44254b + 1);
        if (z4) {
            int[] iArr = this.f44253a;
            int i10 = this.f44254b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f44254b++;
    }

    public final void b(int i10, int i11) {
        if (i11 >= 0 && i11 <= 32) {
            int i12 = this.f44254b;
            c(i12 + i11);
            for (int i13 = i11 - 1; i13 >= 0; i13--) {
                if (((1 << i13) & i10) != 0) {
                    int[] iArr = this.f44253a;
                    int i14 = i12 / 32;
                    iArr[i14] = iArr[i14] | (1 << (i12 & 31));
                }
                i12++;
            }
            this.f44254b = i12;
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void c(int i10) {
        if (i10 > this.f44253a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i10 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f44253a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f44253a = iArr;
        }
    }

    public final Object clone() {
        int i10 = this.f44254b;
        ?? obj = new Object();
        obj.f44253a = (int[]) this.f44253a.clone();
        obj.f44254b = i10;
        return obj;
    }

    public final boolean d(int i10) {
        if (((1 << (i10 & 31)) & this.f44253a[i10 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (this.f44254b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f44254b != aVar.f44254b || !Arrays.equals(this.f44253a, aVar.f44253a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44253a) + (this.f44254b * 31);
    }

    public final String toString() {
        char c3;
        int i10 = this.f44254b;
        StringBuilder sb = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f44254b; i11++) {
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
