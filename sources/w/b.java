package w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a(0);
    public final Bundle f57005a;

    public b(Object obj) {
        ArrayMap arrayMap = g.f57010a;
        String i3 = g.i(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(i3));
        }
        this.f57005a = g.o(obj, i3, new e(null, "", new ArrayDeque()));
    }

    public final Object a() {
        ArrayMap arrayMap = g.f57010a;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.f57005a;
        if (isLoggable) {
            String str = (String) g.f57011b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", "Unbundling ".concat(str));
        }
        return g.f(bundle, new e(null, "", new ArrayDeque()));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeBundle(this.f57005a);
    }

    public b(Bundle bundle) {
        this.f57005a = bundle;
    }
}
