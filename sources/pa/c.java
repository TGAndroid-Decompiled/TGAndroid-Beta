package pa;
public final class c {
    public static final c d = new c("", "", false);
    public final String f41095a;
    public final String f41096b;
    public final boolean f41097c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z4) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f41095a = str;
                this.f41096b = str2;
                this.f41097c = z4;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}
