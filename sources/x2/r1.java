package x2;
public final class r1 extends e2.t0 {
    public final h9.i0 f59647c;

    public r1(String str, h9.s1 s1Var) {
        super(str, null, false, 1);
        this.f59647c = h9.i0.q(s1Var);
    }

    @Override
    public final String getMessage() {
        String message = super.getMessage();
        h9.i0 i0Var = this.f59647c;
        if (i0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + i0Var;
    }
}
