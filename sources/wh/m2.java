package wh;

import android.view.View;
public final class m2 implements Runnable {
    public final int f49910a;
    public final r3 f49911b;
    public final a f49912c;
    public final int d;

    public m2(r3 r3Var, a aVar, int i10, int i11) {
        this.f49910a = i11;
        this.f49911b = r3Var;
        this.f49912c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View y12;
        View y13;
        switch (this.f49910a) {
            case 0:
                r3 r3Var = this.f49911b;
                a aVar = this.f49912c;
                if (aVar == null) {
                    r3Var.getClass();
                    y12 = null;
                } else {
                    y12 = r3Var.y1(aVar);
                }
                if (y12 instanceof v5) {
                    v5 v5Var = (v5) y12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(Math.min(this.d, v5Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                r3 r3Var2 = this.f49911b;
                a aVar2 = this.f49912c;
                if (aVar2 == null) {
                    r3Var2.getClass();
                    y13 = null;
                } else {
                    y13 = r3Var2.y1(aVar2);
                }
                if (y13 instanceof v5) {
                    v5 v5Var2 = (v5) y13;
                    v5Var2.B();
                    v5Var2.getEditText().setSelection(Math.min(this.d, v5Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View y14 = this.f49911b.y1(this.f49912c);
                if (y14 instanceof v5) {
                    v5 v5Var3 = (v5) y14;
                    v5Var3.B();
                    v5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View y15 = this.f49911b.y1(this.f49912c);
                if (y15 instanceof v5) {
                    v5 v5Var4 = (v5) y15;
                    v5Var4.B();
                    v5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View y16 = this.f49911b.y1(this.f49912c);
                if (y16 instanceof v5) {
                    v5 v5Var5 = (v5) y16;
                    v5Var5.B();
                    v5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View y17 = this.f49911b.y1(this.f49912c);
                if (y17 instanceof v5) {
                    v5 v5Var6 = (v5) y17;
                    v5Var6.B();
                    v5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
