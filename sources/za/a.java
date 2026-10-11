package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f54271a;
    public final String f54272b;
    public final String f54273c;
    public final q d;
    public final ArrayList f54274e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f54271a = str;
        this.f54272b = versionName;
        this.f54273c = appBuildVersion;
        this.d = qVar;
        this.f54274e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54271a.equals(aVar.f54271a) && kotlin.jvm.internal.i.a(this.f54272b, aVar.f54272b) && kotlin.jvm.internal.i.a(this.f54273c, aVar.f54273c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f54274e.equals(aVar.f54274e)) {
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
        int h = a1.g.h(a1.g.h(a1.g.h(this.f54271a.hashCode() * 31, 31, this.f54272b), 31, this.f54273c), 31, Build.MANUFACTURER);
        return this.f54274e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f54271a + ", versionName=" + this.f54272b + ", appBuildVersion=" + this.f54273c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f54274e + ')';
    }
}
