package yf;

import ai.e1;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import ug.t1;
public final class c {
    public static volatile long f60622g;
    public static volatile long h;
    public static final HashSet f60623i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f60624a;
    public final int f60626c;
    public int d;
    public boolean f60628f;
    public String f60625b = null;
    public final ArrayList f60627e = new ArrayList();

    public c(int i7) {
        this.f60626c = i7;
        this.f60624a = m10.i(i7).f24959n;
        SharedPreferences d = d();
        try {
            f60622g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.h3(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f28057id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f60619a = document;
        int i7 = this.d;
        this.d = i7 + 1;
        obj.f60621c = i7;
        obj.d = false;
        this.f60627e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f60628f) {
            f(true);
            this.f60628f = true;
        }
        Utilities.f22416e.c(new t1(22, this, new ArrayList(this.f60627e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.f60627e;
        if (!this.f60628f) {
            f(true);
            this.f60628f = true;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (arrayList.get(i7) != null && ((b) arrayList.get(i7)).f60619a != null && ((b) arrayList.get(i7)).f60619a.f28057id == j3) {
                    return ((b) arrayList.get(i7)).f60619a;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f60625b == null) {
            this.f60625b = "ringtones_pref_" + this.f60624a;
        }
        return t0.f26609b.getSharedPreferences(this.f60625b, 0);
    }

    public final String e(long j3) {
        if (!this.f60628f) {
            f(true);
            this.f60628f = true;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f60627e;
            if (i7 < arrayList.size()) {
                if (((b) arrayList.get(i7)).f60619a != null && ((b) arrayList.get(i7)).f60619a.f28057id == j3) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i7)).f60620b)) {
                        return ((b) arrayList.get(i7)).f60620b;
                    }
                    w7.G(this.f60626c);
                    return w7.I(((b) arrayList.get(i7)).f60619a).toString();
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
        ArrayList arrayList = this.f60627e;
        arrayList.clear();
        for (int i10 = 0; i10 < i7; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f60619a = TLdeserialize;
                obj.f60620b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                obj.f60621c = i11;
                arrayList.add(obj);
            } catch (Throwable th2) {
                boolean z11 = r2.f26206a;
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
        getsavedringtones.hash = f60622g;
        if (z11) {
            ConnectionsManager.getInstance(this.f60626c).sendRequest(getsavedringtones, new e1(this, 27));
            return;
        }
        if (!this.f60628f) {
            f(true);
            this.f60628f = true;
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
            ArrayList arrayList = this.f60627e;
            if (i7 < arrayList.size()) {
                if (!((b) arrayList.get(i7)).d) {
                    i10++;
                    TLRPC.Document document = ((b) arrayList.get(i7)).f60619a;
                    String str = ((b) arrayList.get(i7)).f60620b;
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
                ns.f(this.f60626c).k(ns.f25492e5, new Object[0]);
                return;
            }
        }
    }
}
