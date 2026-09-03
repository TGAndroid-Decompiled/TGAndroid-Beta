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
public final class ue implements View.OnClickListener {
    public final int f41807a;
    public final xn f41808b;

    public ue(xn xnVar, int i10) {
        this.f41807a = i10;
        this.f41808b = xnVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        int i10;
        int i11 = this.f41807a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        xn xnVar = this.f41808b;
        switch (i11) {
            case 0:
                xn xnVar2 = this.f41808b;
                fg.v0.C1(xnVar2, xnVar2.A1, xnVar2.B1, xnVar2.Q5, false);
                return;
            case 1:
                xnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", xnVar.f43304r);
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (xnVar.H3 != null) {
                    xnVar.Lb(!xnVar.f43365vc.f50542f);
                    return;
                }
                return;
            case 3:
                xnVar.kb(!xnVar.f43381x0.K);
                return;
            case 4:
                bk bkVar = xnVar.F1;
                if (bkVar != null) {
                    bkVar.setReversed(true);
                    xnVar.F1.getAdapter().f48739h0 = true;
                    xnVar.m7();
                }
                xnVar.P2.setVisibility(8);
                xnVar.Q2.setVisibility(8);
                xnVar.f43221k3 = true;
                xnVar.f43233l3 = null;
                xnVar.f43245m3 = null;
                xnVar.f43169g0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                xnVar.f43169g0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(xnVar.f43169g0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = xnVar.f43169g0;
                w0Var.f22366r = null;
                lg.f fVar = w0Var.f22351e;
                if (fVar != null) {
                    fVar.setText("");
                    return;
                }
                return;
            case 5:
                if (xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = xnVar.f43169g0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    xnVar.showDialog(org.telegram.ui.Components.z4.p(xnVar.getParentActivity(), new cl(xnVar), xnVar.f43114ba).f21209a);
                    return;
                }
                return;
            case 6:
                xnVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = xnVar.f43095a5;
                if (messageObject2 != null) {
                    xnVar.J9(messageObject2, false, false);
                    af.g.r(xnVar.getParentActivity(), Uri.parse(xnVar.f43095a5.sponsoredUrl), true, false, false, null, null, false, xnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(xnVar.f43095a5.sponsoredInfo)) {
                    b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.f43114ba));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(xnVar.f43095a5.sponsoredAdditionalInfo)) {
                    b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.f43114ba));
                    return;
                }
                return;
            case 10:
                if (xnVar.U0 != null && xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(xnVar.U0.getContext(), null, false, false);
                    Activity parentActivity = xnVar.getParentActivity();
                    vn vnVar = xnVar.f43114ba;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout h = l.d.h(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i13 = org.telegram.ui.ActionBar.k6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, vnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(parentActivity, vnVar);
                    g90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), vnVar));
                    g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21722gc, vnVar));
                    g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, vnVar));
                    g90Var.setTextSize(1, 14.0f);
                    g90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    g90Var.setOnLinkPressListener(new org.telegram.ui.Components.f90() {
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
                    org.telegram.ui.Components.g90 g90Var2 = new org.telegram.ui.Components.g90(parentActivity, null);
                    g90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), vnVar));
                    g90Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, vnVar));
                    g90Var2.setTextSize(1, 14.0f);
                    g90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    g90Var2.setOnLinkPressListener(new org.telegram.ui.Components.f90() {
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
                    org.telegram.ui.Components.g90 g90Var3 = new org.telegram.ui.Components.g90(parentActivity, null);
                    g90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), vnVar));
                    g90Var3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, vnVar));
                    g90Var3.setTextSize(1, 14.0f);
                    g90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    g90Var3.setOnLinkPressListener(new org.telegram.ui.Components.f90() {
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
                    paint.setColor(org.telegram.ui.ActionBar.k6.v0(i14, vnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    pk pkVar = new pk(parentActivity, paint);
                    pkVar.setOnClickListener(new z81(parentActivity));
                    pkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    pkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    pkVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, vnVar));
                    pkVar.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, vnVar)));
                    pkVar.setTextSize(1, 14.0f);
                    pkVar.setGravity(16);
                    org.telegram.ui.Components.g90 g90Var4 = new org.telegram.ui.Components.g90(parentActivity, null);
                    g90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), vnVar));
                    g90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    g90Var4.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, vnVar));
                    g90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(textView);
                    g90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(g90Var, k7.c6.t(-1, -2, 0, 0, 18, 0, 0));
                    g90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(g90Var2, k7.c6.t(-1, -2, 0, 0, 24, 0, 0));
                    g90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(g90Var3, k7.c6.t(-1, -2, 0, 0, 24, 0, 0));
                    h.addView(pkVar, k7.c6.t(-2, 34, 1, 22, 14, 22, 0));
                    g90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(g90Var4, k7.c6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(h);
                    frameLayout.addView(scrollView, k7.c6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    o10.customView = frameLayout;
                    o10.show();
                    return;
                }
                return;
            case 11:
                xnVar.finishPreviewFragment();
                return;
            case 12:
                xnVar.getClass();
                xnVar.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) xnVar, 28, true));
                return;
            case 13:
                xn xnVar3 = this.f41808b;
                long j10 = xnVar3.Q5;
                TLRPC.User user = xnVar3.f43156f;
                TLRPC.Chat chat = xnVar3.f43143e;
                TLRPC.EncryptedChat encryptedChat = xnVar3.h;
                if (xnVar3.K1.getTag(R.id.object_tag) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                org.telegram.ui.Components.z4.j0(xnVar3, j10, user, chat, encryptedChat, z4, xnVar3.W7, new vg(xnVar3, 2), xnVar3.f43114ba);
                return;
            case 14:
                xn.j0(xnVar);
                return;
            case 15:
                if (xnVar.Z3 != null) {
                    TopicsController topicsController = xnVar.getMessagesController().getTopicsController();
                    long j11 = xnVar.f43143e.f20845id;
                    TLRPC.TL_forumTopic tL_forumTopic = xnVar.Z3;
                    int i15 = tL_forumTopic.f20897id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i15, false);
                }
                xnVar.Rc();
                xnVar.hc(false);
                xnVar.Qc(true);
                return;
            case 16:
                long j12 = xnVar.Q5;
                if (xnVar.h != null) {
                    j12 = xnVar.f43156f.f20992id;
                }
                xnVar.Vb = false;
                xnVar.getMessagesController().hidePeerSettingsBar(j12, xnVar.f43156f, xnVar.f43143e);
                xnVar.Qc(true);
                xnVar.oc(true);
                return;
            case 17:
                xn xnVar4 = this.f41808b;
                xnVar4.A4 = true;
                if (xnVar4.F9() && !xnVar4.f43148e4) {
                    xnVar4.j((int) xnVar4.f43094a4, 0, true, 0, true, 0);
                    return;
                }
                int i16 = xnVar4.I4;
                if (i16 != 0) {
                    if (!xnVar4.E4.isEmpty()) {
                        if (i16 == ((Integer) l.d.i(1, xnVar4.E4)).intValue()) {
                            i12 = ((Integer) xnVar4.E4.get(0)).intValue() + 1;
                            xnVar4.L4 = true;
                        } else {
                            xnVar4.L4 = false;
                            i12 = i16 - 1;
                        }
                    }
                    xnVar4.K4 = i12;
                    if (!xnVar4.L4) {
                        i12 = -i12;
                    }
                    xnVar4.j(i16, 0, true, 0, true, i12);
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
                xnVar.presentFragment(new po(bundle2));
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
                SparseArray[] sparseArrayArr = xnVar.T5;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (messageObject == null && sparseArrayArr[i17].size() != 0) {
                        messageObject = (MessageObject) xnVar.f43236l6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    xnVar.U5[i17].clear();
                    xnVar.V5[i17].clear();
                }
                xnVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f20866id) > 0 || (i10 < 0 && xnVar.h != null))) {
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
                xn xnVar5 = this.f41808b;
                MessageObject messageObject3 = xnVar5.f43247m5;
                if (messageObject3 != null) {
                    xnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
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
                xnVar.f43356v3.m(xnVar.Q5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
