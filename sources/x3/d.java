package x3;

import android.util.SparseArray;
import f3.a0;
import f3.b0;
import f3.c0;
import f3.j;
import java.util.Arrays;
import java.util.List;
public final class d implements b0 {
    public final j f60310a;
    public final SparseArray f60311b;
    public final long f60312c;
    public final int d;

    public d(SparseArray sparseArray, long j3, int i7, long j10, long j11) {
        j jVar;
        int i10;
        this.f60311b = sparseArray;
        this.f60312c = j3;
        this.d = i7;
        List list = (List) sparseArray.get(i7);
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                c cVar = (c) list.get(i12);
                jArr3[i12] = cVar.f60307a;
                jArr[i12] = cVar.f60308b;
            }
            while (true) {
                i10 = size - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArr[i11] = (int) (jArr[i13] - jArr[i11]);
                jArr2[i11] = jArr3[i13] - jArr3[i11];
                i11 = i13;
            }
            int i14 = i10;
            while (i14 > 0 && jArr3[i14] >= j3) {
                i14--;
            }
            iArr[i14] = (int) ((j10 + j11) - jArr[i14]);
            jArr2[i14] = j3 - jArr3[i14];
            if (i14 < i10) {
                h2.a.l("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i15 = i14 + 1;
                iArr = Arrays.copyOf(iArr, i15);
                jArr = Arrays.copyOf(jArr, i15);
                jArr2 = Arrays.copyOf(jArr2, i15);
                jArr3 = Arrays.copyOf(jArr3, i15);
            }
            jVar = new j(iArr, jArr, jArr2, jArr3);
        } else {
            jVar = null;
        }
        this.f60310a = jVar;
    }

    @Override
    public final boolean d() {
        List list = (List) this.f60311b.get(this.d);
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j3) {
        j jVar = this.f60310a;
        if (jVar != null) {
            return jVar.f(j3);
        }
        c0 c0Var = c0.f11129c;
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f60312c;
    }
}
