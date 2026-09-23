package w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a(0);
    public final Bundle f44412a;

    public b(Object obj) {
        ArrayMap arrayMap = h.f44417a;
        String i10 = h.i(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(i10));
        }
        this.f44412a = h.o(obj, i10, new f(null, "", new ArrayDeque()));
    }

    public final Object a() {
        ArrayMap arrayMap = h.f44417a;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.f44412a;
        if (isLoggable) {
            String str = (String) h.f44418b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", "Unbundling ".concat(str));
        }
        return h.f(bundle, new f(null, "", new ArrayDeque()));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f44412a);
    }

    public b(Bundle bundle) {
        this.f44412a = bundle;
    }
}
