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
    public final int f38825a;
    public final zn f38826b;

    public we(zn znVar, int i10) {
        this.f38825a = i10;
        this.f38826b = znVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f38825a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        zn znVar = this.f38826b;
        switch (i11) {
            case 0:
                zn znVar2 = this.f38826b;
                rg.j0.C1(znVar2, znVar2.D1, znVar2.E1, znVar2.T5, false);
                return;
            case 1:
                znVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", znVar.f40472r);
                znVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (znVar.K3 != null) {
                    znVar.Lb(!znVar.xc.f14185f);
                    return;
                }
                return;
            case 3:
                znVar.kb(!znVar.A0.N);
                return;
            case 4:
                fk fkVar = znVar.I1;
                if (fkVar != null) {
                    fkVar.setReversed(true);
                    znVar.I1.getAdapter().f9827k0 = true;
                    znVar.m7();
                }
                znVar.S2.setVisibility(8);
                znVar.T2.setVisibility(8);
                znVar.f40428n3 = true;
                znVar.f40439o3 = null;
                znVar.f40451p3 = null;
                znVar.f40376j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                znVar.f40376j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(znVar.f40376j0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = znVar.f40376j0;
                v0Var.f19831r = null;
                ci.h2 h2Var = v0Var.e;
                if (h2Var != null) {
                    h2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = znVar.f40376j0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    znVar.showDialog(org.telegram.ui.Components.d5.p(znVar.getParentActivity(), new el(znVar), znVar.f40324ea).f18674a);
                    return;
                }
                return;
            case 6:
                znVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = znVar.f40307d5;
                if (messageObject2 != null) {
                    znVar.J9(messageObject2, false, false);
                    nf.f.r(znVar.getParentActivity(), Uri.parse(znVar.f40307d5.sponsoredUrl), true, false, false, null, null, false, znVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(znVar.f40307d5.sponsoredInfo)) {
                    org.telegram.messenger.rk.o(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.kb.a(znVar.getParentActivity()), znVar.f40324ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(znVar.f40307d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.rk.o(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.kb.a(znVar.getParentActivity()), znVar.f40324ea));
                    return;
                }
                return;
            case 10:
                if (znVar.X0 != null && znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 j3 = org.telegram.messenger.rk.j(1, znVar.X0.getContext(), null, false);
                    Activity parentActivity = znVar.getParentActivity();
                    xn xnVar = znVar.f40324ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout e = org.telegram.messenger.l0.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i13 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, xnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(parentActivity, xnVar);
                    n90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), xnVar));
                    n90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, xnVar));
                    n90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, xnVar));
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
                    n90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), xnVar));
                    n90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, xnVar));
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
                    n90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), xnVar));
                    n90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, xnVar));
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
                    int i14 = org.telegram.ui.ActionBar.j6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, xnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    sk skVar = new sk(parentActivity, paint);
                    skVar.setOnClickListener(new m91(parentActivity));
                    skVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    skVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    skVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, xnVar));
                    skVar.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19180h5, xnVar)));
                    skVar.setTextSize(1, 14.0f);
                    skVar.setGravity(16);
                    org.telegram.ui.Components.n90 n90Var4 = new org.telegram.ui.Components.n90(parentActivity, null);
                    n90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), xnVar));
                    n90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    n90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, xnVar));
                    n90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(textView);
                    n90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(n90Var, w7.y5.t(-1, -2, 0, 0, 18, 0, 0));
                    n90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(n90Var2, w7.y5.t(-1, -2, 0, 0, 24, 0, 0));
                    n90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(n90Var3, w7.y5.t(-1, -2, 0, 0, 24, 0, 0));
                    e.addView(skVar, w7.y5.t(-2, 34, 1, 22, 14, 22, 0));
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
                znVar.finishPreviewFragment();
                return;
            case 12:
                znVar.getClass();
                znVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 28, true));
                return;
            case 13:
                zn znVar3 = this.f38826b;
                long j10 = znVar3.T5;
                TLRPC.User user = znVar3.f40326f;
                TLRPC.Chat chat = znVar3.e;
                TLRPC.EncryptedChat encryptedChat = znVar3.h;
                if (znVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.d5.j0(znVar3, j10, user, chat, encryptedChat, z10, znVar3.Z7, new ch(znVar3, 2), znVar3.f40324ea);
                return;
            case 14:
                zn.i0(znVar);
                return;
            case 15:
                if (znVar.f40294c4 != null) {
                    TopicsController topicsController = znVar.getMessagesController().getTopicsController();
                    long j11 = znVar.e.f18343id;
                    TLRPC.TL_forumTopic tL_forumTopic = znVar.f40294c4;
                    int i15 = tL_forumTopic.f18395id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i15, false);
                }
                znVar.Rc();
                znVar.hc(false);
                znVar.Qc(true);
                return;
            case 16:
                long j12 = znVar.T5;
                if (znVar.h != null) {
                    j12 = znVar.f40326f.f18490id;
                }
                znVar.Xb = false;
                znVar.getMessagesController().hidePeerSettingsBar(j12, znVar.f40326f, znVar.e);
                znVar.Qc(true);
                znVar.oc(true);
                return;
            case 17:
                zn znVar4 = this.f38826b;
                znVar4.D4 = true;
                if (znVar4.F9() && !znVar4.f40355h4) {
                    znVar4.E((int) znVar4.f40306d4, 0, 0, 0, true, true);
                    return;
                }
                int i16 = znVar4.L4;
                if (i16 != 0) {
                    if (!znVar4.H4.isEmpty()) {
                        if (i16 == ((Integer) hg.k0.g(1, znVar4.H4)).intValue()) {
                            i12 = ((Integer) znVar4.H4.get(0)).intValue() + 1;
                            znVar4.O4 = true;
                        } else {
                            znVar4.O4 = false;
                            i12 = i16 - 1;
                        }
                    }
                    znVar4.N4 = i12;
                    if (!znVar4.O4) {
                        i12 = -i12;
                    }
                    znVar4.E(i16, 0, 0, i12, true, true);
                    znVar4.uc();
                    return;
                }
                return;
            case 18:
                znVar.ia(false);
                return;
            case 19:
                zn.X0(znVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", znVar.a());
                znVar.presentFragment(new uo(bundle2));
                return;
            case 21:
                zn.u0(znVar);
                return;
            case 22:
                zn.D0(znVar);
                return;
            case 23:
                zn.h1(znVar);
                return;
            case 24:
                znVar.ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = znVar.W5;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (messageObject == null && sparseArrayArr[i17].size() != 0) {
                        messageObject = (MessageObject) znVar.f40442o6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    znVar.X5[i17].clear();
                    znVar.Y5[i17].clear();
                }
                znVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f18364id) > 0 || (i10 < 0 && znVar.h != null))) {
                    znVar.Bb(messageObject);
                }
                znVar.yc(0, true);
                znVar.Wc(false);
                znVar.Lc();
                return;
            case 26:
                zn.j1(znVar);
                return;
            case 27:
                zn znVar5 = this.f38826b;
                MessageObject messageObject3 = znVar5.p5;
                if (messageObject3 != null) {
                    znVar5.E(messageObject3.getId(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                if (!znVar.E9()) {
                    str = null;
                }
                znVar.la(str);
                return;
            default:
                znVar.Q7();
                znVar.y3.m(znVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
