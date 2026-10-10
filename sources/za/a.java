package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f54226a;
    public final String f54227b;
    public final String f54228c;
    public final q d;
    public final ArrayList f54229e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f54226a = str;
        this.f54227b = versionName;
        this.f54228c = appBuildVersion;
        this.d = qVar;
        this.f54229e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54226a.equals(aVar.f54226a) && kotlin.jvm.internal.i.a(this.f54227b, aVar.f54227b) && kotlin.jvm.internal.i.a(this.f54228c, aVar.f54228c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f54229e.equals(aVar.f54229e)) {
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
        int h = a1.g.h(a1.g.h(a1.g.h(this.f54226a.hashCode() * 31, 31, this.f54227b), 31, this.f54228c), 31, Build.MANUFACTURER);
        return this.f54229e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f54226a + ", versionName=" + this.f54227b + ", appBuildVersion=" + this.f54228c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f54229e + ')';
    }
}
