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
    public static volatile long f61188g;
    public static volatile long h;
    public static final HashSet f61189i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f61190a;
    public final int f61192c;
    public int d;
    public boolean f61194f;
    public String f61191b = null;
    public final ArrayList f61193e = new ArrayList();

    public c(int i7) {
        this.f61192c = i7;
        this.f61190a = j10.i(i7).f24789n;
        SharedPreferences d = d();
        try {
            f61188g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.g3(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f28409id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f61185a = document;
        int i7 = this.d;
        this.d = i7 + 1;
        obj.f61187c = i7;
        obj.d = false;
        this.f61193e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f61194f) {
            f(true);
            this.f61194f = true;
        }
        Utilities.f22779e.c(new r(14, this, new ArrayList(this.f61193e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f61193e;
        if (!this.f61194f) {
            f(true);
            this.f61194f = true;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (arrayList.get(i7) != null && ((b) arrayList.get(i7)).f61185a != null && ((b) arrayList.get(i7)).f61185a.f28409id == j3) {
                    return ((b) arrayList.get(i7)).f61185a;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f61191b == null) {
            this.f61191b = "ringtones_pref_" + this.f61190a;
        }
        return t0.f26913b.getSharedPreferences(this.f61191b, 0);
    }

    public final String e(long j3) {
        if (!this.f61194f) {
            f(true);
            this.f61194f = true;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f61193e;
            if (i7 < arrayList.size()) {
                if (((b) arrayList.get(i7)).f61185a != null && ((b) arrayList.get(i7)).f61185a.f28409id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i7)).f61186b)) {
                        return ((b) arrayList.get(i7)).f61186b;
                    }
                    w7.G(this.f61192c);
                    return w7.I(((b) arrayList.get(i7)).f61185a).toString();
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
        ArrayList arrayList = this.f61193e;
        arrayList.clear();
        for (int i10 = 0; i10 < i7; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f61185a = TLdeserialize;
                obj.f61186b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                obj.f61187c = i11;
                arrayList.add(obj);
            } catch (Throwable th2) {
                boolean z11 = s2.f26721a;
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
        getsavedringtones.hash = f61188g;
        if (z11) {
            ConnectionsManager.getInstance(this.f61192c).sendRequest(getsavedringtones, new d(this, 1));
            return;
        }
        if (!this.f61194f) {
            f(true);
            this.f61194f = true;
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
            ArrayList arrayList = this.f61193e;
            if (i7 < arrayList.size()) {
                if (!((b) arrayList.get(i7)).d) {
                    i10++;
                    TLRPC.Document document = ((b) arrayList.get(i7)).f61185a;
                    String str = ((b) arrayList.get(i7)).f61186b;
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
                ks.f(this.f61192c).k(ks.f25127h5, new Object[0]);
                return;
            }
        }
    }
}
