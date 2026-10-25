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
public abstract class y50 {
    public static void a(org.telegram.ui.ActionBar.e2 e2Var, qf.c cVar, TLObject tLObject, final int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.r2 U;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (e2Var != null) {
            e2Var.dismiss();
        }
        if (cVar != null) {
            cVar.b();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i10).putUsers(groupcall.users, false);
            MessagesController.getInstance(i10).putChats(groupcall.chats, false);
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.f22037id == groupCall.f22037id && (launchActivity = LaunchActivity.I1) != null) {
                v50.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
            di.b bVar = new di.b();
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, (org.telegram.ui.ActionBar.u6) bVar, false);
            k3Var.fixNavigationBar();
            LinearLayout d = org.telegram.messenger.vh.d(context, 1);
            d.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            int dp = AndroidUtilities.dp(80.0f);
            int i11 = org.telegram.ui.ActionBar.y6.Oh;
            ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, bVar.g(i11));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
            frameLayout.setBackground(K);
            org.telegram.ui.ActionBar.f7.k(frameLayout, K, N, null, bVar);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.filled_calls_users);
            frameLayout.addView(imageView, org.telegram.ui.Components.gb1.i(56, 56, 17));
            d.addView(frameLayout, org.telegram.ui.Components.gb1.x(80, 80, 1, 2, 21, 2, 13));
            int i12 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.Components.z90 K2 = org.telegram.ui.Components.gb1.K(context, 20.0f, i12, true, bVar);
            K2.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
            K2.setGravity(17);
            d.addView(K2, org.telegram.ui.Components.gb1.x(-1, -2, 1, 2, 0, 2, 4));
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
            org.telegram.ui.Components.z90 K3 = org.telegram.ui.Components.gb1.K(context, 14.0f, i12, false, bVar);
            K3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
            K3.setGravity(17);
            K3.setMaxWidth(fi.v3.a(K3.getText(), K3.getPaint()));
            d.addView(K3, org.telegram.ui.Components.gb1.x(-1, -2, 1, 2, 0, 2, 23));
            if (!isEmpty) {
                View view = new View(context);
                view.setBackgroundColor(-14012362);
                d.addView(view, org.telegram.ui.Components.gb1.w(-1, 7, 0, 0, 0, 0.66f, 0));
                org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
                m9Var.setCentered(true);
                m9Var.setSize(AndroidUtilities.dp(38.0f));
                int min = Math.min(3, list.size());
                m9Var.setCount(min);
                for (int i13 = 0; i13 < min; i13++) {
                    m9Var.b(i13, MessagesController.getInstance(i10).getUser((Long) list.get(i13)), i10);
                }
                m9Var.a(false);
                d.addView(m9Var, org.telegram.ui.Components.gb1.o(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
                org.telegram.ui.Components.z90 K4 = org.telegram.ui.Components.gb1.K(context, 14.0f, org.telegram.ui.ActionBar.y6.G6, false, bVar);
                K4.setGravity(17);
                if (list.size() == 1) {
                    K4.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()))));
                } else if (list.size() == 2) {
                    K4.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
                } else {
                    K4.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList.size() - 2, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
                }
                K4.setMaxWidth(fi.v3.a(K4.getText(), K4.getPaint()));
                d.addView(K4, org.telegram.ui.Components.gb1.x(-1, -2, 1, 2, 0, 2, 25));
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i14 = org.telegram.ui.ActionBar.y6.f23446i6;
            org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(bVar.g(i14), 20, 20);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i14);
            linearLayout.setBackground(Z);
            org.telegram.ui.ActionBar.f7.k(linearLayout, Z, null, N2, bVar);
            org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(context, 24, bVar);
            zpVar.b(org.telegram.ui.ActionBar.y6.f23427h7, org.telegram.ui.ActionBar.y6.f23464j7, org.telegram.ui.ActionBar.y6.f23483k7);
            zpVar.setDrawUnchecked(true);
            zpVar.a(MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true), false);
            zpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(zpVar, org.telegram.ui.Components.gb1.x(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, bVar);
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.GroupCallLinkMicrophone));
            linearLayout.addView(textView, org.telegram.ui.Components.gb1.x(-2, -2, 16, 9, 0, 0, 0));
            d.addView(linearLayout, org.telegram.ui.Components.gb1.x(-2, 38, 1, 0, 4, 0, 12));
            org.telegram.ui.Components.gb1.c(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new x50(zpVar, 0));
            fi.d dVar = new fi.d(context, bVar, true);
            dVar.setRoundRadius(24);
            dVar.i(LocaleController.getString(R.string.GroupCallLinkJoin), false, true);
            d.addView(dVar, org.telegram.ui.Components.gb1.o(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
            k3Var.customView = d;
            dVar.setOnClickListener(new org.telegram.ui.Components.yo(k3Var, context, zpVar, i10, tL_inputGroupCallSlug, 1));
            k3Var.fixNavigationBar();
            k3Var.show();
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
            if (U2 != null) {
                org.telegram.messenger.t.q(R.string.LinkIsNoActive, org.telegram.ui.Components.wc.b0(U2), R.raw.error, 36);
            }
        } else if (tL_error != null && (U = LaunchActivity.U()) != null) {
            org.telegram.ui.Components.wc.b0(U).g0(tL_error, false);
        }
    }

    public static void b(Activity activity, int i10, String str, qf.c cVar) {
        org.telegram.ui.ActionBar.e2 e2Var;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.I1) != null) {
                v50.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (cVar == null) {
            org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(activity, 3, null);
            e2Var2.r(300L);
            e2Var = e2Var2;
        } else {
            e2Var = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new ag.p0(e2Var, cVar, i10, activity, tL_inputGroupCallSlug, 11));
        if (cVar != null) {
            cVar.f47031b = new org.telegram.messenger.u6(i10, sendRequest, 4);
            cVar.d();
        }
    }
}
