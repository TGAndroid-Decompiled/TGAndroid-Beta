package xh;
public final class x3 implements Runnable {
    public final int f46202a;
    public final f4 f46203b;

    public x3(f4 f4Var, int i10) {
        this.f46202a = i10;
        this.f46203b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f46202a) {
            case 0:
                u3 u3Var = this.f46203b.f45869c;
                if (!u3Var.f46149j.isEmpty()) {
                    u3Var.f46149j.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f46203b.f45869c;
                if (!u3Var2.f46150k.isEmpty()) {
                    u3Var2.f46150k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f46203b.f45869c;
                if (!u3Var3.f46151l.isEmpty()) {
                    u3Var3.f46151l.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46203b.f45869c.i(t3.BY_PRICE);
                return;
            case 4:
                this.f46203b.f45869c.i(t3.BY_DATE);
                return;
            default:
                this.f46203b.f45869c.i(t3.BY_NUMBER);
                return;
        }
    }
}
