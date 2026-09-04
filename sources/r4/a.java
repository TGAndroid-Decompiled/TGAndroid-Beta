package r4;

import android.content.Context;
import java.io.File;
public abstract class a {
    public static File a(Context context) {
        return context.createDeviceProtectedStorageContext().getCodeCacheDir();
    }
}
