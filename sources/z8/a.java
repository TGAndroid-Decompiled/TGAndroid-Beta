package z8;

import android.os.Parcel;
import org.telegram.messenger.AndroidUtilities;
public abstract class a {
    public static int a(Float f7, float f10) {
        return AndroidUtilities.dp(f7.floatValue() * f10);
    }

    public static UnsupportedOperationException b(Parcel parcel) {
        g8.a.b(parcel);
        return new UnsupportedOperationException();
    }
}
