package u2;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
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
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import org.telegram.ui.nj0;
import org.telegram.ui.web.y1;
import wh.m2;
import xh.a8;
import xh.b4;
import xh.n5;
import xh.r8;
import xh.s5;
import xh.u5;
import xh.v5;
import xh.x3;
public final class k0 implements Runnable {
    public final int f42364a;
    public final Object f42365b;
    public final Object f42366c;

    public k0(int i10, Object obj, Object obj2) {
        this.f42364a = i10;
        this.f42365b = obj;
        this.f42366c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        wc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions2;
        y5[] y5VarArr;
        int i12 = this.f42364a;
        int i13 = 8;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        Object obj = this.f42366c;
        Object obj2 = this.f42365b;
        switch (i12) {
            case 0:
                ((e2.h) obj2).accept(obj);
                return;
            case 1:
                ((w0) obj2).A((c3.b0) obj);
                return;
            case 2:
                ((y1) obj2).run((TLRPC.Chat) obj);
                return;
            case 3:
                vh.p pVar = (vh.p) obj2;
                g5 g5Var = (g5) obj;
                int i14 = pVar.f43405k;
                p2 p2Var = pVar.f43402g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                pVar.f43412r = importer;
                LongSparseArray longSparseArray = pVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    p2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (user.photo != null && !z10) {
                        if (pVar.f43413s == null) {
                            vh.o oVar = new vh.o(pVar, p2Var.getParentActivity(), (vl0) g5Var.getParent(), p2Var.getResourceProvider(), pVar.f43398a);
                            pVar.f43413s = oVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = pVar.f43412r;
                            w9 avatarImageView = g5Var.getAvatarImageView();
                            oVar.f43393r = tL_chatInviteImporter;
                            oVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i14, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i14, user2, 1);
                            if (MessagesController.getInstance(i14).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i14).loadUserInfo(user2, false, 0);
                            }
                            yh0 yh0Var = oVar.h;
                            yh0Var.setParentAvatarImage(avatarImageView);
                            yh0Var.M(tL_chatInviteImporter.user_id, true);
                            yh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            oVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            String str = tL_chatInviteImporter.about;
                            TextView textView = oVar.e;
                            textView.setText(str);
                            if (!TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i13 = 0;
                            }
                            textView.setVisibility(i13);
                            oVar.f43397y.requestLayout();
                            pVar.f43413s.setOnDismissListener(new gg.o(pVar, 9));
                            pVar.f43413s.show();
                            return;
                        }
                        return;
                    }
                    pVar.f43399b = true;
                    p2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f17342id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    p2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 4:
                wh.b bVar = (wh.b) obj2;
                bVar.getClass();
                ((View.OnClickListener) obj).onClick(bVar);
                return;
            case 5:
                ((wh.b1) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 6:
                wh.h1 h1Var = (wh.h1) obj2;
                h1Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    h1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 7:
                wr0 wr0Var = (wr0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                wr0Var.h(tL_starGiftCollection.title, new nj0(15, wr0Var, tL_starGiftCollection));
                return;
            case 8:
                AndroidUtilities.addToClipboard((String) obj);
                wc.a0(((m2) obj2).f44246a.f44317a).k(false).j();
                return;
            case 9:
                xh.m mVar = (xh.m) obj2;
                TLObject tLObject = (TLObject) obj;
                int i15 = mVar.f45687a;
                ArrayList arrayList2 = mVar.e;
                mVar.f45692i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i15).putUsers(connectedstarrefbots.users, false);
                    if (mVar.f45689c <= 0) {
                        arrayList2.clear();
                    }
                    mVar.f45689c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList2.size() < mVar.f45689c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    mVar.d = z11;
                } else {
                    mVar.h = true;
                    mVar.d = true;
                }
                mVar.f45691g = false;
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(mVar.f45688b));
                return;
            case 10:
                xh.n nVar = (xh.n) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i16 = nVar.f45731a;
                ArrayList arrayList3 = nVar.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i16).putUsers(suggestedstarrefbots.users, false);
                    if (nVar.f45733c <= 0) {
                        arrayList3.clear();
                    }
                    nVar.f45733c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    nVar.f45737j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList3.size() < nVar.f45733c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    nVar.d = z12;
                } else {
                    nVar.f45736i = true;
                    nVar.d = true;
                }
                nVar.h = false;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(nVar.f45732b));
                return;
            case 11:
                x3.U0((x3) obj2, (Long) obj);
                return;
            case 12:
                x3 x3Var = (x3) obj2;
                if (!((v5) obj).e) {
                    pc Q = x3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f26091t = true;
                    Q.j();
                    return;
                }
                x3Var.f46285j0.setLoading(false);
                x3Var.w1();
                return;
            case 13:
                ((x3) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 14:
                MessagesController.getInstance(((x3) obj2).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 15:
                x3 x3Var2 = (x3) obj2;
                x3Var2.getClass();
                ((boolean[]) obj)[0] = true;
                x3Var2.f46285j0.setLoading(false);
                x3Var2.w1();
                return;
            case 16:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                ((x3) obj2).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 17:
                x3 x3Var3 = (x3) obj2;
                wc.a0((eo) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(x3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new xh.b1(x3Var3, 8)).k(true);
                return;
            case 18:
                ((x3) obj2).n2((CharSequence) obj);
                return;
            case 19:
                x3.I0((x3) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                return;
            case 20:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((d2) obj2).dismiss();
                p2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = wc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = wc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    }
                    a2.o(i11, a02, i10, 36);
                    return;
                }
                return;
            case 21:
                b4 b4Var = (b4) obj2;
                eo eoVar = (eo) obj;
                org.telegram.ui.Cells.a0 a0Var = b4Var.f45267b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    b4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = b4Var.f45267b;
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
                    } else if ((a0Var2 instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) a0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    u5 u5Var = v5.y(messageObject.currentAccount, false).B;
                    if (u5Var != null) {
                        u5Var.b();
                    }
                    TLRPC.ChatFull chatFull = eoVar.Z7;
                    Context context = b4Var.getContext();
                    int currentAccount = eoVar.getCurrentAccount();
                    long a2 = eoVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    MessageObject messageObject2 = messageObject;
                    r8 r8Var = new r8(context, currentAccount, a2, eoVar, messageObject2, arrayList4, z13, false, 0L, eoVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = b4Var.f45267b;
                    r8Var.T = eoVar;
                    r8Var.U = a0Var3;
                    r8Var.show();
                    return;
                }
                return;
            case 22:
                TLObject tLObject3 = (TLObject) obj2;
                y1 y1Var = (y1) obj;
                if (tLObject3 instanceof TL_stars.StarGifts) {
                    y1Var.run((TL_stars.StarGifts) tLObject3);
                    return;
                } else {
                    y1Var.run(null);
                    return;
                }
            case 23:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 24:
                n5 n5Var = (n5) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = n5Var.f45761l;
                int i17 = n5Var.f45753a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    MessagesController.getInstance(i17).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i17).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i18 = 0;
                        while (i18 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i18)).pinned_to_top) {
                            i18++;
                        }
                        arrayList5.add(i18, savedStarGift);
                        NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n5Var.f45754b), n5Var);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ((MessagesController) obj2).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 26:
                new wc(((h3[]) obj2)[0].topBulletinContainer, (f6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 27:
                r8 r8Var2 = (r8) obj2;
                r8Var2.R = true;
                r8Var2.o(new s5((u5) obj, 2));
                AndroidUtilities.runOnUIThread(new a8(r8Var2, 1), 240L);
                return;
            case 28:
                yg.s sVar = (yg.s) obj2;
                y5 y5Var = (y5) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f47137n.getText());
                for (y5 y5Var2 : (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class)) {
                    if (y5Var2 == y5Var) {
                        int editTextSelectionEnd = sVar.f47137n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(y5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(y5Var2);
                        sVar.f47137n.getText().delete(spanStart, spanEnd);
                        int i19 = spanEnd - spanStart;
                        yg.p pVar2 = sVar.f47137n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i19;
                        }
                        pVar2.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            default:
                yg.s sVar2 = (yg.s) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (sVar2.Q != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    yg.r0.f(-sVar2.M, sVar2.R, sVar2.Q);
                    return;
                }
                String str2 = tL_error2.text;
                if (str2.equals("REACTIONS_TOO_MANY")) {
                    str2 = LocaleController.formatPluralString("ReactionMaxCountError", sVar2.J, new Object[0]);
                }
                wc.a0(sVar2).t(str2, null).j();
                return;
        }
    }

    public k0(v5 v5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f42364a = 23;
        this.f42365b = zArr;
        this.f42366c = callback2;
    }
}
