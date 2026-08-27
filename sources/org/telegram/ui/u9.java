package org.telegram.ui;

import com.google.android.gms.common.api.Status;

public final class u9 implements com.google.android.gms.common.api.o {

    public final int f43167a;

    public u9(int i10) {
        this.f43167a = i10;
    }

    @Override
    public final void a(Status status) {
        switch (this.f43167a) {
            case 0:
                d1.f.f4696b.decrementAndGet();
                break;
            case 1:
                d1.f.f4696b.decrementAndGet();
                break;
            case 2:
                d1.f.f4696b.decrementAndGet();
                break;
            case 3:
                d1.f.f4696b.decrementAndGet();
                break;
            default:
                d1.f.f4696b.decrementAndGet();
                break;
        }
    }
}
