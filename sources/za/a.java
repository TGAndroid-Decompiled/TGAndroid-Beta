package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f53050a;
    public final String f53051b;
    public final String f53052c;
    public final p d;
    public final ArrayList f53053e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f53050a = str;
        this.f53051b = versionName;
        this.f53052c = appBuildVersion;
        this.d = pVar;
        this.f53053e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f53050a.equals(aVar.f53050a) && kotlin.jvm.internal.i.a(this.f53051b, aVar.f53051b) && kotlin.jvm.internal.i.a(this.f53052c, aVar.f53052c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f53053e.equals(aVar.f53053e)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f53050a.hashCode() * 31, 31, this.f53051b), 31, this.f53052c), 31, Build.MANUFACTURER);
        return this.f53053e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f53050a + ", versionName=" + this.f53051b + ", appBuildVersion=" + this.f53052c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f53053e + ')';
    }
}
