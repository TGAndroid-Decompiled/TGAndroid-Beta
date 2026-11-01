package th;

import android.text.TextUtils;
import j$.util.Objects;
public final class l3 {
    public boolean f49181a = true;
    public boolean f49182b;
    public String f49183c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && l3.class == obj.getClass()) {
                l3 l3Var = (l3) obj;
                if ((TextUtils.isEmpty(this.f49183c) && TextUtils.isEmpty(l3Var.f49183c)) || Objects.equals(this.f49183c, l3Var.f49183c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f49181a != l3Var.f49181a || this.f49182b != l3Var.f49182b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f49181a), Boolean.valueOf(this.f49182b), this.f49183c);
    }
}
