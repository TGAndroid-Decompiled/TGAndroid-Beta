package zh;

import android.text.TextUtils;
import j$.util.Objects;
public final class m3 {
    public boolean f48683a = true;
    public boolean f48684b;
    public String f48685c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && m3.class == obj.getClass()) {
                m3 m3Var = (m3) obj;
                if ((TextUtils.isEmpty(this.f48685c) && TextUtils.isEmpty(m3Var.f48685c)) || Objects.equals(this.f48685c, m3Var.f48685c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f48683a != m3Var.f48683a || this.f48684b != m3Var.f48684b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f48683a), Boolean.valueOf(this.f48684b), this.f48685c);
    }
}
