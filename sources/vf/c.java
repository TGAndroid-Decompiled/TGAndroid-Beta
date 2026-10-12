package vf;

import ai.o8;
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
import tg.y;
public final class c {
    public static volatile long f49789g;
    public static volatile long h;
    public static final HashSet f49790i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f49791a;
    public final int f49793c;
    public int d;
    public boolean f49795f;
    public String f49792b = null;
    public final ArrayList f49794e = new ArrayList();

    public c(int i10) {
        this.f49793c = i10;
        this.f49791a = UserConfig.getInstance(i10).clientUserId;
        SharedPreferences d = d();
        try {
            f49789g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f19809id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f49786a = document;
        int i10 = this.d;
        this.d = i10 + 1;
        obj.f49788c = i10;
        obj.d = false;
        this.f49794e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f49795f) {
            f(true);
            this.f49795f = true;
        }
        Utilities.globalQueue.postRunnable(new y(7, this, new ArrayList(this.f49794e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f49794e;
        if (!this.f49795f) {
            f(true);
            this.f49795f = true;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (arrayList.get(i10) != null && ((b) arrayList.get(i10)).f49786a != null && ((b) arrayList.get(i10)).f49786a.f19809id == j3) {
                    return ((b) arrayList.get(i10)).f49786a;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f49792b == null) {
            this.f49792b = "ringtones_pref_" + this.f49791a;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.f49792b, 0);
    }

    public final String e(long j3) {
        if (!this.f49795f) {
            f(true);
            this.f49795f = true;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49794e;
            if (i10 < arrayList.size()) {
                if (((b) arrayList.get(i10)).f49786a != null && ((b) arrayList.get(i10)).f49786a.f19809id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i10)).f49787b)) {
                        return ((b) arrayList.get(i10)).f49787b;
                    }
                    return FileLoader.getInstance(this.f49793c).getPathToAttach(((b) arrayList.get(i10)).f49786a).toString();
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
        ArrayList arrayList = this.f49794e;
        arrayList.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = d.getString("tone_document" + i11, "");
            String string2 = d.getString("tone_local_path" + i11, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f49786a = TLdeserialize;
                obj.f49787b = string2;
                int i12 = this.d;
                this.d = i12 + 1;
                obj.f49788c = i12;
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
        getsavedringtones.hash = f49789g;
        if (z11) {
            ConnectionsManager.getInstance(this.f49793c).sendRequest(getsavedringtones, new o8(this, 22));
            return;
        }
        if (!this.f49795f) {
            f(true);
            this.f49795f = true;
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
            ArrayList arrayList = this.f49794e;
            if (i10 < arrayList.size()) {
                if (!((b) arrayList.get(i10)).d) {
                    i11++;
                    TLRPC.Document document = ((b) arrayList.get(i10)).f49786a;
                    String str = ((b) arrayList.get(i10)).f49787b;
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
                NotificationCenter.getInstance(this.f49793c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
        }
    }
}
