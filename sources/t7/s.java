package t7;
public abstract class s {
    public static r f42103a;

    public static boolean a(int i10, CharSequence charSequence) {
        if (i10 < charSequence.length()) {
            char charAt = charSequence.charAt(i10);
            switch (charAt) {
                case '!':
                case '\"':
                case '#':
                case '$':
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                    return true;
                default:
                    switch (charAt) {
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                            return true;
                        default:
                            switch (charAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                case '_':
                                case '`':
                                    return true;
                                default:
                                    switch (charAt) {
                                        case '{':
                                        case '|':
                                        case '}':
                                        case '~':
                                            return true;
                                        default:
                                            return false;
                                    }
                            }
                    }
            }
        }
        return false;
    }

    public static int b(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int c(int i10, int i11, CharSequence charSequence) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (charAt != '\t' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static synchronized q d(o oVar) {
        q qVar;
        synchronized (s.class) {
            try {
                if (f42103a == null) {
                    f42103a = new r(0);
                }
                qVar = (q) f42103a.O0(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
