package org.telegram.utils.twidget;

import android.graphics.fonts.Font;
import android.graphics.fonts.SystemFonts;
import android.os.Binder;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class o extends Binder {
    public static final String[] b = {"/system/fonts", "/product/fonts", "/system_ext/fonts", "/vendor/fonts", "/odm/fonts", "/data/fonts/files"};
    public static final String[] c = {"/data/misc/zoneinfo/current/tzdata", "/apex/com.android.tzdata/etc/tz/tzdata", "/system/usr/share/zoneinfo/tzdata"};
    public static o d;
    public volatile String[] a;

    public static String a(String str) {
        try {
            return new File(str).getCanonicalPath();
        } catch (IOException unused) {
            return null;
        }
    }

    public static synchronized o b() {
        o oVar;
        synchronized (o.class) {
            o oVar2 = d;
            oVar = oVar2;
            if (oVar2 == null) {
                ?? binder = new Binder();
                binder.attachInterface(null, "org.telegram.utils.twidget.WidgetFileGate");
                d = binder;
                oVar = binder;
            }
        }
        return oVar;
    }

    public final boolean c(String str) {
        String[] strArr = this.a;
        if (strArr == null) {
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            String[] strArr2 = b;
            for (int i = 0; i < 6; i++) {
                linkedHashSet.add(strArr2[i]);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    for (Font font : SystemFonts.getAvailableFonts()) {
                        File file = ku7.e(font).getFile();
                        if (file != null && file.getParent() != null) {
                            linkedHashSet.add(file.getParent());
                        }
                    }
                } catch (RuntimeException unused) {
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : linkedHashSet) {
                String a = a(str2);
                if (a != null && !a.equals("/") && a.split("/").length >= 3 && !arrayList.contains(a)) {
                    arrayList.add(a);
                }
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
            this.a = strArr;
        }
        for (String str3 : strArr) {
            if (str.startsWith(str3) && str.length() > str3.length() && str.charAt(str3.length()) == '/') {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.o.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
