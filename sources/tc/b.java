package tc;

public final class b implements rc.c {

    public static final b f48156a = new b();

    @Override
    public final rc.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
