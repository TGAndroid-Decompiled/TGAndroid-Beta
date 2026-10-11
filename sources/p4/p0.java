package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.c1;
public final class p0 extends p implements n0 {
    public final String f45442f;
    public String f45443g;
    public String h;
    public boolean f45444i;
    public int f45446k;
    public m0 f45447l;
    public final r0 f45449n;
    public int f45445j = -1;
    public int f45448m = -1;

    public p0(r0 r0Var, String str) {
        this.f45449n = r0Var;
        this.f45442f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f45447l = m0Var;
        int i10 = m0Var.f45427e;
        m0Var.f45427e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f45442f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.f45448m = i10;
        if (this.f45444i) {
            m0Var.a(i10);
            int i12 = this.f45445j;
            if (i12 >= 0) {
                m0Var.c(this.f45448m, i12);
                this.f45445j = -1;
            }
            int i13 = this.f45446k;
            if (i13 != 0) {
                m0Var.d(this.f45448m, i13);
                this.f45446k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f45448m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f45447l;
        if (m0Var != null) {
            int i10 = this.f45448m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f45447l = null;
            this.f45448m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f45449n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f45444i = true;
        m0 m0Var = this.f45447l;
        if (m0Var != null) {
            m0Var.a(this.f45448m);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f45447l;
        if (m0Var != null) {
            m0Var.c(this.f45448m, i10);
            return;
        }
        this.f45445j = i10;
        this.f45446k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f45444i = false;
        m0 m0Var = this.f45447l;
        if (m0Var != null) {
            int i11 = this.f45448m;
            Bundle f7 = c1.f(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, f7);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f45447l;
        if (m0Var != null) {
            m0Var.d(this.f45448m, i10);
        } else {
            this.f45446k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f45443g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f45447l;
        if (m0Var != null) {
            int i10 = this.f45448m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f45447l;
        if (m0Var != null) {
            int i10 = this.f45448m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f45447l;
        if (m0Var != null) {
            int i10 = this.f45448m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
