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
public final class ye implements View.OnClickListener {
    public final int f38980a;
    public final eo f38981b;

    public ye(eo eoVar, int i10) {
        this.f38980a = i10;
        this.f38981b = eoVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f38980a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        eo eoVar = this.f38981b;
        switch (i11) {
            case 0:
                eo eoVar2 = this.f38981b;
                qg.k0.C1(eoVar2, eoVar2.D1, eoVar2.E1, eoVar2.T5, false);
                return;
            case 1:
                eoVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", eoVar.f32463r);
                eoVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (eoVar.K3 != null) {
                    eoVar.Lb(!eoVar.f32566yc.f12870f);
                    return;
                }
                return;
            case 3:
                eoVar.kb(!eoVar.A0.N);
                return;
            case 4:
                hk hkVar = eoVar.I1;
                if (hkVar != null) {
                    hkVar.setReversed(true);
                    eoVar.I1.getAdapter().f8114k0 = true;
                    eoVar.m7();
                }
                eoVar.S2.setVisibility(8);
                eoVar.T2.setVisibility(8);
                eoVar.f32419n3 = true;
                eoVar.f32430o3 = null;
                eoVar.f32442p3 = null;
                eoVar.f32367j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                eoVar.f32367j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(eoVar.f32367j0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = eoVar.f32367j0;
                w0Var.f18705r = null;
                bi.t2 t2Var = w0Var.e;
                if (t2Var != null) {
                    t2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (eoVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = eoVar.f32367j0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    eoVar.showDialog(org.telegram.ui.Components.d5.p(eoVar.getParentActivity(), new hl(eoVar), eoVar.f32316ea).f17571a);
                    return;
                }
                return;
            case 6:
                eoVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = eoVar.f32299d5;
                if (messageObject2 != null) {
                    eoVar.J9(messageObject2, false, false);
                    nf.f.r(eoVar.getParentActivity(), Uri.parse(eoVar.f32299d5.sponsoredUrl), true, false, false, null, null, false, eoVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(eoVar.f32299d5.sponsoredInfo)) {
                    org.telegram.messenger.em.o(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(eoVar.getParentActivity()), eoVar.f32316ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(eoVar.f32299d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.em.o(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(eoVar.getParentActivity()), eoVar.f32316ea));
                    return;
                }
                return;
            case 10:
                if (eoVar.X0 != null && eoVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.h3 i13 = org.telegram.messenger.em.i(1, eoVar.X0.getContext(), null, false);
                    Activity parentActivity = eoVar.getParentActivity();
                    bo boVar = eoVar.f32316ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.a2.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, boVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(parentActivity, boVar);
                    m90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), boVar));
                    m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, boVar));
                    m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, boVar));
                    m90Var.setTextSize(1, 14.0f);
                    m90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    m90Var.setOnLinkPressListener(new org.telegram.ui.Components.l90() {
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
                    org.telegram.ui.Components.m90 m90Var2 = new org.telegram.ui.Components.m90(parentActivity, null);
                    m90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), boVar));
                    m90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, boVar));
                    m90Var2.setTextSize(1, 14.0f);
                    m90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    m90Var2.setOnLinkPressListener(new org.telegram.ui.Components.l90() {
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
                    org.telegram.ui.Components.m90 m90Var3 = new org.telegram.ui.Components.m90(parentActivity, null);
                    m90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), boVar));
                    m90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, boVar));
                    m90Var3.setTextSize(1, 14.0f);
                    m90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    m90Var3.setOnLinkPressListener(new org.telegram.ui.Components.l90() {
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
                    int i15 = org.telegram.ui.ActionBar.j6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(i15, boVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    uk ukVar = new uk(parentActivity, paint);
                    ukVar.setOnClickListener(new p91(parentActivity));
                    ukVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    ukVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    ukVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, boVar));
                    ukVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, boVar)));
                    ukVar.setTextSize(1, 14.0f);
                    ukVar.setGravity(16);
                    org.telegram.ui.Components.m90 m90Var4 = new org.telegram.ui.Components.m90(parentActivity, null);
                    m90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), boVar));
                    m90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    m90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, boVar));
                    m90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    m90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(m90Var, w7.a6.t(-1, -2, 0, 0, 18, 0, 0));
                    m90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(m90Var2, w7.a6.t(-1, -2, 0, 0, 24, 0, 0));
                    m90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(m90Var3, w7.a6.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(ukVar, w7.a6.t(-2, 34, 1, 22, 14, 22, 0));
                    m90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(m90Var4, w7.a6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(f7);
                    frameLayout.addView(scrollView, w7.a6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i13.customView = frameLayout;
                    i13.show();
                    return;
                }
                return;
            case 11:
                eoVar.finishPreviewFragment();
                return;
            case 12:
                eoVar.getClass();
                eoVar.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) eoVar, 28, true));
                return;
            case 13:
                eo eoVar3 = this.f38981b;
                long j3 = eoVar3.T5;
                TLRPC.User user = eoVar3.f32318f;
                TLRPC.Chat chat = eoVar3.e;
                TLRPC.EncryptedChat encryptedChat = eoVar3.h;
                if (eoVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.d5.j0(eoVar3, j3, user, chat, encryptedChat, z10, eoVar3.Z7, new dh(eoVar3, 2), eoVar3.f32316ea);
                return;
            case 14:
                eo.j0(eoVar);
                return;
            case 15:
                if (eoVar.f32286c4 != null) {
                    TopicsController topicsController = eoVar.getMessagesController().getTopicsController();
                    long j10 = eoVar.e.f17195id;
                    TLRPC.TL_forumTopic tL_forumTopic = eoVar.f32286c4;
                    int i16 = tL_forumTopic.f17247id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i16, false);
                }
                eoVar.Rc();
                eoVar.hc(false);
                eoVar.Qc(true);
                return;
            case 16:
                long j11 = eoVar.T5;
                if (eoVar.h != null) {
                    j11 = eoVar.f32318f.f17342id;
                }
                eoVar.Yb = false;
                eoVar.getMessagesController().hidePeerSettingsBar(j11, eoVar.f32318f, eoVar.e);
                eoVar.Qc(true);
                eoVar.oc(true);
                return;
            case 17:
                eo eoVar4 = this.f38981b;
                eoVar4.D4 = true;
                if (eoVar4.F9() && !eoVar4.f32346h4) {
                    eoVar4.E((int) eoVar4.f32298d4, 0, 0, 0, true, true);
                    return;
                }
                int i17 = eoVar4.L4;
                if (i17 != 0) {
                    if (!eoVar4.H4.isEmpty()) {
                        if (i17 == ((Integer) hc.b.i(1, eoVar4.H4)).intValue()) {
                            i12 = ((Integer) eoVar4.H4.get(0)).intValue() + 1;
                            eoVar4.O4 = true;
                        } else {
                            eoVar4.O4 = false;
                            i12 = i17 - 1;
                        }
                    }
                    eoVar4.N4 = i12;
                    if (!eoVar4.O4) {
                        i12 = -i12;
                    }
                    eoVar4.E(i17, 0, 0, i12, true, true);
                    eoVar4.uc();
                    return;
                }
                return;
            case 18:
                eoVar.ia(false);
                return;
            case 19:
                eo.Z(eoVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", eoVar.a());
                eoVar.presentFragment(new yo(bundle2));
                return;
            case 21:
                eo.C0(eoVar);
                return;
            case 22:
                eo.L0(eoVar);
                return;
            case 23:
                eo.b1(eoVar);
                return;
            case 24:
                eoVar.ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = eoVar.W5;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) eoVar.f32433o6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    eoVar.X5[i18].clear();
                    eoVar.Y5[i18].clear();
                }
                eoVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f17216id) > 0 || (i10 < 0 && eoVar.h != null))) {
                    eoVar.Bb(messageObject);
                }
                eoVar.yc(0, true);
                eoVar.Wc(false);
                eoVar.Lc();
                return;
            case 26:
                eo.f1(eoVar);
                return;
            case 27:
                eo eoVar5 = this.f38981b;
                MessageObject messageObject3 = eoVar5.p5;
                if (messageObject3 != null) {
                    eoVar5.E(messageObject3.getId(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                if (!eoVar.E9()) {
                    str = null;
                }
                eoVar.la(str);
                return;
            default:
                eoVar.Q7();
                eoVar.y3.m(eoVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
