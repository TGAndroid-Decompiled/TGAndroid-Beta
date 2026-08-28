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
public abstract class r50 {
    public static void a(org.telegram.ui.ActionBar.c2 c2Var, ve.d dVar, TLObject tLObject, final int i9, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.o2 U;
        float f10;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (dVar != null) {
            dVar.b();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i9).putUsers(groupcall.users, false);
            MessagesController.getInstance(i9).putChats(groupcall.chats, false);
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.f22390id == groupCall.f22390id && (launchActivity = LaunchActivity.C1) != null) {
                o50.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
            ih.b bVar = new ih.b();
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, bVar, false, false);
            f3Var.fixNavigationBar();
            LinearLayout f11 = org.telegram.messenger.ll.f(context, 1);
            f11.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), bVar.N0(org.telegram.ui.ActionBar.f6.Oh)));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.filled_calls_users);
            frameLayout.addView(imageView, g7.e6.e(56, 56, 17));
            f11.addView(frameLayout, g7.e6.t(80, 80, 1, 2, 21, 2, 13));
            int i10 = org.telegram.ui.ActionBar.f6.G6;
            org.telegram.ui.Components.l80 a2 = g7.i6.a(context, 20.0f, i10, true, bVar);
            a2.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
            a2.setGravity(17);
            f11.addView(a2, g7.e6.t(-1, -2, 1, 2, 0, 2, 4));
            List list = (List) Collection.EL.stream(arrayList).map(new k8(5)).filter(new Predicate() {
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
                    if (l10.longValue() != UserConfig.getInstance(i9).getClientUserId() && l10.longValue() != 0) {
                        return true;
                    }
                    return false;
                }
            }).collect(Collectors.toList());
            boolean isEmpty = list.isEmpty();
            org.telegram.ui.Components.l80 a3 = g7.i6.a(context, 14.0f, i10, false, bVar);
            a3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
            a3.setGravity(17);
            a3.setMaxWidth(kh.x3.a(a3.getText(), a3.getPaint()));
            f11.addView(a3, g7.e6.t(-1, -2, 1, 2, 0, 2, 23));
            if (!isEmpty) {
                View view = new View(context);
                view.setBackgroundColor(-14012362);
                f11.addView(view, g7.e6.s(-1, 7, 0, 0, 0, 0.66f, 0));
                org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(context, false);
                c9Var.setCentered(true);
                c9Var.setSize(AndroidUtilities.dp(38.0f));
                int min = Math.min(3, list.size());
                c9Var.setCount(min);
                for (int i11 = 0; i11 < min; i11++) {
                    c9Var.b(i11, MessagesController.getInstance(i9).getUser((Long) list.get(i11)), i9);
                }
                f10 = 8.0f;
                c9Var.a(false);
                f11.addView(c9Var, g7.e6.k(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
                org.telegram.ui.Components.l80 a10 = g7.i6.a(context, 14.0f, org.telegram.ui.ActionBar.f6.G6, false, bVar);
                a10.setGravity(17);
                if (list.size() == 1) {
                    a10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i9, ((Long) list.get(0)).longValue()))));
                } else if (list.size() == 2) {
                    a10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i9, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i9, ((Long) list.get(1)).longValue()))));
                } else {
                    a10.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList.size() - 2, DialogObject.getShortName(i9, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i9, ((Long) list.get(1)).longValue()))));
                }
                a10.setMaxWidth(kh.x3.a(a10.getText(), a10.getPaint()));
                f11.addView(a10, g7.e6.t(-1, -2, 1, 2, 0, 2, 25));
            } else {
                f10 = 8.0f;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f10));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(bVar.N0(org.telegram.ui.ActionBar.f6.f23092i6), 20, 20));
            org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(context, 24, bVar);
            dpVar.b(org.telegram.ui.ActionBar.f6.f23074h7, org.telegram.ui.ActionBar.f6.f23110j7, org.telegram.ui.ActionBar.f6.f23128k7);
            dpVar.setDrawUnchecked(true);
            dpVar.a(MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true), false);
            dpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(dpVar, g7.e6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(bVar.N0(org.telegram.ui.ActionBar.f6.f23108j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.GroupCallLinkMicrophone));
            linearLayout.addView(textView, g7.e6.t(-2, -2, 16, 9, 0, 0, 0));
            f11.addView(linearLayout, g7.e6.t(-2, 38, 1, 0, 4, 0, 12));
            g7.g6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new q50(dpVar, 0));
            kh.d dVar2 = new kh.d(context, bVar, true);
            dVar2.setRoundRadius(24);
            dVar2.g(LocaleController.getString(R.string.GroupCallLinkJoin), false, true);
            f11.addView(dVar2, g7.e6.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
            f3Var.customView = f11;
            dVar2.setOnClickListener(new org.telegram.ui.Components.bo(f3Var, context, dpVar, i9, tL_inputGroupCallSlug, 1));
            f3Var.fixNavigationBar();
            f3Var.show();
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
            if (U2 != null) {
                org.telegram.messenger.l0.p(R.string.LinkIsNoActive, org.telegram.ui.Components.oc.a0(U2), R.raw.error, 36);
            }
        } else if (tL_error != null && (U = LaunchActivity.U()) != null) {
            org.telegram.ui.Components.oc.a0(U).d0(tL_error, false);
        }
    }

    public static void b(Activity activity, int i9, String str, ve.d dVar) {
        org.telegram.ui.ActionBar.c2 c2Var;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.C1) != null) {
                o50.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (dVar == null) {
            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(activity, 3, null);
            c2Var2.q(300L);
            c2Var = c2Var2;
        } else {
            c2Var = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int sendRequest = ConnectionsManager.getInstance(i9).sendRequest(getgroupcall, new ff.j0(c2Var, dVar, i9, activity, tL_inputGroupCallSlug, 11));
        if (dVar != null) {
            dVar.f48382b = new org.telegram.messenger.dh(i9, sendRequest, 3);
            dVar.d();
        }
    }
}
