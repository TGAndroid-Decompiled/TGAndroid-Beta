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
    public final int f44650a;
    public final wn f44651b;

    public we(wn wnVar, int i10) {
        this.f44650a = i10;
        this.f44651b = wnVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f44650a;
        MessageObject messageObject = null;
        String str = null;
        int i12 = 0;
        wn wnVar = this.f44651b;
        switch (i11) {
            case 0:
                wn wnVar2 = this.f44651b;
                tg.j0.G1(wnVar2, wnVar2.P1, wnVar2.Q1, wnVar2.f45168j6, false);
                return;
            case 1:
                wnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", wnVar.f45259r);
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (wnVar.W3 != null) {
                    wnVar.bc(!wnVar.Zc.f19326f);
                    return;
                }
                return;
            case 3:
                wnVar.zb(!wnVar.A0.N);
                return;
            case 4:
                bk bkVar = wnVar.U1;
                if (bkVar != null) {
                    bkVar.setReversed(true);
                    wnVar.U1.getAdapter().f14121k0 = true;
                    wnVar.v7();
                }
                wnVar.f45104e3.setVisibility(8);
                wnVar.f45117f3.setVisibility(8);
                wnVar.f45367z3 = true;
                wnVar.A3 = null;
                wnVar.B3 = null;
                wnVar.f45162j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                wnVar.f45162j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(wnVar.f45162j0.getSearchField());
                wnVar.f45162j0.n();
                return;
            case 5:
                if (wnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var = wnVar.f45162j0;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    wnVar.showDialog(org.telegram.ui.Components.g5.o(wnVar.getParentActivity(), new cl(wnVar), wnVar.f45309ua).f22602a);
                    return;
                }
                return;
            case 6:
                wnVar.J7(true);
                return;
            case 7:
                MessageObject messageObject2 = wnVar.f45291t5;
                if (messageObject2 != null) {
                    wnVar.W9(messageObject2, false, false);
                    qf.d.q(wnVar.getParentActivity(), Uri.parse(wnVar.f45291t5.sponsoredUrl), true, false, false, null, null, false, wnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(wnVar.f45291t5.sponsoredInfo)) {
                    org.telegram.messenger.wh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.f45309ua));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(wnVar.f45291t5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.wh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.f45309ua));
                    return;
                }
                return;
            case 10:
                if (wnVar.f45163j1 != null && wnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.k3 i13 = org.telegram.messenger.wh.i(1, wnVar.f45163j1.getContext(), null, false);
                    Activity parentActivity = wnVar.getParentActivity();
                    un unVar = wnVar.f45309ua;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.t.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.y6.G6;
                    org.telegram.ui.ActionBar.f7.V(textView, i14, unVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(parentActivity, unVar);
                    aa0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), unVar));
                    org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, unVar);
                    org.telegram.ui.ActionBar.f7.V(aa0Var, i14, unVar);
                    aa0Var.setTextSize(1, 14.0f);
                    aa0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    aa0Var.setOnLinkPressListener(new org.telegram.ui.Components.z90() {
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
                    org.telegram.ui.Components.aa0 aa0Var2 = new org.telegram.ui.Components.aa0(parentActivity, null);
                    aa0Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), unVar));
                    org.telegram.ui.ActionBar.f7.V(aa0Var2, i14, unVar);
                    aa0Var2.setTextSize(1, 14.0f);
                    aa0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    aa0Var2.setOnLinkPressListener(new org.telegram.ui.Components.z90() {
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
                    org.telegram.ui.Components.aa0 aa0Var3 = new org.telegram.ui.Components.aa0(parentActivity, null);
                    aa0Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), unVar));
                    org.telegram.ui.ActionBar.f7.V(aa0Var3, i14, unVar);
                    aa0Var3.setTextSize(1, 14.0f);
                    aa0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    aa0Var3.setOnLinkPressListener(new org.telegram.ui.Components.z90() {
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
                    int i15 = org.telegram.ui.ActionBar.y6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.y6.w0(i15, unVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    ok okVar = new ok(parentActivity, paint);
                    okVar.setOnClickListener(new j81(parentActivity));
                    okVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    okVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    org.telegram.ui.ActionBar.f7.V(okVar, i15, unVar);
                    int i16 = org.telegram.ui.ActionBar.y6.f23428h5;
                    org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.w0(i16, unVar));
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
                    org.telegram.ui.ActionBar.b7 f10 = org.telegram.ui.ActionBar.f7.f(i16);
                    okVar.setBackground(e);
                    org.telegram.ui.ActionBar.f7.k(okVar, e, N, f10, unVar);
                    okVar.setTextSize(1, 14.0f);
                    okVar.setGravity(16);
                    org.telegram.ui.Components.aa0 aa0Var4 = new org.telegram.ui.Components.aa0(parentActivity, null);
                    aa0Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), unVar));
                    aa0Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.f7.V(aa0Var4, i14, unVar);
                    aa0Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    aa0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(aa0Var, org.telegram.ui.Components.kb1.x(-1, -2, 0, 0, 18, 0, 0));
                    aa0Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(aa0Var2, org.telegram.ui.Components.kb1.x(-1, -2, 0, 0, 24, 0, 0));
                    aa0Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(aa0Var3, org.telegram.ui.Components.kb1.x(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(okVar, org.telegram.ui.Components.kb1.x(-2, 34, 1, 22, 14, 22, 0));
                    aa0Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(aa0Var4, org.telegram.ui.Components.kb1.x(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(f7);
                    frameLayout.addView(scrollView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i13.customView = frameLayout;
                    i13.show();
                    return;
                }
                return;
            case 11:
                wnVar.finishPreviewFragment();
                return;
            case 12:
                wnVar.getClass();
                wnVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) wnVar, 28, true));
                return;
            case 13:
                wn wnVar3 = this.f44651b;
                long j10 = wnVar3.f45168j6;
                TLRPC.User user = wnVar3.f45113f;
                TLRPC.Chat chat = wnVar3.e;
                TLRPC.EncryptedChat encryptedChat = wnVar3.h;
                if (wnVar3.Z1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.g5.i0(wnVar3, j10, user, chat, encryptedChat, z10, wnVar3.f45245p8, new rg(wnVar3, 2), wnVar3.f45309ua);
                return;
            case 14:
                wn.g0(wnVar);
                return;
            case 15:
                if (wnVar.f45228o4 != null) {
                    TopicsController topicsController = wnVar.getMessagesController().getTopicsController();
                    long j11 = wnVar.e.f22028id;
                    TLRPC.TL_forumTopic tL_forumTopic = wnVar.f45228o4;
                    int i17 = tL_forumTopic.f22080id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i17, false);
                }
                wnVar.id();
                wnVar.yc(false);
                wnVar.hd(true);
                return;
            case 16:
                long j12 = wnVar.f45168j6;
                if (wnVar.h != null) {
                    j12 = wnVar.f45113f.f22177id;
                }
                wnVar.f45363yc = false;
                wnVar.getMessagesController().hidePeerSettingsBar(j12, wnVar.f45113f, wnVar.e);
                wnVar.hd(true);
                wnVar.Fc(true);
                return;
            case 17:
                wn wnVar4 = this.f44651b;
                wnVar4.P4 = true;
                if (wnVar4.R9() && !wnVar4.f45290t4) {
                    wnVar4.j((int) wnVar4.f45241p4, 0, true, 0, true, 0);
                    return;
                }
                int i18 = wnVar4.X4;
                if (i18 != 0) {
                    if (!wnVar4.T4.isEmpty()) {
                        if (i18 == ((Integer) ic.a.g(1, wnVar4.T4)).intValue()) {
                            i12 = ((Integer) wnVar4.T4.get(0)).intValue() + 1;
                            wnVar4.f45049a5 = true;
                        } else {
                            wnVar4.f45049a5 = false;
                            i12 = i18 - 1;
                        }
                    }
                    wnVar4.Z4 = i12;
                    if (!wnVar4.f45049a5) {
                        i12 = -i12;
                    }
                    wnVar4.j(i18, 0, true, 0, true, i12);
                    wnVar4.Lc();
                    return;
                }
                return;
            case 18:
                wnVar.va(false);
                return;
            case 19:
                wn.k1(wnVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", wnVar.a());
                wnVar.presentFragment(new oo(bundle2));
                return;
            case 21:
                wn.J0(wnVar);
                return;
            case 22:
                wn.Z0(wnVar);
                return;
            case 23:
                wn.q0(wnVar);
                return;
            case 24:
                wnVar.oa(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = wnVar.f45203m6;
                for (int i19 = 1; i19 >= 0; i19--) {
                    if (messageObject == null && sparseArrayArr[i19].size() != 0) {
                        messageObject = (MessageObject) wnVar.E6[i19].get(sparseArrayArr[i19].keyAt(0));
                    }
                    sparseArrayArr[i19].clear();
                    wnVar.f45217n6[i19].clear();
                    wnVar.f45230o6[i19].clear();
                }
                wnVar.p9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f22049id) > 0 || (i10 < 0 && wnVar.h != null))) {
                    wnVar.Rb(messageObject);
                }
                wnVar.Pc(0, true);
                wnVar.nd(false);
                wnVar.cd();
                return;
            case 26:
                wn.K0(wnVar);
                return;
            case 27:
                wn wnVar5 = this.f44651b;
                MessageObject messageObject3 = wnVar5.F5;
                if (messageObject3 != null) {
                    wnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (wnVar.Q9()) {
                    str = "";
                }
                wnVar.ya(str);
                return;
            default:
                wnVar.Z7();
                wnVar.K3.m(wnVar.f45168j6, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
