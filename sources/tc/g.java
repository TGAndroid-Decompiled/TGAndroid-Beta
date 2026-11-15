package tc;

import a8.p0;
import java.io.IOException;
public abstract class g extends Exception {
    public final String f57077a;

    public g(String str, String str2) {
        super(str, null);
        this.f57077a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f57077a;
        if (str2 != null) {
            str = r.b.k("; request-id: ", str2);
        } else {
            str = "";
        }
        return p0.s(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f57077a = str2;
    }
}
