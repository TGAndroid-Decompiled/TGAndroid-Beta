package uf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import bi.v7;
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
import org.telegram.ui.web.g1;
public final class c {
    public static volatile long f47056g;
    public static volatile long h;
    public static final HashSet f47057i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f47058a;
    public final int f47060c;
    public int d;
    public boolean f47062f;
    public String f47059b = null;
    public final ArrayList f47061e = new ArrayList();

    public c(int i10) {
        this.f47060c = i10;
        this.f47058a = UserConfig.getInstance(i10).clientUserId;
        SharedPreferences d = d();
        try {
            f47056g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f19902id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f47053a = document;
        int i10 = this.d;
        this.d = i10 + 1;
        obj.f47055c = i10;
        obj.d = false;
        this.f47061e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f47062f) {
            f(true);
            this.f47062f = true;
        }
        Utilities.globalQueue.postRunnable(new g1(26, this, new ArrayList(this.f47061e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f47061e;
        if (!this.f47062f) {
            f(true);
            this.f47062f = true;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (arrayList.get(i10) != null && ((b) arrayList.get(i10)).f47053a != null && ((b) arrayList.get(i10)).f47053a.f19902id == j3) {
                    return ((b) arrayList.get(i10)).f47053a;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f47059b == null) {
            this.f47059b = "ringtones_pref_" + this.f47058a;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.f47059b, 0);
    }

    public final String e(long j3) {
        if (!this.f47062f) {
            f(true);
            this.f47062f = true;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47061e;
            if (i10 < arrayList.size()) {
                if (((b) arrayList.get(i10)).f47053a != null && ((b) arrayList.get(i10)).f47053a.f19902id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i10)).f47054b)) {
                        return ((b) arrayList.get(i10)).f47054b;
                    }
                    return FileLoader.getInstance(this.f47060c).getPathToAttach(((b) arrayList.get(i10)).f47053a).toString();
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
        ArrayList arrayList = this.f47061e;
        arrayList.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = d.getString("tone_document" + i11, "");
            String string2 = d.getString("tone_local_path" + i11, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f47053a = TLdeserialize;
                obj.f47054b = string2;
                int i12 = this.d;
                this.d = i12 + 1;
                obj.f47055c = i12;
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
        getsavedringtones.hash = f47056g;
        if (z11) {
            ConnectionsManager.getInstance(this.f47060c).sendRequest(getsavedringtones, new v7(this, 19));
            return;
        }
        if (!this.f47062f) {
            f(true);
            this.f47062f = true;
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
            ArrayList arrayList = this.f47061e;
            if (i10 < arrayList.size()) {
                if (!((b) arrayList.get(i10)).d) {
                    i11++;
                    TLRPC.Document document = ((b) arrayList.get(i10)).f47053a;
                    String str = ((b) arrayList.get(i10)).f47054b;
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
                NotificationCenter.getInstance(this.f47060c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
        }
    }
}
