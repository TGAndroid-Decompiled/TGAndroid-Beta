package z3;

import java.util.ArrayList;
import java.util.Arrays;
public final class a extends n3.a {
    public final long f47342c;
    public final ArrayList d;
    public final ArrayList e;

    public a(int i10, long j10) {
        super(i10, 2);
        this.f47342c = j10;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final a j(int i10) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.f14207b == i10) {
                return aVar;
            }
        }
        return null;
    }

    public final b k(int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            if (bVar.f14207b == i10) {
                return bVar;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return n3.a.c(this.f14207b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
