package sf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public final class e extends b {

    public long[] f47893l;

    public long[][] f47894m;

    public int f47895n;

    public e(b bVar, long j10) {
        this.d = new ArrayList();
        this.f47884e = 0L;
        this.f47885f = Long.MAX_VALUE;
        this.f47886g = 0.0f;
        this.h = 0.0f;
        this.f47887i = 0;
        this.f47888j = 0;
        int iBinarySearch = Arrays.binarySearch(bVar.f47881a, j10);
        int length = iBinarySearch - 4;
        int length2 = iBinarySearch + 4;
        if (length < 0) {
            length2 += -length;
            length = 0;
        }
        long[] jArr = bVar.f47881a;
        if (length2 > jArr.length - 1) {
            length -= length2 - jArr.length;
            length2 = jArr.length - 1;
        }
        length = length < 0 ? 0 : length;
        int i10 = (length2 - length) + 1;
        this.f47881a = new long[i10];
        this.f47882b = new float[i10];
        this.d = new ArrayList();
        for (int i11 = 0; i11 < bVar.d.size(); i11++) {
            a aVar = new a();
            aVar.f47874a = new long[i10];
            aVar.f47876c = ((a) bVar.d.get(i11)).f47876c;
            aVar.d = ((a) bVar.d.get(i11)).d;
            aVar.f47879g = ((a) bVar.d.get(i11)).f47879g;
            aVar.h = ((a) bVar.d.get(i11)).h;
            aVar.f47880i = ((a) bVar.d.get(i11)).f47880i;
            this.d.add(aVar);
        }
        int i12 = 0;
        while (length <= length2) {
            this.f47881a[i12] = bVar.f47881a[length];
            for (int i13 = 0; i13 < this.d.size(); i13++) {
                ((a) this.d.get(i13)).f47874a[i12] = ((a) bVar.d.get(i13)).f47874a[length];
            }
            i12++;
            length++;
        }
        this.f47889k = 86400000L;
        e();
    }

    @Override
    public final void e() {
        super.e();
        this.f47895n = 0;
        int length = this.f47882b.length;
        int size = this.d.size();
        int iMax = Math.max(1, Math.round(length / 140.0f));
        int i10 = length / iMax;
        this.f47894m = (long[][]) Array.newInstance((Class<?>) Long.TYPE, size, i10);
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < length; i11++) {
            for (int i12 = 0; i12 < size; i12++) {
                long j10 = ((a) this.d.get(i12)).f47874a[i11];
                if (j10 > jArr[i12]) {
                    jArr[i12] = j10;
                }
            }
            if (i11 % iMax == 0) {
                for (int i13 = 0; i13 < size; i13++) {
                    this.f47894m[i13][this.f47895n] = jArr[i13];
                    jArr[i13] = 0;
                }
                int i14 = this.f47895n + 1;
                this.f47895n = i14;
                if (i14 >= i10) {
                    return;
                }
            }
        }
    }
}
