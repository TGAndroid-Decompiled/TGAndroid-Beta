package qi;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class a implements AutoCloseable {
    public final PrismaHighlighter f56171a;

    public a(PrismaHighlighter prismaHighlighter) {
        this.f56171a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f56171a.close();
    }
}
