package y5;

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class i {

    public static final c9.b f49649b = new c9.b("LibraryVersion", "");

    public static final i f49650c = new i();

    public final ConcurrentHashMap f49651a = new ConcurrentHashMap();

    public final String a(String str) throws Throwable {
        IOException e9;
        String str2;
        InputStream resourceAsStream;
        c9.b bVar = f49649b;
        l.g(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f49651a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = i.class.getResourceAsStream("/" + str + ".properties");
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        String strConcat = str + " version is " + property;
                        if (Log.isLoggable(bVar.f2566b, 2)) {
                            String str3 = bVar.f2567c;
                            if (str3 != null) {
                                strConcat = str3.concat(strConcat);
                            }
                            Log.v("LibraryVersion", strConcat);
                        }
                    } else {
                        String strConcat2 = "Failed to get app version for libraryName: " + str;
                        if (Log.isLoggable(bVar.f2566b, 5)) {
                            String str4 = bVar.f2567c;
                            if (str4 != null) {
                                strConcat2 = str4.concat(strConcat2);
                            }
                            Log.w("LibraryVersion", strConcat2);
                        }
                    }
                } catch (IOException e10) {
                    e9 = e10;
                    inputStream = resourceAsStream;
                    str2 = null;
                    String strConcat3 = "Failed to get app version for libraryName: " + str;
                    if (Log.isLoggable(bVar.f2566b, 6)) {
                        String str5 = bVar.f2567c;
                        if (str5 != null) {
                            strConcat3 = str5.concat(strConcat3);
                        }
                        Log.e("LibraryVersion", strConcat3, e9);
                    }
                    InputStream inputStream2 = inputStream;
                    property = str2;
                    resourceAsStream = inputStream2;
                } catch (Throwable th) {
                    th = th;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        f6.b.a(inputStream);
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e9 = e11;
                str2 = null;
            }
            if (resourceAsStream != null) {
                f6.b.a(resourceAsStream);
            }
            if (property == null) {
                if (Log.isLoggable(bVar.f2566b, 3)) {
                    String str6 = bVar.f2567c;
                    Log.d("LibraryVersion", str6 != null ? str6.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                property = "UNKNOWN";
            }
            concurrentHashMap.put(str, property);
            return property;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
