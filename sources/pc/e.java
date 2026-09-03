package pc;
public final class e extends n3.a {
    public final StringBuilder f41186c;

    public e() {
        super(4, 1);
        this.f41186c = new StringBuilder();
    }

    @Override
    public final n3.a g() {
        n3.a.i(this.f41186c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f41186c.toString() + "-->";
    }
}
