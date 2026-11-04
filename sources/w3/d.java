package w3;

import android.util.SparseArray;
import e3.a0;
import e3.b0;
import e3.c0;
import e3.j;
import java.util.Arrays;
import java.util.List;
public final class d implements b0 {
    public final j f57306a;
    public final SparseArray f57307b;
    public final long f57308c;
    public final int d;

    public d(SparseArray sparseArray, long j10, int i3, long j11, long j12) {
        j jVar;
        int i10;
        this.f57307b = sparseArray;
        this.f57308c = j10;
        this.d = i3;
        List list = (List) sparseArray.get(i3);
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                c cVar = (c) list.get(i12);
                jArr3[i12] = cVar.f57303a;
                jArr[i12] = cVar.f57304b;
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
            while (i14 > 0 && jArr3[i14] >= j10) {
                i14--;
            }
            iArr[i14] = (int) ((j11 + j12) - jArr[i14]);
            jArr2[i14] = j10 - jArr3[i14];
            if (i14 < i10) {
                g2.a.l("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
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
        this.f57306a = jVar;
    }

    @Override
    public final boolean d() {
        List list = (List) this.f57307b.get(this.d);
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
    public final a0 f(long j10) {
        j jVar = this.f57306a;
        if (jVar != null) {
            return jVar.f(j10);
        }
        c0 c0Var = c0.f9436c;
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f57308c;
    }
}
