package uc;

import java.io.IOException;
import sc.v;
public abstract class g extends Exception {
    public final String f48939a;

    public g(String str, String str2) {
        super(str, null);
        this.f48939a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f48939a;
        if (str2 != null) {
            str = v.i("; request-id: ", str2);
        } else {
            str = "";
        }
        return a1.g.t(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f48939a = str2;
    }
}
