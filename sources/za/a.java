package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f51378a;
    public final String f51379b;
    public final String f51380c;
    public final p d;
    public final ArrayList f51381e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f51378a = str;
        this.f51379b = versionName;
        this.f51380c = appBuildVersion;
        this.d = pVar;
        this.f51381e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f51378a.equals(aVar.f51378a) && kotlin.jvm.internal.i.a(this.f51379b, aVar.f51379b) && kotlin.jvm.internal.i.a(this.f51380c, aVar.f51380c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f51381e.equals(aVar.f51381e)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f51378a.hashCode() * 31, 31, this.f51379b), 31, this.f51380c), 31, Build.MANUFACTURER);
        return this.f51381e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f51378a + ", versionName=" + this.f51379b + ", appBuildVersion=" + this.f51380c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f51381e + ')';
    }
}
