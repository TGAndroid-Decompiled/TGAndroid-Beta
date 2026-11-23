package qi;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class a implements AutoCloseable {
    public final PrismaHighlighter f56294a;

    public a(PrismaHighlighter prismaHighlighter) {
        this.f56294a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f56294a.close();
    }
}
