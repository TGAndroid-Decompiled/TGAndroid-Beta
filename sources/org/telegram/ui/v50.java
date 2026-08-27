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

public abstract class v50 {
    public static void a(org.telegram.ui.ActionBar.b2 b2Var, we.d dVar, TLObject tLObject, final int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.n2 n2VarU;
        float f10;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (dVar != null) {
            dVar.b();
        }
        int i11 = 0;
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (tL_error == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                if (tL_error == null || (n2VarU = LaunchActivity.U()) == null) {
                    return;
                }
                org.telegram.ui.Components.mc.a0(n2VarU).d0(tL_error, false);
                return;
            }
            org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
            if (n2VarU2 != null) {
                org.telegram.messenger.y1.q(R.string.LinkIsNoActive, org.telegram.ui.Components.mc.a0(n2VarU2), R.raw.error, 36);
                return;
            }
            return;
        }
        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
        MessagesController.getInstance(i10).putUsers(groupcall.users, false);
        MessagesController.getInstance(i10).putChats(groupcall.chats, false);
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.f22390id == groupCall.f22390id && (launchActivity = LaunchActivity.C1) != null) {
            s50.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
            return;
        }
        ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
        jh.b bVar = new jh.b();
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, bVar, false, false);
        e3Var.fixNavigationBar();
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        linearLayoutG.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), bVar.N0(org.telegram.ui.ActionBar.g6.Oh)));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_calls_users);
        frameLayout.addView(imageView, h7.z5.e(56, 56, 17));
        linearLayoutG.addView(frameLayout, h7.z5.t(80, 80, 1, 2, 21, 2, 13));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.Components.p80 p80VarA = h7.d6.a(context, 20.0f, i12, true, bVar);
        p80VarA.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
        p80VarA.setGravity(17);
        linearLayoutG.addView(p80VarA, h7.z5.t(-1, -2, 1, 2, 0, 2, 4));
        List list = (List) Collection.EL.stream(arrayList).map(new l8(5)).filter(new Predicate() {
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
                return (l10.longValue() == UserConfig.getInstance(i10).getClientUserId() || l10.longValue() == 0) ? false : true;
            }
        }).collect(Collectors.toList());
        boolean zIsEmpty = list.isEmpty();
        org.telegram.ui.Components.p80 p80VarA2 = h7.d6.a(context, 14.0f, i12, false, bVar);
        p80VarA2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
        p80VarA2.setGravity(17);
        p80VarA2.setMaxWidth(lh.w3.a(p80VarA2.getText(), p80VarA2.getPaint()));
        linearLayoutG.addView(p80VarA2, h7.z5.t(-1, -2, 1, 2, 0, 2, 23));
        if (zIsEmpty) {
            f10 = 8.0f;
        } else {
            View view = new View(context);
            view.setBackgroundColor(-14012362);
            linearLayoutG.addView(view, h7.z5.s(-1, 7, 0, 0, 0, 0.66f, 0));
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(context, false);
            b9Var.setCentered(true);
            b9Var.setSize(AndroidUtilities.dp(38.0f));
            int iMin = Math.min(3, list.size());
            b9Var.setCount(iMin);
            for (int i13 = 0; i13 < iMin; i13++) {
                b9Var.b(i13, MessagesController.getInstance(i10).getUser((Long) list.get(i13)), i10);
            }
            f10 = 8.0f;
            b9Var.a(false);
            linearLayoutG.addView(b9Var, h7.z5.k(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
            org.telegram.ui.Components.p80 p80VarA3 = h7.d6.a(context, 14.0f, org.telegram.ui.ActionBar.g6.G6, false, bVar);
            p80VarA3.setGravity(17);
            if (list.size() == 1) {
                p80VarA3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()))));
            } else if (list.size() == 2) {
                p80VarA3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
            } else {
                p80VarA3.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList.size() - 2, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
            }
            p80VarA3.setMaxWidth(lh.w3.a(p80VarA3.getText(), p80VarA3.getPaint()));
            linearLayoutG.addView(p80VarA3, h7.z5.t(-1, -2, 1, 2, 0, 2, 25));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f10));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(bVar.N0(org.telegram.ui.ActionBar.g6.f23144i6), 20, 20));
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context, 24, bVar);
        bpVar.b(org.telegram.ui.ActionBar.g6.f23126h7, org.telegram.ui.ActionBar.g6.f23163j7, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(true);
        bpVar.a(MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true), false);
        bpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(bpVar, h7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.f23161j5));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.GroupCallLinkMicrophone));
        linearLayout.addView(textView, h7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayoutG.addView(linearLayout, h7.z5.t(-2, 38, 1, 0, 4, 0, 12));
        h7.b6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new u50(bpVar, i11));
        lh.d dVar2 = new lh.d(context, bVar, true);
        dVar2.setRoundRadius(24);
        dVar2.g(LocaleController.getString(R.string.GroupCallLinkJoin), false, true);
        linearLayoutG.addView(dVar2, h7.z5.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
        e3Var.customView = linearLayoutG;
        dVar2.setOnClickListener(new org.telegram.ui.Components.zn(e3Var, context, bpVar, i10, tL_inputGroupCallSlug, 1));
        e3Var.fixNavigationBar();
        e3Var.show();
    }

    public static void b(Activity activity, int i10, String str, we.d dVar) {
        org.telegram.ui.ActionBar.b2 b2Var;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.C1) != null) {
                s50.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (dVar == null) {
            org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(activity, 3, null);
            b2Var2.q(300L);
            b2Var = b2Var2;
        } else {
            b2Var = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int iSendRequest = ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new gf.j0(b2Var, dVar, i10, activity, tL_inputGroupCallSlug, 10));
        if (dVar != null) {
            dVar.f49293b = new org.telegram.messenger.hh(i10, iSendRequest, 3);
            dVar.d();
        }
    }
}
