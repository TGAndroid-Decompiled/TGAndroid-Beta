package w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a(0);
    public final Bundle f57565a;

    public b(Object obj) {
        ArrayMap arrayMap = g.f57570a;
        String i7 = g.i(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(i7));
        }
        this.f57565a = g.o(obj, i7, new e(null, "", new ArrayDeque()));
    }

    public final Object a() {
        ArrayMap arrayMap = g.f57570a;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.f57565a;
        if (isLoggable) {
            String str = (String) g.f57571b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
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
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeBundle(this.f57565a);
    }

    public b(Bundle bundle) {
        this.f57565a = bundle;
    }
}
