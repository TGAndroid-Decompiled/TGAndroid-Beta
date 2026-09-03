package uf;

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
import org.telegram.ui.qi1;
import vh.w2;
public final class s1 {
    public static volatile s1[] e = new s1[4];
    public static final Object[] f45502f = new Object[4];
    public final int f45503a;
    public boolean f45504b;
    public boolean f45505c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f45502f[i10] = new Object();
        }
    }

    public s1(int i10) {
        this.f45503a = i10;
    }

    public static s1 b(int i10) {
        s1 s1Var;
        s1 s1Var2 = e[i10];
        if (s1Var2 == null) {
            synchronized (f45502f[i10]) {
                try {
                    s1Var = e[i10];
                    if (s1Var == null) {
                        s1[] s1VarArr = e;
                        s1 s1Var3 = new s1(i10);
                        s1VarArr[i10] = s1Var3;
                        s1Var = s1Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return s1Var;
        }
        return s1Var2;
    }

    public static String e(TLRPC.TL_timezone tL_timezone, boolean z4) {
        if (tL_timezone == null) {
            return null;
        }
        if (z4) {
            return tL_timezone.name + ", " + f(tL_timezone);
        }
        return tL_timezone.name;
    }

    public static String f(TLRPC.TL_timezone tL_timezone) {
        String str;
        String str2;
        int i10 = tL_timezone.utc_offset;
        if (i10 == 0) {
            return "GMT";
        }
        if (i10 < 0) {
            str = "-";
        } else {
            str = "+";
        }
        String concat = "GMT".concat(str);
        int abs = Math.abs(tL_timezone.utc_offset) / 60;
        int i11 = abs / 60;
        int i12 = abs % 60;
        StringBuilder l10 = e2.c.l(concat);
        String str3 = "";
        if (i11 >= 10) {
            str2 = "";
        } else {
            str2 = "0";
        }
        l10.append(str2);
        l10.append(i11);
        StringBuilder l11 = e2.c.l(w2.k(l10.toString(), ":"));
        if (i12 < 10) {
            str3 = "0";
        }
        l11.append(str3);
        l11.append(i12);
        return l11.toString();
    }

    public final TLRPC.TL_timezone a(String str) {
        if (str == null) {
            return null;
        }
        g();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                return null;
            }
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i10);
            if (TextUtils.equals(tL_timezone.f19297id, str)) {
                return tL_timezone;
            }
            i10++;
        }
    }

    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: uf.s1.c():java.lang.String");
    }

    public final String d(String str, boolean z4) {
        String str2;
        TLRPC.TL_timezone a2 = a(str);
        if (a2 != null) {
            return e(a2, z4);
        }
        ZoneId of2 = ZoneId.of(str);
        String str3 = "";
        if (of2 == null) {
            return "";
        }
        if (z4) {
            String displayName = of2.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            str2 = "GMT";
            if (displayName.length() != 1 || displayName.charAt(0) != 'Z') {
                str2 = "GMT".concat(displayName);
            }
        } else {
            str2 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(of2.getId().replace("/", ", ").replace("_", " "));
        if (str2 != null) {
            str3 = ", ".concat(str2);
        }
        sb.append(str3);
        return sb.toString();
    }

    public final void g() {
        if (!this.f45504b && !this.f45505c) {
            this.f45504b = true;
            int i10 = this.f45503a;
            SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
            TLRPC.help_timezonesList help_timezoneslist = null;
            String string = mainSettings.getString("timezones", null);
            int i11 = 0;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                help_timezoneslist = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            }
            ArrayList arrayList = this.d;
            arrayList.clear();
            if (help_timezoneslist != null) {
                arrayList.addAll(help_timezoneslist.timezones);
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
            TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
            if (help_timezoneslist != null) {
                i11 = help_timezoneslist.hash;
            }
            tL_help_getTimezonesList.hash = i11;
            ConnectionsManager.getInstance(i10).sendRequest(tL_help_getTimezonesList, new qi1(11, this, mainSettings));
        }
    }
}
