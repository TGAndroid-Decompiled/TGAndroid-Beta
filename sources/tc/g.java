package tc;

import java.io.IOException;
import org.telegram.ui.Cells.r6;
public abstract class g extends Exception {
    public final String f42122a;

    public g(String str, String str2) {
        super(str, null);
        this.f42122a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f42122a;
        if (str2 != null) {
            str = r6.i("; request-id: ", str2);
        } else {
            str = "";
        }
        return a4.a.s(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f42122a = str2;
    }
}
