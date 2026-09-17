package za;

import android.os.Build;
public final class b {
    public final String f51385a;
    public final a f51386b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.i.e(osVersion, "osVersion");
        this.f51385a = appId;
        this.f51386b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.a(this.f51385a, bVar.f51385a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.i.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!kotlin.jvm.internal.i.a(str2, str2) || !this.f51386b.equals(bVar.f51386b)) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int h = a4.a.h((((Build.MODEL.hashCode() + (this.f51385a.hashCode() * 31)) * 31) + 46672439) * 31, 31, Build.VERSION.RELEASE);
        return this.f51386b.hashCode() + ((o.LOG_ENVIRONMENT_PROD.hashCode() + h) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f51385a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.2.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + o.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f51386b + ')';
    }
}
