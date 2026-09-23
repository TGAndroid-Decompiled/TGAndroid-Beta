package uh;

import ai.f5;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import ii.q1;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dt;
import org.telegram.ui.xn;
import wh.m;
import wh.n;
import xh.c1;
import xh.j1;
import xh.o2;
import yh.b1;
import yh.c4;
import yh.l;
import yh.l5;
import yh.o8;
import yh.q5;
import yh.s5;
import yh.t5;
import yh.x7;
import yh.y3;
import zg.o;
import zg.p;
import zg.q;
import zg.r0;
public final class i implements Runnable {
    public final int f43751a;
    public final Object f43752b;
    public final Object f43753c;

    public i(int i10, Object obj, Object obj2) {
        this.f43751a = i10;
        this.f43752b = obj;
        this.f43753c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        xc a02;
        int i11;
        int i12;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i13 = this.f43751a;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        int i14 = 0;
        Object obj = this.f43753c;
        Object obj2 = this.f43752b;
        switch (i13) {
            case 0:
                j jVar = (j) obj2;
                jVar.f43755b.add((String) obj);
                jVar.invalidate();
                return;
            case 1:
                ((q1) obj2).run((TLRPC.Chat) obj);
                return;
            case 2:
                n nVar = (n) obj2;
                g5 g5Var = (g5) obj;
                int i15 = nVar.f45068k;
                n2 n2Var = nVar.f45065g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                nVar.f45075r = importer;
                LongSparseArray longSparseArray = nVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    n2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (user.photo != null && !z10) {
                        if (nVar.f45076s == null) {
                            m mVar = new m(nVar, n2Var.getParentActivity(), (ml0) g5Var.getParent(), n2Var.getResourceProvider(), nVar.f45061a);
                            nVar.f45076s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.f45075r;
                            w9 avatarImageView = g5Var.getAvatarImageView();
                            mVar.f45056r = tL_chatInviteImporter;
                            mVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i15, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i15, user2, 1);
                            if (MessagesController.getInstance(i15).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i15).loadUserInfo(user2, false, 0);
                            }
                            ph0 ph0Var = mVar.h;
                            ph0Var.setParentAvatarImage(avatarImageView);
                            ph0Var.M(tL_chatInviteImporter.user_id, true);
                            ph0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            mVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            String str = tL_chatInviteImporter.about;
                            TextView textView = mVar.e;
                            textView.setText(str);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            mVar.f45060y.requestLayout();
                            nVar.f45076s.setOnDismissListener(new f5(nVar, 11));
                            nVar.f45076s.show();
                            return;
                        }
                        return;
                    }
                    nVar.f45062b = true;
                    n2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f18230id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    n2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 3:
                xh.b bVar = (xh.b) obj2;
                bVar.getClass();
                ((View.OnClickListener) obj).onClick(bVar);
                return;
            case 4:
                ((c1) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 5:
                j1 j1Var = (j1) obj2;
                j1Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    j1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 6:
                nr0 nr0Var = (nr0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                nr0Var.h(tL_starGiftCollection.title, new dt(24, nr0Var, tL_starGiftCollection));
                return;
            case 7:
                AndroidUtilities.addToClipboard((String) obj);
                xc.a0(((o2) obj2).f45999a.f46068a).k(false).j();
                return;
            case 8:
                l lVar = (l) obj2;
                TLObject tLObject = (TLObject) obj;
                int i16 = lVar.f47313a;
                ArrayList arrayList2 = lVar.e;
                lVar.f47318i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i16).putUsers(connectedstarrefbots.users, false);
                    if (lVar.f47315c <= 0) {
                        arrayList2.clear();
                    }
                    lVar.f47315c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList2.size() < lVar.f47315c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar.d = z11;
                } else {
                    lVar.h = true;
                    lVar.d = true;
                }
                lVar.f47317g = false;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar.f47314b));
                return;
            case 9:
                yh.m mVar2 = (yh.m) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i17 = mVar2.f47378a;
                ArrayList arrayList3 = mVar2.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i17).putUsers(suggestedstarrefbots.users, false);
                    if (mVar2.f47380c <= 0) {
                        arrayList3.clear();
                    }
                    mVar2.f47380c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    mVar2.f47384j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList3.size() < mVar2.f47380c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    mVar2.d = z12;
                } else {
                    mVar2.f47383i = true;
                    mVar2.d = true;
                }
                mVar2.h = false;
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar2.f47379b));
                return;
            case 10:
                y3.U0((y3) obj2, (Long) obj);
                return;
            case 11:
                y3 y3Var = (y3) obj2;
                if (!((t5) obj).e) {
                    qc Q = y3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f27316t = true;
                    Q.j();
                    return;
                }
                y3Var.f47964j0.setLoading(false);
                y3Var.w1();
                return;
            case 12:
                ((y3) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 13:
                MessagesController.getInstance(((y3) obj2).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 14:
                y3 y3Var2 = (y3) obj2;
                y3Var2.getClass();
                ((boolean[]) obj)[0] = true;
                y3Var2.f47964j0.setLoading(false);
                y3Var2.w1();
                return;
            case 15:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                xc bulletinFactory = ((y3) obj2).getBulletinFactory();
                int i18 = R.raw.ic_delete;
                int i19 = R.string.GiftRemovedDescription;
                bulletinFactory.Q(i18, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i19, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 16:
                y3 y3Var3 = (y3) obj2;
                xc.a0((xn) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(y3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new b1(y3Var3, 8)).k(true);
                return;
            case 17:
                ((y3) obj2).n2((CharSequence) obj);
                return;
            case 18:
                y3.I0((y3) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                return;
            case 19:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((b2) obj2).dismiss();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = xc.a0(U);
                        i11 = R.raw.fire_on;
                        i12 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = xc.a0(U);
                        i11 = R.raw.error;
                        i12 = R.string.UniqueGiftNotFound;
                    }
                    z0.o(i12, a02, i11, 36);
                    return;
                }
                return;
            case 20:
                c4 c4Var = (c4) obj2;
                xn xnVar = (xn) obj;
                a0 a0Var = c4Var.f46945b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    c4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    a0 a0Var2 = c4Var.f46945b;
                    if (a0Var2 instanceof t1) {
                        messageObject = ((t1) a0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        } else {
                            return;
                        }
                    } else if ((a0Var2 instanceof w0) && (messageObject = ((w0) a0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    s5 s5Var = t5.y(messageObject.currentAccount, false).B;
                    if (s5Var != null) {
                        s5Var.b();
                    }
                    TLRPC.ChatFull chatFull = xnVar.Z7;
                    Context context = c4Var.getContext();
                    int currentAccount = xnVar.getCurrentAccount();
                    long a2 = xnVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    MessageObject messageObject2 = messageObject;
                    o8 o8Var = new o8(context, currentAccount, a2, xnVar, messageObject2, arrayList4, z13, false, 0L, xnVar.getResourceProvider());
                    messageObject2.getId();
                    a0 a0Var3 = c4Var.f46945b;
                    o8Var.T = xnVar;
                    o8Var.U = a0Var3;
                    o8Var.show();
                    return;
                }
                return;
            case 21:
                TLObject tLObject3 = (TLObject) obj2;
                q1 q1Var = (q1) obj;
                if (tLObject3 instanceof TL_stars.StarGifts) {
                    q1Var.run((TL_stars.StarGifts) tLObject3);
                    return;
                } else {
                    q1Var.run(null);
                    return;
                }
            case 22:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 23:
                l5 l5Var = (l5) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = l5Var.f47337l;
                int i20 = l5Var.f47329a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    MessagesController.getInstance(i20).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i20).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i21 = 0;
                        while (i21 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i21)).pinned_to_top) {
                            i21++;
                        }
                        arrayList5.add(i21, savedStarGift);
                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l5Var.f47330b), l5Var);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ((MessagesController) obj2).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 25:
                new xc(((f3[]) obj2)[0].topBulletinContainer, (d6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 26:
                o8 o8Var2 = (o8) obj2;
                o8Var2.R = true;
                o8Var2.o(new q5((s5) obj, 2));
                AndroidUtilities.runOnUIThread(new x7(o8Var2, 1), 240L);
                return;
            case 27:
                q qVar = (q) obj2;
                z5 z5Var = (z5) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f49077n.getText());
                z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                int length = z5VarArr.length;
                while (i14 < length) {
                    z5 z5Var2 = z5VarArr[i14];
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = qVar.f49077n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        qVar.f49077n.getText().delete(spanStart, spanEnd);
                        int i22 = spanEnd - spanStart;
                        o oVar = qVar.f49077n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i22;
                        }
                        oVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                    i14++;
                }
                return;
            case 28:
                q qVar2 = (q) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (qVar2.Q != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    r0.f(-qVar2.M, qVar2.R, qVar2.Q);
                    return;
                }
                String str2 = tL_error2.text;
                if (str2.equals("REACTIONS_TOO_MANY")) {
                    str2 = LocaleController.formatPluralString("ReactionMaxCountError", qVar2.J, new Object[0]);
                }
                xc.a0(qVar2).t(str2, null).j();
                return;
            default:
                z5 z5Var3 = (z5) obj;
                q qVar3 = ((p) obj2).f49067e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.f49077n.getText());
                z5[] z5VarArr2 = (z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), z5.class);
                int length2 = z5VarArr2.length;
                while (i14 < length2) {
                    z5 z5Var4 = z5VarArr2[i14];
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = qVar3.f49077n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        qVar3.f49077n.getText().delete(spanStart2, spanEnd2);
                        int i23 = spanEnd2 - spanStart2;
                        o oVar2 = qVar3.f49077n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i23;
                        }
                        oVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                    i14++;
                }
                return;
        }
    }

    public i(t5 t5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f43751a = 22;
        this.f43752b = zArr;
        this.f43753c = callback2;
    }
}
