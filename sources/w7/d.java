package w7;

import android.os.Bundle;
import android.os.Parcelable;
import b6.m;
public abstract class d {
    public static Parcelable a(String str, Bundle bundle) {
        ClassLoader classLoader = d.class.getClassLoader();
        m.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void b(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a2 = a("MapOptions", bundle);
            if (a2 != null) {
                c(bundle2, "MapOptions", a2);
            }
            Parcelable a10 = a("StreetViewPanoramaOptions", bundle);
            if (a10 != null) {
                c(bundle2, "StreetViewPanoramaOptions", a10);
            }
            Parcelable a11 = a("camera", bundle);
            if (a11 != null) {
                c(bundle2, "camera", a11);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = d.class.getClassLoader();
        m.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
