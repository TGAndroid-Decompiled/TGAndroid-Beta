package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f54416a;
    public final String f54417b;
    public final String f54418c;
    public final q d;
    public final ArrayList f54419e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f54416a = str;
        this.f54417b = versionName;
        this.f54418c = appBuildVersion;
        this.d = qVar;
        this.f54419e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54416a.equals(aVar.f54416a) && kotlin.jvm.internal.i.a(this.f54417b, aVar.f54417b) && kotlin.jvm.internal.i.a(this.f54418c, aVar.f54418c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f54419e.equals(aVar.f54419e)) {
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
        int h = a1.g.h(a1.g.h(a1.g.h(this.f54416a.hashCode() * 31, 31, this.f54417b), 31, this.f54418c), 31, Build.MANUFACTURER);
        return this.f54419e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f54416a + ", versionName=" + this.f54417b + ", appBuildVersion=" + this.f54418c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f54419e + ')';
    }
}
