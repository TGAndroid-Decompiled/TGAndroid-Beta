package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f49012a;
    public final String f49013b;
    public final String f49014c;
    public final r d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, r rVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f49012a = str;
        this.f49013b = versionName;
        this.f49014c = appBuildVersion;
        this.d = rVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f49012a.equals(aVar.f49012a) && kotlin.jvm.internal.i.a(this.f49013b, aVar.f49013b) && kotlin.jvm.internal.i.a(this.f49014c, aVar.f49014c)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f49012a.hashCode() * 31, 31, this.f49013b), 31, this.f49014c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f49012a + ", versionName=" + this.f49013b + ", appBuildVersion=" + this.f49014c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
