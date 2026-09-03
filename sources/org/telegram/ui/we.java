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
    public final int f39350a;
    public final zn f39351b;

    public we(zn znVar, int i10) {
        this.f39350a = i10;
        this.f39351b = znVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        int i10;
        int i11 = this.f39350a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        zn znVar = this.f39351b;
        switch (i11) {
            case 0:
                zn znVar2 = this.f39351b;
                eg.v0.C1(znVar2, znVar2.A1, znVar2.B1, znVar2.Q5, false);
                return;
            case 1:
                znVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", znVar.f40723r);
                znVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (znVar.H3 != null) {
                    znVar.Lb(!znVar.f40784vc.f46961f);
                    return;
                }
                return;
            case 3:
                znVar.kb(!znVar.f40800x0.K);
                return;
            case 4:
                dk dkVar = znVar.F1;
                if (dkVar != null) {
                    dkVar.setReversed(true);
                    znVar.F1.getAdapter().f44908h0 = true;
                    znVar.m7();
                }
                znVar.P2.setVisibility(8);
                znVar.Q2.setVisibility(8);
                znVar.f40640k3 = true;
                znVar.f40652l3 = null;
                znVar.f40664m3 = null;
                znVar.f40588g0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                znVar.f40588g0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(znVar.f40588g0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = znVar.f40588g0;
                w0Var.f20643r = null;
                kg.f fVar = w0Var.e;
                if (fVar != null) {
                    fVar.setText("");
                    return;
                }
                return;
            case 5:
                if (znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = znVar.f40588g0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    znVar.showDialog(org.telegram.ui.Components.z4.p(znVar.getParentActivity(), new el(znVar), znVar.f40534ba).f19500a);
                    return;
                }
                return;
            case 6:
                znVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = znVar.f40515a5;
                if (messageObject2 != null) {
                    znVar.J9(messageObject2, false, false);
                    ze.d.r(znVar.getParentActivity(), Uri.parse(znVar.f40515a5.sponsoredUrl), true, false, false, null, null, false, znVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(znVar.f40515a5.sponsoredInfo)) {
                    b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(znVar.getParentActivity()), znVar.f40534ba));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(znVar.f40515a5.sponsoredAdditionalInfo)) {
                    b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(znVar.getParentActivity()), znVar.f40534ba));
                    return;
                }
                return;
            case 10:
                if (znVar.U0 != null && znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(znVar.U0.getContext(), null, false, false);
                    Activity parentActivity = znVar.getParentActivity();
                    xn xnVar = znVar.f40534ba;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout h = kf.k0.h(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i13 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, xnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(parentActivity, xnVar);
                    f90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), xnVar));
                    f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19941gc, xnVar));
                    f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, xnVar));
                    f90Var.setTextSize(1, 14.0f);
                    f90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    f90Var.setOnLinkPressListener(new org.telegram.ui.Components.e90() {
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
                    org.telegram.ui.Components.f90 f90Var2 = new org.telegram.ui.Components.f90(parentActivity, null);
                    f90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), xnVar));
                    f90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, xnVar));
                    f90Var2.setTextSize(1, 14.0f);
                    f90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    f90Var2.setOnLinkPressListener(new org.telegram.ui.Components.e90() {
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
                    org.telegram.ui.Components.f90 f90Var3 = new org.telegram.ui.Components.f90(parentActivity, null);
                    f90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), xnVar));
                    f90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, xnVar));
                    f90Var3.setTextSize(1, 14.0f);
                    f90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    f90Var3.setOnLinkPressListener(new org.telegram.ui.Components.e90() {
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
                    rk rkVar = new rk(parentActivity, paint);
                    rkVar.setOnClickListener(new a91(parentActivity));
                    rkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    rkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    rkVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, xnVar));
                    rkVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, xnVar)));
                    rkVar.setTextSize(1, 14.0f);
                    rkVar.setGravity(16);
                    org.telegram.ui.Components.f90 f90Var4 = new org.telegram.ui.Components.f90(parentActivity, null);
                    f90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), xnVar));
                    f90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    f90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, xnVar));
                    f90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(textView);
                    f90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(f90Var, k7.b6.t(-1, -2, 0, 0, 18, 0, 0));
                    f90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(f90Var2, k7.b6.t(-1, -2, 0, 0, 24, 0, 0));
                    f90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(f90Var3, k7.b6.t(-1, -2, 0, 0, 24, 0, 0));
                    h.addView(rkVar, k7.b6.t(-2, 34, 1, 22, 14, 22, 0));
                    f90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(f90Var4, k7.b6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(h);
                    frameLayout.addView(scrollView, k7.b6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    o10.customView = frameLayout;
                    o10.show();
                    return;
                }
                return;
            case 11:
                znVar.finishPreviewFragment();
                return;
            case 12:
                znVar.getClass();
                znVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) znVar, 28, true));
                return;
            case 13:
                zn znVar3 = this.f39351b;
                long j10 = znVar3.Q5;
                TLRPC.User user = znVar3.f40575f;
                TLRPC.Chat chat = znVar3.e;
                TLRPC.EncryptedChat encryptedChat = znVar3.h;
                if (znVar3.K1.getTag(R.id.object_tag) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                org.telegram.ui.Components.z4.j0(znVar3, j10, user, chat, encryptedChat, z4, znVar3.W7, new xg(znVar3, 2), znVar3.f40534ba);
                return;
            case 14:
                zn.j0(znVar);
                return;
            case 15:
                if (znVar.Z3 != null) {
                    TopicsController topicsController = znVar.getMessagesController().getTopicsController();
                    long j11 = znVar.e.f19159id;
                    TLRPC.TL_forumTopic tL_forumTopic = znVar.Z3;
                    int i15 = tL_forumTopic.f19211id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i15, false);
                }
                znVar.Rc();
                znVar.hc(false);
                znVar.Qc(true);
                return;
            case 16:
                long j12 = znVar.Q5;
                if (znVar.h != null) {
                    j12 = znVar.f40575f.f19306id;
                }
                znVar.Vb = false;
                znVar.getMessagesController().hidePeerSettingsBar(j12, znVar.f40575f, znVar.e);
                znVar.Qc(true);
                znVar.oc(true);
                return;
            case 17:
                zn znVar4 = this.f39351b;
                znVar4.A4 = true;
                if (znVar4.F9() && !znVar4.f40567e4) {
                    znVar4.j((int) znVar4.f40514a4, 0, true, 0, true, 0);
                    return;
                }
                int i16 = znVar4.I4;
                if (i16 != 0) {
                    if (!znVar4.E4.isEmpty()) {
                        if (i16 == ((Integer) kf.k0.i(1, znVar4.E4)).intValue()) {
                            i12 = ((Integer) znVar4.E4.get(0)).intValue() + 1;
                            znVar4.L4 = true;
                        } else {
                            znVar4.L4 = false;
                            i12 = i16 - 1;
                        }
                    }
                    znVar4.K4 = i12;
                    if (!znVar4.L4) {
                        i12 = -i12;
                    }
                    znVar4.j(i16, 0, true, 0, true, i12);
                    znVar4.uc();
                    return;
                }
                return;
            case 18:
                znVar.ia(false);
                return;
            case 19:
                zn.Z(znVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", znVar.a());
                znVar.presentFragment(new ro(bundle2));
                return;
            case 21:
                zn.C0(znVar);
                return;
            case 22:
                zn.L0(znVar);
                return;
            case 23:
                zn.b1(znVar);
                return;
            case 24:
                znVar.ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = znVar.T5;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (messageObject == null && sparseArrayArr[i17].size() != 0) {
                        messageObject = (MessageObject) znVar.f40655l6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    znVar.U5[i17].clear();
                    znVar.V5[i17].clear();
                }
                znVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f19180id) > 0 || (i10 < 0 && znVar.h != null))) {
                    znVar.Bb(messageObject);
                }
                znVar.yc(0, true);
                znVar.Wc(false);
                znVar.Lc();
                return;
            case 26:
                zn.f1(znVar);
                return;
            case 27:
                zn znVar5 = this.f39351b;
                MessageObject messageObject3 = znVar5.f40666m5;
                if (messageObject3 != null) {
                    znVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
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
                znVar.f40775v3.m(znVar.Q5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
