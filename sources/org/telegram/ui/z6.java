package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class z6 implements org.telegram.ui.Components.tj0, org.telegram.ui.Components.ei0, org.telegram.ui.Components.a5, org.telegram.messenger.oc, u4, org.telegram.ui.ActionBar.q1, org.telegram.messenger.pr, org.telegram.ui.Components.rj0, ww, oa1, org.telegram.ui.Components.voip.c3, OnSuccessListener {
    public final int f54411a;
    public final Object f54412b;
    public final Object f54413c;
    public final Object d;

    public z6(Object obj, Object obj2, Object obj3, int i7) {
        this.f54411a = i7;
        this.f54412b = obj;
        this.f54413c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean G() {
        switch (this.f54411a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f54411a) {
            case 2:
                bn bnVar = (bn) this.f54412b;
                bnVar.getClass();
                bnVar.Hb((TLRPC.BotInlineResult) this.f54413c, z10, i7, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                bn bnVar2 = (bn) this.f54412b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f54413c;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.d;
                bnVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    cg.a m10 = cg.a.m(starsAmount);
                    long j3 = i7;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (m10 != null && !m10.l()) {
                        suggestedPost2.price = m10.q();
                    }
                    if (j3 > 0) {
                        suggestedPost2.schedule_date = (int) j3;
                        suggestedPost2.flags |= 1;
                    }
                    if (gjVar != null && gjVar.f24177k != null) {
                        bnVar2.getMessagesController().h(gjVar, suggestedPost2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                bn.C0((bn) this.f54412b, (org.telegram.messenger.bj) this.f54413c, (org.telegram.messenger.gj) this.d, i7, i10);
                return;
        }
    }

    @Override
    public boolean P(cx cxVar) {
        switch (this.f54411a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(String str) {
        bn bnVar = (bn) this.f54412b;
        org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) this.f54413c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = org.telegram.messenger.hd.E0().f24436y.getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !sy0.d0().contains(str))) {
            g0Var.setOnClickListener(new fi.d0(bnVar, str, language, charSequence, g0Var, 7));
        } else {
            g0Var.setClickable(false);
        }
    }

    @Override
    public void b(org.telegram.ui.Components.gi0 gi0Var, int i7) {
        int i10;
        View view = (View) this.f54412b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f54413c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(gi0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = view.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i10 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.f3.C(52.0f, i10, i7), true);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void c(c5 c5Var) {
        switch (this.f54411a) {
            case 6:
                mm mmVar = (mm) this.f54412b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f54413c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = c5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                mmVar.f49910a.Pa(user);
                                return;
                            }
                            return;
                        }
                        mmVar.d(user);
                        return;
                    }
                    mmVar.k(r1Var, user);
                    return;
                }
                mmVar.o(user, false);
                return;
            default:
                mm mmVar2 = (mm) this.f54412b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f54413c;
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) this.d;
                int ordinal2 = c5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                mmVar2.f49910a.Na(chat);
                                return;
                            }
                            return;
                        }
                        mmVar2.a(chat);
                        return;
                    }
                    mmVar2.j(r1Var2, chat, 0, false);
                    return;
                }
                mmVar2.n(chat);
                return;
        }
    }

    public boolean d(TLRPC.Message message) {
        ml0 ml0Var = (ml0) this.f54412b;
        org.telegram.ui.ActionBar.r4 r4Var = (org.telegram.ui.ActionBar.r4) this.f54413c;
        Activity activity = (Activity) this.d;
        if (org.telegram.messenger.gj.B1(message.peer_id) == ml0Var.m0.f28547id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            org.telegram.messenger.g0.g3(new kg0(ml0Var, r4Var, activity, message, 2));
            return true;
        }
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        f40.J0((f40) this.f54412b, (Activity) this.f54413c, (org.telegram.messenger.t3) this.d, view, i7);
    }

    @Override
    public void g(org.telegram.ui.Components.voip.d3 d3Var) {
        String N0;
        hc1 hc1Var = (hc1) this.f54412b;
        VoIPService voIPService = (VoIPService) this.f54413c;
        org.telegram.ui.Components.voip.e3 e3Var = (org.telegram.ui.Components.voip.e3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            org.telegram.messenger.g0.r(hc1Var.S0);
            hc1Var.R0 = false;
            if (hc1Var.f48336w0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    N0 = org.telegram.messenger.hd.N0(2131754730, null);
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131754729, null);
                }
                d3Var.announceForAccessibility(N0);
            }
            e3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String str;
        int i10;
        switch (this.f54411a) {
            case 8:
                fo foVar = (fo) this.f54412b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f54413c;
                View view = (View) this.d;
                io ioVar = foVar.f47773a.f48471i3;
                if (tL_username.editable) {
                    if (ioVar.f48802s0 == null) {
                        ioVar.f48802s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = ioVar.Y;
                    tL_inputChannel.channel_id = chat.f28398id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    ioVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new di.j3(foVar, tL_channels_toggleUsername, tL_username, z10, 5));
                    ioVar.Q.add(tL_username.username);
                    ((ia) view).setLoading(true);
                }
                ioVar.b0();
                return;
            case 9:
                uo uoVar = (uo) this.f54412b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                uoVar.getClass();
                if (((TLRPC.ChatFull) this.f54413c).hidden_prehistory) {
                    uoVar.getMessagesController().n5(chat2.f28398id, false);
                }
                uoVar.d0(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                g61 g61Var = (g61) this.f54412b;
                boolean z11 = true;
                if (org.telegram.ui.ActionBar.m6.l0(((i61) this.f54413c).d, (org.telegram.ui.ActionBar.j6) this.d, true)) {
                    org.telegram.ui.ActionBar.m6.t1(false, false);
                    org.telegram.ui.ActionBar.l6 l6Var = org.telegram.ui.ActionBar.m6.I;
                    if (g61Var.f47933e.f43849f != 1) {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.m6.K1(l6Var, z11, -1, null);
                    return;
                }
                return;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) this.f54412b;
                TLRPC.User user = (TLRPC.User) this.f54413c;
                EditText editText = (EditText) this.d;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.l0(user, false, str);
                return;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f54412b;
                org.telegram.messenger.cz.f23374h0 = (String) this.f54413c;
                org.telegram.messenger.cz.y();
                org.telegram.messenger.cz.f23357b = false;
                dataSettingsActivity.s0(dataSettingsActivity.f43027n);
                org.telegram.messenger.fc.D().i(new bt(dataSettingsActivity, 2));
                ((AlertDialog$Builder) this.d).f28743a.M0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f54413c;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                ((AlertDialog$Builder) this.d).f28743a.M0.run();
                ky kyVar = ((iy) this.f54412b).F.f49099c;
                kyVar.d.title = editTextBoldCursor.getText().toString();
                kyVar.i0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = kyVar.d;
                if (kyVar.F != 0) {
                    kyVar.getConnectionsManager().cancelRequest(kyVar.F, true);
                    kyVar.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = kyVar.f49388c.f26850a;
                tL_chatlists_editExportedInvite.slug = kyVar.g0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                kyVar.F = kyVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new xx(kyVar, 1));
                org.telegram.messenger.y10 y10Var = kyVar.f49396y;
                if (y10Var != null) {
                    y10Var.a(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f54413c;
                org.telegram.messenger.g0.v1(editTextBoldCursor2);
                org.telegram.messenger.t3 t3Var = ((k30) this.f54412b).f49147b.V2;
                String obj = editTextBoldCursor2.getText().toString();
                t3Var.getClass();
                TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
                editgroupcalltitle.call = t3Var.g(t3Var.f26913a);
                editgroupcalltitle.title = obj;
                ConnectionsManager.getInstance(t3Var.C.f23166a).sendRequest(editgroupcalltitle, new org.telegram.messenger.m3(t3Var, 1));
                ((AlertDialog$Builder) this.d).f28743a.M0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f54412b;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) this.f54413c, (ArrayList) this.d, false));
                return;
            case 21:
                w21 w21Var = (w21) this.f54413c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i10 = ((org.telegram.ui.ActionBar.g2) w21Var.f52915a).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new e00(28, w21Var, tL_authorization));
                ((l21) this.f54412b).d.dismiss();
                return;
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((b21) this.f54412b).f1((TLRPC.User) this.f54413c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.h6 h6Var;
        float f10;
        a8.r7 r7Var = (a8.r7) this.f54412b;
        Integer num = (Integer) obj;
        org.telegram.messenger.a8.b("wear-auth: /answer delivered to " + ((String) r7Var.d));
        ((hi.d) this.f54413c).setLoading(false);
        int i7 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) r7Var.f619f;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f26895b;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    h6Var = T.getResourceProvider();
                } else {
                    h6Var = null;
                }
                org.telegram.ui.ActionBar.w2 w2Var = yc1.f54142c;
                if (w2Var != null) {
                    w2Var.dismiss();
                    yc1.f54142c = null;
                }
                org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                j3.O = frameLayout;
                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                frameLayout.addView(g10, c8.na.e(-1, -1, 119));
                TextView b10 = c8.wa.b(context, 20.0f, org.telegram.ui.ActionBar.m6.f29455j5, true, h6Var);
                org.telegram.messenger.f3.k(b10, 17, null, 2131742683);
                g10.addView(b10, c8.na.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.f6 f11 = org.telegram.messenger.j6.f((String) arrayList.get(i10));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(f11);
                    org.telegram.messenger.ls.i(imageView);
                    int L = org.telegram.messenger.g0.L(80.0f);
                    int i11 = org.telegram.ui.ActionBar.m6.Fi;
                    ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.r1(0.15f, org.telegram.ui.ActionBar.m6.w0(i11, h6Var)));
                    org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.15f, i11);
                    imageView.setBackground(L2);
                    org.telegram.ui.ActionBar.t6.j(imageView, L2, K, null, h6Var);
                    if (i10 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 5.0f;
                    }
                    linearLayout.addView(imageView, c8.na.k(f10, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                g10.addView(linearLayout, c8.na.t(-2, -2, 49, 32, 12, 32, 12));
                hi.d g11 = org.telegram.messenger.o10.g(24, context, h6Var, true);
                g11.setText(org.telegram.messenger.hd.N0(2131742682, null));
                g10.addView(g11, c8.na.t(-1, 48, 7, 12, 12, 12, 8));
                int i12 = org.telegram.ui.ActionBar.m6.f29290a7;
                j3.w0(i12);
                j3.Q(i12);
                yc1.f54142c = j3;
                j3.show();
                g11.setOnClickListener(new bi.k5(g11, i7, j3, 23));
            }
        }
    }

    @Override
    public void run(long j3) {
        np.f0((np) this.f54412b, (TLRPC.InputCheckPasswordSRP) this.f54413c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        long j3;
        int i11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i12 = this.f54411a;
        Object obj = this.d;
        Object obj2 = this.f54413c;
        Object obj3 = this.f54412b;
        switch (i12) {
            case 18:
                ArrayList arrayList2 = (ArrayList) obj2;
                bn bnVar = (bn) obj;
                PhotoViewer photoViewer = ((so0) obj3).f52063b;
                if (arrayList.size() <= 1 && ((org.telegram.messenger.tr) arrayList.get(0)).f27037a != org.telegram.messenger.k10.i(photoViewer.U).e() && charSequence == null) {
                    org.telegram.messenger.tr trVar = (org.telegram.messenger.tr) arrayList.get(0);
                    long j10 = trVar.f27037a;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    if (org.telegram.messenger.n5.C(j10)) {
                        k10.putInt("enc_id", (int) (j10 & 4294967295L));
                    } else if (org.telegram.messenger.n5.E(j10)) {
                        k10.putLong("user_id", j10);
                    } else {
                        k10.putLong("chat_id", -j10);
                    }
                    bn bnVar2 = new bn(k10);
                    if (trVar.f27038b != 0) {
                        qg.c.a(bnVar2, trVar);
                    }
                    if (((LaunchActivity) photoViewer.E).u0(bnVar2, true, false)) {
                        bnVar2.hc(arrayList2);
                    } else {
                        cxVar.finishFragment();
                    }
                } else {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long j11 = ((org.telegram.messenger.tr) arrayList.get(i13)).f27037a;
                        if (charSequence != null) {
                            j3 = j11;
                            org.telegram.messenger.az.C(photoViewer.U).r0(org.telegram.messenger.yy.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j11;
                        }
                        org.telegram.messenger.az.C(photoViewer.U).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    cxVar.finishFragment();
                    if (bnVar != null) {
                        bnVar.h8();
                        UndoView undoView = bnVar.N3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((org.telegram.messenger.tr) arrayList.get(0)).f27037a, Integer.valueOf(arrayList2.size()), 53);
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                            }
                        }
                    }
                }
                return true;
            default:
                sv0 sv0Var = (sv0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                cx cxVar2 = (cx) obj;
                long j12 = ((org.telegram.messenger.tr) arrayList.get(0)).f27037a;
                ProfileActivity profileActivity = sv0Var.f52091b;
                i11 = ((org.telegram.ui.ActionBar.g2) profileActivity).currentAccount;
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i11).O0(Long.valueOf(-j12));
                if (O0 != null && (O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().K(O0, user, new di.h(sv0Var, j12, cxVar2, 9));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                    String N0 = org.telegram.messenger.hd.N0(2131754460, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                    t1Var.S = N0;
                    if (O0 == null) {
                        str = "";
                    } else {
                        str = O0.title;
                    }
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("AddMembersAlertNamesText", null, 2131754396, org.telegram.messenger.p10.q(user), str));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754460, null), new bg.f0(sv0Var, j12, cxVar, user, 6));
                    profileActivity.showDialog(t1Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, final View view) {
        String str;
        final c7 c7Var = (c7) this.f54412b;
        org.telegram.ui.Components.ek0 ek0Var = (org.telegram.ui.Components.ek0) this.f54413c;
        x6 x6Var = (x6) this.d;
        s7 s7Var = c7Var.f46460f;
        e7 e7Var = (e7) ek0Var.getAdapter();
        final l7 l7Var = (l7) e7Var.f47119e.get(i7);
        if (!(view instanceof j7) && !(view instanceof org.telegram.ui.Cells.p7)) {
            h7 h7Var = s7Var.G;
            if (h7Var != null) {
                h7Var.m(l7Var.f49488c, l7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(s7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232422, org.telegram.messenger.hd.N0(2131752636, null), false, null).setOnClickListener(new fi.d0(c7Var, l7Var, e7Var, ek0Var, view, 5));
            str = null;
        } else if (((j7) view).f48919b.getChildAt(0) instanceof org.telegram.ui.Cells.h7) {
            str = null;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232300, org.telegram.messenger.hd.N0(2131747026, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            c7 c7Var2 = c7Var;
                            s7.b(c7Var2.f46460f, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.g1 g1Var = c7Var2.f46456a;
                            if (g1Var != null) {
                                g1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            c7 c7Var3 = c7Var;
                            s7.b(c7Var3.f46460f, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.g1 g1Var2 = c7Var3.f46456a;
                            if (g1Var2 != null) {
                                g1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            str = null;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232422, org.telegram.messenger.hd.N0(2131752636, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            c7 c7Var2 = c7Var;
                            s7.b(c7Var2.f46460f, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.g1 g1Var = c7Var2.f46456a;
                            if (g1Var != null) {
                                g1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            c7 c7Var3 = c7Var;
                            s7.b(c7Var3.f46460f, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.g1 g1Var2 = c7Var3.f46456a;
                            if (g1Var2 != null) {
                                g1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        ei.b bVar = l7Var.d;
        if (bVar.f10959b != 0 && bVar.f10963g != 0) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232424, org.telegram.messenger.hd.N0(2131743309, str), false, null).setOnClickListener(new y(c7Var, l7Var, x6Var, 1));
        }
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232359, org.telegram.messenger.hd.N0(!s7Var.h.f10971j.contains(l7Var.d) ? 2131745476 : 2131751446, str), false, null).setOnClickListener(new oi.h1(7, c7Var, l7Var));
        c7Var.f46456a = org.telegram.ui.Components.c5.N(x6Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        s7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void r(float f10) {
    }

    @Override
    public void j() {
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
