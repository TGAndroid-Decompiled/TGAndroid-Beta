package u2;

import e9.x1;
public final class t1 extends b2.w0 {
    public final e9.n0 f47442c;

    public t1(String str, x1 x1Var) {
        super(str, null, false, 1);
        this.f47442c = e9.n0.u(x1Var);
    }

    @Override
    public final String getMessage() {
        String message = super.getMessage();
        e9.n0 n0Var = this.f47442c;
        if (n0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + n0Var;
    }
}
