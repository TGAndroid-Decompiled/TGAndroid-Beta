package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f49056a;
    public final String f49057b;
    public final String f49058c;
    public final p d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f49056a = str;
        this.f49057b = versionName;
        this.f49058c = appBuildVersion;
        this.d = pVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f49056a.equals(aVar.f49056a) && kotlin.jvm.internal.i.a(this.f49057b, aVar.f49057b) && kotlin.jvm.internal.i.a(this.f49058c, aVar.f49058c)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f49056a.hashCode() * 31, 31, this.f49057b), 31, this.f49058c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f49056a + ", versionName=" + this.f49057b + ", appBuildVersion=" + this.f49058c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
