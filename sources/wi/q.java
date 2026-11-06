package wi;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.eb;
import bi.i5;
import hi.m2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pk;
import zh.a2;
import zh.z0;
public final class q implements Runnable {
    public final int f58013a;
    public final Object f58014b;
    public final Object f58015c;

    public q(int i7, Object obj, Object obj2) {
        this.f58013a = i7;
        this.f58014b = obj;
        this.f58015c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z9;
        int i7;
        switch (this.f58013a) {
            case 0:
                t tVar = (t) this.f58014b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f58015c;
                tVar.getClass();
                try {
                    try {
                        tVar.f();
                        tVar.f58059r0 = true;
                    } catch (RuntimeException e10) {
                        tVar.f58068w0 = e10;
                        tVar.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 1:
                m0 m0Var = (m0) this.f58015c;
                t0 t0Var = (t0) ((qt) this.f58014b).f37504b;
                t0Var.Q++;
                t0Var.f58095y = true;
                t0Var.f58084m.b("camera switch started: target=" + m0Var);
                n40 n40Var = (n40) t0Var.d.f37504b;
                FrameLayout frameLayout = n40Var.f36270x;
                n40Var.f36264s0++;
                ValueAnimator valueAnimator = n40Var.f36243b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    n40Var.f36243b0.cancel();
                    n40Var.f36243b0 = null;
                }
                n40Var.f36257n0 = true;
                n40Var.f36258o0 = false;
                n40Var.f36259p0 = false;
                n40Var.f36260q0 = false;
                n40Var.f36262r0 = SystemClock.elapsedRealtime();
                pk pkVar = n40Var.D;
                n40Var.y(false);
                Bitmap bitmap = n40Var.f36265t0;
                if (bitmap != null) {
                    pkVar.setImageBitmap(bitmap);
                    n40Var.m0 = true;
                    pkVar.animate().cancel();
                    pkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i10 = n40Var.f36264s0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                n40Var.f36243b0 = ofFloat;
                ofFloat.setDuration(580L);
                n40Var.f36243b0.setInterpolator(xq.h);
                n40Var.f36243b0.addUpdateListener(new i2(n40Var, i10, 4));
                n40Var.f36243b0.addListener(new m2(n40Var, i10, 10));
                n40Var.f36243b0.start();
                a8.b("RoundVideo camera flip started: facing=" + m0Var + ", minimumDurationMs=580");
                n40Var.B();
                t0Var.o();
                return;
            case 2:
                ((h2.j) this.f58014b).accept(this.f58015c);
                return;
            case 3:
                ((x2.w0) this.f58014b).y((f3.c0) this.f58015c);
                return;
            case 4:
                yf.c cVar = (yf.c) this.f58014b;
                TLObject tLObject = (TLObject) this.f58015c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = cVar.f59293e;
                        if (!cVar.f59294f) {
                            cVar.f(false);
                            cVar.f59294f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            yf.b bVar = (yf.b) obj;
                            if (bVar.f59286b != null && (document = bVar.f59285a) != null) {
                                hashMap.put(Long.valueOf(document.f26958id), bVar.f59286b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList.size());
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TLRPC.Document document3 = arrayList.get(i12);
                            String str = (String) hashMap.get(Long.valueOf(document3.f26958id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i12, Utilities.f(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i12, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f59285a = document3;
                            obj2.f59286b = str;
                            int i13 = cVar.d;
                            cVar.d = i13 + 1;
                            obj2.f59287c = i13;
                            arrayList2.add(obj2);
                        }
                        edit.apply();
                        qs.f(cVar.f59292c).k(307, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        yf.c.f59288g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        yf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 5:
                yf.c cVar2 = (yf.c) this.f58014b;
                ArrayList arrayList3 = (ArrayList) this.f58015c;
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    yf.b bVar2 = (yf.b) arrayList3.get(i14);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f59286b) || !new File(bVar2.f59286b).exists()) && (document2 = bVar2.f59285a) != null)) {
                        w7.G(cVar2.f59292c);
                        File I = w7.I(document2);
                        if (I == null || !I.exists()) {
                            org.telegram.messenger.g0.h3(new q(6, cVar2, document2));
                        }
                    }
                }
                return;
            case 6:
                TLRPC.Document document4 = (TLRPC.Document) this.f58015c;
                w7.G(((yf.c) this.f58014b).f59292c).X(document4, document4, 0, 0);
                return;
            case 7:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f58015c;
                int i15 = ((yf.d) this.f58014b).f59295a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    qs.e().k(292, 4, hd.a0("TooLongError", null, 2131744042, new Object[0]), hd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(qp.s1(i15).f24808k4)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    qs.e().k(292, 4, hd.a0("TooLargeError", null, 2131744043, new Object[0]), hd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(qp.s1(i15).f24816l4 / 1024)));
                    return;
                } else {
                    qs.e().k(292, 4, hd.a0("InvalidFormatError", null, 2131749180, new Object[0]), hd.M0(2131751104, null));
                    return;
                }
            case 8:
                ((xg.a) this.f58014b).a((TLRPC.Chat) this.f58015c);
                return;
            case 9:
                yh.m mVar = (yh.m) this.f58014b;
                e5 e5Var = (e5) this.f58015c;
                int i16 = mVar.f59428k;
                f2 f2Var = mVar.f59425g;
                TLRPC.TL_chatInviteImporter importer = e5Var.getImporter();
                mVar.f59435r = importer;
                LongSparseArray longSparseArray = mVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    f2Var.getMessagesController().X3(user, false, false);
                    Point point = org.telegram.messenger.g0.f22537q;
                    if (point.x > point.y) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (user.photo != null && !z9) {
                        if (mVar.f59436s == null) {
                            yh.l lVar = new yh.l(mVar, f2Var.getParentActivity(), (pj0) e5Var.getParent(), f2Var.getResourceProvider(), mVar.f59420a);
                            mVar.f59436s = lVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f59435r;
                            l9 avatarImageView = e5Var.getAvatarImageView();
                            TextView textView = lVar.f59412e;
                            sf0 sf0Var = lVar.h;
                            lVar.f59415r = tL_chatInviteImporter;
                            lVar.f59417w = avatarImageView;
                            TLRPC.User a22 = qp.s1(i16).a2(Long.valueOf(tL_chatInviteImporter.user_id));
                            hc m10 = hc.m(i16, 0, a22);
                            hc m11 = hc.m(i16, 1, a22);
                            if (qp.s1(i16).b2(tL_chatInviteImporter.user_id) == null) {
                                qp.s1(i16).g3(a22, false, 0);
                            }
                            sf0Var.setParentAvatarImage(avatarImageView);
                            sf0Var.M(tL_chatInviteImporter.user_id, true);
                            sf0Var.H(null, m10, m11, true);
                            lVar.d.setText(t10.p((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            textView.setVisibility(i7);
                            lVar.D.requestLayout();
                            mVar.f59436s.setOnDismissListener(new eb(mVar, 15));
                            mVar.f59436s.show();
                            return;
                        }
                        return;
                    }
                    mVar.f59421b = true;
                    f2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f27101id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    f2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 10:
                zh.c cVar3 = (zh.c) this.f58014b;
                cVar3.getClass();
                ((View.OnClickListener) this.f58015c).onClick(cVar3);
                return;
            case 11:
                ((i5) this.f58014b).k().f0((TLRPC.TL_error) this.f58015c, false);
                return;
            case 12:
                z0 z0Var = (z0) this.f58014b;
                z0Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f58015c).unsaved) {
                    z0Var.F.setVisibility(8);
                    return;
                }
                return;
            case 13:
                up0 up0Var = (up0) this.f58014b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f58015c;
                up0Var.h(tL_starGiftCollection.title, new org.telegram.ui.Wallet.t(17, up0Var, tL_starGiftCollection));
                return;
            default:
                org.telegram.messenger.g0.g((String) this.f58015c);
                org.telegram.ui.Components.hc.a0(((a2) this.f58014b).f60081a.f60187a).k(false).j();
                return;
        }
    }
}
