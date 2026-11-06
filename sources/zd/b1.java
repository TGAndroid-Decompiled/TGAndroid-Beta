package zd;

import java.util.concurrent.CancellationException;
public final class b1 extends CancellationException {
    public final transient a1 f59952a;

    public b1(String str, Throwable th2, a1 a1Var) {
        super(str);
        this.f59952a = a1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b1) {
                b1 b1Var = (b1) obj;
                if (!kotlin.jvm.internal.j.a(b1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.j.a(b1Var.f59952a, this.f59952a) || !kotlin.jvm.internal.j.a(b1Var.getCause(), getCause())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i7;
        String message = getMessage();
        kotlin.jvm.internal.j.b(message);
        int hashCode = (this.f59952a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i7 = cause.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }

    @Override
    public final String toString() {
        return super.toString() + "; job=" + this.f59952a;
    }
}
