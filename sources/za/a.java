package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f47857a;
    public final String f47858b;
    public final String f47859c;
    public final p d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f47857a = str;
        this.f47858b = versionName;
        this.f47859c = appBuildVersion;
        this.d = pVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f47857a.equals(aVar.f47857a) && kotlin.jvm.internal.i.a(this.f47858b, aVar.f47858b) && kotlin.jvm.internal.i.a(this.f47859c, aVar.f47859c)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f47857a.hashCode() * 31, 31, this.f47858b), 31, this.f47859c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f47857a + ", versionName=" + this.f47858b + ", appBuildVersion=" + this.f47859c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
