package yf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class c {
    public static volatile long f61317g;
    public static volatile long h;
    public static final HashSet f61318i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f61319a;
    public final int f61321c;
    public int d;
    public boolean f61323f;
    public String f61320b = null;
    public final ArrayList f61322e = new ArrayList();

    public c(int i7) {
        this.f61321c = i7;
        this.f61319a = i10.i(i7).f24656n;
        SharedPreferences d = d();
        try {
            f61317g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.g3(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f28498id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f61314a = document;
        int i7 = this.d;
        this.d = i7 + 1;
        obj.f61316c = i7;
        obj.d = false;
        this.f61322e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f61323f) {
            f(true);
            this.f61323f = true;
        }
        Utilities.f22877e.c(new v9.b(20, this, new ArrayList(this.f61322e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f61322e;
        if (!this.f61323f) {
            f(true);
            this.f61323f = true;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (arrayList.get(i7) != null && ((b) arrayList.get(i7)).f61314a != null && ((b) arrayList.get(i7)).f61314a.f28498id == j3) {
                    return ((b) arrayList.get(i7)).f61314a;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f61320b == null) {
            this.f61320b = "ringtones_pref_" + this.f61319a;
        }
        return t0.f27013b.getSharedPreferences(this.f61320b, 0);
    }

    public final String e(long j3) {
        if (!this.f61323f) {
            f(true);
            this.f61323f = true;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f61322e;
            if (i7 < arrayList.size()) {
                if (((b) arrayList.get(i7)).f61314a != null && ((b) arrayList.get(i7)).f61314a.f28498id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i7)).f61315b)) {
                        return ((b) arrayList.get(i7)).f61315b;
                    }
                    w7.G(this.f61321c);
                    return w7.I(((b) arrayList.get(i7)).f61314a).toString();
                }
                i7++;
            } else {
                return "NoSound";
            }
        }
    }

    public final void f(boolean z10) {
        SharedPreferences d = d();
        int i7 = d.getInt("count", 0);
        ArrayList arrayList = this.f61322e;
        arrayList.clear();
        for (int i10 = 0; i10 < i7; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f61314a = TLdeserialize;
                obj.f61315b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                obj.f61316c = i11;
                arrayList.add(obj);
            } catch (Throwable th2) {
                boolean z11 = s2.f26829a;
                a8.g(th2, true);
            }
        }
        if (z10) {
            g0.g3(new a(this, 1));
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
        getsavedringtones.hash = f61317g;
        if (z11) {
            ConnectionsManager.getInstance(this.f61321c).sendRequest(getsavedringtones, new d(this, 1));
            return;
        }
        if (!this.f61323f) {
            f(true);
            this.f61323f = true;
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
            ArrayList arrayList = this.f61322e;
            if (i7 < arrayList.size()) {
                if (!((b) arrayList.get(i7)).d) {
                    i10++;
                    TLRPC.Document document = ((b) arrayList.get(i7)).f61314a;
                    String str = ((b) arrayList.get(i7)).f61315b;
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
                ks.f(this.f61321c).k(ks.f25226h5, new Object[0]);
                return;
            }
        }
    }
}
