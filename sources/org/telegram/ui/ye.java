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
    public final int f40196a;
    public final xn f40197b;

    public ye(xn xnVar, int i10) {
        this.f40196a = i10;
        this.f40197b = xnVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f40196a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        xn xnVar = this.f40197b;
        switch (i11) {
            case 0:
                xn xnVar2 = this.f40197b;
                rg.j0.C1(xnVar2, xnVar2.D1, xnVar2.E1, xnVar2.T5, false);
                return;
            case 1:
                xnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", xnVar.f39898r);
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (xnVar.K3 != null) {
                    xnVar.Lb(!xnVar.xc.f14203f);
                    return;
                }
                return;
            case 3:
                xnVar.kb(!xnVar.A0.N);
                return;
            case 4:
                ek ekVar = xnVar.I1;
                if (ekVar != null) {
                    ekVar.setReversed(true);
                    xnVar.I1.getAdapter().f9814k0 = true;
                    xnVar.m7();
                }
                xnVar.S2.setVisibility(8);
                xnVar.T2.setVisibility(8);
                xnVar.f39854n3 = true;
                xnVar.f39865o3 = null;
                xnVar.f39877p3 = null;
                xnVar.f39802j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                xnVar.f39802j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(xnVar.f39802j0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39802j0;
                w0Var.f19857r = null;
                ci.h2 h2Var = w0Var.e;
                if (h2Var != null) {
                    h2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = xnVar.f39802j0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    xnVar.showDialog(org.telegram.ui.Components.e5.p(xnVar.getParentActivity(), new dl(xnVar), xnVar.f39750ea).f18683a);
                    return;
                }
                return;
            case 6:
                xnVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = xnVar.f39733d5;
                if (messageObject2 != null) {
                    xnVar.J9(messageObject2, false, false);
                    nf.f.r(xnVar.getParentActivity(), Uri.parse(xnVar.f39733d5.sponsoredUrl), true, false, false, null, null, false, xnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(xnVar.f39733d5.sponsoredInfo)) {
                    org.telegram.messenger.qk.o(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(xnVar.getParentActivity()), xnVar.f39750ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(xnVar.f39733d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.qk.o(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(xnVar.getParentActivity()), xnVar.f39750ea));
                    return;
                }
                return;
            case 10:
                if (xnVar.X0 != null && xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.g3 j3 = org.telegram.messenger.qk.j(1, xnVar.X0.getContext(), null, false);
                    Activity parentActivity = xnVar.getParentActivity();
                    vn vnVar = xnVar.f39750ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout e = org.telegram.messenger.l0.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i13 = org.telegram.ui.ActionBar.i6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, vnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(parentActivity, vnVar);
                    p90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), vnVar));
                    p90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, vnVar));
                    p90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, vnVar));
                    p90Var.setTextSize(1, 14.0f);
                    p90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p90Var.setOnLinkPressListener(new org.telegram.ui.Components.o90() {
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
                    org.telegram.ui.Components.p90 p90Var2 = new org.telegram.ui.Components.p90(parentActivity, null);
                    p90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), vnVar));
                    p90Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, vnVar));
                    p90Var2.setTextSize(1, 14.0f);
                    p90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p90Var2.setOnLinkPressListener(new org.telegram.ui.Components.o90() {
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
                    org.telegram.ui.Components.p90 p90Var3 = new org.telegram.ui.Components.p90(parentActivity, null);
                    p90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), vnVar));
                    p90Var3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, vnVar));
                    p90Var3.setTextSize(1, 14.0f);
                    p90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p90Var3.setOnLinkPressListener(new org.telegram.ui.Components.o90() {
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
                    int i14 = org.telegram.ui.ActionBar.i6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.i6.v0(i14, vnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    rk rkVar = new rk(parentActivity, paint);
                    rkVar.setOnClickListener(new e91(parentActivity));
                    rkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    rkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    rkVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, vnVar));
                    rkVar.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, vnVar)));
                    rkVar.setTextSize(1, 14.0f);
                    rkVar.setGravity(16);
                    org.telegram.ui.Components.p90 p90Var4 = new org.telegram.ui.Components.p90(parentActivity, null);
                    p90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), vnVar));
                    p90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p90Var4.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, vnVar));
                    p90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(textView);
                    p90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(p90Var, w7.y5.t(-1, -2, 0, 0, 18, 0, 0));
                    p90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(p90Var2, w7.y5.t(-1, -2, 0, 0, 24, 0, 0));
                    p90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(p90Var3, w7.y5.t(-1, -2, 0, 0, 24, 0, 0));
                    e.addView(rkVar, w7.y5.t(-2, 34, 1, 22, 14, 22, 0));
                    p90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(p90Var4, w7.y5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(e);
                    frameLayout.addView(scrollView, w7.y5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j3.customView = frameLayout;
                    j3.show();
                    return;
                }
                return;
            case 11:
                xnVar.finishPreviewFragment();
                return;
            case 12:
                xnVar.getClass();
                xnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) xnVar, 28, true));
                return;
            case 13:
                xn xnVar3 = this.f40197b;
                long j10 = xnVar3.T5;
                TLRPC.User user = xnVar3.f39752f;
                TLRPC.Chat chat = xnVar3.e;
                TLRPC.EncryptedChat encryptedChat = xnVar3.h;
                if (xnVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.e5.j0(xnVar3, j10, user, chat, encryptedChat, z10, xnVar3.Z7, new ch(xnVar3, 2), xnVar3.f39750ea);
                return;
            case 14:
                xn.h0(xnVar);
                return;
            case 15:
                if (xnVar.f39720c4 != null) {
                    TopicsController topicsController = xnVar.getMessagesController().getTopicsController();
                    long j11 = xnVar.e.f18329id;
                    TLRPC.TL_forumTopic tL_forumTopic = xnVar.f39720c4;
                    int i15 = tL_forumTopic.f18381id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i15, false);
                }
                xnVar.Rc();
                xnVar.hc(false);
                xnVar.Qc(true);
                return;
            case 16:
                long j12 = xnVar.T5;
                if (xnVar.h != null) {
                    j12 = xnVar.f39752f.f18476id;
                }
                xnVar.Xb = false;
                xnVar.getMessagesController().hidePeerSettingsBar(j12, xnVar.f39752f, xnVar.e);
                xnVar.Qc(true);
                xnVar.oc(true);
                return;
            case 17:
                xn xnVar4 = this.f40197b;
                xnVar4.D4 = true;
                if (xnVar4.F9() && !xnVar4.f39781h4) {
                    xnVar4.F((int) xnVar4.f39732d4, 0, 0, 0, true, true);
                    return;
                }
                int i16 = xnVar4.L4;
                if (i16 != 0) {
                    if (!xnVar4.H4.isEmpty()) {
                        if (i16 == ((Integer) hg.k0.g(1, xnVar4.H4)).intValue()) {
                            i12 = ((Integer) xnVar4.H4.get(0)).intValue() + 1;
                            xnVar4.O4 = true;
                        } else {
                            xnVar4.O4 = false;
                            i12 = i16 - 1;
                        }
                    }
                    xnVar4.N4 = i12;
                    if (!xnVar4.O4) {
                        i12 = -i12;
                    }
                    xnVar4.F(i16, 0, 0, i12, true, true);
                    xnVar4.uc();
                    return;
                }
                return;
            case 18:
                xnVar.ia(false);
                return;
            case 19:
                xn.X0(xnVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", xnVar.a());
                xnVar.presentFragment(new so(bundle2));
                return;
            case 21:
                xn.t0(xnVar);
                return;
            case 22:
                xn.C0(xnVar);
                return;
            case 23:
                xn.h1(xnVar);
                return;
            case 24:
                xnVar.ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = xnVar.W5;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (messageObject == null && sparseArrayArr[i17].size() != 0) {
                        messageObject = (MessageObject) xnVar.f39868o6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    xnVar.X5[i17].clear();
                    xnVar.Y5[i17].clear();
                }
                xnVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f18350id) > 0 || (i10 < 0 && xnVar.h != null))) {
                    xnVar.Bb(messageObject);
                }
                xnVar.yc(0, true);
                xnVar.Wc(false);
                xnVar.Lc();
                return;
            case 26:
                xn.j1(xnVar);
                return;
            case 27:
                xn xnVar5 = this.f40197b;
                MessageObject messageObject3 = xnVar5.p5;
                if (messageObject3 != null) {
                    xnVar5.F(messageObject3.getId(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                if (!xnVar.E9()) {
                    str = null;
                }
                xnVar.la(str);
                return;
            default:
                xnVar.Q7();
                xnVar.y3.m(xnVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
