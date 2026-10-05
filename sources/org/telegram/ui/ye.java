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
    public final int f43201a;
    public final yn f43202b;

    public ye(yn ynVar, int i10) {
        this.f43201a = i10;
        this.f43202b = ynVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f43201a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        yn ynVar = this.f43202b;
        switch (i11) {
            case 0:
                yn ynVar2 = this.f43202b;
                rg.k0.C1(ynVar2, ynVar2.B1, ynVar2.C1, ynVar2.R5, false);
                return;
            case 1:
                ynVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ynVar.f43473r);
                ynVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (ynVar.I3 != null) {
                    ynVar.Kb(!ynVar.f43537vc.f15437f);
                    return;
                }
                return;
            case 3:
                ynVar.jb(!ynVar.f43565y0.N);
                return;
            case 4:
                ck ckVar = ynVar.G1;
                if (ckVar != null) {
                    ckVar.setReversed(true);
                    ynVar.G1.getAdapter().f10681k0 = true;
                    ynVar.m7();
                }
                ynVar.Q2.setVisibility(8);
                ynVar.R2.setVisibility(8);
                ynVar.f43404l3 = true;
                ynVar.f43415m3 = null;
                ynVar.f43429n3 = null;
                ynVar.f43352h0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                ynVar.f43352h0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(ynVar.f43352h0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = ynVar.f43352h0;
                v0Var.f21599r = null;
                ci.h2 h2Var = v0Var.f21584e;
                if (h2Var != null) {
                    h2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (ynVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = ynVar.f43352h0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    ynVar.showDialog(org.telegram.ui.Components.e5.p(ynVar.getParentActivity(), new cl(ynVar), ynVar.f43300ca).f20383a);
                    return;
                }
                return;
            case 6:
                ynVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = ynVar.f43281b5;
                if (messageObject2 != null) {
                    ynVar.I9(messageObject2, false, false);
                    nf.f.r(ynVar.getParentActivity(), Uri.parse(ynVar.f43281b5.sponsoredUrl), true, false, false, null, null, false, ynVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(ynVar.f43281b5.sponsoredInfo)) {
                    org.telegram.messenger.bi.n(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.f43300ca));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(ynVar.f43281b5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.bi.n(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.f43300ca));
                    return;
                }
                return;
            case 10:
                if (ynVar.V0 != null && ynVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 i13 = org.telegram.messenger.bi.i(1, ynVar.V0.getContext(), null, false);
                    Activity parentActivity = ynVar.getParentActivity();
                    wn wnVar = ynVar.f43300ca;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout e7 = org.telegram.messenger.q.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.i6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(parentActivity, wnVar);
                    q90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), wnVar));
                    q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, wnVar));
                    q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
                    q90Var.setTextSize(1, 14.0f);
                    q90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    q90Var.setOnLinkPressListener(new org.telegram.ui.Components.p90() {
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
                    org.telegram.ui.Components.q90 q90Var2 = new org.telegram.ui.Components.q90(parentActivity, null);
                    q90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), wnVar));
                    q90Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
                    q90Var2.setTextSize(1, 14.0f);
                    q90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    q90Var2.setOnLinkPressListener(new org.telegram.ui.Components.p90() {
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
                    org.telegram.ui.Components.q90 q90Var3 = new org.telegram.ui.Components.q90(parentActivity, null);
                    q90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), wnVar));
                    q90Var3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
                    q90Var3.setTextSize(1, 14.0f);
                    q90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    q90Var3.setOnLinkPressListener(new org.telegram.ui.Components.p90() {
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
                    int i15 = org.telegram.ui.ActionBar.i6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.i6.v0(i15, wnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    pk pkVar = new pk(parentActivity, paint);
                    pkVar.setOnClickListener(new c91(parentActivity));
                    pkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    pkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    pkVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, wnVar));
                    pkVar.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, wnVar)));
                    pkVar.setTextSize(1, 14.0f);
                    pkVar.setGravity(16);
                    org.telegram.ui.Components.q90 q90Var4 = new org.telegram.ui.Components.q90(parentActivity, null);
                    q90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), wnVar));
                    q90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    q90Var4.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
                    q90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(textView);
                    q90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(q90Var, w7.z5.t(-1, -2, 0, 0, 18, 0, 0));
                    q90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(q90Var2, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    q90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(q90Var3, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    e7.addView(pkVar, w7.z5.t(-2, 34, 1, 22, 14, 22, 0));
                    q90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(q90Var4, w7.z5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(e7);
                    frameLayout.addView(scrollView, w7.z5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i13.customView = frameLayout;
                    i13.show();
                    return;
                }
                return;
            case 11:
                ynVar.finishPreviewFragment();
                return;
            case 12:
                ynVar.getClass();
                ynVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 28, true));
                return;
            case 13:
                yn ynVar3 = this.f43202b;
                long j3 = ynVar3.R5;
                TLRPC.User user = ynVar3.f43327f;
                TLRPC.Chat chat = ynVar3.f43315e;
                TLRPC.EncryptedChat encryptedChat = ynVar3.h;
                if (ynVar3.L1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.e5.j0(ynVar3, j3, user, chat, encryptedChat, z10, ynVar3.X7, new ah(ynVar3, 1), ynVar3.f43300ca);
                return;
            case 14:
                yn.q1(ynVar);
                return;
            case 15:
                if (ynVar.f43266a4 != null) {
                    TopicsController topicsController = ynVar.getMessagesController().getTopicsController();
                    long j10 = ynVar.f43315e.f20047id;
                    TLRPC.TL_forumTopic tL_forumTopic = ynVar.f43266a4;
                    int i16 = tL_forumTopic.f20099id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i16, false);
                }
                ynVar.Qc();
                ynVar.gc(false);
                ynVar.Pc(true);
                return;
            case 16:
                long j11 = ynVar.R5;
                if (ynVar.h != null) {
                    j11 = ynVar.f43327f.f20194id;
                }
                ynVar.Vb = false;
                ynVar.getMessagesController().hidePeerSettingsBar(j11, ynVar.f43327f, ynVar.f43315e);
                ynVar.Pc(true);
                ynVar.nc(true);
                return;
            case 17:
                yn ynVar4 = this.f43202b;
                ynVar4.B4 = true;
                if (ynVar4.E9() && !ynVar4.f43332f4) {
                    ynVar4.D((int) ynVar4.f43280b4, 0, 0, 0, true, true);
                    return;
                }
                int i17 = ynVar4.J4;
                if (i17 != 0) {
                    if (!ynVar4.F4.isEmpty()) {
                        if (i17 == ((Integer) hg.c.g(1, ynVar4.F4)).intValue()) {
                            i12 = ((Integer) ynVar4.F4.get(0)).intValue() + 1;
                            ynVar4.M4 = true;
                        } else {
                            ynVar4.M4 = false;
                            i12 = i17 - 1;
                        }
                    }
                    ynVar4.L4 = i12;
                    if (!ynVar4.M4) {
                        i12 = -i12;
                    }
                    ynVar4.D(i17, 0, 0, i12, true, true);
                    ynVar4.tc();
                    return;
                }
                return;
            case 18:
                ynVar.ha(false);
                return;
            case 19:
                yn.b0(ynVar);
                return;
            case 20:
                yn.Y(ynVar);
                return;
            case 21:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ynVar.a());
                ynVar.presentFragment(new to(bundle2));
                return;
            case 22:
                yn.H0(ynVar);
                return;
            case 23:
                yn.a1(ynVar);
                return;
            case 24:
                ynVar.aa(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = ynVar.U5;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) ynVar.f43418m6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    ynVar.V5[i18].clear();
                    ynVar.W5[i18].clear();
                }
                ynVar.d9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f20068id) > 0 || (i10 < 0 && ynVar.h != null))) {
                    ynVar.Ab(messageObject);
                }
                ynVar.xc(0, true);
                ynVar.Vc(false);
                ynVar.Kc();
                return;
            case 26:
                yn.K0(ynVar);
                return;
            case 27:
                yn ynVar5 = this.f43202b;
                MessageObject messageObject3 = ynVar5.f43431n5;
                if (messageObject3 != null) {
                    ynVar5.D(messageObject3.getId(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                if (!ynVar.D9()) {
                    str = null;
                }
                ynVar.ka(str);
                return;
            default:
                ynVar.Q7();
                ynVar.f43542w3.m(ynVar.R5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
