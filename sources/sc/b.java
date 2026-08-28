package sc;
public final class b implements qc.c {
    public static final b f47507a = new Object();

    @Override
    public final qc.h getContext() {
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
