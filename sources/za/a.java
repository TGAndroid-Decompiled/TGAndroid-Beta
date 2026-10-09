package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f54182a;
    public final String f54183b;
    public final String f54184c;
    public final q d;
    public final ArrayList f54185e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f54182a = str;
        this.f54183b = versionName;
        this.f54184c = appBuildVersion;
        this.d = qVar;
        this.f54185e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54182a.equals(aVar.f54182a) && kotlin.jvm.internal.i.a(this.f54183b, aVar.f54183b) && kotlin.jvm.internal.i.a(this.f54184c, aVar.f54184c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f54185e.equals(aVar.f54185e)) {
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
        int h = a1.g.h(a1.g.h(a1.g.h(this.f54182a.hashCode() * 31, 31, this.f54183b), 31, this.f54184c), 31, Build.MANUFACTURER);
        return this.f54185e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f54182a + ", versionName=" + this.f54183b + ", appBuildVersion=" + this.f54184c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f54185e + ')';
    }
}
