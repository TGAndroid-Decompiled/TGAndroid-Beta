package wh;

import android.view.View;
import org.telegram.ui.Cells.l9;
public final class k2 implements Runnable {
    public final int f49824a;
    public final r3 f49825b;
    public final a f49826c;

    public k2(r3 r3Var, a aVar, int i10) {
        this.f49824a = i10;
        this.f49825b = r3Var;
        this.f49826c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f49824a) {
            case 0:
                this.f49825b.d3(this.f49826c);
                return;
            case 1:
                View z12 = this.f49825b.z1(this.f49826c);
                if (z12 instanceof v5) {
                    v5 v5Var = (v5) z12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f49825b.d3(this.f49826c);
                return;
            case 3:
                this.f49825b.c3(this.f49826c, true);
                return;
            case 4:
                this.f49825b.c3(this.f49826c, false);
                return;
            case 5:
                this.f49825b.c3(this.f49826c, true);
                return;
            case 6:
                this.f49825b.d3(this.f49826c);
                return;
            case 7:
                this.f49825b.b3(this.f49826c, false);
                return;
            case 8:
                this.f49825b.b3(this.f49826c, true);
                return;
            case 9:
                this.f49825b.d3(this.f49826c);
                return;
            case 10:
                this.f49825b.b3(this.f49826c, true);
                return;
            case 11:
                this.f49825b.d3(this.f49826c);
                return;
            case 12:
                this.f49825b.c3(this.f49826c, false);
                return;
            case 13:
                this.f49825b.b3(this.f49826c, true);
                return;
            case 14:
                r3 r3Var = this.f49825b;
                View z13 = r3Var.z1(this.f49826c);
                if (z13 instanceof l9) {
                    r3Var.f49991k3.c0(0, 0, (l9) z13);
                    return;
                }
                return;
            case 15:
                r3 r3Var2 = this.f49825b;
                View z14 = r3Var2.z1(this.f49826c);
                if (z14 instanceof l9) {
                    if (z14 instanceof v5) {
                        i10 = ((v5) z14).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    r3Var2.f49991k3.c0(0, i10, (l9) z14);
                    return;
                }
                return;
            case 16:
                this.f49825b.f3(this.f49826c);
                return;
            case 17:
                View z15 = this.f49825b.z1(this.f49826c);
                if (z15 instanceof v5) {
                    v5 v5Var2 = (v5) z15;
                    v5Var2.B();
                    v5Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View z16 = this.f49825b.z1(this.f49826c);
                if (z16 instanceof v5) {
                    v5 v5Var3 = (v5) z16;
                    v5Var3.B();
                    v5Var3.getEditText().setSelection(v5Var3.getEditText().length());
                    return;
                } else if (z16 instanceof i5) {
                    i5 i5Var = (i5) z16;
                    if (i5Var.getGrid().getChildCount() > 0) {
                        View childAt = i5Var.getGrid().getChildAt(0);
                        if (childAt instanceof l5) {
                            ((l5) childAt).f49866a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f49825b.e3(this.f49826c);
                return;
            case 20:
                View z17 = this.f49825b.z1(this.f49826c);
                if (z17 instanceof r0) {
                    ((r0) z17).d.r();
                    return;
                }
                return;
            case 21:
                this.f49825b.e3(this.f49826c);
                return;
            case 22:
                this.f49825b.e3(this.f49826c);
                return;
            case 23:
                View z18 = this.f49825b.z1(this.f49826c);
                if (z18 instanceof v5) {
                    v5 v5Var4 = (v5) z18;
                    v5Var4.B();
                    v5Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f49825b.d3(this.f49826c);
                return;
            case 25:
                this.f49825b.Z4("", this.f49826c);
                return;
            case 26:
                this.f49825b.d3(this.f49826c);
                return;
            case 27:
                this.f49825b.d3(this.f49826c);
                return;
            case 28:
                this.f49825b.d3(this.f49826c);
                return;
            default:
                this.f49825b.d3(this.f49826c);
                return;
        }
    }
}
