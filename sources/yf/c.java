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
    public static volatile long f59288g;
    public static volatile long h;
    public static final HashSet f59289i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f59290a;
    public final int f59292c;
    public int d;
    public boolean f59294f;
    public String f59291b = null;
    public final ArrayList f59293e = new ArrayList();

    public c(int i7) {
        this.f59292c = i7;
        this.f59290a = p10.i(i7).f24478n;
        SharedPreferences d = d();
        try {
            f59288g = d.getLong("hash", 0L);
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
        obj.f59285a = document;
        int i7 = this.d;
        this.d = i7 + 1;
        obj.f59287c = i7;
        obj.d = false;
        this.f59293e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f59294f) {
            f(true);
            this.f59294f = true;
        }
        Utilities.f21333e.c(new q(5, this, new ArrayList(this.f59293e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f59293e;
        if (!this.f59294f) {
            f(true);
            this.f59294f = true;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (arrayList.get(i7) != null && ((b) arrayList.get(i7)).f59285a != null && ((b) arrayList.get(i7)).f59285a.f26958id == j3) {
                    return ((b) arrayList.get(i7)).f59285a;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f59291b == null) {
            this.f59291b = "ringtones_pref_" + this.f59290a;
        }
        return t0.f25555b.getSharedPreferences(this.f59291b, 0);
    }

    public final String e(long j3) {
        if (!this.f59294f) {
            f(true);
            this.f59294f = true;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f59293e;
            if (i7 < arrayList.size()) {
                if (((b) arrayList.get(i7)).f59285a != null && ((b) arrayList.get(i7)).f59285a.f26958id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i7)).f59286b)) {
                        return ((b) arrayList.get(i7)).f59286b;
                    }
                    w7.G(this.f59292c);
                    return w7.I(((b) arrayList.get(i7)).f59285a).toString();
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
        ArrayList arrayList = this.f59293e;
        arrayList.clear();
        for (int i10 = 0; i10 < i7; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f59285a = TLdeserialize;
                obj.f59286b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                obj.f59287c = i11;
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
        getsavedringtones.hash = f59288g;
        if (z10) {
            ConnectionsManager.getInstance(this.f59292c).sendRequest(getsavedringtones, new j0(this, 26));
            return;
        }
        if (!this.f59294f) {
            f(true);
            this.f59294f = true;
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
            ArrayList arrayList = this.f59293e;
            if (i7 < arrayList.size()) {
                if (!((b) arrayList.get(i7)).d) {
                    i10++;
                    TLRPC.Document document = ((b) arrayList.get(i7)).f59285a;
                    String str = ((b) arrayList.get(i7)).f59286b;
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
                qs.f(this.f59292c).k(qs.f24978e5, new Object[0]);
                return;
            }
        }
    }
}
