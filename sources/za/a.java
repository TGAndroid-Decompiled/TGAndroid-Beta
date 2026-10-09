package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f54180a;
    public final String f54181b;
    public final String f54182c;
    public final q d;
    public final ArrayList f54183e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f54180a = str;
        this.f54181b = versionName;
        this.f54182c = appBuildVersion;
        this.d = qVar;
        this.f54183e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54180a.equals(aVar.f54180a) && kotlin.jvm.internal.i.a(this.f54181b, aVar.f54181b) && kotlin.jvm.internal.i.a(this.f54182c, aVar.f54182c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f54183e.equals(aVar.f54183e)) {
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
        int h = a1.g.h(a1.g.h(a1.g.h(this.f54180a.hashCode() * 31, 31, this.f54181b), 31, this.f54182c), 31, Build.MANUFACTURER);
        return this.f54183e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f54180a + ", versionName=" + this.f54181b + ", appBuildVersion=" + this.f54182c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f54183e + ')';
    }
}
