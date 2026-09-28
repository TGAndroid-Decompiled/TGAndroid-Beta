package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f49011a;
    public final String f49012b;
    public final String f49013c;
    public final r d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, r rVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f49011a = str;
        this.f49012b = versionName;
        this.f49013c = appBuildVersion;
        this.d = rVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f49011a.equals(aVar.f49011a) && kotlin.jvm.internal.i.a(this.f49012b, aVar.f49012b) && kotlin.jvm.internal.i.a(this.f49013c, aVar.f49013c)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f49011a.hashCode() * 31, 31, this.f49012b), 31, this.f49013c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f49011a + ", versionName=" + this.f49012b + ", appBuildVersion=" + this.f49013c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
