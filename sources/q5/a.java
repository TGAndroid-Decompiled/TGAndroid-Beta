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
import org.telegram.messenger.g4;
import org.telegram.messenger.gs;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.i6;
import org.telegram.messenger.k6;
import org.telegram.messenger.kj;
import org.telegram.messenger.ri;
import org.telegram.messenger.si;
import org.telegram.messenger.vi;
import org.telegram.messenger.w0;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.nb1;
import org.telegram.ui.pm0;
import org.telegram.ui.tx;
import org.telegram.ui.un;
import org.telegram.ui.web.o;
import org.telegram.ui.zx;
import rh.e4;
import s5.e;
import s5.g;
import th.j7;
import th.u2;
import th.z2;
import u2.c0;
import u2.g0;
import u2.k0;
import vh.c1;
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
public final class a implements t5.b, tx, e, gs, j7, j, si, u1, l, SuccessContinuation, pm0 {
    public final int f45490a;
    public final Object f45491b;
    public final Object f45492c;
    public final Object d;

    public a(Object obj, Object obj2, Object obj3, int i10) {
        this.f45490a = i10;
        this.f45491b = obj;
        this.f45492c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean O(zx zxVar) {
        return false;
    }

    @Override
    public void a(String str) {
        u2 u2Var = (u2) this.f45491b;
        z2 z2Var = u2Var.f49526x;
        z2Var.getStoriesController().r(z2Var.f49740k1, str, new d0(u2Var, (TL_stories.StoryItem) this.f45492c, (p6) this.d, 11));
    }

    @Override
    public void accept(Object obj) {
        ((k0) obj).n(((a5.a) this.f45491b).f281b, (g0) this.f45492c, (c0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: q5.a.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public x1 b(int i10, p1 p1Var, int[] iArr) {
        x2.j jVar = (x2.j) this.f45491b;
        String str = (String) this.f45492c;
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
        k1 k1Var = (k1) this.f45491b;
        vi viVar = (vi) this.d;
        ArrayList arrayList6 = k1Var.h;
        SparseIntArray sparseIntArray = k1Var.D;
        ArrayList arrayList7 = k1Var.f51388n;
        l1 l1Var = k1Var.N;
        ArrayList arrayList8 = k1Var.f51391w;
        HashSet hashSet = k1Var.L;
        ArrayList arrayList9 = k1Var.f51390s;
        if (!TextUtils.equals((String) this.f45492c, k1Var.H)) {
            return;
        }
        ArrayList j10 = k6.j(k1Var.H, null);
        int i13 = 0;
        for (int i14 = 0; i14 < j10.size(); i14++) {
            try {
                ?? obj = new Object();
                obj.f17936a = ((i6) j10.get(i14)).f16235c.toString();
                arrayList5.add(obj);
            } catch (Exception unused) {
            }
        }
        k1Var.f51393y = 0;
        arrayList9.clear();
        arrayList8.clear();
        sparseIntArray.clear();
        arrayList7.clear();
        int i15 = 1;
        k1Var.f51393y++;
        arrayList9.add(null);
        arrayList8.add(0L);
        if (l1Var.f51240a == 0) {
            hashSet.clear();
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                ri riVar = (ri) arrayList5.get(i16);
                String str2 = riVar.f17936a;
                if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) k1Var.d.get(riVar.f17936a)) != null) {
                    hashSet.addAll(arrayList4);
                }
            }
            arrayList8.addAll(hashSet);
            for (int i17 = 0; i17 < hashSet.size(); i17++) {
                arrayList9.add(null);
            }
            k1Var.f51393y = hashSet.size() + k1Var.f51393y;
            i10 = 1;
            i11 = 0;
        } else {
            HashMap hashMap = viVar.f18642d0;
            int i18 = 0;
            while (i18 < arrayList5.size()) {
                ri riVar2 = (ri) arrayList5.get(i18);
                int i19 = i13;
                String str3 = riVar2.f17936a;
                if (str3 == null || str3.startsWith("animated_") || (arrayList3 = (ArrayList) hashMap.get(riVar2.f17936a)) == null || arrayList3.isEmpty()) {
                    i12 = i15;
                } else {
                    i12 = i15;
                    for (int i20 = i19; i20 < arrayList3.size(); i20++) {
                        TLRPC.Document document = (TLRPC.Document) arrayList3.get(i20);
                        if (document != null && !arrayList9.contains(document)) {
                            arrayList9.add(document);
                            k1Var.f51393y++;
                        }
                    }
                }
                i18++;
                i13 = i19;
                i15 = i12;
            }
            i10 = i15;
            i11 = i13;
            ArrayList arrayList10 = viVar.f18674s0[i11];
            int i21 = i11;
            while (i21 < arrayList5.size()) {
                ri riVar3 = (ri) arrayList5.get(i21);
                String str4 = riVar3.f17936a;
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
                            String V = kj.V(arrayList2.get(i23), null, null);
                            if (V != null && V.contains(riVar3.f17936a)) {
                                arrayList9.add(arrayList2.get(i23));
                                k1Var.f51393y++;
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
                    sparseIntArray.put(k1Var.f51393y, size);
                    arrayList9.add(null);
                    k1Var.f51393y++;
                    arrayList9.addAll(tL_messages_stickerSet.documents);
                    k1Var.f51393y = tL_messages_stickerSet.documents.size() + k1Var.f51393y;
                }
            }
        }
        int i25 = i10;
        if (arrayList8.size() <= i25 && arrayList9.size() <= i25) {
            z10 = i25;
        } else {
            z10 = i11;
        }
        k1Var.f51392x = z10;
        if (z10 != 0) {
            k1Var.f51393y += i25;
        }
        if (z10 == 0) {
            k1Var.K += i25;
        }
        k1Var.I = k1Var.H;
        k1Var.f();
        boolean z11 = i11;
        c1.z1(l1Var.f51460b, z11 ? 1 : 0, z11 ? 1 : 0);
        l1Var.f51462f.c(z11);
        l1Var.e.n(z11);
    }

