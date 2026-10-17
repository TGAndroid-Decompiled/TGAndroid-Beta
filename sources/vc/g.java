package vc;

import java.io.IOException;
public abstract class g extends Exception {
    public final String f48354a;

    public g(String str, String str2) {
        super(str, null);
        this.f48354a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f48354a;
        if (str2 != null) {
            str = r.c.g("; request-id: ", str2);
        } else {
            str = "";
        }
        return a1.g.s(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f48354a = str2;
    }
}
