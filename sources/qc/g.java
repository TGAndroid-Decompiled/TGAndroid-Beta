package qc;

import java.util.regex.Pattern;
import ne.p;
public final class g extends h {
    public static final Pattern e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            ne.d dVar = new ne.d(1);
            dVar.h = a2;
            return dVar;
        }
        return null;
    }

    @Override
    public final char d() {
        return '<';
    }
}
