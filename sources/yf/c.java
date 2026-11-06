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
    public static volatile long f59312g;
    public static volatile long h;
    public static final HashSet f59313i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f59314a;
    public final int f59316c;
    public int d;
    public boolean f59318f;
    public String f59315b = null;
    public final ArrayList f59317e = new ArrayList();

    public c(int i7) {
        this.f59316c = i7;
        this.f59314a = p10.i(i7).f24486n;
        SharedPreferences d = d();
        try {
            f59312g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.h3(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f26959id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f59309a = document;
        int i7 = this.d;
        this.d = i7 + 1;
        obj.f59311c = i7;
        obj.d = false;
        this.f59317e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f59318f) {
            f(true);
            this.f59318f = true;
        }
        Utilities.f21333e.c(new q(5, this, new ArrayList(this.f59317e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f59317e;
        if (!this.f59318f) {
            f(true);
            this.f59318f = true;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (arrayList.get(i7) != null && ((b) arrayList.get(i7)).f59309a != null && ((b) arrayList.get(i7)).f59309a.f26959id == j3) {
                    return ((b) arrayList.get(i7)).f59309a;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f59315b == null) {
            this.f59315b = "ringtones_pref_" + this.f59314a;
        }
        return t0.f25563b.getSharedPreferences(this.f59315b, 0);
    }

    public final String e(long j3) {
        if (!this.f59318f) {
            f(true);
            this.f59318f = true;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f59317e;
            if (i7 < arrayList.size()) {
                if (((b) arrayList.get(i7)).f59309a != null && ((b) arrayList.get(i7)).f59309a.f26959id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i7)).f59310b)) {
                        return ((b) arrayList.get(i7)).f59310b;
                    }
                    w7.G(this.f59316c);
                    return w7.I(((b) arrayList.get(i7)).f59309a).toString();
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
        ArrayList arrayList = this.f59317e;
        arrayList.clear();
        for (int i10 = 0; i10 < i7; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f59309a = TLdeserialize;
                obj.f59310b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                obj.f59311c = i11;
                arrayList.add(obj);
            } catch (Throwable th2) {
                boolean z10 = r2.f25199a;
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
        getsavedringtones.hash = f59312g;
        if (z10) {
            ConnectionsManager.getInstance(this.f59316c).sendRequest(getsavedringtones, new j0(this, 26));
            return;
        }
        if (!this.f59318f) {
            f(true);
            this.f59318f = true;
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
            ArrayList arrayList = this.f59317e;
            if (i7 < arrayList.size()) {
                if (!((b) arrayList.get(i7)).d) {
                    i10++;
                    TLRPC.Document document = ((b) arrayList.get(i7)).f59309a;
                    String str = ((b) arrayList.get(i7)).f59310b;
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
                qs.f(this.f59316c).k(qs.f24986e5, new Object[0]);
                return;
            }
        }
    }
}
