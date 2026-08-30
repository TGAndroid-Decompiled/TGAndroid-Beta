package pa;
public final class c {
    public static final c d = new c("", "", false);
    public final String f41072a;
    public final String f41073b;
    public final boolean f41074c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z4) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f41072a = str;
                this.f41073b = str2;
                this.f41074c = z4;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}
