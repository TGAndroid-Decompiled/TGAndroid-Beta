package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f54305a;
    public final String f54306b;
    public final String f54307c;
    public final q d;
    public final ArrayList f54308e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f54305a = str;
        this.f54306b = versionName;
        this.f54307c = appBuildVersion;
        this.d = qVar;
        this.f54308e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54305a.equals(aVar.f54305a) && kotlin.jvm.internal.i.a(this.f54306b, aVar.f54306b) && kotlin.jvm.internal.i.a(this.f54307c, aVar.f54307c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f54308e.equals(aVar.f54308e)) {
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
        int h = a1.g.h(a1.g.h(a1.g.h(this.f54305a.hashCode() * 31, 31, this.f54306b), 31, this.f54307c), 31, Build.MANUFACTURER);
        return this.f54308e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f54305a + ", versionName=" + this.f54306b + ", appBuildVersion=" + this.f54307c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f54308e + ')';
    }
}
