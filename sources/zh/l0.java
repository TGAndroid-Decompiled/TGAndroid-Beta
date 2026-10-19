package zh;

import java.io.IOException;
public final class l0 implements y2.m {
    public final Object f52025a;

    public l0(Object obj) {
        this.f52025a = obj;
    }

    @Override
    public void a() {
        l2.h hVar = (l2.h) this.f52025a;
        hVar.A.a();
        IOException iOException = hVar.C;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }
}
