package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f53077a;
    public final String f53078b;
    public final String f53079c;
    public final p d;
    public final ArrayList f53080e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f53077a = str;
        this.f53078b = versionName;
        this.f53079c = appBuildVersion;
        this.d = pVar;
        this.f53080e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f53077a.equals(aVar.f53077a) && kotlin.jvm.internal.i.a(this.f53078b, aVar.f53078b) && kotlin.jvm.internal.i.a(this.f53079c, aVar.f53079c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f53080e.equals(aVar.f53080e)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f53077a.hashCode() * 31, 31, this.f53078b), 31, this.f53079c), 31, Build.MANUFACTURER);
        return this.f53080e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f53077a + ", versionName=" + this.f53078b + ", appBuildVersion=" + this.f53079c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f53080e + ')';
    }
}
