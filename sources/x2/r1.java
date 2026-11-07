package x2;

import h9.t1;
public final class r1 extends e2.t0 {
    public final h9.i0 f58365c;

    public r1(String str, t1 t1Var) {
        super(str, null, false, 1);
        this.f58365c = h9.i0.q(t1Var);
    }

    @Override
    public final String getMessage() {
        String message = super.getMessage();
        h9.i0 i0Var = this.f58365c;
        if (i0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + i0Var;
    }
}
