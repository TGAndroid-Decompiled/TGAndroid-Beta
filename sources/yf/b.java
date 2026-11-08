package yf;

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
import org.telegram.messenger.g0;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.t;
import yh.l;
import yh.m;
import zh.y0;
import zh.z1;
public final class b implements Runnable {
    public final int f59405a;
    public final Object f59406b;
    public final Object f59407c;

    public b(int i7, Object obj, Object obj2) {
        this.f59405a = i7;
        this.f59406b = obj;
        this.f59407c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        boolean z9;
        int i7;
        int i10 = this.f59405a;
        Object obj = this.f59407c;
        Object obj2 = this.f59406b;
        switch (i10) {
            case 0:
                d dVar = (d) obj2;
                ArrayList arrayList = (ArrayList) obj;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    c cVar = (c) arrayList.get(i11);
                    if (cVar != null && ((TextUtils.isEmpty(cVar.f59409b) || !new File(cVar.f59409b).exists()) && (document = cVar.f59408a) != null)) {
                        w7.G(dVar.f59415c);
                        File I = w7.I(document);
                        if (I == null || !I.exists()) {
                            g0.h3(new b(1, dVar, document));
                        }
                    }
                }
                return;
            case 1:
                TLRPC.Document document2 = (TLRPC.Document) obj;
                w7.G(((d) obj2).f59415c).W(document2, document2, 0, 0);
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                int i12 = ((e) obj2).f59418a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    qs.e().k(292, 4, id.a0("TooLongError", null, 2131744044, new Object[0]), id.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(qp.s1(i12).f24823k4)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    qs.e().k(292, 4, id.a0("TooLargeError", null, 2131744045, new Object[0]), id.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(qp.s1(i12).f24831l4 / 1024)));
                    return;
                } else {
                    qs.e().k(292, 4, id.a0("InvalidFormatError", null, 2131749182, new Object[0]), id.M0(2131751104, null));
                    return;
                }
            case 3:
                ((xg.a) obj2).a((TLRPC.Chat) obj);
                return;
            case 4:
                m mVar = (m) obj2;
                e5 e5Var = (e5) obj;
                int i13 = mVar.f59551k;
                f2 f2Var = mVar.f59548g;
                TLRPC.TL_chatInviteImporter importer = e5Var.getImporter();
                mVar.f59558r = importer;
                LongSparseArray longSparseArray = mVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    f2Var.getMessagesController().X3(user, false, false);
                    Point point = g0.f22563q;
                    if (point.x > point.y) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (user.photo != null && !z9) {
                        if (mVar.f59559s == null) {
                            l lVar = new l(mVar, f2Var.getParentActivity(), (pj0) e5Var.getParent(), f2Var.getResourceProvider(), mVar.f59543a);
                            mVar.f59559s = lVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f59558r;
                            l9 avatarImageView = e5Var.getAvatarImageView();
                            lVar.f59538r = tL_chatInviteImporter;
                            lVar.f59540w = avatarImageView;
                            TLRPC.User a22 = qp.s1(i13).a2(Long.valueOf(tL_chatInviteImporter.user_id));
                            hc m10 = hc.m(i13, 0, a22);
                            hc m11 = hc.m(i13, 1, a22);
                            if (qp.s1(i13).b2(tL_chatInviteImporter.user_id) == null) {
                                qp.s1(i13).g3(a22, false, 0);
                            }
                            sf0 sf0Var = lVar.h;
                            sf0Var.setParentAvatarImage(avatarImageView);
                            sf0Var.M(tL_chatInviteImporter.user_id, true);
                            sf0Var.H(null, m10, m11, true);
                            lVar.d.setText(t10.p((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            String str = tL_chatInviteImporter.about;
                            TextView textView = lVar.f59535e;
                            textView.setText(str);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            textView.setVisibility(i7);
                            lVar.D.requestLayout();
                            mVar.f59559s.setOnDismissListener(new eb(mVar, 15));
                            mVar.f59559s.show();
                            return;
                        }
                        return;
                    }
                    mVar.f59544b = true;
                    f2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f27105id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    f2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 5:
                zh.c cVar2 = (zh.c) obj2;
                cVar2.getClass();
                ((View.OnClickListener) obj).onClick(cVar2);
                return;
            case 6:
                ((i5) obj2).k().f0((TLRPC.TL_error) obj, false);
                return;
            case 7:
                y0 y0Var = (y0) obj2;
                y0Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    y0Var.F.setVisibility(8);
                    return;
                }
                return;
            case 8:
                up0 up0Var = (up0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                up0Var.h(tL_starGiftCollection.title, new t(17, up0Var, tL_starGiftCollection));
                return;
            default:
                g0.g((String) obj);
                org.telegram.ui.Components.hc.a0(((z1) obj2).f60622a.f60283a).k(false).j();
                return;
        }
    }
}
