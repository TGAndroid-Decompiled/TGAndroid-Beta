package s8;

import j$.util.Objects;
public final class y extends com.google.android.gms.common.api.internal.w {
    @Override
    public final com.google.android.gms.common.api.internal.w c(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public final z i() {
        int i10 = this.f2825a;
        if (i10 != 0) {
            if (i10 != 1) {
                z t6 = z.t(i10, this.f2827c);
                this.f2825a = t6.size();
                this.f2826b = true;
                return t6;
            }
            Object obj = this.f2827c[0];
            Objects.requireNonNull(obj);
            int i11 = z.f47150c;
            return new t0(obj);
        }
        int i12 = z.f47150c;
        return o0.f47123s;
    }
}
