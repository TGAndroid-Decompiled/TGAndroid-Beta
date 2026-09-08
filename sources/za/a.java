package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f51409a;
    public final String f51410b;
    public final String f51411c;
    public final p d;
    public final ArrayList f51412e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f51409a = str;
        this.f51410b = versionName;
        this.f51411c = appBuildVersion;
        this.d = pVar;
        this.f51412e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f51409a.equals(aVar.f51409a) && kotlin.jvm.internal.i.a(this.f51410b, aVar.f51410b) && kotlin.jvm.internal.i.a(this.f51411c, aVar.f51411c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f51412e.equals(aVar.f51412e)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f51409a.hashCode() * 31, 31, this.f51410b), 31, this.f51411c), 31, Build.MANUFACTURER);
        return this.f51412e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f51409a + ", versionName=" + this.f51410b + ", appBuildVersion=" + this.f51411c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f51412e + ')';
    }
}
