package yf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import wg.r;
public final class c {
    public static volatile long f61198g;
    public static volatile long h;
    public static final HashSet f61199i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f61200a;
    public final int f61202c;
    public int d;
    public boolean f61204f;
    public String f61201b = null;
    public final ArrayList f61203e = new ArrayList();

    public c(int i7) {
        this.f61202c = i7;
        this.f61200a = k10.i(i7).f24951n;
        SharedPreferences d = d();
        try {
            f61198g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.g3(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f28404id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f61195a = document;
        int i7 = this.d;
        this.d = i7 + 1;
        obj.f61197c = i7;
        obj.d = false;
        this.f61203e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f61204f) {
            f(true);
            this.f61204f = true;
        }
        Utilities.f22774e.c(new r(14, this, new ArrayList(this.f61203e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f61203e;
        if (!this.f61204f) {
            f(true);
            this.f61204f = true;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (arrayList.get(i7) != null && ((b) arrayList.get(i7)).f61195a != null && ((b) arrayList.get(i7)).f61195a.f28404id == j3) {
                    return ((b) arrayList.get(i7)).f61195a;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f61201b == null) {
            this.f61201b = "ringtones_pref_" + this.f61200a;
        }
        return t0.f26895b.getSharedPreferences(this.f61201b, 0);
    }

    public final String e(long j3) {
        if (!this.f61204f) {
            f(true);
            this.f61204f = true;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f61203e;
            if (i7 < arrayList.size()) {
                if (((b) arrayList.get(i7)).f61195a != null && ((b) arrayList.get(i7)).f61195a.f28404id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i7)).f61196b)) {
                        return ((b) arrayList.get(i7)).f61196b;
                    }
                    w7.G(this.f61202c);
                    return w7.I(((b) arrayList.get(i7)).f61195a).toString();
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
        ArrayList arrayList = this.f61203e;
        arrayList.clear();
        for (int i10 = 0; i10 < i7; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f61195a = TLdeserialize;
                obj.f61196b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                obj.f61197c = i11;
                arrayList.add(obj);
            } catch (Throwable th2) {
                boolean z11 = s2.f26694a;
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
        getsavedringtones.hash = f61198g;
        if (z11) {
            ConnectionsManager.getInstance(this.f61202c).sendRequest(getsavedringtones, new d(this, 1));
            return;
        }
        if (!this.f61204f) {
            f(true);
            this.f61204f = true;
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
            ArrayList arrayList = this.f61203e;
            if (i7 < arrayList.size()) {
                if (!((b) arrayList.get(i7)).d) {
                    i10++;
                    TLRPC.Document document = ((b) arrayList.get(i7)).f61195a;
                    String str = ((b) arrayList.get(i7)).f61196b;
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
                ls.f(this.f61202c).k(ls.f25285h5, new Object[0]);
                return;
            }
        }
    }
}
