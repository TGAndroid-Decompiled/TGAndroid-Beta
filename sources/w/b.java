package w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a(0);

    public final Bundle f48919a;

    public b(Object obj) {
        ArrayMap arrayMap = g.f48924a;
        String strI = g.i(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(strI));
        }
        this.f48919a = g.o(obj, strI, new e(null, "", new ArrayDeque()));
    }

    public final Object a() {
        ArrayMap arrayMap = g.f48924a;
        boolean zIsLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.f48919a;
        if (zIsLoggable) {
            String str = (String) g.f48925b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
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
        parcel.writeBundle(this.f48919a);
    }

    public b(Bundle bundle) {
        this.f48919a = bundle;
    }
}
