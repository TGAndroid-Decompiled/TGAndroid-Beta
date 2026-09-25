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
    public final int f38701a;
    public final wn f38702b;

    public ve(wn wnVar, int i10) {
        this.f38701a = i10;
        this.f38702b = wnVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f38701a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        wn wnVar = this.f38702b;
        switch (i11) {
            case 0:
                wn wnVar2 = this.f38702b;
                rg.j0.C1(wnVar2, wnVar2.D1, wnVar2.E1, wnVar2.T5, false);
                return;
            case 1:
                wnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", wnVar.f39617r);
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (wnVar.K3 != null) {
                    wnVar.Lb(!wnVar.xc.f14201f);
                    return;
                }
                return;
            case 3:
                wnVar.kb(!wnVar.A0.N);
                return;
            case 4:
                ck ckVar = wnVar.I1;
                if (ckVar != null) {
                    ckVar.setReversed(true);
                    wnVar.I1.getAdapter().f9808k0 = true;
                    wnVar.m7();
                }
                wnVar.S2.setVisibility(8);
                wnVar.T2.setVisibility(8);
                wnVar.f39573n3 = true;
                wnVar.f39584o3 = null;
                wnVar.f39596p3 = null;
                wnVar.f39521j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                wnVar.f39521j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(wnVar.f39521j0.getSearchField());
                org.telegram.ui.ActionBar.u0 u0Var = wnVar.f39521j0;
                u0Var.f19808r = null;
                ci.h2 h2Var = u0Var.e;
                if (h2Var != null) {
                    h2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (wnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = wnVar.f39521j0;
                    if (u0Var2 != null) {
                        AndroidUtilities.hideKeyboard(u0Var2.getSearchField());
                    }
                    wnVar.showDialog(org.telegram.ui.Components.e5.p(wnVar.getParentActivity(), new cl(wnVar), wnVar.f39470ea).f19950a);
                    return;
                }
                return;
            case 6:
                wnVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = wnVar.f39453d5;
                if (messageObject2 != null) {
                    wnVar.J9(messageObject2, false, false);
                    nf.f.r(wnVar.getParentActivity(), Uri.parse(wnVar.f39453d5.sponsoredUrl), true, false, false, null, null, false, wnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(wnVar.f39453d5.sponsoredInfo)) {
                    org.telegram.messenger.ok.o(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.f39470ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(wnVar.f39453d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.ok.o(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.f39470ea));
                    return;
                }
                return;
            case 10:
                if (wnVar.X0 != null && wnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 j3 = org.telegram.messenger.ok.j(1, wnVar.X0.getContext(), null, false);
                    Activity parentActivity = wnVar.getParentActivity();
                    un unVar = wnVar.f39470ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout e = org.telegram.messenger.f0.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i13 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, unVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(parentActivity, unVar);
                    n90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), unVar));
                    n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, unVar));
                    n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, unVar));
                    n90Var.setTextSize(1, 14.0f);
                    n90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    n90Var.setOnLinkPressListener(new org.telegram.ui.Components.m90() {
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
                    org.telegram.ui.Components.n90 n90Var2 = new org.telegram.ui.Components.n90(parentActivity, null);
                    n90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), unVar));
                    n90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, unVar));
                    n90Var2.setTextSize(1, 14.0f);
                    n90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    n90Var2.setOnLinkPressListener(new org.telegram.ui.Components.m90() {
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
                    org.telegram.ui.Components.n90 n90Var3 = new org.telegram.ui.Components.n90(parentActivity, null);
                    n90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), unVar));
                    n90Var3.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, unVar));
                    n90Var3.setTextSize(1, 14.0f);
                    n90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    n90Var3.setOnLinkPressListener(new org.telegram.ui.Components.m90() {
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
                    paint.setColor(org.telegram.ui.ActionBar.h6.v0(i14, unVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    pk pkVar = new pk(parentActivity, paint);
                    pkVar.setOnClickListener(new d91(parentActivity));
                    pkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    pkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    pkVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i14, unVar));
                    pkVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19130h5, unVar)));
                    pkVar.setTextSize(1, 14.0f);
                    pkVar.setGravity(16);
                    org.telegram.ui.Components.n90 n90Var4 = new org.telegram.ui.Components.n90(parentActivity, null);
                    n90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), unVar));
                    n90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    n90Var4.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, unVar));
                    n90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(textView);
                    n90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(n90Var, w7.y5.t(-1, -2, 0, 0, 18, 0, 0));
                    n90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(n90Var2, w7.y5.t(-1, -2, 0, 0, 24, 0, 0));
                    n90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(n90Var3, w7.y5.t(-1, -2, 0, 0, 24, 0, 0));
                    e.addView(pkVar, w7.y5.t(-2, 34, 1, 22, 14, 22, 0));
                    n90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(n90Var4, w7.y5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(e);
                    frameLayout.addView(scrollView, w7.y5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j3.customView = frameLayout;
                    j3.show();
                    return;
                }
                return;
            case 11:
                wnVar.finishPreviewFragment();
                return;
            case 12:
                wnVar.getClass();
                wnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 28, true));
                return;
            case 13:
                wn wnVar3 = this.f38702b;
                long j10 = wnVar3.T5;
                TLRPC.User user = wnVar3.f39472f;
                TLRPC.Chat chat = wnVar3.e;
                TLRPC.EncryptedChat encryptedChat = wnVar3.h;
                if (wnVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.e5.j0(wnVar3, j10, user, chat, encryptedChat, z10, wnVar3.Z7, new zg(wnVar3, 2), wnVar3.f39470ea);
                return;
            case 14:
                wn.h0(wnVar);
                return;
            case 15:
                if (wnVar.f39440c4 != null) {
                    TopicsController topicsController = wnVar.getMessagesController().getTopicsController();
                    long j11 = wnVar.e.f18336id;
                    TLRPC.TL_forumTopic tL_forumTopic = wnVar.f39440c4;
                    int i15 = tL_forumTopic.f18388id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i15, false);
                }
                wnVar.Rc();
                wnVar.hc(false);
                wnVar.Qc(true);
                return;
            case 16:
                long j12 = wnVar.T5;
                if (wnVar.h != null) {
                    j12 = wnVar.f39472f.f18483id;
                }
                wnVar.Xb = false;
                wnVar.getMessagesController().hidePeerSettingsBar(j12, wnVar.f39472f, wnVar.e);
                wnVar.Qc(true);
                wnVar.oc(true);
                return;
            case 17:
                wn wnVar4 = this.f38702b;
                wnVar4.D4 = true;
                if (wnVar4.F9() && !wnVar4.f39500h4) {
                    wnVar4.F((int) wnVar4.f39452d4, 0, 0, 0, true, true);
                    return;
                }
                int i16 = wnVar4.L4;
                if (i16 != 0) {
                    if (!wnVar4.H4.isEmpty()) {
                        if (i16 == ((Integer) hg.c.g(1, wnVar4.H4)).intValue()) {
                            i12 = ((Integer) wnVar4.H4.get(0)).intValue() + 1;
                            wnVar4.O4 = true;
                        } else {
                            wnVar4.O4 = false;
                            i12 = i16 - 1;
                        }
                    }
                    wnVar4.N4 = i12;
                    if (!wnVar4.O4) {
                        i12 = -i12;
                    }
                    wnVar4.F(i16, 0, 0, i12, true, true);
                    wnVar4.uc();
                    return;
                }
                return;
            case 18:
                wnVar.ia(false);
                return;
            case 19:
                wn.X0(wnVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", wnVar.a());
                wnVar.presentFragment(new ro(bundle2));
                return;
            case 21:
                wn.t0(wnVar);
                return;
            case 22:
                wn.C0(wnVar);
                return;
            case 23:
                wn.h1(wnVar);
                return;
            case 24:
                wnVar.ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = wnVar.W5;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (messageObject == null && sparseArrayArr[i17].size() != 0) {
                        messageObject = (MessageObject) wnVar.f39587o6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    wnVar.X5[i17].clear();
                    wnVar.Y5[i17].clear();
                }
                wnVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f18357id) > 0 || (i10 < 0 && wnVar.h != null))) {
                    wnVar.Bb(messageObject);
                }
                wnVar.yc(0, true);
                wnVar.Wc(false);
                wnVar.Lc();
                return;
            case 26:
                wn.j1(wnVar);
                return;
            case 27:
                wn wnVar5 = this.f38702b;
                MessageObject messageObject3 = wnVar5.p5;
                if (messageObject3 != null) {
                    wnVar5.F(messageObject3.getId(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                if (!wnVar.E9()) {
                    str = null;
                }
                wnVar.la(str);
                return;
            default:
                wnVar.Q7();
                wnVar.y3.m(wnVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
