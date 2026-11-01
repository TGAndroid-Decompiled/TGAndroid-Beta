package xc;
public final class e extends f2.f {
    public final StringBuilder f53652c;

    public e() {
        super(4, 1);
        this.f53652c = new StringBuilder();
    }

    @Override
    public final f2.f b() {
        f2.f.c(this.f53652c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f53652c.toString() + "-->";
    }
}
