package zh;

import java.io.IOException;
public final class m0 implements y2.m {
    public final Object f52037a;

    public m0(Object obj) {
        this.f52037a = obj;
    }

    @Override
    public void a() {
        l2.h hVar = (l2.h) this.f52037a;
        hVar.A.a();
        IOException iOException = hVar.C;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }
}
