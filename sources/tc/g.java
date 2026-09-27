package tc;

import java.io.IOException;
import v7.k0;
public abstract class g extends Exception {
    public final String f43385a;

    public g(String str, String str2) {
        super(str, null);
        this.f43385a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f43385a;
        if (str2 != null) {
            str = k0.g("; request-id: ", str2);
        } else {
            str = "";
        }
        return a4.a.s(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f43385a = str2;
    }
}
