package x2;

import java.util.Arrays;
import java.util.Random;
public final class f1 implements h1 {
    public final Random f58327a;
    public final int[] f58328b;
    public final int[] f58329c;

    public f1() {
        this(new Random());
    }

    @Override
    public final h1 a(int i7, int i10) {
        int i11 = i10 - i7;
        int[] iArr = this.f58328b;
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
        return new f1(iArr2, new Random(this.f58327a.nextLong()));
    }

    @Override
    public final int b() {
        int[] iArr = this.f58328b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override
    public final h1 c(int i7) {
        return ((f1) i()).f(0, i7);
    }

    @Override
    public final int d(int i7) {
        int i10 = this.f58329c[i7] - 1;
        if (i10 < 0) {
            return -1;
        }
        return this.f58328b[i10];
    }

    @Override
    public final int e(int i7) {
        int i10 = this.f58329c[i7] + 1;
        int[] iArr = this.f58328b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    @Override
    public final h1 f(int i7, int i10) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = 0;
        while (true) {
            iArr = this.f58328b;
            random = this.f58327a;
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
        return new f1(iArr4, new Random(random.nextLong()));
    }

    @Override
    public final int getLength() {
        return this.f58328b.length;
    }

    @Override
    public final int h() {
        int[] iArr = this.f58328b;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override
    public final h1 i() {
        return new f1(new Random(this.f58327a.nextLong()));
    }

    public f1(int[] iArr, Random random) {
        this.f58328b = iArr;
        this.f58327a = random;
        this.f58329c = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.f58329c[iArr[i7]] = i7;
        }
    }

    public f1(Random random) {
        this(new int[0], random);
    }

    @Override
    public final h1 g() {
        return this;
    }
}
