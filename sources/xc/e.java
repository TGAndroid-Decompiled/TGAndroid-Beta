package xc;
public final class e extends f2.f {
    public final StringBuilder f53634c;

    public e() {
        super(4, 1);
        this.f53634c = new StringBuilder();
    }

    @Override
    public final f2.f b() {
        f2.f.c(this.f53634c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f53634c.toString() + "-->";
    }
}
