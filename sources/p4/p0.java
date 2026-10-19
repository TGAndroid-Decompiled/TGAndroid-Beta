package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.c1;
public final class p0 extends p implements n0 {
    public final String f44164f;
    public String f44165g;
    public String h;
    public boolean f44166i;
    public int f44168k;
    public m0 f44169l;
    public final r0 f44171n;
    public int f44167j = -1;
    public int f44170m = -1;

    public p0(r0 r0Var, String str) {
        this.f44171n = r0Var;
        this.f44164f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f44169l = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f44164f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.f44170m = i10;
        if (this.f44166i) {
            m0Var.a(i10);
            int i12 = this.f44167j;
            if (i12 >= 0) {
                m0Var.c(this.f44170m, i12);
                this.f44167j = -1;
            }
            int i13 = this.f44168k;
            if (i13 != 0) {
                m0Var.d(this.f44170m, i13);
                this.f44168k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44170m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f44169l;
        if (m0Var != null) {
            int i10 = this.f44170m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f44169l = null;
            this.f44170m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f44171n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f44166i = true;
        m0 m0Var = this.f44169l;
        if (m0Var != null) {
            m0Var.a(this.f44170m);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f44169l;
        if (m0Var != null) {
            m0Var.c(this.f44170m, i10);
            return;
        }
        this.f44167j = i10;
        this.f44168k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f44166i = false;
        m0 m0Var = this.f44169l;
        if (m0Var != null) {
            int i11 = this.f44170m;
            Bundle i12 = c1.i(i10, "unselectReason");
            int i13 = m0Var.d;
            m0Var.d = i13 + 1;
            m0Var.b(6, i13, i11, null, i12);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f44169l;
        if (m0Var != null) {
            m0Var.d(this.f44170m, i10);
        } else {
            this.f44168k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f44165g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f44169l;
        if (m0Var != null) {
            int i10 = this.f44170m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f44169l;
        if (m0Var != null) {
            int i10 = this.f44170m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f44169l;
        if (m0Var != null) {
            int i10 = this.f44170m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
