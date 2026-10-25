package u2;
public final class s1 extends b2.x0 {
    public final f9.i0 f49418c;

    public s1(String str, f9.s1 s1Var) {
        super(str, null, false, 1);
        this.f49418c = f9.i0.u(s1Var);
    }

    @Override
    public final String getMessage() {
        String message = super.getMessage();
        f9.i0 i0Var = this.f49418c;
        if (i0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + i0Var;
    }
}
