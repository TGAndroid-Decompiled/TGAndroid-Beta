package tc;

import java.io.IOException;
import org.telegram.ui.Cells.q3;
public abstract class g extends Exception {
    public final String f43004a;

    public g(String str, String str2) {
        super(str, null);
        this.f43004a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f43004a;
        if (str2 != null) {
            str = q3.i("; request-id: ", str2);
        } else {
            str = "";
        }
        return a4.a.t(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f43004a = str2;
    }
}
