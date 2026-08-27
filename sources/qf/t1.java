package qf;

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
import org.telegram.ui.rc1;

public final class t1 {

    public static volatile t1[] f46456e = new t1[4];

    public static final Object[] f46457f = new Object[4];

    public final int f46458a;

    public boolean f46459b;

    public boolean f46460c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f46457f[i10] = new Object();
        }
    }

    public t1(int i10) {
        this.f46458a = i10;
    }

    public static t1 b(int i10) {
        t1 t1Var;
        t1 t1Var2 = f46456e[i10];
        if (t1Var2 != null) {
            return t1Var2;
        }
        synchronized (f46457f[i10]) {
            try {
                t1Var = f46456e[i10];
                if (t1Var == null) {
                    t1[] t1VarArr = f46456e;
                    t1 t1Var3 = new t1(i10);
                    t1VarArr[i10] = t1Var3;
                    t1Var = t1Var3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t1Var;
    }

    public static String e(TLRPC.TL_timezone tL_timezone, boolean z10) {
        if (tL_timezone == null) {
            return null;
        }
        if (!z10) {
            return tL_timezone.name;
        }
        return tL_timezone.name + ", " + f(tL_timezone);
    }

    public static String f(TLRPC.TL_timezone tL_timezone) {
        int i10 = tL_timezone.utc_offset;
        if (i10 == 0) {
            return "GMT";
        }
        String strConcat = "GMT".concat(i10 < 0 ? "-" : "+");
        int iAbs = Math.abs(tL_timezone.utc_offset) / 60;
        int i11 = iAbs / 60;
        int i12 = iAbs % 60;
        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(strConcat);
        sbO.append(i11 < 10 ? "0" : "");
        sbO.append(i11);
        StringBuilder sbO2 = com.google.android.recaptcha.internal.a.o(s3.c.l(sbO.toString(), ":"));
        sbO2.append(i12 < 10 ? "0" : "");
        sbO2.append(i12);
        return sbO2.toString();
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
            if (TextUtils.equals(tL_timezone.f22518id, str)) {
                return tL_timezone;
            }
            i10++;
        }
    }

    public final String c() {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        String id2 = zoneIdSystemDefault != null ? zoneIdSystemDefault.getId() : null;
        if (this.f46459b || !this.f46460c) {
            g();
            return id2;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                int totalSeconds = zoneIdSystemDefault != null ? zoneIdSystemDefault.getRules().getOffset(Instant.now()).getTotalSeconds() : 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i11);
                    if (totalSeconds == tL_timezone.utc_offset) {
                        return tL_timezone.f22518id;
                    }
                }
                if (arrayList.isEmpty()) {
                    break;
                }
                return ((TLRPC.TL_timezone) arrayList.get(0)).f22518id;
            }
            if (TextUtils.equals(((TLRPC.TL_timezone) arrayList.get(i10)).f22518id, id2)) {
                break;
            }
            i10++;
        }
        return id2;
    }

    public final String d(String str, boolean z10) {
        String strConcat;
        TLRPC.TL_timezone tL_timezoneA = a(str);
        if (tL_timezoneA != null) {
            return e(tL_timezoneA, z10);
        }
        ZoneId zoneIdOf = ZoneId.of(str);
        if (zoneIdOf == null) {
            return "";
        }
        if (z10) {
            String displayName = zoneIdOf.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            strConcat = "GMT";
            if (displayName.length() != 1 || displayName.charAt(0) != 'Z') {
                strConcat = "GMT".concat(displayName);
            }
        } else {
            strConcat = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zoneIdOf.getId().replace("/", ", ").replace("_", " "));
        sb2.append(strConcat != null ? ", ".concat(strConcat) : "");
        return sb2.toString();
    }

    public final void g() {
        if (this.f46459b || this.f46460c) {
            return;
        }
        this.f46459b = true;
        int i10 = this.f46458a;
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        TLRPC.help_timezonesList help_timezoneslistTLdeserialize = null;
        String string = mainSettings.getString("timezones", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            help_timezoneslistTLdeserialize = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (help_timezoneslistTLdeserialize != null) {
            arrayList.addAll(help_timezoneslistTLdeserialize.timezones);
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
        TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
        tL_help_getTimezonesList.hash = help_timezoneslistTLdeserialize != null ? help_timezoneslistTLdeserialize.hash : 0;
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_getTimezonesList, new rc1(10, this, mainSettings));
    }
}
