package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f51379a;
    public final String f51380b;
    public final String f51381c;
    public final p d;
    public final ArrayList f51382e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f51379a = str;
        this.f51380b = versionName;
        this.f51381c = appBuildVersion;
        this.d = pVar;
        this.f51382e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f51379a.equals(aVar.f51379a) && kotlin.jvm.internal.i.a(this.f51380b, aVar.f51380b) && kotlin.jvm.internal.i.a(this.f51381c, aVar.f51381c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f51382e.equals(aVar.f51382e)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f51379a.hashCode() * 31, 31, this.f51380b), 31, this.f51381c), 31, Build.MANUFACTURER);
        return this.f51382e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f51379a + ", versionName=" + this.f51380b + ", appBuildVersion=" + this.f51381c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f51382e + ')';
    }
}
