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
public final class xe implements View.OnClickListener {
    public final int f39600a;
    public final bo f39601b;

    public xe(bo boVar, int i10) {
        this.f39600a = i10;
        this.f39601b = boVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f39600a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        bo boVar = this.f39601b;
        switch (i11) {
            case 0:
                bo boVar2 = this.f39601b;
                rg.j0.C1(boVar2, boVar2.D1, boVar2.E1, boVar2.T5, false);
                return;
            case 1:
                boVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", boVar.f32423r);
                boVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (boVar.K3 != null) {
                    boVar.Lb(!boVar.f32526yc.f13985f);
                    return;
                }
                return;
            case 3:
                boVar.kb(!boVar.A0.N);
                return;
            case 4:
                gk gkVar = boVar.I1;
                if (gkVar != null) {
                    gkVar.setReversed(true);
                    boVar.I1.getAdapter().f9827k0 = true;
                    boVar.m7();
                }
                boVar.S2.setVisibility(8);
                boVar.T2.setVisibility(8);
                boVar.f32379n3 = true;
                boVar.f32390o3 = null;
                boVar.f32402p3 = null;
                boVar.f32327j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                boVar.f32327j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(boVar.f32327j0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = boVar.f32327j0;
                w0Var.f19624r = null;
                ci.h2 h2Var = w0Var.e;
                if (h2Var != null) {
                    h2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (boVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = boVar.f32327j0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    boVar.showDialog(org.telegram.ui.Components.c5.p(boVar.getParentActivity(), new fl(boVar), boVar.f32275ea).f18470a);
                    return;
                }
                return;
            case 6:
                boVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = boVar.f32258d5;
                if (messageObject2 != null) {
                    boVar.J9(messageObject2, false, false);
                    nf.f.r(boVar.getParentActivity(), Uri.parse(boVar.f32258d5.sponsoredUrl), true, false, false, null, null, false, boVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(boVar.f32258d5.sponsoredInfo)) {
                    org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.f32275ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(boVar.f32258d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.f32275ea));
                    return;
                }
                return;
            case 10:
                if (boVar.X0 != null && boVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.g3 i13 = org.telegram.messenger.wl.i(1, boVar.X0.getContext(), null, false);
                    Activity parentActivity = boVar.getParentActivity();
                    zn znVar = boVar.f32275ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.w1.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, znVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(parentActivity, znVar);
                    c90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), znVar));
                    c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, znVar));
                    c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, znVar));
                    c90Var.setTextSize(1, 14.0f);
                    c90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    c90Var.setOnLinkPressListener(new org.telegram.ui.Components.b90() {
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
                    org.telegram.ui.Components.c90 c90Var2 = new org.telegram.ui.Components.c90(parentActivity, null);
                    c90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), znVar));
                    c90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, znVar));
                    c90Var2.setTextSize(1, 14.0f);
                    c90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    c90Var2.setOnLinkPressListener(new org.telegram.ui.Components.b90() {
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
                    org.telegram.ui.Components.c90 c90Var3 = new org.telegram.ui.Components.c90(parentActivity, null);
                    c90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), znVar));
                    c90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, znVar));
                    c90Var3.setTextSize(1, 14.0f);
                    c90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    c90Var3.setOnLinkPressListener(new org.telegram.ui.Components.b90() {
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
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(i15, znVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    tk tkVar = new tk(parentActivity, paint);
                    tkVar.setOnClickListener(new k91(parentActivity));
                    tkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    tkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    tkVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, znVar));
                    tkVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18933h5, znVar)));
                    tkVar.setTextSize(1, 14.0f);
                    tkVar.setGravity(16);
                    org.telegram.ui.Components.c90 c90Var4 = new org.telegram.ui.Components.c90(parentActivity, null);
                    c90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), znVar));
                    c90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    c90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, znVar));
                    c90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    c90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(c90Var, w7.x5.t(-1, -2, 0, 0, 18, 0, 0));
                    c90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(c90Var2, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    c90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(c90Var3, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(tkVar, w7.x5.t(-2, 34, 1, 22, 14, 22, 0));
                    c90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(c90Var4, w7.x5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(f7);
                    frameLayout.addView(scrollView, w7.x5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i13.customView = frameLayout;
                    i13.show();
                    return;
                }
                return;
            case 11:
                boVar.finishPreviewFragment();
                return;
            case 12:
                boVar.getClass();
                boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar, 28, true));
                return;
            case 13:
                bo boVar3 = this.f39601b;
                long j3 = boVar3.T5;
                TLRPC.User user = boVar3.f32277f;
                TLRPC.Chat chat = boVar3.e;
                TLRPC.EncryptedChat encryptedChat = boVar3.h;
                if (boVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.c5.j0(boVar3, j3, user, chat, encryptedChat, z10, boVar3.Z7, new eh(boVar3, 2), boVar3.f32275ea);
                return;
            case 14:
                bo.j0(boVar);
                return;
            case 15:
                if (boVar.f32245c4 != null) {
                    TopicsController topicsController = boVar.getMessagesController().getTopicsController();
                    long j10 = boVar.e.f18121id;
                    TLRPC.TL_forumTopic tL_forumTopic = boVar.f32245c4;
                    int i16 = tL_forumTopic.f18173id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i16, false);
                }
                boVar.Rc();
                boVar.hc(false);
                boVar.Qc(true);
                return;
            case 16:
                long j11 = boVar.T5;
                if (boVar.h != null) {
                    j11 = boVar.f32277f.f18268id;
                }
                boVar.Yb = false;
                boVar.getMessagesController().hidePeerSettingsBar(j11, boVar.f32277f, boVar.e);
                boVar.Qc(true);
                boVar.oc(true);
                return;
            case 17:
                bo boVar4 = this.f39601b;
                boVar4.D4 = true;
                if (boVar4.F9() && !boVar4.f32306h4) {
                    boVar4.F((int) boVar4.f32257d4, 0, 0, 0, true, true);
                    return;
                }
                int i17 = boVar4.L4;
                if (i17 != 0) {
                    if (!boVar4.H4.isEmpty()) {
                        if (i17 == ((Integer) hg.k0.h(1, boVar4.H4)).intValue()) {
                            i12 = ((Integer) boVar4.H4.get(0)).intValue() + 1;
                            boVar4.O4 = true;
                        } else {
                            boVar4.O4 = false;
                            i12 = i17 - 1;
                        }
                    }
                    boVar4.N4 = i12;
                    if (!boVar4.O4) {
                        i12 = -i12;
                    }
                    boVar4.F(i17, 0, 0, i12, true, true);
                    boVar4.uc();
                    return;
                }
                return;
            case 18:
                boVar.ia(false);
                return;
            case 19:
                bo.Z(boVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", boVar.a());
                boVar.presentFragment(new wo(bundle2));
                return;
            case 21:
                bo.C0(boVar);
                return;
            case 22:
                bo.L0(boVar);
                return;
            case 23:
                bo.b1(boVar);
                return;
            case 24:
                boVar.ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = boVar.W5;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) boVar.f32393o6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    boVar.X5[i18].clear();
                    boVar.Y5[i18].clear();
                }
                boVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f18142id) > 0 || (i10 < 0 && boVar.h != null))) {
                    boVar.Bb(messageObject);
                }
                boVar.yc(0, true);
                boVar.Wc(false);
                boVar.Lc();
                return;
            case 26:
                bo.f1(boVar);
                return;
            case 27:
                bo boVar5 = this.f39601b;
                MessageObject messageObject3 = boVar5.p5;
                if (messageObject3 != null) {
                    boVar5.F(messageObject3.getId(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                if (!boVar.E9()) {
                    str = null;
                }
                boVar.la(str);
                return;
            default:
                boVar.Q7();
                boVar.y3.m(boVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
