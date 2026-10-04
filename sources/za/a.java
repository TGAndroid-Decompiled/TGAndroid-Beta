package za;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f53056a;
    public final String f53057b;
    public final String f53058c;
    public final p d;
    public final ArrayList f53059e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f53056a = str;
        this.f53057b = versionName;
        this.f53058c = appBuildVersion;
        this.d = pVar;
        this.f53059e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f53056a.equals(aVar.f53056a) && kotlin.jvm.internal.i.a(this.f53057b, aVar.f53057b) && kotlin.jvm.internal.i.a(this.f53058c, aVar.f53058c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f53059e.equals(aVar.f53059e)) {
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
        int h = a4.a.h(a4.a.h(a4.a.h(this.f53056a.hashCode() * 31, 31, this.f53057b), 31, this.f53058c), 31, Build.MANUFACTURER);
        return this.f53059e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f53056a + ", versionName=" + this.f53057b + ", appBuildVersion=" + this.f53058c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f53059e + ')';
    }
}
