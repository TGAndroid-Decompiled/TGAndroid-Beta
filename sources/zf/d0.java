package zf;

import android.os.Bundle;
import com.google.android.gms.internal.cast.y4;
public abstract class d0 {
    public static int a(int i10, int i11, int i12) {
        return y4.o(i10) + i11 + i12;
    }

    public static Bundle b(long j10, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j10);
        return bundle;
    }
}
