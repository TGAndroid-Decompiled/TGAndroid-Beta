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
    public final int f45741a;
    public final un f45742b;

    public xe(un unVar, int i10) {
        this.f45741a = i10;
        this.f45742b = unVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f45741a;
        MessageObject messageObject = null;
        String str = null;
        int i12 = 0;
        un unVar = this.f45742b;
        switch (i11) {
            case 0:
                un unVar2 = this.f45742b;
                tg.j0.G1(unVar2, unVar2.P1, unVar2.Q1, unVar2.f44249f6, false);
                return;
            case 1:
                unVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", unVar.f44388r);
                unVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (unVar.W3 != null) {
                    unVar.Xb(!unVar.Vc.f19327f);
                    return;
                }
                return;
            case 3:
                unVar.vb(!unVar.A0.N);
                return;
            case 4:
                zj zjVar = unVar.U1;
                if (zjVar != null) {
                    zjVar.setReversed(true);
                    unVar.U1.getAdapter().f14122k0 = true;
                    unVar.t7();
                }
                unVar.f44233e3.setVisibility(8);
                unVar.f44246f3.setVisibility(8);
                unVar.f44496z3 = true;
                unVar.A3 = null;
                unVar.B3 = null;
                unVar.f44291j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                unVar.f44291j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(unVar.f44291j0.getSearchField());
                unVar.f44291j0.n();
                return;
            case 5:
                if (unVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var = unVar.f44291j0;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    unVar.showDialog(org.telegram.ui.Components.g5.o(unVar.getParentActivity(), new al(unVar), unVar.f44385qa).f22599a);
                    return;
                }
                return;
            case 6:
                unVar.H7(true);
                return;
            case 7:
                MessageObject messageObject2 = unVar.f44371p5;
                if (messageObject2 != null) {
                    unVar.T9(messageObject2, false, false);
                    qf.d.q(unVar.getParentActivity(), Uri.parse(unVar.f44371p5.sponsoredUrl), true, false, false, null, null, false, unVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(unVar.f44371p5.sponsoredInfo)) {
                    org.telegram.messenger.vh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(unVar.getParentActivity()), unVar.f44385qa));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(unVar.f44371p5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.vh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(unVar.getParentActivity()), unVar.f44385qa));
                    return;
                }
                return;
            case 10:
                if (unVar.f44292j1 != null && unVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.k3 i13 = org.telegram.messenger.vh.i(1, unVar.f44292j1.getContext(), null, false);
                    Activity parentActivity = unVar.getParentActivity();
                    sn snVar = unVar.f44385qa;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.t.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.y6.G6;
                    org.telegram.ui.ActionBar.f7.V(textView, i14, snVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(parentActivity, snVar);
                    z90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), snVar));
                    org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, snVar);
                    org.telegram.ui.ActionBar.f7.V(z90Var, i14, snVar);
                    z90Var.setTextSize(1, 14.0f);
                    z90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    z90Var.setOnLinkPressListener(new org.telegram.ui.Components.y90() {
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
                    org.telegram.ui.Components.z90 z90Var2 = new org.telegram.ui.Components.z90(parentActivity, null);
                    z90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), snVar));
                    org.telegram.ui.ActionBar.f7.V(z90Var2, i14, snVar);
                    z90Var2.setTextSize(1, 14.0f);
                    z90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    z90Var2.setOnLinkPressListener(new org.telegram.ui.Components.y90() {
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
                    org.telegram.ui.Components.z90 z90Var3 = new org.telegram.ui.Components.z90(parentActivity, null);
                    z90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), snVar));
                    org.telegram.ui.ActionBar.f7.V(z90Var3, i14, snVar);
                    z90Var3.setTextSize(1, 14.0f);
                    z90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    z90Var3.setOnLinkPressListener(new org.telegram.ui.Components.y90() {
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
                    paint.setColor(org.telegram.ui.ActionBar.y6.w0(i15, snVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    mk mkVar = new mk(parentActivity, paint);
                    mkVar.setOnClickListener(new h81(parentActivity));
                    mkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    mkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    org.telegram.ui.ActionBar.f7.V(mkVar, i15, snVar);
                    int i16 = org.telegram.ui.ActionBar.y6.f23425h5;
                    org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.w0(i16, snVar));
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
                    org.telegram.ui.ActionBar.b7 f10 = org.telegram.ui.ActionBar.f7.f(i16);
                    mkVar.setBackground(e);
                    org.telegram.ui.ActionBar.f7.k(mkVar, e, N, f10, snVar);
                    mkVar.setTextSize(1, 14.0f);
                    mkVar.setGravity(16);
                    org.telegram.ui.Components.z90 z90Var4 = new org.telegram.ui.Components.z90(parentActivity, null);
                    z90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), snVar));
                    z90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.f7.V(z90Var4, i14, snVar);
                    z90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    z90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(z90Var, org.telegram.ui.Components.gb1.x(-1, -2, 0, 0, 18, 0, 0));
                    z90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(z90Var2, org.telegram.ui.Components.gb1.x(-1, -2, 0, 0, 24, 0, 0));
                    z90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(z90Var3, org.telegram.ui.Components.gb1.x(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(mkVar, org.telegram.ui.Components.gb1.x(-2, 34, 1, 22, 14, 22, 0));
                    z90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(z90Var4, org.telegram.ui.Components.gb1.x(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(f7);
                    frameLayout.addView(scrollView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i13.customView = frameLayout;
                    i13.show();
                    return;
                }
                return;
            case 11:
                unVar.finishPreviewFragment();
                return;
            case 12:
                unVar.getClass();
                unVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar, 28, true));
                return;
            case 13:
                un unVar3 = this.f45742b;
                long j10 = unVar3.f44249f6;
                TLRPC.User user = unVar3.f44242f;
                TLRPC.Chat chat = unVar3.e;
                TLRPC.EncryptedChat encryptedChat = unVar3.h;
                if (unVar3.Z1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.g5.i0(unVar3, j10, user, chat, encryptedChat, z10, unVar3.f44322l8, new tg(unVar3, 2), unVar3.f44385qa);
                return;
            case 14:
                un.k0(unVar);
                return;
            case 15:
                if (unVar.f44357o4 != null) {
                    TopicsController topicsController = unVar.getMessagesController().getTopicsController();
                    long j11 = unVar.e.f22027id;
                    TLRPC.TL_forumTopic tL_forumTopic = unVar.f44357o4;
                    int i17 = tL_forumTopic.f22079id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i17, false);
                }
                unVar.ed();
                unVar.uc(false);
                unVar.dd(true);
                return;
            case 16:
                long j12 = unVar.f44249f6;
                if (unVar.h != null) {
                    j12 = unVar.f44242f.f22174id;
                }
                unVar.f44440uc = false;
                unVar.getMessagesController().hidePeerSettingsBar(j12, unVar.f44242f, unVar.e);
                unVar.dd(true);
                unVar.Bc(true);
                return;
            case 17:
                un unVar4 = this.f45742b;
                unVar4.P4 = true;
                if (unVar4.O9() && !unVar4.f44419t4) {
                    unVar4.j((int) unVar4.f44370p4, 0, true, 0, true, 0);
                    return;
                }
                int i18 = unVar4.X4;
                if (i18 != 0) {
                    if (!unVar4.T4.isEmpty()) {
                        if (i18 == ((Integer) ic.a.g(1, unVar4.T4)).intValue()) {
                            i12 = ((Integer) unVar4.T4.get(0)).intValue() + 1;
                            unVar4.f44181a5 = true;
                        } else {
                            unVar4.f44181a5 = false;
                            i12 = i18 - 1;
                        }
                    }
                    unVar4.Z4 = i12;
                    if (!unVar4.f44181a5) {
                        i12 = -i12;
                    }
                    unVar4.j(i18, 0, true, 0, true, i12);
                    unVar4.Hc();
                    return;
                }
                return;
            case 18:
                unVar.sa(false);
                return;
            case 19:
                un.c1(unVar);
                return;
            case 20:
                un.H0(unVar);
                return;
            case 21:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", unVar.a());
                unVar.presentFragment(new mo(bundle2));
                return;
            case 22:
                un.U0(unVar);
                return;
            case 23:
                un.X0(unVar);
                return;
            case 24:
                unVar.la(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = unVar.f44285i6;
                for (int i19 = 1; i19 >= 0; i19--) {
                    if (messageObject == null && sparseArrayArr[i19].size() != 0) {
                        messageObject = (MessageObject) unVar.A6[i19].get(sparseArrayArr[i19].keyAt(0));
                    }
                    sparseArrayArr[i19].clear();
                    unVar.f44297j6[i19].clear();
                    unVar.f44309k6[i19].clear();
                }
                unVar.m9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f22048id) > 0 || (i10 < 0 && unVar.h != null))) {
                    unVar.Nb(messageObject);
                }
                unVar.Lc(0, true);
                unVar.jd(false);
                unVar.Yc();
                return;
            case 26:
                un.J0(unVar);
                return;
            case 27:
                un unVar5 = this.f45742b;
                MessageObject messageObject3 = unVar5.B5;
                if (messageObject3 != null) {
                    unVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (unVar.N9()) {
                    str = "";
                }
                unVar.va(str);
                return;
            default:
                unVar.X7();
                unVar.K3.m(unVar.f44249f6, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}
