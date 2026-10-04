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
    public static volatile long f47627g;
    public static volatile long h;
    public static final HashSet f47628i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f47629a;
    public final int f47631c;
    public int d;
    public boolean f47633f;
    public String f47630b = null;
    public final ArrayList f47632e = new ArrayList();

    public c(int i10) {
        this.f47631c = i10;
        this.f47629a = UserConfig.getInstance(i10).clientUserId;
        SharedPreferences d = d();
        try {
            f47627g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f20048id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f47624a = document;
        int i10 = this.d;
        this.d = i10 + 1;
        obj.f47626c = i10;
        obj.d = false;
        this.f47632e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f47633f) {
            f(true);
            this.f47633f = true;
        }
        Utilities.globalQueue.postRunnable(new i0(3, this, new ArrayList(this.f47632e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f47632e;
        if (!this.f47633f) {
            f(true);
            this.f47633f = true;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (arrayList.get(i10) != null && ((b) arrayList.get(i10)).f47624a != null && ((b) arrayList.get(i10)).f47624a.f20048id == j3) {
                    return ((b) arrayList.get(i10)).f47624a;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f47630b == null) {
            this.f47630b = "ringtones_pref_" + this.f47629a;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.f47630b, 0);
    }

    public final String e(long j3) {
        if (!this.f47633f) {
            f(true);
            this.f47633f = true;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47632e;
            if (i10 < arrayList.size()) {
                if (((b) arrayList.get(i10)).f47624a != null && ((b) arrayList.get(i10)).f47624a.f20048id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i10)).f47625b)) {
                        return ((b) arrayList.get(i10)).f47625b;
                    }
                    return FileLoader.getInstance(this.f47631c).getPathToAttach(((b) arrayList.get(i10)).f47624a).toString();
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
        ArrayList arrayList = this.f47632e;
        arrayList.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = d.getString("tone_document" + i11, "");
            String string2 = d.getString("tone_local_path" + i11, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f47624a = TLdeserialize;
                obj.f47625b = string2;
                int i12 = this.d;
                this.d = i12 + 1;
                obj.f47626c = i12;
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
        getsavedringtones.hash = f47627g;
        if (z11) {
            ConnectionsManager.getInstance(this.f47631c).sendRequest(getsavedringtones, new n8(this, 22));
            return;
        }
        if (!this.f47633f) {
            f(true);
            this.f47633f = true;
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
            ArrayList arrayList = this.f47632e;
            if (i10 < arrayList.size()) {
                if (!((b) arrayList.get(i10)).d) {
                    i11++;
                    TLRPC.Document document = ((b) arrayList.get(i10)).f47624a;
                    String str = ((b) arrayList.get(i10)).f47625b;
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
                NotificationCenter.getInstance(this.f47631c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
        }
    }
}
