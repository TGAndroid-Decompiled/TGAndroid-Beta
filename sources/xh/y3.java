package xh;
public final class y3 implements Runnable {
    public final int f50317a;
    public final g4 f50318b;

    public y3(g4 g4Var, int i10) {
        this.f50317a = i10;
        this.f50318b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f50317a) {
            case 0:
                v3 v3Var = this.f50318b.f49965c;
                if (!v3Var.f50280j.isEmpty()) {
                    v3Var.f50280j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f50318b.f49965c;
                if (!v3Var2.f50281k.isEmpty()) {
                    v3Var2.f50281k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f50318b.f49965c;
                if (!v3Var3.f50282l.isEmpty()) {
                    v3Var3.f50282l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50318b.f49965c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f50318b.f49965c.i(u3.BY_DATE);
                return;
            default:
                this.f50318b.f49965c.i(u3.BY_NUMBER);
                return;
        }
    }
}
