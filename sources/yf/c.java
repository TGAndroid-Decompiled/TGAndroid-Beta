package yf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import wg.r;
public final class c {
    public static volatile long f61187g;
    public static volatile long h;
    public static final HashSet f61188i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f61189a;
    public final int f61191c;
    public int d;
    public boolean f61193f;
    public String f61190b = null;
    public final ArrayList f61192e = new ArrayList();

    public c(int i7) {
        this.f61191c = i7;
        this.f61189a = j10.i(i7).f24792n;
        SharedPreferences d = d();
        try {
            f61187g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.g3(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f28411id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f61184a = document;
        int i7 = this.d;
        this.d = i7 + 1;
        obj.f61186c = i7;
        obj.d = false;
        this.f61192e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f61193f) {
            f(true);
            this.f61193f = true;
        }
        Utilities.f22782e.c(new r(14, this, new ArrayList(this.f61192e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f61192e;
        if (!this.f61193f) {
            f(true);
            this.f61193f = true;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (arrayList.get(i7) != null && ((b) arrayList.get(i7)).f61184a != null && ((b) arrayList.get(i7)).f61184a.f28411id == j3) {
                    return ((b) arrayList.get(i7)).f61184a;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f61190b == null) {
            this.f61190b = "ringtones_pref_" + this.f61189a;
        }
        return t0.f26915b.getSharedPreferences(this.f61190b, 0);
    }

    public final String e(long j3) {
        if (!this.f61193f) {
            f(true);
            this.f61193f = true;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f61192e;
            if (i7 < arrayList.size()) {
                if (((b) arrayList.get(i7)).f61184a != null && ((b) arrayList.get(i7)).f61184a.f28411id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i7)).f61185b)) {
                        return ((b) arrayList.get(i7)).f61185b;
                    }
                    w7.G(this.f61191c);
                    return w7.I(((b) arrayList.get(i7)).f61184a).toString();
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
        ArrayList arrayList = this.f61192e;
        arrayList.clear();
        for (int i10 = 0; i10 < i7; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f61184a = TLdeserialize;
                obj.f61185b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                obj.f61186c = i11;
                arrayList.add(obj);
            } catch (Throwable th2) {
                boolean z11 = s2.f26723a;
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
        getsavedringtones.hash = f61187g;
        if (z11) {
            ConnectionsManager.getInstance(this.f61191c).sendRequest(getsavedringtones, new d(this, 1));
            return;
        }
        if (!this.f61193f) {
            f(true);
            this.f61193f = true;
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
            ArrayList arrayList = this.f61192e;
            if (i7 < arrayList.size()) {
                if (!((b) arrayList.get(i7)).d) {
                    i10++;
                    TLRPC.Document document = ((b) arrayList.get(i7)).f61184a;
                    String str = ((b) arrayList.get(i7)).f61185b;
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
                ks.f(this.f61191c).k(ks.f25123g5, new Object[0]);
                return;
            }
        }
    }
}
