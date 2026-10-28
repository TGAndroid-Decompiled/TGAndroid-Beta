package yf;

import android.content.ComponentName;
import android.text.Editable;
import li.f1;
import li.g0;
import li.g1;
import li.i0;
import li.j0;
import org.telegram.ui.Cells.s9;
public final class c implements f1 {
    public final Object f52586a;
    public final Object f52587b;

    public c(f fVar, ComponentName componentName) {
        this.f52586a = fVar;
        this.f52587b = componentName;
    }

    @Override
    public void E(g1 g1Var, int i10, int i11) {
        s9 C;
        i0 i0Var = (i0) this.f52586a;
        if (!((j0) this.f52587b).d && i10 != i11 && (C = i0Var.C()) != null) {
            if (!C.x() || C.W != i0Var.K()) {
                g1Var.post(new g0(this, g1Var, i11, C, i0Var, i10));
            }
        }
    }

    @Override
    public void T(CharSequence charSequence) {
        ((i0) this.f52586a).I(charSequence);
    }

    @Override
    public void Y(Editable editable) {
        ((j0) this.f52587b).i();
        ((i0) this.f52586a).S();
    }

    @Override
    public void b(g1 g1Var) {
        ((i0) this.f52586a).b(g1Var);
    }

    @Override
    public boolean e() {
        return ((i0) this.f52586a).M();
    }

    @Override
    public boolean f0(boolean z10) {
        return false;
    }

    @Override
    public boolean g(g1 g1Var) {
        return false;
    }

    @Override
    public void k(int i10, int i11) {
        ((i0) this.f52586a).O(i10, i11);
    }

    @Override
    public boolean o(g1 g1Var) {
        return false;
    }

    @Override
    public void t(g1 g1Var) {
        ((i0) this.f52586a).h();
    }

    public c(j0 j0Var, i0 i0Var) {
        this.f52587b = j0Var;
        this.f52586a = i0Var;
    }

    @Override
    public void R() {
    }
}
