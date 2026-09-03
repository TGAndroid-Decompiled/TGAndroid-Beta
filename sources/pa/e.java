package pa;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
public final class e extends u {
    public final int f41099a;
    public final u f41100b;

    public e(u uVar, int i10) {
        this.f41099a = i10;
        this.f41100b = uVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        switch (this.f41099a) {
            case 0:
                return new AtomicLong(((Number) this.f41100b.read(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.k()) {
                    arrayList.add(Long.valueOf(((Number) this.f41100b.read(aVar)).longValue()));
                }
                aVar.e();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                return this.f41100b.read(aVar);
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        switch (this.f41099a) {
            case 0:
                this.f41100b.write(bVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.b();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    this.f41100b.write(bVar, Long.valueOf(atomicLongArray.get(i10)));
                }
                bVar.e();
                return;
            default:
                if (obj == null) {
                    bVar.i();
                    return;
                } else {
                    this.f41100b.write(bVar, obj);
                    return;
                }
        }
    }
}
