package za;

import android.os.Build;
public final class b {
    public final String f49061a;
    public final a f49062b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.i.e(osVersion, "osVersion");
        this.f49061a = appId;
        this.f49062b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.a(this.f49061a, bVar.f49061a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.i.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!kotlin.jvm.internal.i.a(str2, str2) || !this.f49062b.equals(bVar.f49062b)) {
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
        int h = a4.a.h((((Build.MODEL.hashCode() + (this.f49061a.hashCode() * 31)) * 31) + 46672439) * 31, 31, Build.VERSION.RELEASE);
        return this.f49062b.hashCode() + ((o.LOG_ENVIRONMENT_PROD.hashCode() + h) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f49061a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.2.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + o.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f49062b + ')';
    }
}
