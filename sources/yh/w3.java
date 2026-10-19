package yh;
public final class w3 implements Runnable {
    public final int f50566a;
    public final e4 f50567b;

    public w3(e4 e4Var, int i10) {
        this.f50566a = i10;
        this.f50567b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f50566a) {
            case 0:
                s3 s3Var = this.f50567b.f50226c;
                if (!s3Var.f50503j.isEmpty()) {
                    s3Var.f50503j.clear();
                    s3Var.h();
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f50567b.f50226c;
                if (!s3Var2.f50504k.isEmpty()) {
                    s3Var2.f50504k.clear();
                    s3Var2.h();
                    return;
                }
                return;
            case 2:
                s3 s3Var3 = this.f50567b.f50226c;
                if (!s3Var3.f50505l.isEmpty()) {
                    s3Var3.f50505l.clear();
                    s3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50567b.f50226c.i(r3.BY_PRICE);
                return;
            case 4:
                this.f50567b.f50226c.i(r3.BY_DATE);
                return;
            default:
                this.f50567b.f50226c.i(r3.BY_NUMBER);
                return;
        }
    }
}
