package xd;

import java.io.Serializable;
import java.util.regex.Pattern;
public final class c implements Serializable {
    public final Pattern f45086a;

    public c() {
        Pattern compile = Pattern.compile("^[a-zA-Z0-9/_]{1,100}$");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        this.f45086a = compile;
    }

    public final String toString() {
        String pattern = this.f45086a.toString();
        kotlin.jvm.internal.i.d(pattern, "toString(...)");
        return pattern;
    }
}
