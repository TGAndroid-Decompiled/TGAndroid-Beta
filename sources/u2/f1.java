package u2;

import java.util.Arrays;
import java.util.Random;
public final class f1 implements h1 {
    public final Random f43677a;
    public final int[] f43678b;
    public final int[] f43679c;

    public f1() {
        this(new Random());
    }

    @Override
    public final h1 a(int i10, int i11) {
        int i12 = i11 - i10;
        int[] iArr = this.f43678b;
        int[] iArr2 = new int[iArr.length - i12];
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            if (i15 >= i10 && i15 < i11) {
                i13++;
            } else {
                int i16 = i14 - i13;
                if (i15 >= i10) {
                    i15 -= i12;
                }
                iArr2[i16] = i15;
            }
        }
        return new f1(iArr2, new Random(this.f43677a.nextLong()));
    }

    @Override
    public final int b() {
        int[] iArr = this.f43678b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override
    public final int c(int i10) {
        int i11 = this.f43679c[i10] - 1;
        if (i11 < 0) {
            return -1;
        }
        return this.f43678b[i11];
    }

    @Override
    public final int d(int i10) {
        int i11 = this.f43679c[i10] + 1;
        int[] iArr = this.f43678b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    @Override
    public final h1 e(int i10, int i11) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        int i12 = 0;
        while (true) {
            iArr = this.f43678b;
            random = this.f43677a;
            if (i12 >= i11) {
                break;
            }
            iArr2[i12] = random.nextInt(iArr.length + 1);
            int i13 = i12 + 1;
            int nextInt = random.nextInt(i13);
            iArr3[i12] = iArr3[nextInt];
            iArr3[nextInt] = i12 + i10;
            i12 = i13;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i11];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length + i11; i16++) {
            if (i14 < i11 && i15 == iArr2[i14]) {
                iArr4[i16] = iArr3[i14];
                i14++;
            } else {
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                iArr4[i16] = i18;
                if (i18 >= i10) {
                    iArr4[i16] = i18 + i11;
                }
                i15 = i17;
            }
        }
        return new f1(iArr4, new Random(random.nextLong()));
    }

    @Override
    public final int g() {
        int[] iArr = this.f43678b;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override
    public final int getLength() {
        return this.f43678b.length;
    }

    @Override
    public final h1 h() {
        return new f1(new Random(this.f43677a.nextLong()));
    }

    public f1(int[] iArr, Random random) {
        this.f43678b = iArr;
        this.f43677a = random;
        this.f43679c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f43679c[iArr[i10]] = i10;
        }
    }

    public f1(Random random) {
        this(new int[0], random);
    }

    @Override
    public final h1 f() {
        return this;
    }
}
