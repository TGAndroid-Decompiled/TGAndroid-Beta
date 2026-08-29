package w3;

import java.util.ArrayList;
import java.util.Arrays;
public final class a extends nc.k {
    public final long f49632c;
    public final ArrayList d;
    public final ArrayList f49633e;

    public a(int i10, long j10) {
        super(i10, 1);
        this.f49632c = j10;
        this.d = new ArrayList();
        this.f49633e = new ArrayList();
    }

    public final a e(int i10) {
        ArrayList arrayList = this.f49633e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.f17285b == i10) {
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
            if (bVar.f17285b == i10) {
                return bVar;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return nc.k.a(this.f17285b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.f49633e.toArray());
    }
}
