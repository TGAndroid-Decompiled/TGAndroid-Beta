package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f48683a;
    public final String f48684b;
    public final String f48685c;
    public final r d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, r rVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f48683a = str;
        this.f48684b = versionName;
        this.f48685c = appBuildVersion;
        this.d = rVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f48683a.equals(aVar.f48683a) && kotlin.jvm.internal.i.a(this.f48684b, aVar.f48684b) && kotlin.jvm.internal.i.a(this.f48685c, aVar.f48685c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.e.equals(aVar.e)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f48683a.hashCode() * 31, 31, this.f48684b), 31, this.f48685c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f48683a + ", versionName=" + this.f48684b + ", appBuildVersion=" + this.f48685c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
