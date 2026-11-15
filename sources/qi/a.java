package qi;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class a implements AutoCloseable {
    public final PrismaHighlighter f55597a;

    public a(PrismaHighlighter prismaHighlighter) {
        this.f55597a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f55597a.close();
    }
}
