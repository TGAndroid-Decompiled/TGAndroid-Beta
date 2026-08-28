package u3;

import java.util.ArrayList;
import java.util.Arrays;
public final class a extends lc.k {
    public final long f47973c;
    public final ArrayList d;
    public final ArrayList f47974e;

    public a(int i9, long j10) {
        super(i9, 1);
        this.f47973c = j10;
        this.d = new ArrayList();
        this.f47974e = new ArrayList();
    }

    public final a e(int i9) {
        ArrayList arrayList = this.f47974e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            if (aVar.f16818b == i9) {
                return aVar;
            }
        }
        return null;
    }

    public final b f(int i9) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f16818b == i9) {
                return bVar;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return lc.k.a(this.f16818b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.f47974e.toArray());
    }
}
