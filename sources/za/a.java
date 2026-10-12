package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f54408a;
    public final String f54409b;
    public final String f54410c;
    public final q d;
    public final ArrayList f54411e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f54408a = str;
        this.f54409b = versionName;
        this.f54410c = appBuildVersion;
        this.d = qVar;
        this.f54411e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54408a.equals(aVar.f54408a) && kotlin.jvm.internal.i.a(this.f54409b, aVar.f54409b) && kotlin.jvm.internal.i.a(this.f54410c, aVar.f54410c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f54411e.equals(aVar.f54411e)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int h = a1.g.h(a1.g.h(a1.g.h(this.f54408a.hashCode() * 31, 31, this.f54409b), 31, this.f54410c), 31, Build.MANUFACTURER);
        return this.f54411e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f54408a + ", versionName=" + this.f54409b + ", appBuildVersion=" + this.f54410c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f54411e + ')';
    }
}
