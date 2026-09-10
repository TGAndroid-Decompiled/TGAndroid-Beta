package xd;

import java.nio.charset.Charset;
public abstract class a {
    public static final Charset f45082a;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.i.d(forName, "forName(...)");
        f45082a = forName;
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("US-ASCII"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
