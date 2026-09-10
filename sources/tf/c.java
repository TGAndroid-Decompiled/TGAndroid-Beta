package tf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import bi.c2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.web.x1;
public final class c {
    public static volatile long f42128g;
    public static volatile long h;
    public static final HashSet f42129i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f42130a;
    public final int f42132c;
    public int d;
    public boolean f42133f;
    public String f42131b = null;
    public final ArrayList e = new ArrayList();

    public c(int i10) {
        this.f42132c = i10;
        this.f42130a = UserConfig.getInstance(i10).clientUserId;
        SharedPreferences d = d();
        try {
            f42128g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f17201id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f42125a = document;
        int i10 = this.d;
        this.d = i10 + 1;
        obj.f42127c = i10;
        obj.d = false;
        this.e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f42133f) {
            f(true);
            this.f42133f = true;
        }
        Utilities.globalQueue.postRunnable(new x1(26, this, new ArrayList(this.e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.e;
        if (!this.f42133f) {
            f(true);
            this.f42133f = true;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (arrayList.get(i10) != null && ((b) arrayList.get(i10)).f42125a != null && ((b) arrayList.get(i10)).f42125a.f17201id == j3) {
                    return ((b) arrayList.get(i10)).f42125a;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f42131b == null) {
            this.f42131b = "ringtones_pref_" + this.f42130a;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.f42131b, 0);
    }

    public final String e(long j3) {
        if (!this.f42133f) {
            f(true);
            this.f42133f = true;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                if (((b) arrayList.get(i10)).f42125a != null && ((b) arrayList.get(i10)).f42125a.f17201id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i10)).f42126b)) {
                        return ((b) arrayList.get(i10)).f42126b;
                    }
                    return FileLoader.getInstance(this.f42132c).getPathToAttach(((b) arrayList.get(i10)).f42125a).toString();
                }
                i10++;
            } else {
                return "NoSound";
            }
        }
    }

    public final void f(boolean z10) {
        boolean z11;
        SharedPreferences d = d();
        int i10 = d.getInt("count", 0);
        ArrayList arrayList = this.e;
        arrayList.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = d.getString("tone_document" + i11, "");
            String string2 = d.getString("tone_local_path" + i11, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f42125a = TLdeserialize;
                obj.f42126b = string2;
                int i12 = this.d;
                this.d = i12 + 1;
                obj.f42127c = i12;
                arrayList.add(obj);
            } finally {
                if (!z11) {
                }
            }
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new a(this, 1));
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        if (!z10 && System.currentTimeMillis() - h <= 86400000) {
            z11 = false;
        } else {
            z11 = true;
        }
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = f42128g;
        if (z11) {
            ConnectionsManager.getInstance(this.f42132c).sendRequest(getsavedringtones, new c2(this, 19));
            return;
        }
        if (!this.f42133f) {
            f(true);
            this.f42133f = true;
        }
        b();
    }

    public final void h() {
        SharedPreferences d = d();
        d.edit().clear().apply();
        SharedPreferences.Editor edit = d.edit();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                if (!((b) arrayList.get(i10)).d) {
                    i11++;
                    TLRPC.Document document = ((b) arrayList.get(i10)).f42125a;
                    String str = ((b) arrayList.get(i10)).f42126b;
                    SerializedData serializedData = new SerializedData(document.getObjectSize());
                    document.serializeToStream(serializedData);
                    edit.putString("tone_document" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
                    if (str != null) {
                        edit.putString("tone_local_path" + i10, str);
                    }
                }
                i10++;
            } else {
                edit.putInt("count", i11);
                edit.apply();
                NotificationCenter.getInstance(this.f42132c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
        }
    }
}
