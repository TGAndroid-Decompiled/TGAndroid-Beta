package u3;

import java.util.ArrayList;
import java.util.Arrays;

public final class a extends mc.k {

    public final long f48270c;
    public final ArrayList d;

    public final ArrayList f48271e;

    public a(int i10, long j10) {
        super(i10, 1);
        this.f48270c = j10;
        this.d = new ArrayList();
        this.f48271e = new ArrayList();
    }

    public final a e(int i10) {
        ArrayList arrayList = this.f48271e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.f18002b == i10) {
                return aVar;
            }
        }
        return null;
    }

    public final b f(int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            if (bVar.f18002b == i10) {
                return bVar;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return mc.k.a(this.f18002b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.f48271e.toArray());
    }
}
