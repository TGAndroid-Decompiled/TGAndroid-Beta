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
public final class xe implements View.OnClickListener {
    public final int f43084a;
    public final sn f43085b;

    public xe(sn snVar, int i10) {
        this.f43084a = i10;
        this.f43085b = snVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f43084a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        sn snVar = this.f43085b;
        switch (i11) {
            case 0:
                sn snVar2 = this.f43085b;
                sg.k0.D1(snVar2, snVar2.D1, snVar2.E1, snVar2.T5, false);
                return;
            case 1:
                snVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", snVar.f41339r);
                snVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (snVar.K3 != null) {
                    snVar.Pb(!snVar.zc.f17383f);
                    return;
                }
                return;
            case 3:
                snVar.ob(!snVar.A0.N);
                return;
            case 4:
                zj zjVar = snVar.I1;
                if (zjVar != null) {
                    zjVar.setReversed(true);
                    snVar.I1.getAdapter().f11932k0 = true;
                    snVar.p7();
                }
                snVar.S2.setVisibility(8);
                snVar.T2.setVisibility(8);
                snVar.f41295n3 = true;
                snVar.f41308o3 = null;
                snVar.f41319p3 = null;
                snVar.f41242j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                snVar.f41242j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(snVar.f41242j0.getSearchField());
                org.telegram.ui.ActionBar.u0 u0Var = snVar.f41242j0;
                u0Var.f21747r = null;
                ei.e2 e2Var = u0Var.e;
                if (e2Var != null) {
                    e2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (snVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = snVar.f41242j0;
                    if (u0Var2 != null) {
                        AndroidUtilities.hideKeyboard(u0Var2.getSearchField());
                    }
                    snVar.showDialog(org.telegram.ui.Components.f5.o(snVar.getParentActivity(), new al(snVar), snVar.f41191ea).f20609a);
                    return;
                }
                return;
            case 6:
                snVar.D7(true);
                return;
            case 7:
                MessageObject messageObject2 = snVar.f41175d5;
                if (messageObject2 != null) {
                    snVar.O9(messageObject2, false, false);
                    pf.d.q(snVar.getParentActivity(), Uri.parse(snVar.f41175d5.sponsoredUrl), true, false, false, null, null, false, snVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(snVar.f41175d5.sponsoredInfo)) {
                    org.telegram.messenger.lk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.f41191ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(snVar.f41175d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.lk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.f41191ea));
                    return;
                }
                return;
            case 10:
                if (snVar.X0 != null && snVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 i13 = org.telegram.messenger.lk.i(1, snVar.X0.getContext(), null, false);
                    Activity parentActivity = snVar.getParentActivity();
                    qn qnVar = snVar.f41191ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout e = org.telegram.messenger.g0.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, qnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(parentActivity, qnVar);
                    x90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), qnVar));
                    x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, qnVar));
                    x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, qnVar));
                    x90Var.setTextSize(1, 14.0f);
                    x90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var.setOnLinkPressListener(new org.telegram.ui.Components.w90() {
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
                    org.telegram.ui.Components.x90 x90Var2 = new org.telegram.ui.Components.x90(parentActivity, null);
                    x90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), qnVar));
                    x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, qnVar));
                    x90Var2.setTextSize(1, 14.0f);
                    x90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var2.setOnLinkPressListener(new org.telegram.ui.Components.w90() {
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
                    org.telegram.ui.Components.x90 x90Var3 = new org.telegram.ui.Components.x90(parentActivity, null);
                    x90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), qnVar));
                    x90Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, qnVar));
                    x90Var3.setTextSize(1, 14.0f);
                    x90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var3.setOnLinkPressListener(new org.telegram.ui.Components.w90() {
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
                    int i15 = org.telegram.ui.ActionBar.h6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(i15, qnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    mk mkVar = new mk(parentActivity, paint);
                    mkVar.setOnClickListener(new d81(parentActivity));
                    mkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    mkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    mkVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, qnVar));
                    mkVar.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, qnVar)));
                    mkVar.setTextSize(1, 14.0f);
                    mkVar.setGravity(16);
                    org.telegram.ui.Components.x90 x90Var4 = new org.telegram.ui.Components.x90(parentActivity, null);
                    x90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), qnVar));
                    x90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, qnVar));
                    x90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(textView);
                    x90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var, w7.z5.t(-1, -2, 0, 0, 18, 0, 0));
                    x90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var2, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    x90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var3, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    e.addView(mkVar, w7.z5.t(-2, 34, 1, 22, 14, 22, 0));
                    x90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var4, w7.z5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(e);
                    frameLayout.addView(scrollView, w7.z5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i13.customView = frameLayout;
                    i13.show();
                    return;
                }
                return;
            case 11:
                snVar.finishPreviewFragment();
                return;
            case 12:
                snVar.getClass();
                snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) snVar, 28, true));
                return;
            case 13:
                sn snVar3 = this.f43085b;
                long j10 = snVar3.T5;
                TLRPC.User user = snVar3.f41194f;
                TLRPC.Chat chat = snVar3.e;
                TLRPC.EncryptedChat encryptedChat = snVar3.h;
                if (snVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.f5.i0(snVar3, j10, user, chat, encryptedChat, z10, snVar3.Z7, new ug(snVar3, 2), snVar3.f41191ea);
                return;
            case 14:
                sn.k0(snVar);
                return;
            case 15:
                if (snVar.f41161c4 != null) {
                    TopicsController topicsController = snVar.getMessagesController().getTopicsController();
                    long j11 = snVar.e.f20272id;
                    TLRPC.TL_forumTopic tL_forumTopic = snVar.f41161c4;
                    int i16 = tL_forumTopic.f20324id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i16, false);
                }
                snVar.Vc();
                snVar.lc(false);
                snVar.Uc(true);
                return;
            case 16:
                long j12 = snVar.T5;
                if (snVar.h != null) {
                    j12 = snVar.f41194f.f20419id;
                }
                snVar.Yb = false;
                snVar.getMessagesController().hidePeerSettingsBar(j12, snVar.f41194f, snVar.e);
                snVar.Uc(true);
                snVar.sc(true);
                return;
            case 17:
                sn snVar4 = this.f43085b;
                snVar4.D4 = true;
                if (snVar4.K9() && !snVar4.f41223h4) {
                    snVar4.j((int) snVar4.f41174d4, 0, true, 0, true, 0);
                    return;
                }
                int i17 = snVar4.L4;
                if (i17 != 0) {
                    if (!snVar4.H4.isEmpty()) {
                        if (i17 == ((Integer) i2.d.h(1, snVar4.H4)).intValue()) {
                            i12 = ((Integer) snVar4.H4.get(0)).intValue() + 1;
                            snVar4.O4 = true;
                        } else {
                            snVar4.O4 = false;
                            i12 = i17 - 1;
                        }
                    }
                    snVar4.N4 = i12;
                    if (!snVar4.O4) {
                        i12 = -i12;
                    }
                    snVar4.j(i17, 0, true, 0, true, i12);
                    snVar4.yc();
                    return;
                }
                return;
            case 18:
                snVar.na(false);
                return;
            case 19:
                sn.b1(snVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", snVar.a());
                snVar.presentFragment(new ko(bundle2));
                return;
            case 21:
                sn.m0(snVar);
                return;
            case 22:
                sn.Y0(snVar);
                return;
            case 23:
                sn.i0(snVar);
                return;
            case 24:
                snVar.ga(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = snVar.W5;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) snVar.f41311o6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    snVar.X5[i18].clear();
                    snVar.Y5[i18].clear();
                }
                snVar.h9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f20293id) > 0 || (i10 < 0 && snVar.h != null))) {
                    snVar.Fb(messageObject);
                }
                snVar.Cc(0, true);
                snVar.ad(false);
                snVar.Pc();
                return;
            case 26:
                sn.c1(snVar);
                return;
            case 27:
                sn snVar5 = this.f43085b;
                MessageObject messageObject3 = snVar5.p5;
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
                snVar.y3.m(snVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
