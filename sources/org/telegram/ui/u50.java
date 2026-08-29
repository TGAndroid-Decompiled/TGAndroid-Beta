package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public abstract class u50 {
    public static void a(org.telegram.ui.ActionBar.c2 c2Var, ye.c cVar, TLObject tLObject, final int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.o2 U;
        float f9;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (cVar != null) {
            cVar.b();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i10).putUsers(groupcall.users, false);
            MessagesController.getInstance(i10).putChats(groupcall.chats, false);
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.f22402id == groupCall.f22402id && (launchActivity = LaunchActivity.C1) != null) {
                r50.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
            lh.b bVar = new lh.b();
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, bVar, false, false);
            f3Var.fixNavigationBar();
            LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
            g10.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), bVar.C0(org.telegram.ui.ActionBar.g6.Oh)));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.filled_calls_users);
            frameLayout.addView(imageView, i7.f6.e(56, 56, 17));
            g10.addView(frameLayout, i7.f6.t(80, 80, 1, 2, 21, 2, 13));
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            org.telegram.ui.Components.y80 a2 = i7.j6.a(context, 20.0f, i11, true, bVar);
            a2.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
            a2.setGravity(17);
            g10.addView(a2, i7.f6.t(-1, -2, 1, 2, 0, 2, 4));
            List list = (List) Collection.EL.stream(arrayList).map(new j8(5)).filter(new Predicate() {
                public Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override
                public final boolean test(Object obj) {
                    Long l10 = (Long) obj;
                    if (l10.longValue() != UserConfig.getInstance(i10).getClientUserId() && l10.longValue() != 0) {
                        return true;
                    }
                    return false;
                }
            }).collect(Collectors.toList());
            boolean isEmpty = list.isEmpty();
            org.telegram.ui.Components.y80 a10 = i7.j6.a(context, 14.0f, i11, false, bVar);
            a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
            a10.setGravity(17);
            a10.setMaxWidth(nh.t3.a(a10.getText(), a10.getPaint()));
            g10.addView(a10, i7.f6.t(-1, -2, 1, 2, 0, 2, 23));
            if (!isEmpty) {
                View view = new View(context);
                view.setBackgroundColor(-14012362);
                g10.addView(view, i7.f6.s(-1, 7, 0, 0, 0, 0.66f, 0));
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(context, false);
                h9Var.setCentered(true);
                h9Var.setSize(AndroidUtilities.dp(38.0f));
                int min = Math.min(3, list.size());
                h9Var.setCount(min);
                for (int i12 = 0; i12 < min; i12++) {
                    h9Var.b(i12, MessagesController.getInstance(i10).getUser((Long) list.get(i12)), i10);
                }
                f9 = 8.0f;
                h9Var.a(false);
                g10.addView(h9Var, i7.f6.k(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
                org.telegram.ui.Components.y80 a11 = i7.j6.a(context, 14.0f, org.telegram.ui.ActionBar.g6.G6, false, bVar);
                a11.setGravity(17);
                if (list.size() == 1) {
                    a11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()))));
                } else if (list.size() == 2) {
                    a11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
                } else {
                    a11.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList.size() - 2, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
                }
                a11.setMaxWidth(nh.t3.a(a11.getText(), a11.getPaint()));
                g10.addView(a11, i7.f6.t(-1, -2, 1, 2, 0, 2, 25));
            } else {
                f9 = 8.0f;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f9), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f9));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(bVar.C0(org.telegram.ui.ActionBar.g6.f23152i6), 20, 20));
            org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(context, 24, bVar);
            hpVar.b(org.telegram.ui.ActionBar.g6.f23135h7, org.telegram.ui.ActionBar.g6.f23171j7, org.telegram.ui.ActionBar.g6.f23190k7);
            hpVar.setDrawUnchecked(true);
            hpVar.a(MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true), false);
            hpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(hpVar, i7.f6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(bVar.C0(org.telegram.ui.ActionBar.g6.f23169j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.GroupCallLinkMicrophone));
            linearLayout.addView(textView, i7.f6.t(-2, -2, 16, 9, 0, 0, 0));
            g10.addView(linearLayout, i7.f6.t(-2, 38, 1, 0, 4, 0, 12));
            i7.h6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new t50(hpVar, 0));
            nh.d dVar = new nh.d(context, bVar, true);
            dVar.setRoundRadius(24);
            dVar.g(LocaleController.getString(R.string.GroupCallLinkJoin), false, true);
            g10.addView(dVar, i7.f6.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
            f3Var.customView = g10;
            dVar.setOnClickListener(new org.telegram.ui.Components.go(f3Var, context, hpVar, i10, tL_inputGroupCallSlug, 1));
            f3Var.fixNavigationBar();
            f3Var.show();
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
            if (U2 != null) {
                j7.l1.v(R.string.LinkIsNoActive, org.telegram.ui.Components.tc.a0(U2), R.raw.error, 36);
            }
        } else if (tL_error != null && (U = LaunchActivity.U()) != null) {
            org.telegram.ui.Components.tc.a0(U).d0(tL_error, false);
        }
    }

    public static void b(Activity activity, int i10, String str, ye.c cVar) {
        org.telegram.ui.ActionBar.c2 c2Var;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.C1) != null) {
                r50.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (cVar == null) {
            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(activity, 3, null);
            c2Var2.q(300L);
            c2Var = c2Var2;
        } else {
            c2Var = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new jf.i0(c2Var, cVar, i10, activity, tL_inputGroupCallSlug, 10));
        if (cVar != null) {
            cVar.f50515b = new org.telegram.messenger.kh(i10, sendRequest, 3);
            cVar.d();
        }
    }
}
