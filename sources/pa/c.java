package pa;
public final class c {
    public static final c d = new c("", "", false);
    public final String f44230a;
    public final String f44231b;
    public final boolean f44232c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z4) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f44230a = str;
                this.f44231b = str2;
                this.f44232c = z4;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}
