package th;

import android.text.TextUtils;
import j$.util.Objects;
public final class l3 {
    public boolean f49167a = true;
    public boolean f49168b;
    public String f49169c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && l3.class == obj.getClass()) {
                l3 l3Var = (l3) obj;
                if ((TextUtils.isEmpty(this.f49169c) && TextUtils.isEmpty(l3Var.f49169c)) || Objects.equals(this.f49169c, l3Var.f49169c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f49167a != l3Var.f49167a || this.f49168b != l3Var.f49168b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f49167a), Boolean.valueOf(this.f49168b), this.f49169c);
    }
}
