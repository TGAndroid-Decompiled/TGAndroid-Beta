package yh;
public final class w3 implements Runnable {
    public final int f50577a;
    public final e4 f50578b;

    public w3(e4 e4Var, int i10) {
        this.f50577a = i10;
        this.f50578b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f50577a) {
            case 0:
                s3 s3Var = this.f50578b.f50237c;
                if (!s3Var.f50514j.isEmpty()) {
                    s3Var.f50514j.clear();
                    s3Var.h();
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f50578b.f50237c;
                if (!s3Var2.f50515k.isEmpty()) {
                    s3Var2.f50515k.clear();
                    s3Var2.h();
                    return;
                }
                return;
            case 2:
                s3 s3Var3 = this.f50578b.f50237c;
                if (!s3Var3.f50516l.isEmpty()) {
                    s3Var3.f50516l.clear();
                    s3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50578b.f50237c.i(r3.BY_PRICE);
                return;
            case 4:
                this.f50578b.f50237c.i(r3.BY_DATE);
                return;
            default:
                this.f50578b.f50237c.i(r3.BY_NUMBER);
                return;
        }
    }
}
