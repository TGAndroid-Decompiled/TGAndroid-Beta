package vc;

import java.io.IOException;
import si.o0;
public abstract class g extends Exception {
    public final String f48780a;

    public g(String str, String str2) {
        super(str, null);
        this.f48780a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f48780a;
        if (str2 != null) {
            str = o0.h("; request-id: ", str2);
        } else {
            str = "";
        }
        return a1.g.s(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f48780a = str2;
    }
}
