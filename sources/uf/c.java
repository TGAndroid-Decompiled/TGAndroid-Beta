package uf;

import ai.n8;
import android.content.SharedPreferences;
import android.text.TextUtils;
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
import u2.i0;
public final class c {
    public static volatile long f47619g;
    public static volatile long h;
    public static final HashSet f47620i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f47621a;
    public final int f47623c;
    public int d;
    public boolean f47625f;
    public String f47622b = null;
    public final ArrayList f47624e = new ArrayList();

    public c(int i10) {
        this.f47623c = i10;
        this.f47621a = UserConfig.getInstance(i10).clientUserId;
        SharedPreferences d = d();
        try {
            f47619g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f20044id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f47616a = document;
        int i10 = this.d;
        this.d = i10 + 1;
        obj.f47618c = i10;
        obj.d = false;
        this.f47624e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f47625f) {
            f(true);
            this.f47625f = true;
        }
        Utilities.globalQueue.postRunnable(new i0(3, this, new ArrayList(this.f47624e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f47624e;
        if (!this.f47625f) {
            f(true);
            this.f47625f = true;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (arrayList.get(i10) != null && ((b) arrayList.get(i10)).f47616a != null && ((b) arrayList.get(i10)).f47616a.f20044id == j3) {
                    return ((b) arrayList.get(i10)).f47616a;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f47622b == null) {
            this.f47622b = "ringtones_pref_" + this.f47621a;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.f47622b, 0);
    }

    public final String e(long j3) {
        if (!this.f47625f) {
            f(true);
            this.f47625f = true;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47624e;
            if (i10 < arrayList.size()) {
                if (((b) arrayList.get(i10)).f47616a != null && ((b) arrayList.get(i10)).f47616a.f20044id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i10)).f47617b)) {
                        return ((b) arrayList.get(i10)).f47617b;
                    }
                    return FileLoader.getInstance(this.f47623c).getPathToAttach(((b) arrayList.get(i10)).f47616a).toString();
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
        ArrayList arrayList = this.f47624e;
        arrayList.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = d.getString("tone_document" + i11, "");
            String string2 = d.getString("tone_local_path" + i11, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f47616a = TLdeserialize;
                obj.f47617b = string2;
                int i12 = this.d;
                this.d = i12 + 1;
                obj.f47618c = i12;
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
        getsavedringtones.hash = f47619g;
        if (z11) {
            ConnectionsManager.getInstance(this.f47623c).sendRequest(getsavedringtones, new n8(this, 22));
            return;
        }
        if (!this.f47625f) {
            f(true);
            this.f47625f = true;
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
            ArrayList arrayList = this.f47624e;
            if (i10 < arrayList.size()) {
                if (!((b) arrayList.get(i10)).d) {
                    i11++;
                    TLRPC.Document document = ((b) arrayList.get(i10)).f47616a;
                    String str = ((b) arrayList.get(i10)).f47617b;
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
                NotificationCenter.getInstance(this.f47623c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
        }
    }
}
