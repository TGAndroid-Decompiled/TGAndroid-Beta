package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f51410a;
    public final String f51411b;
    public final String f51412c;
    public final p d;
    public final ArrayList f51413e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f51410a = str;
        this.f51411b = versionName;
        this.f51412c = appBuildVersion;
        this.d = pVar;
        this.f51413e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f51410a.equals(aVar.f51410a) && kotlin.jvm.internal.i.a(this.f51411b, aVar.f51411b) && kotlin.jvm.internal.i.a(this.f51412c, aVar.f51412c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f51413e.equals(aVar.f51413e)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f51410a.hashCode() * 31, 31, this.f51411b), 31, this.f51412c), 31, Build.MANUFACTURER);
        return this.f51413e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f51410a + ", versionName=" + this.f51411b + ", appBuildVersion=" + this.f51412c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f51413e + ')';
    }
}
