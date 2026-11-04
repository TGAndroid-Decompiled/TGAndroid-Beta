package zb;

import java.util.Arrays;
public final class a implements Cloneable {
    public static final int[] f60347c = new int[0];
    public int f60349b = 0;
    public int[] f60348a = f60347c;

    public final void a(boolean z10) {
        c(this.f60349b + 1);
        if (z10) {
            int[] iArr = this.f60348a;
            int i3 = this.f60349b;
            int i10 = i3 / 32;
            iArr[i10] = (1 << (i3 & 31)) | iArr[i10];
        }
        this.f60349b++;
    }

    public final void b(int i3, int i10) {
        if (i10 >= 0 && i10 <= 32) {
            int i11 = this.f60349b;
            c(i11 + i10);
            for (int i12 = i10 - 1; i12 >= 0; i12--) {
                if (((1 << i12) & i3) != 0) {
                    int[] iArr = this.f60348a;
                    int i13 = i11 / 32;
                    iArr[i13] = iArr[i13] | (1 << (i11 & 31));
                }
                i11++;
            }
            this.f60349b = i11;
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void c(int i3) {
        if (i3 > this.f60348a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i3 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f60348a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f60348a = iArr;
        }
    }

    public final Object clone() {
        int i3 = this.f60349b;
        ?? obj = new Object();
        obj.f60348a = (int[]) this.f60348a.clone();
        obj.f60349b = i3;
        return obj;
    }

    public final boolean d(int i3) {
        if (((1 << (i3 & 31)) & this.f60348a[i3 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (this.f60349b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f60349b != aVar.f60349b || !Arrays.equals(this.f60348a, aVar.f60348a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f60348a) + (this.f60349b * 31);
    }

    public final String toString() {
        char c2;
        int i3 = this.f60349b;
        StringBuilder sb2 = new StringBuilder((i3 / 8) + i3 + 1);
        for (int i10 = 0; i10 < this.f60349b; i10++) {
            if ((i10 & 7) == 0) {
                sb2.append(' ');
            }
            if (d(i10)) {
                c2 = 'X';
            } else {
                c2 = '.';
            }
            sb2.append(c2);
        }
        return sb2.toString();
    }
}
