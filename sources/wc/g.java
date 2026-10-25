package wc;

import java.io.IOException;
import org.telegram.ui.Components.b10;
public abstract class g extends Exception {
    public final String f51155a;

    public g(String str, String str2) {
        super(str, null);
        this.f51155a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f51155a;
        if (str2 != null) {
            str = b10.j("; request-id: ", str2);
        } else {
            str = "";
        }
        return a1.g.s(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f51155a = str2;
    }
}
