package w2;
public final class s1 extends d2.v0 {
    public final g9.i0 f57213c;

    public s1(String str, g9.s1 s1Var) {
        super(str, null, false, 1);
        this.f57213c = g9.i0.q(s1Var);
    }

    @Override
    public final String getMessage() {
        String message = super.getMessage();
        g9.i0 i0Var = this.f57213c;
        if (i0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + i0Var;
    }
}
