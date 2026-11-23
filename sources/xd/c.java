package xd;

import java.io.Serializable;
import java.util.regex.Pattern;
public final class c implements Serializable {
    public final Pattern f60578a;

    public c(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.j.d(compile, "compile(...)");
        this.f60578a = compile;
    }

    public final String toString() {
        String pattern = this.f60578a.toString();
        kotlin.jvm.internal.j.d(pattern, "toString(...)");
        return pattern;
    }
}
