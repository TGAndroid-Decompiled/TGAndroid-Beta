package w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a(0);
    public final Bundle f50639a;

    public b(Object obj) {
        ArrayMap arrayMap = g.f50644a;
        String i10 = g.i(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(i10));
        }
        this.f50639a = g.o(obj, i10, new e(null, "", new ArrayDeque()));
    }

    public final Object a() {
        ArrayMap arrayMap = g.f50644a;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.f50639a;
        if (isLoggable) {
            String str = (String) g.f50645b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
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
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f50639a);
    }

    public b(Bundle bundle) {
        this.f50639a = bundle;
    }
}
