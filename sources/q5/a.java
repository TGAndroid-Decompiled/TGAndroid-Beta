package q5;

import ag.a3;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import b2.p1;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import e2.j;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import kg.d0;
import l5.h;
import l5.i;
import org.telegram.messenger.f8;
import org.telegram.messenger.fs;
import org.telegram.messenger.g4;
import org.telegram.messenger.gs;
import org.telegram.messenger.i0;
import org.telegram.messenger.i6;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.qi;
import org.telegram.messenger.ri;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;
import org.telegram.ui.rm0;
import org.telegram.ui.un;
import org.telegram.ui.ux;
import org.telegram.ui.web.o;
import rh.e4;
import s5.e;
import s5.g;
import th.j7;
import th.u2;
import th.z2;
import u2.c0;
import u2.g0;
import u2.k0;
import vh.b1;
import vh.k1;
import vh.l1;
import vh.u6;
import vh.w3;
import vh.w6;
import w7.n6;
import x2.k;
import x2.l;
import xh.h2;
import zf.x0;
public final class a implements t5.b, ux, e, fs, j7, j, ri, u1, l, SuccessContinuation, rm0 {
    public final int f45479a;
    public final Object f45480b;
    public final Object f45481c;
    public final Object d;

    public a(Object obj, Object obj2, Object obj3, int i10) {
        this.f45479a = i10;
        this.f45480b = obj;
        this.f45481c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ay ayVar) {
        return false;
    }

    @Override
    public void a(String str) {
        u2 u2Var = (u2) this.f45480b;
        z2 z2Var = u2Var.f49512x;
        z2Var.getStoriesController().r(z2Var.f49726k1, str, new d0(u2Var, (TL_stories.StoryItem) this.f45481c, (p6) this.d, 11));
    }

