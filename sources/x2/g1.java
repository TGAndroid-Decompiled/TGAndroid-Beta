package x2;

import java.util.Arrays;
import java.util.Random;
public final class g1 implements i1 {
    public final Random f60220a;
    public final int[] f60221b;
    public final int[] f60222c;

    public g1() {
        this(new Random());
    }

    @Override
    public final i1 a(int i7, int i10) {
        int i11 = i10 - i7;
        int[] iArr = this.f60221b;
        int[] iArr2 = new int[iArr.length - i11];
        int i12 = 0;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 >= i7 && i14 < i10) {
                i12++;
            } else {
                int i15 = i13 - i12;
                if (i14 >= i7) {
                    i14 -= i11;
                }
                iArr2[i15] = i14;
            }
        }
        return new g1(iArr2, new Random(this.f60220a.nextLong()));
    }

    @Override
    public final int b() {
        int[] iArr = this.f60221b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override
    public final i1 c(int i7) {
        return ((g1) i()).f(0, i7);
    }

    @Override
    public final int d(int i7) {
        int i10 = this.f60222c[i7] - 1;
        if (i10 < 0) {
            return -1;
        }
        return this.f60221b[i10];
    }

    @Override
    public final int e(int i7) {
        int i10 = this.f60222c[i7] + 1;
        int[] iArr = this.f60221b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    @Override
    public final i1 f(int i7, int i10) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = 0;
        while (true) {
            iArr = this.f60221b;
            random = this.f60220a;
            if (i11 >= i10) {
                break;
            }
            iArr2[i11] = random.nextInt(iArr.length + 1);
            int i12 = i11 + 1;
            int nextInt = random.nextInt(i12);
            iArr3[i11] = iArr3[nextInt];
            iArr3[nextInt] = i11 + i7;
            i11 = i12;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i10];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length + i10; i15++) {
            if (i13 < i10 && i14 == iArr2[i13]) {
                iArr4[i15] = iArr3[i13];
                i13++;
            } else {
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                iArr4[i15] = i17;
                if (i17 >= i7) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            }
        }
        return new g1(iArr4, new Random(random.nextLong()));
    }

    @Override
    public final int getLength() {
        return this.f60221b.length;
    }

    @Override
    public final int h() {
        int[] iArr = this.f60221b;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override
    public final i1 i() {
        return new g1(new Random(this.f60220a.nextLong()));
    }

    public g1(int[] iArr, Random random) {
        this.f60221b = iArr;
        this.f60220a = random;
        this.f60222c = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.f60222c[iArr[i7]] = i7;
        }
    }

    public g1(Random random) {
        this(new int[0], random);
    }

    @Override
    public final i1 g() {
        return this;
    }
}
