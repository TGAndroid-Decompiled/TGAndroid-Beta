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
    public final int f42222a;
    public final qn f42223b;

    public ve(qn qnVar, int i10) {
        this.f42222a = i10;
        this.f42223b = qnVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f42222a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        qn qnVar = this.f42223b;
        switch (i11) {
            case 0:
                qn qnVar2 = this.f42223b;
                sg.k0.D1(qnVar2, qnVar2.D1, qnVar2.E1, qnVar2.T5, false);
                return;
            case 1:
                qnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", qnVar.f40825r);
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (qnVar.K3 != null) {
                    qnVar.Qb(!qnVar.zc.f17384f);
                    return;
                }
                return;
            case 3:
                qnVar.pb(!qnVar.A0.N);
                return;
            case 4:
                xj xjVar = qnVar.I1;
                if (xjVar != null) {
                    xjVar.setReversed(true);
                    qnVar.I1.getAdapter().f11931k0 = true;
                    qnVar.p7();
                }
                qnVar.S2.setVisibility(8);
                qnVar.T2.setVisibility(8);
                qnVar.f40781n3 = true;
                qnVar.f40794o3 = null;
                qnVar.f40805p3 = null;
                qnVar.f40728j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                qnVar.f40728j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(qnVar.f40728j0.getSearchField());
                org.telegram.ui.ActionBar.u0 u0Var = qnVar.f40728j0;
                u0Var.f21755r = null;
                ei.e2 e2Var = u0Var.e;
                if (e2Var != null) {
                    e2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (qnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = qnVar.f40728j0;
                    if (u0Var2 != null) {
                        AndroidUtilities.hideKeyboard(u0Var2.getSearchField());
                    }
                    qnVar.showDialog(org.telegram.ui.Components.f5.o(qnVar.getParentActivity(), new yk(qnVar), qnVar.f40677ea).f20617a);
                    return;
                }
                return;
            case 6:
                qnVar.D7(true);
                return;
            case 7:
                MessageObject messageObject2 = qnVar.f40661d5;
                if (messageObject2 != null) {
                    qnVar.O9(messageObject2, false, false);
                    pf.d.q(qnVar.getParentActivity(), Uri.parse(qnVar.f40661d5.sponsoredUrl), true, false, false, null, null, false, qnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(qnVar.f40661d5.sponsoredInfo)) {
                    org.telegram.messenger.nk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qnVar.getParentActivity()), qnVar.f40677ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(qnVar.f40661d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.nk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qnVar.getParentActivity()), qnVar.f40677ea));
                    return;
                }
                return;
            case 10:
                if (qnVar.X0 != null && qnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 i13 = org.telegram.messenger.nk.i(1, qnVar.X0.getContext(), null, false);
                    Activity parentActivity = qnVar.getParentActivity();
                    on onVar = qnVar.f40677ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout e = org.telegram.messenger.g0.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, onVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(parentActivity, onVar);
                    x90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), onVar));
                    x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21053gc, onVar));
                    x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, onVar));
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
                    x90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), onVar));
                    x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, onVar));
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
                    x90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), onVar));
                    x90Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, onVar));
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
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(i15, onVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    kk kkVar = new kk(parentActivity, paint);
                    kkVar.setOnClickListener(new b81(parentActivity));
                    kkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    kkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    kkVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, onVar));
                    kkVar.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21065h5, onVar)));
                    kkVar.setTextSize(1, 14.0f);
                    kkVar.setGravity(16);
                    org.telegram.ui.Components.x90 x90Var4 = new org.telegram.ui.Components.x90(parentActivity, null);
                    x90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), onVar));
                    x90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, onVar));
                    x90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(textView);
                    x90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var, w7.z5.t(-1, -2, 0, 0, 18, 0, 0));
                    x90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var2, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    x90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var3, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    e.addView(kkVar, w7.z5.t(-2, 34, 1, 22, 14, 22, 0));
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
                qnVar.finishPreviewFragment();
                return;
            case 12:
                qnVar.getClass();
                qnVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar, 28, true));
                return;
            case 13:
                qn qnVar3 = this.f42223b;
                long j10 = qnVar3.T5;
                TLRPC.User user = qnVar3.f40680f;
                TLRPC.Chat chat = qnVar3.e;
                TLRPC.EncryptedChat encryptedChat = qnVar3.h;
                if (qnVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.f5.i0(qnVar3, j10, user, chat, encryptedChat, z10, qnVar3.Z7, new sg(qnVar3, 2), qnVar3.f40677ea);
                return;
            case 14:
                qn.k0(qnVar);
                return;
            case 15:
                if (qnVar.f40647c4 != null) {
                    TopicsController topicsController = qnVar.getMessagesController().getTopicsController();
                    long j11 = qnVar.e.f20280id;
                    TLRPC.TL_forumTopic tL_forumTopic = qnVar.f40647c4;
                    int i16 = tL_forumTopic.f20332id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i16, false);
                }
                qnVar.Wc();
                qnVar.mc(false);
                qnVar.Vc(true);
                return;
            case 16:
                long j12 = qnVar.T5;
                if (qnVar.h != null) {
                    j12 = qnVar.f40680f.f20427id;
                }
                qnVar.Yb = false;
                qnVar.getMessagesController().hidePeerSettingsBar(j12, qnVar.f40680f, qnVar.e);
                qnVar.Vc(true);
                qnVar.tc(true);
                return;
            case 17:
                qn qnVar4 = this.f42223b;
                qnVar4.D4 = true;
                if (qnVar4.K9() && !qnVar4.f40709h4) {
                    qnVar4.j((int) qnVar4.f40660d4, 0, true, 0, true, 0);
                    return;
                }
                int i17 = qnVar4.L4;
                if (i17 != 0) {
                    if (!qnVar4.H4.isEmpty()) {
                        if (i17 == ((Integer) i2.e.h(1, qnVar4.H4)).intValue()) {
                            i12 = ((Integer) qnVar4.H4.get(0)).intValue() + 1;
                            qnVar4.O4 = true;
                        } else {
                            qnVar4.O4 = false;
                            i12 = i17 - 1;
                        }
                    }
                    qnVar4.N4 = i12;
                    if (!qnVar4.O4) {
                        i12 = -i12;
                    }
                    qnVar4.j(i17, 0, true, 0, true, i12);
                    qnVar4.zc();
                    return;
                }
                return;
            case 18:
                qnVar.na(false);
                return;
            case 19:
                qn.b1(qnVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", qnVar.a());
                qnVar.presentFragment(new io(bundle2));
                return;
            case 21:
                qn.m0(qnVar);
                return;
            case 22:
                qn.Y0(qnVar);
                return;
            case 23:
                qn.i0(qnVar);
                return;
            case 24:
                qnVar.ga(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = qnVar.W5;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) qnVar.f40797o6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    qnVar.X5[i18].clear();
                    qnVar.Y5[i18].clear();
                }
                qnVar.h9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f20301id) > 0 || (i10 < 0 && qnVar.h != null))) {
                    qnVar.Gb(messageObject);
                }
                qnVar.Dc(0, true);
                qnVar.bd(false);
                qnVar.Qc();
                return;
            case 26:
                qn.c1(qnVar);
                return;
            case 27:
                qn qnVar5 = this.f42223b;
                MessageObject messageObject3 = qnVar5.p5;
                if (messageObject3 != null) {
                    qnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (!qnVar.J9()) {
                    str = null;
                }
                qnVar.qa(str);
                return;
            default:
                qnVar.T7();
                qnVar.y3.m(qnVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