    @Override
    public void accept(Object obj) {
        ((k0) obj).n(((a5.a) this.f45480b).f281b, (g0) this.f45481c, (c0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: q5.a.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public x1 b(int i10, p1 p1Var, int[] iArr) {
        x2.j jVar = (x2.j) this.f45480b;
        String str = (String) this.f45481c;
        String str2 = (String) this.d;
        e9.k0 t10 = n0.t();
        for (int i11 = 0; i11 < p1Var.f2187a; i11++) {
            t10.c(new k(i10, p1Var, i11, jVar, iArr[i11], str, str2));
        }
        return t10.f();
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        int i10;
        int i11;
        ArrayList<TLRPC.Document> arrayList2;
        int i12;
        ArrayList arrayList3;
        boolean z10;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        k1 k1Var = (k1) this.f45480b;
        ui uiVar = (ui) this.d;
        ArrayList arrayList6 = k1Var.h;
        SparseIntArray sparseIntArray = k1Var.D;
        ArrayList arrayList7 = k1Var.f51373n;
        l1 l1Var = k1Var.N;
        ArrayList arrayList8 = k1Var.f51376w;
        HashSet hashSet = k1Var.L;
        ArrayList arrayList9 = k1Var.f51375s;
        if (!TextUtils.equals((String) this.f45481c, k1Var.H)) {
            return;
        }
        ArrayList j10 = k6.j(k1Var.H, null);
        int i13 = 0;
        for (int i14 = 0; i14 < j10.size(); i14++) {
            try {
                ?? obj = new Object();
                obj.f17590a = ((i6) j10.get(i14)).f16082c.toString();
                arrayList5.add(obj);
            } catch (Exception unused) {
            }
        }
        k1Var.f51378y = 0;
        arrayList9.clear();
        arrayList8.clear();
        sparseIntArray.clear();
        arrayList7.clear();
        int i15 = 1;
        k1Var.f51378y++;
        arrayList9.add(null);
        arrayList8.add(0L);
        if (l1Var.f51225a == 0) {
            hashSet.clear();
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                qi qiVar = (qi) arrayList5.get(i16);
                String str2 = qiVar.f17590a;
                if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) k1Var.d.get(qiVar.f17590a)) != null) {
                    hashSet.addAll(arrayList4);
                }
            }
            arrayList8.addAll(hashSet);
            for (int i17 = 0; i17 < hashSet.size(); i17++) {
                arrayList9.add(null);
            }
            k1Var.f51378y = hashSet.size() + k1Var.f51378y;
            i10 = 1;
            i11 = 0;
        } else {
            HashMap hashMap = uiVar.f18313d0;
            int i18 = 0;
            while (i18 < arrayList5.size()) {
                qi qiVar2 = (qi) arrayList5.get(i18);
                int i19 = i13;
                String str3 = qiVar2.f17590a;
                if (str3 == null || str3.startsWith("animated_") || (arrayList3 = (ArrayList) hashMap.get(qiVar2.f17590a)) == null || arrayList3.isEmpty()) {
                    i12 = i15;
                } else {
                    i12 = i15;
                    for (int i20 = i19; i20 < arrayList3.size(); i20++) {
                        TLRPC.Document document = (TLRPC.Document) arrayList3.get(i20);
                        if (document != null && !arrayList9.contains(document)) {
                            arrayList9.add(document);
                            k1Var.f51378y++;
                        }
                    }
                }
                i18++;
                i13 = i19;
                i15 = i12;
            }
            i10 = i15;
            i11 = i13;
            ArrayList arrayList10 = uiVar.f18345s0[i11];
            int i21 = i11;
            while (i21 < arrayList5.size()) {
                qi qiVar3 = (qi) arrayList5.get(i21);
                String str4 = qiVar3.f17590a;
                if (str4 != null && !str4.startsWith("animated_")) {
                    for (int i22 = i11; i22 < arrayList10.size(); i22++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList10.get(i22);
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                        } else if (!stickerSetCovered.covers.isEmpty()) {
                            arrayList2 = stickerSetCovered.covers;
                        } else if (stickerSetCovered.cover != null) {
                            ArrayList<TLRPC.Document> arrayList11 = new ArrayList<>();
                            arrayList11.add(stickerSetCovered.cover);
                            arrayList2 = arrayList11;
                        }
                        for (int i23 = i11; i23 < arrayList2.size(); i23++) {
                            String V = jj.V(arrayList2.get(i23), null, null);
                            if (V != null && V.contains(qiVar3.f17590a)) {
                                arrayList9.add(arrayList2.get(i23));
                                k1Var.f51378y++;
                            }
                        }
                    }
                }
                i21++;
                arrayList5 = arrayList;
            }
        }
        String N3 = i0.N3((k1Var.H + "").toLowerCase());
        for (int i24 = i11; i24 < arrayList6.size(); i24++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i24);
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                String N32 = i0.N3((tL_messages_stickerSet.set.title + "").toLowerCase());
                if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                    int size = arrayList7.size();
                    arrayList7.add(tL_messages_stickerSet);
                    sparseIntArray.put(k1Var.f51378y, size);
                    arrayList9.add(null);
                    k1Var.f51378y++;
                    arrayList9.addAll(tL_messages_stickerSet.documents);
                    k1Var.f51378y = tL_messages_stickerSet.documents.size() + k1Var.f51378y;
                }
            }
        }
        int i25 = i10;
        if (arrayList8.size() <= i25 && arrayList9.size() <= i25) {
            z10 = i25;
        } else {
            z10 = i11;
        }
        k1Var.f51377x = z10;
        if (z10 != 0) {
            k1Var.f51378y += i25;
        }
        if (z10 == 0) {
            k1Var.K += i25;
        }
        k1Var.I = k1Var.H;
        k1Var.f();
        boolean z11 = i11;
        b1.z1(l1Var.f51445b, z11 ? 1 : 0, z11 ? 1 : 0);
        l1Var.f51447f.c(z11);
        l1Var.e.n(z11);
    }

    @Override
    public void e(int i10) {
        h2 h2Var = (h2) this.f45480b;
        fc0 fc0Var = (fc0) this.f45481c;
        String str = (String) this.d;
        if (i10 != 3) {
            fc0Var.dismiss();
        }
        h2Var.d.D.F(str, f1.A(i10).toLowerCase(Locale.ROOT), false);
    }

    @Override
    public Object g() {
        b bVar = (b) this.f45480b;
        i iVar = (i) this.f45481c;
        h hVar = (h) this.d;
        g gVar = (g) bVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f11666c;
        String str = hVar.f11660a;
        String str2 = iVar.f11664a;
        String c10 = n6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new a(gVar, (Object) hVar, iVar, 2))).getClass();
        bVar.f45483a.x(iVar, 1, false);
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f45479a) {
            case 9:
                ((w6) this.f45480b).N0((u6) this.f45481c, (Runnable) this.d, true);
                return;
            case 12:
                Activity activity = (Activity) this.f45480b;
                boolean[] zArr = (boolean[]) this.f45481c;
                o oVar = (o) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + w0.f19025b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    f8.g(e, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                oVar.a(bool, bool);
                return;
            default:
                x0 x0Var = (x0) this.f45480b;
                TLRPC.User user = (TLRPC.User) this.d;
                x0Var.getClass();
                ((boolean[]) this.f45481c)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = vp.r1(x0Var.f55651f).e7.edit();
                    edit.putBoolean("inlinegeo_" + user.f19942id, true).commit();
                    x0Var.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7) {
        s7 s7Var = (s7) this.f45480b;
        zj0 zj0Var = (zj0) this.f45481c;
        int[] iArr = (int[]) this.d;
        s7Var.c(canvas, rectF, f7);
        s7Var.f(canvas, rectF, f7);
        if (s7Var.h) {
            s7Var.b(canvas, rectF, f7);
        } else {
            s7Var.e(canvas, rectF, f7);
        }
        if (zj0Var != null && zj0Var.f33077a0 && zj0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            zj0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f45480b;
        String str = (String) this.f45481c;
        xa.o oVar = (xa.o) this.d;
        String str2 = (String) obj;
        w3 c10 = FirebaseMessaging.c(firebaseMessaging.f5591b);
        l9.h hVar = firebaseMessaging.f5590a;
        hVar.a();
        if ("[DEFAULT]".equals(hVar.f11708b)) {
            d = "";
        } else {
            d = hVar.d();
        }
        String a2 = firebaseMessaging.f5595i.a();
        synchronized (c10) {
            String a10 = xa.o.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.f52087a).edit();
                edit.putString(d + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (oVar == null || !str2.equals(oVar.f53557a)) {
            l9.h hVar2 = firebaseMessaging.f5590a;
            hVar2.a();
            if ("[DEFAULT]".equals(hVar2.f11708b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    hVar2.a();
                    sb2.append(hVar2.f11708b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new xa.g(firebaseMessaging.f5591b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        long j10;
        e4 e4Var = (e4) this.f45480b;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f45481c;
        ay ayVar2 = (ay) this.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        long j11 = ((gs) arrayList.get(0)).f15760a;
        Long l4 = (Long) g4.f(e4Var.f21583a).f15675r.get(tL_starGiftUnique.slug);
        if (l4 != null) {
            j10 = l4.longValue();
        } else {
            j10 = 0;
        }
        if (j10 != 0 && j10 != j11) {
            s4.m0(e4Var.getContext(), e4Var.I0, e4Var.f21583a, tL_starGiftUnique, j10, new a3(e4Var, j11, tL_starGiftUnique, ayVar2, 16));
            return true;
        }
        g4.f(e4Var.f21583a).s(j11, new yf.b(null, tL_starGiftUnique.slug), null, true);
        ayVar2.presentFragment(un.ha(j11), true);
        return true;
    }

    public a(g gVar, Object obj, i iVar, int i10) {
        this.f45479a = i10;
        this.f45480b = gVar;
        this.d = obj;
        this.f45481c = iVar;
    }
}
