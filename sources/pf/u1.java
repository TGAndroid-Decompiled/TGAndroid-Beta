package pf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o71;
public final class u1 {
    public static volatile u1[] f45792e = new u1[4];
    public static final Object[] f45793f = new Object[4];
    public final int f45794a;
    public boolean f45795b;
    public boolean f45796c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            f45793f[i9] = new Object();
        }
    }

    public u1(int i9) {
        this.f45794a = i9;
    }

    public static u1 b(int i9) {
        u1 u1Var;
        u1 u1Var2 = f45792e[i9];
        if (u1Var2 == null) {
            synchronized (f45793f[i9]) {
                try {
                    u1Var = f45792e[i9];
                    if (u1Var == null) {
                        u1[] u1VarArr = f45792e;
                        u1 u1Var3 = new u1(i9);
                        u1VarArr[i9] = u1Var3;
                        u1Var = u1Var3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return u1Var;
        }
        return u1Var2;
    }

    public static String e(TLRPC.TL_timezone tL_timezone, boolean z10) {
        if (tL_timezone == null) {
            return null;
        }
        if (z10) {
            return tL_timezone.name + ", " + f(tL_timezone);
        }
        return tL_timezone.name;
    }

    public static String f(TLRPC.TL_timezone tL_timezone) {
        String str;
        String str2;
        int i9 = tL_timezone.utc_offset;
        if (i9 == 0) {
            return "GMT";
        }
        if (i9 < 0) {
            str = "-";
        } else {
            str = "+";
        }
        String concat = "GMT".concat(str);
        int abs = Math.abs(tL_timezone.utc_offset) / 60;
        int i10 = abs / 60;
        int i11 = abs % 60;
        StringBuilder n10 = e2.c.n(concat);
        String str3 = "";
        if (i10 >= 10) {
            str2 = "";
        } else {
            str2 = "0";
        }
        n10.append(str2);
        n10.append(i10);
        StringBuilder n11 = e2.c.n(ta.b.j(n10.toString(), ":"));
        if (i11 < 10) {
            str3 = "0";
        }
        n11.append(str3);
        n11.append(i11);
        return n11.toString();
    }

    public final TLRPC.TL_timezone a(String str) {
        if (str == null) {
            return null;
        }
        g();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i9 >= arrayList.size()) {
                return null;
            }
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i9);
            if (TextUtils.equals(tL_timezone.f22518id, str)) {
                return tL_timezone;
            }
            i9++;
        }
    }

    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: pf.u1.c():java.lang.String");
    }

    public final String d(String str, boolean z10) {
        String str2;
        TLRPC.TL_timezone a2 = a(str);
        if (a2 != null) {
            return e(a2, z10);
        }
        ZoneId of2 = ZoneId.of(str);
        String str3 = "";
        if (of2 == null) {
            return "";
        }
        if (z10) {
            String displayName = of2.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            str2 = "GMT";
            if (displayName.length() != 1 || displayName.charAt(0) != 'Z') {
                str2 = "GMT".concat(displayName);
            }
        } else {
            str2 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(of2.getId().replace("/", ", ").replace("_", " "));
        if (str2 != null) {
            str3 = ", ".concat(str2);
        }
        sb2.append(str3);
        return sb2.toString();
    }

    public final void g() {
        if (!this.f45795b && !this.f45796c) {
            this.f45795b = true;
            int i9 = this.f45794a;
            SharedPreferences mainSettings = MessagesController.getInstance(i9).getMainSettings();
            TLRPC.help_timezonesList help_timezoneslist = null;
            String string = mainSettings.getString("timezones", null);
            int i10 = 0;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                help_timezoneslist = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            }
            ArrayList arrayList = this.d;
            arrayList.clear();
            if (help_timezoneslist != null) {
                arrayList.addAll(help_timezoneslist.timezones);
            }
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
            TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
            if (help_timezoneslist != null) {
                i10 = help_timezoneslist.hash;
            }
            tL_help_getTimezonesList.hash = i10;
            ConnectionsManager.getInstance(i9).sendRequest(tL_help_getTimezonesList, new o71(10, this, mainSettings));
        }
    }
}
