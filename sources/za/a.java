package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f53051a;
    public final String f53052b;
    public final String f53053c;
    public final p d;
    public final ArrayList f53054e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f53051a = str;
        this.f53052b = versionName;
        this.f53053c = appBuildVersion;
        this.d = pVar;
        this.f53054e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f53051a.equals(aVar.f53051a) && kotlin.jvm.internal.i.a(this.f53052b, aVar.f53052b) && kotlin.jvm.internal.i.a(this.f53053c, aVar.f53053c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f53054e.equals(aVar.f53054e)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f53051a.hashCode() * 31, 31, this.f53052b), 31, this.f53053c), 31, Build.MANUFACTURER);
        return this.f53054e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f53051a + ", versionName=" + this.f53052b + ", appBuildVersion=" + this.f53053c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f53054e + ')';
    }
}