    @Override
    public void e(int i10) {
        h2 h2Var = (h2) this.f45491b;
        fc0 fc0Var = (fc0) this.f45492c;
        String str = (String) this.d;
        if (i10 != 3) {
            fc0Var.dismiss();
        }
        h2Var.d.D.F(str, f1.A(i10).toLowerCase(Locale.ROOT), false);
    }

    @Override
    public Object g() {
        b bVar = (b) this.f45491b;
        i iVar = (i) this.f45492c;
        h hVar = (h) this.d;
        g gVar = (g) bVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f11667c;
        String str = hVar.f11661a;
        String str2 = iVar.f11665a;
        String c10 = n6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new a(gVar, (Object) hVar, iVar, 2))).getClass();
        bVar.f45494a.x(iVar, 1, false);
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f45490a) {
            case 9:
                ((w6) this.f45491b).N0((u6) this.f45492c, (Runnable) this.d, true);
                return;
            case 12:
                Activity activity = (Activity) this.f45491b;
                boolean[] zArr = (boolean[]) this.f45492c;
                o oVar = (o) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + w0.f18945b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    f8.g(e, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                oVar.a(bool, bool);
                return;
            default:
                x0 x0Var = (x0) this.f45491b;
                TLRPC.User user = (TLRPC.User) this.d;
                x0Var.getClass();
                ((boolean[]) this.f45492c)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = wp.r1(x0Var.f55669f).e7.edit();
                    edit.putBoolean("inlinegeo_" + user.f19943id, true).commit();
                    x0Var.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7) {
        s7 s7Var = (s7) this.f45491b;
        ak0 ak0Var = (ak0) this.f45492c;
        int[] iArr = (int[]) this.d;
        s7Var.c(canvas, rectF, f7);
        s7Var.f(canvas, rectF, f7);
        if (s7Var.h) {
            s7Var.b(canvas, rectF, f7);
        } else {
            s7Var.e(canvas, rectF, f7);
        }
        if (ak0Var != null && ak0Var.f24412a0 && ak0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            ak0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f45491b;
        String str = (String) this.f45492c;
        xa.o oVar = (xa.o) this.d;
        String str2 = (String) obj;
        w3 c10 = FirebaseMessaging.c(firebaseMessaging.f5591b);
        l9.h hVar = firebaseMessaging.f5590a;
        hVar.a();
        if ("[DEFAULT]".equals(hVar.f11709b)) {
            d = "";
        } else {
            d = hVar.d();
        }
        String a2 = firebaseMessaging.f5595i.a();
        synchronized (c10) {
            String a10 = xa.o.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.f52105a).edit();
                edit.putString(d + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (oVar == null || !str2.equals(oVar.f53575a)) {
            l9.h hVar2 = firebaseMessaging.f5590a;
            hVar2.a();
            if ("[DEFAULT]".equals(hVar2.f11709b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    hVar2.a();
                    sb2.append(hVar2.f11709b);
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
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        long j10;
        e4 e4Var = (e4) this.f45491b;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f45492c;
        zx zxVar2 = (zx) this.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        long j11 = ((hs) arrayList.get(0)).f16109a;
        Long l4 = (Long) g4.f(e4Var.f21584a).f15860r.get(tL_starGiftUnique.slug);
        if (l4 != null) {
            j10 = l4.longValue();
        } else {
            j10 = 0;
        }
        if (j10 != 0 && j10 != j11) {
            s4.m0(e4Var.getContext(), e4Var.I0, e4Var.f21584a, tL_starGiftUnique, j10, new a3(e4Var, j11, tL_starGiftUnique, zxVar2, 16));
            return true;
        }
        g4.f(e4Var.f21584a).s(j11, new yf.b(null, tL_starGiftUnique.slug), null, true);
        zxVar2.presentFragment(un.ma(j11), true);
        return true;
    }

    public a(g gVar, Object obj, i iVar, int i10) {
        this.f45490a = i10;
        this.f45491b = gVar;
        this.d = obj;
        this.f45492c = iVar;
    }
}
