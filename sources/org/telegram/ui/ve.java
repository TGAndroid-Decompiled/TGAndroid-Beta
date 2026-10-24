package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class ve implements View.OnClickListener {
    public final int f42708a;
    public final sn f42709b;

    public ve(sn snVar, int i10) {
        this.f42708a = i10;
        this.f42709b = snVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f42708a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        sn snVar = this.f42709b;
        switch (i11) {
            case 0:
                sn snVar2 = this.f42709b;
                sg.j0.G1(snVar2, snVar2.P1, snVar2.Q1, snVar2.f41516f6, false);
                return;
            case 1:
                snVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", snVar.f41654r);
                snVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (snVar.W3 != null) {
                    snVar.Rb(!snVar.Mc.f17447f);
                    return;
                }
                return;
            case 3:
                snVar.qb(!snVar.A0.N);
                return;
            case 4:
                yj yjVar = snVar.U1;
                if (yjVar != null) {
                    yjVar.setReversed(true);
                    snVar.U1.getAdapter().f11959k0 = true;
                    snVar.p7();
                }
                snVar.f41500e3.setVisibility(8);
                snVar.f41513f3.setVisibility(8);
                snVar.f41762z3 = true;
                snVar.A3 = null;
                snVar.B3 = null;
                snVar.f41557j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                snVar.f41557j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(snVar.f41557j0.getSearchField());
                org.telegram.ui.ActionBar.u0 u0Var = snVar.f41557j0;
                u0Var.f21894r = null;
                ei.e2 e2Var = u0Var.e;
                if (e2Var != null) {
                    e2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (snVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = snVar.f41557j0;
                    if (u0Var2 != null) {
                        AndroidUtilities.hideKeyboard(u0Var2.getSearchField());
                    }
                    snVar.showDialog(org.telegram.ui.Components.d5.o(snVar.getParentActivity(), new zk(snVar), snVar.f41651qa).f20729a);
                    return;
                }
                return;
            case 6:
                snVar.D7(true);
                return;
            case 7:
                MessageObject messageObject2 = snVar.p5;
                if (messageObject2 != null) {
                    snVar.O9(messageObject2, false, false);
                    pf.d.q(snVar.getParentActivity(), Uri.parse(snVar.p5.sponsoredUrl), true, false, false, null, null, false, snVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(snVar.p5.sponsoredInfo)) {
                    org.telegram.messenger.tl.p(R.string.TextCopied, new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(snVar.getParentActivity()), snVar.f41651qa));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(snVar.p5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.tl.p(R.string.TextCopied, new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(snVar.getParentActivity()), snVar.f41651qa));
                    return;
                }
                return;
            case 10:
                if (snVar.f41558j1 != null && snVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.h3 j10 = org.telegram.messenger.tl.j(1, snVar.f41558j1.getContext(), null, false);
                    Activity parentActivity = snVar.getParentActivity();
                    qn qnVar = snVar.f41651qa;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.v0.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i13 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.W(textView, i13, qnVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(parentActivity, qnVar);
                    w90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), qnVar));
                    org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21243gc, qnVar);
                    org.telegram.ui.ActionBar.r6.W(w90Var, i13, qnVar);
                    w90Var.setTextSize(1, 14.0f);
                    w90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    w90Var.setOnLinkPressListener(new org.telegram.ui.Components.v90() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                case 1:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                default:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.w90 w90Var2 = new org.telegram.ui.Components.w90(parentActivity, null);
                    w90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), qnVar));
                    org.telegram.ui.ActionBar.r6.W(w90Var2, i13, qnVar);
                    w90Var2.setTextSize(1, 14.0f);
                    w90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    w90Var2.setOnLinkPressListener(new org.telegram.ui.Components.v90() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                case 1:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                default:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.w90 w90Var3 = new org.telegram.ui.Components.w90(parentActivity, null);
                    w90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), qnVar));
                    org.telegram.ui.ActionBar.r6.W(w90Var3, i13, qnVar);
                    w90Var3.setTextSize(1, 14.0f);
                    w90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    w90Var3.setOnLinkPressListener(new org.telegram.ui.Components.v90() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                case 1:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                default:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i14 = org.telegram.ui.ActionBar.k6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(i14, qnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    lk lkVar = new lk(parentActivity, paint);
                    lkVar.setOnClickListener(new f81(parentActivity));
                    lkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    lkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    org.telegram.ui.ActionBar.r6.W(lkVar, i14, qnVar);
                    int i15 = org.telegram.ui.ActionBar.k6.f21255h5;
                    org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.w0(i15, qnVar));
                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
                    org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i15);
                    lkVar.setBackground(e);
                    org.telegram.ui.ActionBar.r6.k(lkVar, e, O, f10, qnVar);
                    lkVar.setTextSize(1, 14.0f);
                    lkVar.setGravity(16);
                    org.telegram.ui.Components.w90 w90Var4 = new org.telegram.ui.Components.w90(parentActivity, null);
                    w90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), qnVar));
                    w90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.r6.W(w90Var4, i13, qnVar);
                    w90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    w90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(w90Var, w7.z5.t(-1, -2, 0, 0, 18, 0, 0));
                    w90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(w90Var2, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    w90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(w90Var3, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(lkVar, w7.z5.t(-2, 34, 1, 22, 14, 22, 0));
                    w90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(w90Var4, w7.z5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(f7);
                    frameLayout.addView(scrollView, w7.z5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j10.customView = frameLayout;
                    j10.show();
                    return;
                }
                return;
            case 11:
                snVar.finishPreviewFragment();
                return;
            case 12:
                snVar.getClass();
                snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 28, true));
                return;
            case 13:
                sn snVar3 = this.f42709b;
                long j11 = snVar3.f41516f6;
                TLRPC.User user = snVar3.f41509f;
                TLRPC.Chat chat = snVar3.e;
                TLRPC.EncryptedChat encryptedChat = snVar3.h;
                if (snVar3.Z1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.d5.i0(snVar3, j11, user, chat, encryptedChat, z10, snVar3.f41589l8, new rg(snVar3, 2), snVar3.f41651qa);
                return;
            case 14:
                sn.j0(snVar);
                return;
            case 15:
                if (snVar.f41624o4 != null) {
                    TopicsController topicsController = snVar.getMessagesController().getTopicsController();
                    long j12 = snVar.e.f20344id;
                    TLRPC.TL_forumTopic tL_forumTopic = snVar.f41624o4;
                    int i16 = tL_forumTopic.f20396id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j12, i16, false);
                }
                snVar.Yc();
                snVar.oc(false);
                snVar.Xc(true);
                return;
            case 16:
                long j13 = snVar.f41516f6;
                if (snVar.h != null) {
                    j13 = snVar.f41509f.f20491id;
                }
                snVar.f41593lc = false;
                snVar.getMessagesController().hidePeerSettingsBar(j13, snVar.f41509f, snVar.e);
                snVar.Xc(true);
                snVar.vc(true);
                return;
            case 17:
                sn snVar4 = this.f42709b;
                snVar4.P4 = true;
                if (snVar4.K9() && !snVar4.f41686t4) {
                    snVar4.j((int) snVar4.f41635p4, 0, true, 0, true, 0);
                    return;
                }
                int i17 = snVar4.X4;
                if (i17 != 0) {
                    if (!snVar4.T4.isEmpty()) {
                        if (i17 == ((Integer) i2.o1.i(1, snVar4.T4)).intValue()) {
                            i12 = ((Integer) snVar4.T4.get(0)).intValue() + 1;
                            snVar4.f41449a5 = true;
                        } else {
                            snVar4.f41449a5 = false;
                            i12 = i17 - 1;
                        }
                    }
                    snVar4.Z4 = i12;
                    if (!snVar4.f41449a5) {
                        i12 = -i12;
                    }
                    snVar4.j(i17, 0, true, 0, true, i12);
                    snVar4.Bc();
                    return;
                }
                return;
            case 18:
                snVar.na(false);
                return;
            case 19:
                sn.f1(snVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", snVar.a());
                snVar.presentFragment(new ko(bundle2));
                return;
            case 21:
                sn.l0(snVar);
                return;
            case 22:
                sn.d1(snVar);
                return;
            case 23:
                sn.h0(snVar);
                return;
            case 24:
                snVar.ga(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = snVar.f41551i6;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) snVar.A6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    snVar.f41563j6[i18].clear();
                    snVar.f41576k6[i18].clear();
                }
                snVar.h9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f20365id) > 0 || (i10 < 0 && snVar.h != null))) {
                    snVar.Hb(messageObject);
                }
                snVar.Fc(0, true);
                snVar.dd(false);
                snVar.Sc();
                return;
            case 26:
                sn.g1(snVar);
                return;
            case 27:
                sn snVar5 = this.f42709b;
                MessageObject messageObject3 = snVar5.B5;
                if (messageObject3 != null) {
                    snVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (!snVar.J9()) {
                    str = null;
                }
                snVar.qa(str);
                return;
            default:
                snVar.T7();
                snVar.K3.m(snVar.f41516f6, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
