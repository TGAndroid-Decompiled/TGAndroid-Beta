package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
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
public abstract class x50 {
    public static void a(org.telegram.ui.ActionBar.c2 c2Var, pf.c cVar, TLObject tLObject, final int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.o2 U;
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
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.f20353id == groupCall.f20353id && (launchActivity = LaunchActivity.J1) != null) {
                u50.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
            ci.b bVar = new ci.b();
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, (org.telegram.ui.ActionBar.g6) bVar, false);
            h3Var.fixNavigationBar();
            LinearLayout e = org.telegram.messenger.sl.e(context, 1);
            e.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            int dp = AndroidUtilities.dp(80.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, bVar.g(i11));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
            frameLayout.setBackground(K);
            org.telegram.ui.ActionBar.r6.k(frameLayout, K, O, null, bVar);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.filled_calls_users);
            frameLayout.addView(imageView, w7.z5.e(56, 56, 17));
            e.addView(frameLayout, w7.z5.t(80, 80, 1, 2, 21, 2, 13));
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.Components.y90 a2 = w7.d6.a(context, 20.0f, i12, true, bVar);
            a2.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
            a2.setGravity(17);
            e.addView(a2, w7.z5.t(-1, -2, 1, 2, 0, 2, 4));
            List list = (List) Collection.EL.stream(arrayList).map(new k2.g(6)).filter(new Predicate() {
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
                    Long l4 = (Long) obj;
                    if (l4.longValue() != UserConfig.getInstance(i10).getClientUserId() && l4.longValue() != 0) {
                        return true;
                    }
                    return false;
                }
            }).collect(Collectors.toList());
            boolean isEmpty = list.isEmpty();
            org.telegram.ui.Components.y90 a10 = w7.d6.a(context, 14.0f, i12, false, bVar);
            a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
            a10.setGravity(17);
            a10.setMaxWidth(ei.x3.a(a10.getText(), a10.getPaint()));
            e.addView(a10, w7.z5.t(-1, -2, 1, 2, 0, 2, 23));
            if (!isEmpty) {
                View view = new View(context);
                view.setBackgroundColor(-14012362);
                e.addView(view, w7.z5.s(-1, 7, 0, 0, 0, 0.66f, 0));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context, false);
                k9Var.setCentered(true);
                k9Var.setSize(AndroidUtilities.dp(38.0f));
                int min = Math.min(3, list.size());
                k9Var.setCount(min);
                for (int i13 = 0; i13 < min; i13++) {
                    k9Var.b(i13, MessagesController.getInstance(i10).getUser((Long) list.get(i13)), i10);
                }
                k9Var.a(false);
                e.addView(k9Var, w7.z5.k(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
                org.telegram.ui.Components.y90 a11 = w7.d6.a(context, 14.0f, org.telegram.ui.ActionBar.k6.G6, false, bVar);
                a11.setGravity(17);
                if (list.size() == 1) {
                    a11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()))));
                } else if (list.size() == 2) {
                    a11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
                } else {
                    a11.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList.size() - 2, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
                }
                a11.setMaxWidth(ei.x3.a(a11.getText(), a11.getPaint()));
                e.addView(a11, w7.z5.t(-1, -2, 1, 2, 0, 2, 25));
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i14 = org.telegram.ui.ActionBar.k6.f21272i6;
            org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(bVar.g(i14), 20, 20);
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i14);
            linearLayout.setBackground(Z);
            org.telegram.ui.ActionBar.r6.k(linearLayout, Z, null, O2, bVar);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(context, 24, bVar);
            xpVar.b(org.telegram.ui.ActionBar.k6.f21256h7, org.telegram.ui.ActionBar.k6.f21291j7, org.telegram.ui.ActionBar.k6.f21311k7);
            xpVar.setDrawUnchecked(true);
            xpVar.a(MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true), false);
            xpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(xpVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21289j5, bVar);
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.GroupCallLinkMicrophone));
            linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
            e.addView(linearLayout, w7.z5.t(-2, 38, 1, 0, 4, 0, 12));
            w7.b6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new w50(xpVar, 0));
            ei.d dVar = new ei.d(context, bVar, true);
            dVar.setRoundRadius(24);
            dVar.i(LocaleController.getString(R.string.GroupCallLinkJoin), false, true);
            e.addView(dVar, w7.z5.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
            h3Var.customView = e;
            dVar.setOnClickListener(new org.telegram.ui.Components.wo(h3Var, context, xpVar, i10, tL_inputGroupCallSlug, 1));
            h3Var.fixNavigationBar();
            h3Var.show();
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
            if (U2 != null) {
                org.telegram.messenger.v0.p(R.string.LinkIsNoActive, org.telegram.ui.Components.xc.a0(U2), R.raw.error, 36);
            }
        } else if (tL_error != null && (U = LaunchActivity.U()) != null) {
            org.telegram.ui.Components.xc.a0(U).f0(tL_error, false);
        }
    }

    public static void b(Activity activity, int i10, String str, pf.c cVar) {
        org.telegram.ui.ActionBar.c2 c2Var;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.J1) != null) {
                u50.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (cVar == null) {
            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(activity, 3, null);
            c2Var2.r(300L);
            c2Var = c2Var2;
        } else {
            c2Var = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new ai.tb(c2Var, cVar, i10, activity, tL_inputGroupCallSlug, 10));
        if (cVar != null) {
            cVar.f44707b = new org.telegram.messenger.s6(i10, sendRequest, 4);
            cVar.d();
        }
    }
}
