package u3;

import android.util.SparseArray;
import c3.a0;
import c3.b0;
import c3.c0;
import c3.j;
import java.util.Arrays;
import java.util.List;
public final class d implements b0 {
    public final j f49502a;
    public final SparseArray f49503b;
    public final long f49504c;
    public final int d;

    public d(SparseArray sparseArray, long j10, int i10, long j11, long j12) {
        j jVar;
        int i11;
        this.f49503b = sparseArray;
        this.f49504c = j10;
        this.d = i10;
        List list = (List) sparseArray.get(i10);
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                c cVar = (c) list.get(i13);
                jArr3[i13] = cVar.f49499a;
                jArr[i13] = cVar.f49500b;
            }
            while (true) {
                i11 = size - 1;
                if (i12 >= i11) {
                    break;
                }
                int i14 = i12 + 1;
                iArr[i12] = (int) (jArr[i14] - jArr[i12]);
                jArr2[i12] = jArr3[i14] - jArr3[i12];
                i12 = i14;
            }
            int i15 = i11;
            while (i15 > 0 && jArr3[i15] >= j10) {
                i15--;
            }
            iArr[i15] = (int) ((j11 + j12) - jArr[i15]);
            jArr2[i15] = j10 - jArr3[i15];
            if (i15 < i11) {
                e2.a.l("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i16 = i15 + 1;
                iArr = Arrays.copyOf(iArr, i16);
                jArr = Arrays.copyOf(jArr, i16);
                jArr2 = Arrays.copyOf(jArr2, i16);
                jArr3 = Arrays.copyOf(jArr3, i16);
            }
            jVar = new j(iArr, jArr, jArr2, jArr3);
        } else {
            jVar = null;
        }
        this.f49502a = jVar;
    }

    @Override
    public final boolean d() {
        List list = (List) this.f49503b.get(this.d);
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
        j jVar = this.f49502a;
        if (jVar != null) {
            return jVar.f(j10);
        }
        c0 c0Var = c0.f6030c;
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f49504c;
    }
}
