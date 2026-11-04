package zf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import ci.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import xh.i;
public final class c {
    public static volatile long f60451g;
    public static volatile long h;
    public static final HashSet f60452i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f60453a;
    public final int f60455c;
    public int d;
    public boolean f60457f;
    public String f60454b = null;
    public final ArrayList f60456e = new ArrayList();

    public c(int i3) {
        this.f60455c = i3;
        this.f60453a = h10.i(i3).f22848n;
        SharedPreferences d = d();
        try {
            f60451g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.h3(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f27007id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f60448a = document;
        int i3 = this.d;
        this.d = i3 + 1;
        obj.f60450c = i3;
        obj.d = false;
        this.f60456e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f60457f) {
            f(true);
            this.f60457f = true;
        }
        Utilities.f21387e.c(new i(8, this, new ArrayList(this.f60456e)));
    }

    public final TLRPC.Document c(long j10) {
        ArrayList arrayList = this.f60456e;
        if (!this.f60457f) {
            f(true);
            this.f60457f = true;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            try {
                if (arrayList.get(i3) != null && ((b) arrayList.get(i3)).f60448a != null && ((b) arrayList.get(i3)).f60448a.f27007id == j10) {
                    return ((b) arrayList.get(i3)).f60448a;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f60454b == null) {
            this.f60454b = "ringtones_pref_" + this.f60453a;
        }
        return t0.f25457b.getSharedPreferences(this.f60454b, 0);
    }

    public final String e(long j10) {
        if (!this.f60457f) {
            f(true);
            this.f60457f = true;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f60456e;
            if (i3 < arrayList.size()) {
                if (((b) arrayList.get(i3)).f60448a != null && ((b) arrayList.get(i3)).f60448a.f27007id == j10) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i3)).f60449b)) {
                        return ((b) arrayList.get(i3)).f60449b;
                    }
                    w7.G(this.f60455c);
                    return w7.I(((b) arrayList.get(i3)).f60448a).toString();
                }
                i3++;
            } else {
                return "NoSound";
            }
        }
    }

    public final void f(boolean z10) {
        SharedPreferences d = d();
        int i3 = d.getInt("count", 0);
        ArrayList arrayList = this.f60456e;
        arrayList.clear();
        for (int i10 = 0; i10 < i3; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f60448a = TLdeserialize;
                obj.f60449b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                obj.f60450c = i11;
                arrayList.add(obj);
            } catch (Throwable th2) {
                boolean z11 = r2.f25040a;
                a8.g(th2, true);
            }
        }
        if (z10) {
            g0.h3(new a(this, 1));
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
        getsavedringtones.hash = f60451g;
        if (z11) {
            ConnectionsManager.getInstance(this.f60455c).sendRequest(getsavedringtones, new d0(this, 26));
            return;
        }
        if (!this.f60457f) {
            f(true);
            this.f60457f = true;
        }
        b();
    }

    public final void h() {
        SharedPreferences d = d();
        d.edit().clear().apply();
        SharedPreferences.Editor edit = d.edit();
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f60456e;
            if (i3 < arrayList.size()) {
                if (!((b) arrayList.get(i3)).d) {
                    i10++;
                    TLRPC.Document document = ((b) arrayList.get(i3)).f60448a;
                    String str = ((b) arrayList.get(i3)).f60449b;
                    SerializedData serializedData = new SerializedData(document.getObjectSize());
                    document.serializeToStream(serializedData);
                    edit.putString("tone_document" + i3, Utilities.f(serializedData.toByteArray()));
                    if (str != null) {
                        edit.putString("tone_local_path" + i3, str);
                    }
                }
                i3++;
            } else {
                edit.putInt("count", i10);
                edit.apply();
                hs.f(this.f60455c).k(hs.f23224e5, new Object[0]);
                return;
            }
        }
    }
}
