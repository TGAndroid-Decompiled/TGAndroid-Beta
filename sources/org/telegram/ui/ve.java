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
    public final int f38365a;
    public final xn f38366b;

    public ve(xn xnVar, int i10) {
        this.f38365a = i10;
        this.f38366b = xnVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f38365a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        xn xnVar = this.f38366b;
        switch (i11) {
            case 0:
                xn xnVar2 = this.f38366b;
                rg.j0.C1(xnVar2, xnVar2.D1, xnVar2.E1, xnVar2.T5, false);
                return;
            case 1:
                xnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", xnVar.f39517r);
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (xnVar.K3 != null) {
                    xnVar.Lb(!xnVar.xc.f13963f);
                    return;
                }
                return;
            case 3:
                xnVar.kb(!xnVar.A0.N);
                return;
            case 4:
                ck ckVar = xnVar.I1;
                if (ckVar != null) {
                    ckVar.setReversed(true);
                    xnVar.I1.getAdapter().f9809k0 = true;
                    xnVar.m7();
                }
                xnVar.S2.setVisibility(8);
                xnVar.T2.setVisibility(8);
                xnVar.f39473n3 = true;
                xnVar.f39484o3 = null;
                xnVar.f39496p3 = null;
                xnVar.f39421j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                xnVar.f39421j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(xnVar.f39421j0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = xnVar.f39421j0;
                v0Var.f19580r = null;
                ci.h2 h2Var = v0Var.e;
                if (h2Var != null) {
                    h2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = xnVar.f39421j0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    xnVar.showDialog(org.telegram.ui.Components.e5.p(xnVar.getParentActivity(), new cl(xnVar), xnVar.f39370ea).f18414a);
                    return;
                }
                return;
            case 6:
                xnVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = xnVar.f39353d5;
                if (messageObject2 != null) {
                    xnVar.J9(messageObject2, false, false);
                    nf.f.r(xnVar.getParentActivity(), Uri.parse(xnVar.f39353d5.sponsoredUrl), true, false, false, null, null, false, xnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(xnVar.f39353d5.sponsoredInfo)) {
                    org.telegram.messenger.ul.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(xnVar.getParentActivity()), xnVar.f39370ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(xnVar.f39353d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.ul.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(xnVar.getParentActivity()), xnVar.f39370ea));
                    return;
                }
                return;
            case 10:
                if (xnVar.X0 != null && xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 j3 = org.telegram.messenger.ul.j(1, xnVar.X0.getContext(), null, false);
                    Activity parentActivity = xnVar.getParentActivity();
                    vn vnVar = xnVar.f39370ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.z0.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i13 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, vnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(parentActivity, vnVar);
                    d90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), vnVar));
                    d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, vnVar));
                    d90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, vnVar));
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
                    d90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), vnVar));
                    d90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, vnVar));
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
                    d90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), vnVar));
                    d90Var3.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, vnVar));
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
                    int i14 = org.telegram.ui.ActionBar.h6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.h6.v0(i14, vnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    pk pkVar = new pk(parentActivity, paint);
                    pkVar.setOnClickListener(new b91(parentActivity));
                    pkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    pkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    pkVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i14, vnVar));
                    pkVar.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18859h5, vnVar)));
                    pkVar.setTextSize(1, 14.0f);
                    pkVar.setGravity(16);
                    org.telegram.ui.Components.d90 d90Var4 = new org.telegram.ui.Components.d90(parentActivity, null);
                    d90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), vnVar));
                    d90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var4.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, vnVar));
                    d90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    d90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var, w7.x5.t(-1, -2, 0, 0, 18, 0, 0));
                    d90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var2, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    d90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var3, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(pkVar, w7.x5.t(-2, 34, 1, 22, 14, 22, 0));
                    d90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var4, w7.x5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(f7);
                    frameLayout.addView(scrollView, w7.x5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
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
                xnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) xnVar, 28, true));
                return;
            case 13:
                xn xnVar3 = this.f38366b;
                long j10 = xnVar3.T5;
                TLRPC.User user = xnVar3.f39372f;
                TLRPC.Chat chat = xnVar3.e;
                TLRPC.EncryptedChat encryptedChat = xnVar3.h;
                if (xnVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.e5.j0(xnVar3, j10, user, chat, encryptedChat, z10, xnVar3.Z7, new ah(xnVar3, 2), xnVar3.f39370ea);
                return;
            case 14:
                xn.k0(xnVar);
                return;
            case 15:
                if (xnVar.f39340c4 != null) {
                    TopicsController topicsController = xnVar.getMessagesController().getTopicsController();
                    long j11 = xnVar.e.f18083id;
                    TLRPC.TL_forumTopic tL_forumTopic = xnVar.f39340c4;
                    int i15 = tL_forumTopic.f18135id;
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
                    j12 = xnVar.f39372f.f18230id;
                }
                xnVar.Xb = false;
                xnVar.getMessagesController().hidePeerSettingsBar(j12, xnVar.f39372f, xnVar.e);
                xnVar.Qc(true);
                xnVar.oc(true);
                return;
            case 17:
                xn xnVar4 = this.f38366b;
                xnVar4.D4 = true;
                if (xnVar4.F9() && !xnVar4.f39400h4) {
                    xnVar4.F((int) xnVar4.f39352d4, 0, 0, 0, true, true);
                    return;
                }
                int i16 = xnVar4.L4;
                if (i16 != 0) {
                    if (!xnVar4.H4.isEmpty()) {
                        if (i16 == ((Integer) hg.c.h(1, xnVar4.H4)).intValue()) {
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
                xn.Z(xnVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", xnVar.a());
                xnVar.presentFragment(new so(bundle2));
                return;
            case 21:
                xn.C0(xnVar);
                return;
            case 22:
                xn.L0(xnVar);
                return;
            case 23:
                xn.b1(xnVar);
                return;
            case 24:
                xnVar.ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = xnVar.W5;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (messageObject == null && sparseArrayArr[i17].size() != 0) {
                        messageObject = (MessageObject) xnVar.f39487o6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    xnVar.X5[i17].clear();
                    xnVar.Y5[i17].clear();
                }
                xnVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f18104id) > 0 || (i10 < 0 && xnVar.h != null))) {
                    xnVar.Bb(messageObject);
                }
                xnVar.yc(0, true);
                xnVar.Wc(false);
                xnVar.Lc();
                return;
            case 26:
                xn.f1(xnVar);
                return;
            case 27:
                xn xnVar5 = this.f38366b;
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
