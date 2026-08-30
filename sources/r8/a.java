package r8;
public abstract class a implements f {
    public abstract boolean a(char c3);

    @Override
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
