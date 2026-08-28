package rf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class e extends b {
    public long[] f47172l;
    public long[][] f47173m;
    public int f47174n;

    public e(b bVar, long j10) {
        this.d = new ArrayList();
        this.f47163e = 0L;
        this.f47164f = Long.MAX_VALUE;
        this.f47165g = 0.0f;
        this.h = 0.0f;
        this.f47166i = 0;
        this.f47167j = 0;
        int binarySearch = Arrays.binarySearch(bVar.f47160a, j10);
        int i9 = binarySearch - 4;
        int i10 = binarySearch + 4;
        if (i9 < 0) {
            i10 += -i9;
            i9 = 0;
        }
        long[] jArr = bVar.f47160a;
        if (i10 > jArr.length - 1) {
            i9 -= i10 - jArr.length;
            i10 = jArr.length - 1;
        }
        i9 = i9 < 0 ? 0 : i9;
        int i11 = (i10 - i9) + 1;
        this.f47160a = new long[i11];
        this.f47161b = new float[i11];
        this.d = new ArrayList();
        for (int i12 = 0; i12 < bVar.d.size(); i12++) {
            a aVar = new a();
            aVar.f47153a = new long[i11];
            aVar.f47155c = ((a) bVar.d.get(i12)).f47155c;
            aVar.d = ((a) bVar.d.get(i12)).d;
            aVar.f47158g = ((a) bVar.d.get(i12)).f47158g;
            aVar.h = ((a) bVar.d.get(i12)).h;
            aVar.f47159i = ((a) bVar.d.get(i12)).f47159i;
            this.d.add(aVar);
        }
        int i13 = 0;
        while (i9 <= i10) {
            this.f47160a[i13] = bVar.f47160a[i9];
            for (int i14 = 0; i14 < this.d.size(); i14++) {
                ((a) this.d.get(i14)).f47153a[i13] = ((a) bVar.d.get(i14)).f47153a[i9];
            }
            i13++;
            i9++;
        }
        this.f47168k = 86400000L;
        e();
    }

    @Override
    public final void e() {
        super.e();
        this.f47174n = 0;
        int length = this.f47161b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i9 = length / max;
        this.f47173m = (long[][]) Array.newInstance(Long.TYPE, size, i9);
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < size; i11++) {
                long j10 = ((a) this.d.get(i11)).f47153a[i10];
                if (j10 > jArr[i11]) {
                    jArr[i11] = j10;
                }
            }
            if (i10 % max == 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    this.f47173m[i12][this.f47174n] = jArr[i12];
                    jArr[i12] = 0;
                }
                int i13 = this.f47174n + 1;
                this.f47174n = i13;
                if (i13 >= i9) {
                    return;
                }
            }
        }
    }
}
