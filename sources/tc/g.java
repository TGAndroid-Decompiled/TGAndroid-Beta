package tc;

import java.io.IOException;
import v7.j;
public abstract class g extends Exception {
    public final String f43340a;

    public g(String str, String str2) {
        super(str, null);
        this.f43340a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f43340a;
        if (str2 != null) {
            str = j.g("; request-id: ", str2);
        } else {
            str = "";
        }
        return a4.a.t(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f43340a = str2;
    }
}
