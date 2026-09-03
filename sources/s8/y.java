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
        int i10 = this.f2869a;
        if (i10 != 0) {
            if (i10 != 1) {
                z t6 = z.t(i10, this.f2871c);
                this.f2869a = t6.size();
                this.f2870b = true;
                return t6;
            }
            Object obj = this.f2871c[0];
            Objects.requireNonNull(obj);
            int i11 = z.f44229c;
            return new t0(obj);
        }
        int i12 = z.f44229c;
        return o0.f44204s;
    }
}
