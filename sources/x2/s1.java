package x2;
public final class s1 extends e2.t0 {
    public final h9.i0 f60261c;

    public s1(String str, h9.t1 t1Var) {
        super(str, null, false, 1);
        this.f60261c = h9.i0.q(t1Var);
    }

    @Override
    public final String getMessage() {
        String message = super.getMessage();
        h9.i0 i0Var = this.f60261c;
        if (i0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + i0Var;
    }
}
