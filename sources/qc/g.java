package qc;

import java.io.IOException;
public abstract class g extends Exception {
    public final String f53836a;

    public g(String str, String str2) {
        super(str, null);
        this.f53836a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f53836a;
        if (str2 != null) {
            str = t4.c.f("; request-id: ", str2);
        } else {
            str = "";
        }
        return a1.g.s(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f53836a = str2;
    }
}
