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
import wi.q;
public final class c {
    public static volatile long f59313g;
    public static volatile long h;
    public static final HashSet f59314i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f59315a;
    public final int f59317c;
    public int d;
    public boolean f59319f;
    public String f59316b = null;
    public final ArrayList f59318e = new ArrayList();

    public c(int i7) {
        this.f59317c = i7;
        this.f59315a = p10.i(i7).f24478n;
        SharedPreferences d = d();
        try {
            f59313g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.h3(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f26958id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f59310a = document;
        int i7 = this.d;
        this.d = i7 + 1;
        obj.f59312c = i7;
        obj.d = false;
        this.f59318e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f59319f) {
            f(true);
            this.f59319f = true;
        }
        Utilities.f21333e.c(new q(5, this, new ArrayList(this.f59318e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f59318e;
        if (!this.f59319f) {
            f(true);
            this.f59319f = true;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (arrayList.get(i7) != null && ((b) arrayList.get(i7)).f59310a != null && ((b) arrayList.get(i7)).f59310a.f26958id == j3) {
                    return ((b) arrayList.get(i7)).f59310a;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f59316b == null) {
            this.f59316b = "ringtones_pref_" + this.f59315a;
        }
        return t0.f25555b.getSharedPreferences(this.f59316b, 0);
    }

    public final String e(long j3) {
        if (!this.f59319f) {
            f(true);
            this.f59319f = true;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f59318e;
            if (i7 < arrayList.size()) {
                if (((b) arrayList.get(i7)).f59310a != null && ((b) arrayList.get(i7)).f59310a.f26958id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i7)).f59311b)) {
                        return ((b) arrayList.get(i7)).f59311b;
                    }
                    w7.G(this.f59317c);
                    return w7.I(((b) arrayList.get(i7)).f59310a).toString();
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
        ArrayList arrayList = this.f59318e;
        arrayList.clear();
        for (int i10 = 0; i10 < i7; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f59310a = TLdeserialize;
                obj.f59311b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                obj.f59312c = i11;
                arrayList.add(obj);
            } catch (Throwable th2) {
                boolean z10 = r2.f25191a;
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
        getsavedringtones.hash = f59313g;
        if (z10) {
            ConnectionsManager.getInstance(this.f59317c).sendRequest(getsavedringtones, new j0(this, 26));
            return;
        }
        if (!this.f59319f) {
            f(true);
            this.f59319f = true;
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
            ArrayList arrayList = this.f59318e;
            if (i7 < arrayList.size()) {
                if (!((b) arrayList.get(i7)).d) {
                    i10++;
                    TLRPC.Document document = ((b) arrayList.get(i7)).f59310a;
                    String str = ((b) arrayList.get(i7)).f59311b;
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
                qs.f(this.f59317c).k(qs.f24978e5, new Object[0]);
                return;
            }
        }
    }
}
