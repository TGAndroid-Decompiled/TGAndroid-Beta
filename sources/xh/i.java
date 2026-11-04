package xh;

import ai.s;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.widget.TextView;
import ci.ba;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.o3;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.ProfileActivity;
import z9.m;
import z9.p;
import z9.r;
import z9.x;
import zh.k;
public final class i implements Runnable {
    public final int f58862a;
    public final Object f58863b;
    public final Object f58864c;

    public i(int i3, Object obj, Object obj2) {
        this.f58862a = i3;
        this.f58864c = obj;
        this.f58863b = obj2;
    }

    @Override
    public final void run() {
        boolean equals;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        int i3;
        switch (this.f58862a) {
            case 0:
                j jVar = (j) this.f58864c;
                jVar.f58866b.add((String) this.f58863b);
                jVar.invalidate();
                return;
            case 1:
                ((m) this.f58864c).d((String) this.f58863b, Boolean.FALSE);
                return;
            case 2:
                o3 o3Var = ((p) this.f58864c).f60220f.d;
                o3Var.getClass();
                String b10 = ba.e.b(1024, (String) this.f58863b);
                synchronized (((AtomicMarkableReference) o3Var.f18687g)) {
                    try {
                        String str = (String) ((AtomicMarkableReference) o3Var.f18687g).getReference();
                        if (b10 == null) {
                            if (str == null) {
                                equals = true;
                            } else {
                                equals = false;
                            }
                        } else {
                            equals = b10.equals(str);
                        }
                        if (!equals) {
                            ((AtomicMarkableReference) o3Var.f18687g).set(b10, true);
                            ((aa.g) o3Var.f18683b).f287b.a(new s(o3Var, 14));
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 3:
                Throwable th2 = (Throwable) this.f58863b;
                Map map = Collections.EMPTY_MAP;
                m mVar = ((p) this.f58864c).f60220f;
                Thread currentThread = Thread.currentThread();
                mVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                r rVar = mVar.f60206n;
                if (rVar == null || !rVar.f60237e.get()) {
                    long j10 = currentTimeMillis / 1000;
                    String g7 = mVar.g();
                    if (g7 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    ba.c cVar = new ba.c(g7, j10, map);
                    x xVar = mVar.f60205m;
                    xVar.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(g7);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    xVar.g(th2, currentThread, "error", cVar, false);
                    return;
                }
                return;
            case 4:
                ((za.h) this.f58864c).a((Intent) this.f58863b);
                return;
            case 5:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f58864c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f58863b;
                he0 he0Var = FirebaseMessaging.f7941m;
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 6:
                za.m mVar2 = (za.m) this.f58864c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f58863b;
                try {
                    taskCompletionSource2.setResult(mVar2.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            case 7:
                zf.c cVar2 = (zf.c) this.f58864c;
                TLObject tLObject = (TLObject) this.f58863b;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar2.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = cVar2.f60456e;
                        if (!cVar2.f60457f) {
                            cVar2.f(false);
                            cVar2.f60457f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            zf.b bVar = (zf.b) obj;
                            if (bVar.f60449b != null && (document = bVar.f60448a) != null) {
                                hashMap.put(Long.valueOf(document.f27007id), bVar.f60449b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = cVar2.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList.size());
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TLRPC.Document document3 = arrayList.get(i11);
                            String str2 = (String) hashMap.get(Long.valueOf(document3.f27007id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i11, Utilities.f(serializedData.toByteArray()));
                            if (str2 != null) {
                                edit.putString("tone_local_path" + i11, str2);
                            }
                            ?? obj2 = new Object();
                            obj2.f60448a = document3;
                            obj2.f60449b = str2;
                            int i12 = cVar2.d;
                            cVar2.d = i12 + 1;
                            obj2.f60450c = i12;
                            arrayList2.add(obj2);
                        }
                        edit.apply();
                        hs.f(cVar2.f60455c).k(307, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar2.d().edit();
                        long j11 = tL_savedRingtones.hash;
                        zf.c.f60451g = j11;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j11);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        zf.c.h = currentTimeMillis2;
                        putLong.putLong("lastReload", currentTimeMillis2).apply();
                    }
                    cVar2.b();
                    return;
                }
                return;
            case 8:
                zf.c cVar3 = (zf.c) this.f58864c;
                ArrayList arrayList3 = (ArrayList) this.f58863b;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    zf.b bVar2 = (zf.b) arrayList3.get(i13);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f60449b) || !new File(bVar2.f60449b).exists()) && (document2 = bVar2.f60448a) != null)) {
                        w7.G(cVar3.f60455c);
                        File I = w7.I(document2);
                        if (I == null || !I.exists()) {
                            g0.h3(new i(9, cVar3, document2));
                        }
                    }
                }
                return;
            case 9:
                TLRPC.Document document4 = (TLRPC.Document) this.f58863b;
                w7.G(((zf.c) this.f58864c).f60455c).X(document4, document4, 0, 0);
                return;
            case 10:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f58863b;
                int i14 = ((zf.d) this.f58864c).f60458a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    hs.e().k(292, 4, bd.a0("TooLongError", null, 2131744051, new Object[0]), bd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(hp.s1(i14).f23047k4)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    hs.e().k(292, 4, bd.a0("TooLargeError", null, 2131744052, new Object[0]), bd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(hp.s1(i14).f23056l4 / 1024)));
                    return;
                } else {
                    hs.e().k(292, 4, bd.a0("InvalidFormatError", null, 2131749189, new Object[0]), bd.M0(2131751104, null));
                    return;
                }
            case 11:
                ((xg.d) this.f58864c).a((TLRPC.Chat) this.f58863b);
                return;
            default:
                k kVar = (k) this.f58864c;
                e5 e5Var = (e5) this.f58863b;
                int i15 = kVar.f60588k;
                d2 d2Var = kVar.f60585g;
                TLRPC.TL_chatInviteImporter importer = e5Var.getImporter();
                kVar.f60595r = importer;
                LongSparseArray longSparseArray = kVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    d2Var.getMessagesController().X3(user, false, false);
                    Point point = g0.f22608q;
                    if (point.x > point.y) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (user.photo != null && !z10) {
                        if (kVar.f60596s == null) {
                            zh.j jVar2 = new zh.j(kVar, d2Var.getParentActivity(), (tj0) e5Var.getParent(), d2Var.getResourceProvider(), kVar.f60580a);
                            kVar.f60596s = jVar2;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f60595r;
                            k9 avatarImageView = e5Var.getAvatarImageView();
                            TextView textView = jVar2.f60572e;
                            vf0 vf0Var = jVar2.h;
                            jVar2.f60575r = tL_chatInviteImporter;
                            jVar2.f60577w = avatarImageView;
                            TLRPC.User a22 = hp.s1(i15).a2(Long.valueOf(tL_chatInviteImporter.user_id));
                            ac m10 = ac.m(i15, 0, a22);
                            ac m11 = ac.m(i15, 1, a22);
                            if (hp.s1(i15).b2(tL_chatInviteImporter.user_id) == null) {
                                hp.s1(i15).g3(a22, false, 0);
                            }
                            vf0Var.setParentAvatarImage(avatarImageView);
                            vf0Var.M(tL_chatInviteImporter.user_id, true);
                            vf0Var.H(null, m10, m11, true);
                            jVar2.d.setText(l10.p((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i3 = 8;
                            } else {
                                i3 = 0;
                            }
                            textView.setVisibility(i3);
                            jVar2.E.requestLayout();
                            kVar.f60596s.setOnDismissListener(new ba(kVar, 15));
                            kVar.f60596s.show();
                            return;
                        }
                        return;
                    }
                    kVar.f60581b = true;
                    d2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f27150id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    d2Var.presentFragment(profileActivity);
                    return;
                }
                return;
        }
    }

    public i(p pVar, Throwable th2) {
        this.f58862a = 3;
        Map map = Collections.EMPTY_MAP;
        this.f58864c = pVar;
        this.f58863b = th2;
    }
}
