package vh;

import android.text.Editable;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import org.telegram.messenger.p6;
import org.telegram.ui.Cells.m9;
public final class p1 implements org.telegram.ui.Components.y4, c1, xd.b {
    public Object f46065a;

    public p1(Object obj) {
        this.f46065a = obj;
    }

    @Override
    public void D(CharSequence charSequence) {
        y2 y2Var = ((i5) this.f46065a).B;
        if (y2Var != null && charSequence != null && charSequence.length() > 0) {
            y2Var.f46324a.t4(charSequence.toString());
        }
    }

    @Override
    public boolean F(d1 d1Var) {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        ((y1) this.f46065a).s0(i10, i11, z4);
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((xd.h) this.f46065a).i(f10);
    }

    @Override
    public void N(Editable editable) {
        i5 i5Var = (i5) this.f46065a;
        a aVar = i5Var.f46283a;
        if (aVar != null) {
            aVar.f45789s = true;
            aVar.f45788r = i5Var.f45941r.B;
        }
        i5Var.u();
        y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f46283a != null) {
            y2Var.a();
        }
    }

    @Override
    public void O(d1 d1Var, int i10, int i11) {
        y2 y2Var;
        m9 textSelectionHelper;
        i5 i5Var = (i5) this.f46065a;
        if (!i5Var.D && i10 != i11 && (y2Var = i5Var.B) != null && (textSelectionHelper = y2Var.f46324a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != i5Var) {
                i5Var.post(new p6(this, d1Var, i11, textSelectionHelper, i10, 6));
            }
        }
    }

    @Override
    public boolean R(boolean z4) {
        return false;
    }

    public void a(StringBuilder sb) {
        String str;
        if (((Boolean) e2.c.g(1, (ArrayList) this.f46065a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb.append(str);
    }

    public void b(StringBuilder sb) {
        while (!((ArrayList) this.f46065a).isEmpty()) {
            a(sb);
        }
    }

    @Override
    public void c(d1 d1Var) {
        y2 y2Var = ((i5) this.f46065a).B;
        if (y2Var != null) {
            r3 r3Var = y2Var.f46324a;
            r3.M1(r3Var, d1Var);
            r3Var.f46112e3.e(d1Var, true);
        }
    }

    @Override
    public boolean d() {
        i5 i5Var = (i5) this.f46065a;
        y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f46283a != null) {
            return y2Var.f46324a.S4();
        }
        return false;
    }

    public String e(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            w9.d dVar = (w9.d) this.f46065a;
            w9.e eVar = new w9.e(stringWriter, dVar.f46498a, dVar.f46499b, dVar.f46500c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f46502b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public void i(int i10, int i11) {
        c2 c2Var;
        i5 i5Var = (i5) this.f46065a;
        y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f46283a != null && (c2Var = y2Var.f46324a.G3) != null) {
            c2Var.f(i10, i11);
        }
    }

    @Override
    public boolean o(d1 d1Var) {
        return false;
    }

    @Override
    public void z(float f10, int i10) {
        ((xd.h) this.f46065a).i(f10);
    }

    public p1() {
        this.f46065a = new ArrayList();
    }

    @Override
    public void r() {
    }

    @Override
    public void G(d1 d1Var) {
    }
}
