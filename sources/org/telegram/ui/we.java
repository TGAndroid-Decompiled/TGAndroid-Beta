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
public final class we implements View.OnClickListener {
    public final int f42011a;
    public final co f42012b;

    public we(co coVar, int i10) {
        this.f42011a = i10;
        this.f42012b = coVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f42011a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        co coVar = this.f42012b;
        switch (i11) {
            case 0:
                co coVar2 = this.f42012b;
                sg.k0.C1(coVar2, coVar2.D1, coVar2.E1, coVar2.T5, false);
                return;
            case 1:
                coVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", coVar.f35421r);
                coVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (coVar.K3 != null) {
                    coVar.Lb(!coVar.f35524yc.f15396f);
                    return;
                }
                return;
            case 3:
                coVar.kb(!coVar.A0.N);
                return;
            case 4:
                fk fkVar = coVar.I1;
                if (fkVar != null) {
                    fkVar.setReversed(true);
                    coVar.I1.getAdapter().f11167k0 = true;
                    coVar.m7();
                }
                coVar.S2.setVisibility(8);
                coVar.T2.setVisibility(8);
                coVar.f35377n3 = true;
                coVar.f35388o3 = null;
                coVar.f35400p3 = null;
                coVar.f35325j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                coVar.f35325j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(coVar.f35325j0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = coVar.f35325j0;
                v0Var.f21425r = null;
                di.h2 h2Var = v0Var.f21410e;
                if (h2Var != null) {
                    h2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (coVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = coVar.f35325j0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    coVar.showDialog(org.telegram.ui.Components.e5.p(coVar.getParentActivity(), new fl(coVar), coVar.f35274ea).f20231a);
                    return;
                }
                return;
            case 6:
                coVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = coVar.f35256d5;
                if (messageObject2 != null) {
                    coVar.J9(messageObject2, false, false);
                    of.f.r(coVar.getParentActivity(), Uri.parse(coVar.f35256d5.sponsoredUrl), true, false, false, null, null, false, coVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(coVar.f35256d5.sponsoredInfo)) {
                    org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.f35274ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(coVar.f35256d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.f35274ea));
                    return;
                }
                return;
            case 10:
                if (coVar.X0 != null && coVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 i13 = org.telegram.messenger.wl.i(1, coVar.X0.getContext(), null, false);
                    Activity parentActivity = coVar.getParentActivity();
                    ao aoVar = coVar.f35274ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.w1.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, aoVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(parentActivity, aoVar);
                    d90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), aoVar));
                    d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, aoVar));
                    d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, aoVar));
                    d90Var.setTextSize(1, 14.0f);
                    d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var.setOnLinkPressListener(new org.telegram.ui.Components.c90() {
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
                    org.telegram.ui.Components.d90 d90Var2 = new org.telegram.ui.Components.d90(parentActivity, null);
                    d90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), aoVar));
                    d90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, aoVar));
                    d90Var2.setTextSize(1, 14.0f);
                    d90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var2.setOnLinkPressListener(new org.telegram.ui.Components.c90() {
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
                    org.telegram.ui.Components.d90 d90Var3 = new org.telegram.ui.Components.d90(parentActivity, null);
                    d90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), aoVar));
                    d90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, aoVar));
                    d90Var3.setTextSize(1, 14.0f);
                    d90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var3.setOnLinkPressListener(new org.telegram.ui.Components.c90() {
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
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(i15, aoVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    sk skVar = new sk(parentActivity, paint);
                    skVar.setOnClickListener(new m91(parentActivity));
                    skVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    skVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    skVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, aoVar));
                    skVar.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, aoVar)));
                    skVar.setTextSize(1, 14.0f);
                    skVar.setGravity(16);
                    org.telegram.ui.Components.d90 d90Var4 = new org.telegram.ui.Components.d90(parentActivity, null);
                    d90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), aoVar));
                    d90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, aoVar));
                    d90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    d90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var, w7.x5.t(-1, -2, 0, 0, 18, 0, 0));
                    d90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var2, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    d90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var3, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(skVar, w7.x5.t(-2, 34, 1, 22, 14, 22, 0));
                    d90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var4, w7.x5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(f7);
                    frameLayout.addView(scrollView, w7.x5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i13.customView = frameLayout;
                    i13.show();
                    return;
                }
                return;
            case 11:
                coVar.finishPreviewFragment();
                return;
            case 12:
                coVar.getClass();
                coVar.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar, 28, true));
                return;
            case 13:
                co coVar3 = this.f42012b;
                long j3 = coVar3.T5;
                TLRPC.User user = coVar3.f35276f;
                TLRPC.Chat chat = coVar3.f35264e;
                TLRPC.EncryptedChat encryptedChat = coVar3.h;
                if (coVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.e5.j0(coVar3, j3, user, chat, encryptedChat, z10, coVar3.Z7, new ch(coVar3, 2), coVar3.f35274ea);
                return;
            case 14:
                co.j0(coVar);
                return;
            case 15:
                if (coVar.f35243c4 != null) {
                    TopicsController topicsController = coVar.getMessagesController().getTopicsController();
                    long j10 = coVar.f35264e.f19896id;
                    TLRPC.TL_forumTopic tL_forumTopic = coVar.f35243c4;
                    int i16 = tL_forumTopic.f19948id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i16, false);
                }
                coVar.Rc();
                coVar.hc(false);
                coVar.Qc(true);
                return;
            case 16:
                long j11 = coVar.T5;
                if (coVar.h != null) {
                    j11 = coVar.f35276f.f20043id;
                }
                coVar.Yb = false;
                coVar.getMessagesController().hidePeerSettingsBar(j11, coVar.f35276f, coVar.f35264e);
                coVar.Qc(true);
                coVar.oc(true);
                return;
            case 17:
                co coVar4 = this.f42012b;
                coVar4.D4 = true;
                if (coVar4.F9() && !coVar4.f35304h4) {
                    coVar4.F((int) coVar4.f35255d4, 0, 0, 0, true, true);
                    return;
                }
                int i17 = coVar4.L4;
                if (i17 != 0) {
                    if (!coVar4.H4.isEmpty()) {
                        if (i17 == ((Integer) i2.g.h(1, coVar4.H4)).intValue()) {
                            i12 = ((Integer) coVar4.H4.get(0)).intValue() + 1;
                            coVar4.O4 = true;
                        } else {
                            coVar4.O4 = false;
                            i12 = i17 - 1;
                        }
                    }
                    coVar4.N4 = i12;
                    if (!coVar4.O4) {
                        i12 = -i12;
                    }
                    coVar4.F(i17, 0, 0, i12, true, true);
                    coVar4.uc();
                    return;
                }
                return;
            case 18:
                coVar.ia(false);
                return;
            case 19:
                co.Z(coVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", coVar.a());
                coVar.presentFragment(new xo(bundle2));
                return;
            case 21:
                co.C0(coVar);
                return;
            case 22:
                co.L0(coVar);
                return;
            case 23:
                co.b1(coVar);
                return;
            case 24:
                coVar.ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = coVar.W5;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) coVar.f35391o6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    coVar.X5[i18].clear();
                    coVar.Y5[i18].clear();
                }
                coVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f19917id) > 0 || (i10 < 0 && coVar.h != null))) {
                    coVar.Bb(messageObject);
                }
                coVar.yc(0, true);
                coVar.Wc(false);
                coVar.Lc();
                return;
            case 26:
                co.f1(coVar);
                return;
            case 27:
                co coVar5 = this.f42012b;
                MessageObject messageObject3 = coVar5.p5;
                if (messageObject3 != null) {
                    coVar5.F(messageObject3.getId(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                if (!coVar.E9()) {
                    str = null;
                }
                coVar.la(str);
                return;
            default:
                coVar.Q7();
                coVar.y3.m(coVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
