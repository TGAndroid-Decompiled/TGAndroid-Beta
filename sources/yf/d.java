package yf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import bi.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d {
    public static volatile long f59411g;
    public static volatile long h;
    public static final HashSet f59412i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f59413a;
    public final int f59415c;
    public int d;
    public boolean f59417f;
    public String f59414b = null;
    public final ArrayList f59416e = new ArrayList();

    public d(int i7) {
        this.f59415c = i7;
        this.f59413a = p10.i(i7).f24489n;
        SharedPreferences d = d();
        try {
            f59411g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.h3(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f26962id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f59408a = document;
        int i7 = this.d;
        this.d = i7 + 1;
        obj.f59410c = i7;
        obj.d = false;
        this.f59416e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f59417f) {
            f(true);
            this.f59417f = true;
        }
        Utilities.f21336e.c(new b(0, this, new ArrayList(this.f59416e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f59416e;
        if (!this.f59417f) {
            f(true);
            this.f59417f = true;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (arrayList.get(i7) != null && ((c) arrayList.get(i7)).f59408a != null && ((c) arrayList.get(i7)).f59408a.f26962id == j3) {
                    return ((c) arrayList.get(i7)).f59408a;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f59414b == null) {
            this.f59414b = "ringtones_pref_" + this.f59413a;
        }
        return t0.f25566b.getSharedPreferences(this.f59414b, 0);
    }

    public final String e(long j3) {
        if (!this.f59417f) {
            f(true);
            this.f59417f = true;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f59416e;
            if (i7 < arrayList.size()) {
                if (((c) arrayList.get(i7)).f59408a != null && ((c) arrayList.get(i7)).f59408a.f26962id == j3) {
                    if (!TextUtils.isEmpty(((c) arrayList.get(i7)).f59409b)) {
                        return ((c) arrayList.get(i7)).f59409b;
                    }
                    w7.G(this.f59415c);
                    return w7.I(((c) arrayList.get(i7)).f59408a).toString();
                }
                i7++;
            } else {
                return "NoSound";
            }
        }
    }

    public final void f(boolean z9) {
        SharedPreferences d = d();
        int i7 = d.getInt("count", 0);
        ArrayList arrayList = this.f59416e;
        arrayList.clear();
        for (int i10 = 0; i10 < i7; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f59408a = TLdeserialize;
                obj.f59409b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                obj.f59410c = i11;
                arrayList.add(obj);
            } catch (Throwable th2) {
                boolean z10 = r2.f25212a;
                a8.g(th2, true);
            }
        }
        if (z9) {
            g0.h3(new a(this, 1));
        }
    }

    public final void g(boolean z9) {
        boolean z10;
        if (!z9 && System.currentTimeMillis() - h <= 86400000) {
            z10 = false;
        } else {
            z10 = true;
        }
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = f59411g;
        if (z10) {
            ConnectionsManager.getInstance(this.f59415c).sendRequest(getsavedringtones, new j0(this, 26));
            return;
        }
        if (!this.f59417f) {
            f(true);
            this.f59417f = true;
        }
        b();
    }

    public final void h() {
        SharedPreferences d = d();
        d.edit().clear().apply();
        SharedPreferences.Editor edit = d.edit();
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f59416e;
            if (i7 < arrayList.size()) {
                if (!((c) arrayList.get(i7)).d) {
                    i10++;
                    TLRPC.Document document = ((c) arrayList.get(i7)).f59408a;
                    String str = ((c) arrayList.get(i7)).f59409b;
                    SerializedData serializedData = new SerializedData(document.getObjectSize());
                    document.serializeToStream(serializedData);
                    edit.putString("tone_document" + i7, Utilities.f(serializedData.toByteArray()));
                    if (str != null) {
                        edit.putString("tone_local_path" + i7, str);
                    }
                }
                i7++;
            } else {
                edit.putInt("count", i10);
                edit.apply();
                qs.f(this.f59415c).k(qs.f24995e5, new Object[0]);
                return;
            }
        }
    }
}
