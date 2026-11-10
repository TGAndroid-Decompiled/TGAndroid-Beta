package yf;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import bi.eb;
import bi.i5;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
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
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.s;
import yh.l;
import yh.m;
import zh.y0;
import zh.z1;
public final class b implements Runnable {
    public final int f59412a;
    public final Object f59413b;
    public final Object f59414c;

    public b(int i7, Object obj, Object obj2) {
        this.f59412a = i7;
        this.f59413b = obj;
        this.f59414c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z9;
        f2 f2Var;
        boolean z10;
        int i7;
        switch (this.f59412a) {
            case 0:
                d dVar = (d) this.f59413b;
                TLObject tLObject = (TLObject) this.f59414c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        dVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = dVar.f59423e;
                        if (!dVar.f59424f) {
                            dVar.f(false);
                            dVar.f59424f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            c cVar = (c) obj;
                            if (cVar.f59416b != null && (document = cVar.f59415a) != null) {
                                hashMap.put(Long.valueOf(document.f26966id), cVar.f59416b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = dVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList.size());
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TLRPC.Document document3 = arrayList.get(i11);
                            String str = (String) hashMap.get(Long.valueOf(document3.f26966id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i11, Utilities.f(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i11, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f59415a = document3;
                            obj2.f59416b = str;
                            int i12 = dVar.d;
                            dVar.d = i12 + 1;
                            obj2.f59417c = i12;
                            arrayList2.add(obj2);
                        }
                        edit.apply();
                        qs.f(dVar.f59422c).k(307, new Object[0]);
                        SharedPreferences.Editor edit2 = dVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        d.f59418g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        d.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    dVar.b();
                    return;
                }
                return;
            case 1:
                d dVar2 = (d) this.f59413b;
                ArrayList arrayList3 = (ArrayList) this.f59414c;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    c cVar2 = (c) arrayList3.get(i13);
                    if (cVar2 != null && ((TextUtils.isEmpty(cVar2.f59416b) || !new File(cVar2.f59416b).exists()) && (document2 = cVar2.f59415a) != null)) {
                        w7.G(dVar2.f59422c);
                        File I = w7.I(document2);
                        if (I == null || !I.exists()) {
                            g0.h3(new b(2, dVar2, document2));
                        }
                    }
                }
                return;
            case 2:
                TLRPC.Document document4 = (TLRPC.Document) this.f59414c;
                w7.G(((d) this.f59413b).f59422c).W(document4, document4, 0, 0);
                return;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f59414c;
                int i14 = ((e) this.f59413b).f59425a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    qs.e().k(292, 4, id.a0("TooLongError", null, 2131744041, new Object[0]), id.a0("ErrorRingtoneDurationTooLong", null, 2131751104, Integer.valueOf(qp.s1(i14).f24827k4)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    qs.e().k(292, 4, id.a0("TooLargeError", null, 2131744042, new Object[0]), id.a0("ErrorRingtoneSizeTooBig", null, 2131751102, Integer.valueOf(qp.s1(i14).f24835l4 / 1024)));
                    return;
                } else {
                    qs.e().k(292, 4, id.a0("InvalidFormatError", null, 2131749181, new Object[0]), id.M0(2131751103, null));
                    return;
                }
            case 4:
                ((xg.a) this.f59413b).a((TLRPC.Chat) this.f59414c);
                return;
            case 5:
                m mVar = (m) this.f59413b;
                e5 e5Var = (e5) this.f59414c;
                int i15 = mVar.f59558k;
                f2 f2Var2 = mVar.f59555g;
                TLRPC.TL_chatInviteImporter importer = e5Var.getImporter();
                mVar.f59565r = importer;
                LongSparseArray longSparseArray = mVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    f2Var2.getMessagesController().X3(user, false, false);
                    Point point = g0.f22567q;
                    if (point.x > point.y) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (user.photo != null) {
                        if (z9) {
                            z10 = true;
                            f2Var = f2Var2;
                        } else if (mVar.f59566s == null) {
                            l lVar = new l(mVar, f2Var2.getParentActivity(), (pj0) e5Var.getParent(), f2Var2.getResourceProvider(), mVar.f59550a);
                            mVar.f59566s = lVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f59565r;
                            k9 avatarImageView = e5Var.getAvatarImageView();
                            TextView textView = lVar.f59542e;
                            sf0 sf0Var = lVar.h;
                            lVar.f59545r = tL_chatInviteImporter;
                            lVar.f59547w = avatarImageView;
                            TLRPC.User a22 = qp.s1(i15).a2(Long.valueOf(tL_chatInviteImporter.user_id));
                            hc m10 = hc.m(i15, 0, a22);
                            hc m11 = hc.m(i15, 1, a22);
                            if (qp.s1(i15).b2(tL_chatInviteImporter.user_id) == null) {
                                qp.s1(i15).g3(a22, false, 0);
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
                            mVar.f59566s.setOnDismissListener(new eb(mVar, 15));
                            mVar.f59566s.show();
                            return;
                        } else {
                            return;
                        }
                    } else {
                        f2Var = f2Var2;
                        z10 = true;
                    }
                    mVar.f59551b = z10;
                    f2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f27109id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    f2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 6:
                zh.c cVar3 = (zh.c) this.f59413b;
                cVar3.getClass();
                ((View.OnClickListener) this.f59414c).onClick(cVar3);
                return;
            case 7:
                ((i5) this.f59413b).k().f0((TLRPC.TL_error) this.f59414c, false);
                return;
            case 8:
                y0 y0Var = (y0) this.f59413b;
                y0Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f59414c).unsaved) {
                    y0Var.F.setVisibility(8);
                    return;
                }
                return;
            case 9:
                up0 up0Var = (up0) this.f59413b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f59414c;
                up0Var.h(tL_starGiftCollection.title, new s(17, up0Var, tL_starGiftCollection));
                return;
            default:
                g0.g((String) this.f59414c);
                gc.a0(((z1) this.f59413b).f60651a.f60294a).k(false).j();
                return;
        }
    }
}
