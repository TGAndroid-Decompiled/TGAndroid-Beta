package tc;

import java.io.IOException;
public abstract class g extends Exception {
    public final String f43310a;

    public g(String str, String str2) {
        super(str, null);
        this.f43310a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f43310a;
        if (str2 != null) {
            str = t8.b.i("; request-id: ", str2);
        } else {
            str = "";
        }
        return a4.a.s(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f43310a = str2;
    }
}
