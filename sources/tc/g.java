package tc;

import java.io.IOException;
public abstract class g extends Exception {
    public final String f46946a;

    public g(String str, String str2) {
        super(str, null);
        this.f46946a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f46946a;
        if (str2 != null) {
            str = sa.e.i("; request-id: ", str2);
        } else {
            str = "";
        }
        return a4.a.t(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f46946a = str2;
    }
}
