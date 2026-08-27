package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class v implements View.OnLongClickListener {

    public final int f43315a;

    public final Object f43316b;

    public v(Object obj, int i10) {
        this.f43315a = i10;
        this.f43316b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        TLRPC.User user;
        boolean zB;
        boolean z10;
        boolean z11;
        switch (this.f43315a) {
            case 0:
                final m4 m4Var = (m4) this.f43316b;
                ArrayList arrayList = m4Var.Z;
                ?? r10 = 0;
                if (m4Var.f40347q0[0] != null) {
                    float f10 = m4Var.f40335d0.I.d;
                    z3 z3Var = m4Var.G;
                    org.telegram.ui.Components.b70 b70VarF = org.telegram.ui.Components.b70.F(z3Var != null ? z3Var.f45005c : m4Var.f40333b0, null, view);
                    int iW0 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : m4Var.f40347q0[0].getBackgroundColor();
                    int iW1 = SharedConfig.adaptableColorInBrowser ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false) : AndroidUtilities.computePerceivedBrightness(m4Var.f40347q0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int iL1 = org.telegram.ui.ActionBar.g6.l1(0.65f, iW1);
                    org.telegram.ui.web.w0 webView = m4Var.f40347q0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                        if (webBackForwardListCopyBackForwardList.getCurrentIndex() > 0) {
                            int i10 = 0;
                            while (i10 < currentIndex) {
                                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i10);
                                b70VarF.c(r10, itemAtIndex.getTitle(), new h3.z(currentIndex, i10, webView, 5), r10);
                                org.telegram.ui.ActionBar.f1 f1VarY = b70VarF.y();
                                if (f1VarY != null) {
                                    f1VarY.setSubtext(itemAtIndex.getUrl());
                                    Bitmap favicon = (Bitmap) webView.L.get(itemAtIndex.getUrl());
                                    if (favicon == null) {
                                        favicon = itemAtIndex.getFavicon();
                                    }
                                    f1VarY.g(itemAtIndex.getTitle(), 0, new q0(favicon, new Paint(3), 0));
                                    f1VarY.setTextColor(iW1);
                                    f1VarY.setSubtextColor(iL1);
                                }
                                i10++;
                                webBackForwardListCopyBackForwardList = webBackForwardListCopyBackForwardList;
                                r10 = 0;
                            }
                        }
                    }
                    for (final int size = arrayList.size() - 2; size >= 0; size--) {
                        Object obj = arrayList.get(size);
                        if (obj instanceof d3) {
                            d3 d3Var = (d3) obj;
                            final int i11 = 0;
                            b70VarF.c(0, d3Var.b(), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            m4Var.H(size);
                                            break;
                                        default:
                                            m4Var.H(size);
                                            break;
                                    }
                                }
                            }, false);
                            org.telegram.ui.ActionBar.f1 f1VarY2 = b70VarF.y();
                            if (f1VarY2 != null) {
                                f1VarY2.setSubtext(d3Var.v);
                                Bitmap bitmap = webView != null ? (Bitmap) webView.L.get(d3Var.v) : null;
                                if (bitmap == null) {
                                    bitmap = d3Var.D;
                                }
                                f1VarY2.g(d3Var.b(), 0, new q0(bitmap, new Paint(3), 1));
                                f1VarY2.setTextColor(iW1);
                                f1VarY2.setSubtextColor(iL1);
                                f1VarY2.c(iW1, iW1);
                            }
                        } else {
                            if (obj instanceof TLRPC.WebPage) {
                                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                                final int i12 = 1;
                                b70VarF.c(0, webPage.title, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                m4Var.H(size);
                                                break;
                                            default:
                                                m4Var.H(size);
                                                break;
                                        }
                                    }
                                }, false);
                                org.telegram.ui.ActionBar.f1 f1VarY3 = b70VarF.y();
                                if (f1VarY3 != null) {
                                    org.telegram.ui.Components.ri0 ri0Var = f1VarY3.f22913c;
                                    f1VarY3.g(webPage.title, R.drawable.msg_instant, null);
                                    f1VarY3.setTextColor(iW1);
                                    if (!TextUtils.isEmpty(webPage.site_name)) {
                                        f1VarY3.setSubtext(webPage.site_name);
                                    }
                                    f1VarY3.setSubtextColor(iL1);
                                    ri0Var.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                                    ri0Var.setScaleX(1.45f);
                                    ri0Var.setScaleY(1.45f);
                                    f1VarY3.c(iW1, iW1);
                                }
                            }
                        }
                    }
                    b70VarF.W(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(40.0f), m4Var.f40335d0.getBackgroundColor()));
                    b70VarF.P(iW0);
                    if (b70VarF.x() > 0) {
                        m4Var.m(new org.telegram.messenger.b6(m4Var, b70VarF, f10, 1));
                        return true;
                    }
                }
                return false;
            case 1:
                e8 e8Var = (e8) this.f43316b;
                h8 h8Var = e8Var.f37662x;
                if (e8Var.f37658n != null) {
                    int i13 = -1;
                    int i14 = -1;
                    for (int i15 = 0; i15 < e8Var.d; i15++) {
                        f8 f8Var = (f8) e8Var.f37658n.get(i15, null);
                        if (f8Var != null) {
                            if (i13 == -1) {
                                i13 = f8Var.h;
                            }
                            i14 = f8Var.h;
                        }
                    }
                    if (i13 >= 0 && i14 >= 0) {
                        h8Var.C = true;
                        h8Var.L = i13;
                        h8Var.M = i14;
                        h8Var.t0();
                        h8Var.o0();
                    }
                }
                return false;
            case 2:
                al alVar = (al) this.f43316b;
                rn rnVar = alVar.f36559c;
                if (AndroidUtilities.isTablet() || (rnVar.F9() && !UserObject.isBot(rnVar.f42039f))) {
                    return false;
                }
                alVar.f36558b = alVar.f36557a;
                rnVar.ia(true);
                return true;
            case 3:
                jp0 jp0Var = (jp0) this.f43316b;
                rn rnVar2 = jp0Var.B;
                if (rnVar2 != null && jp0Var.C != 1) {
                    TLRPC.User userI = rnVar2.i();
                    if (jp0Var.F == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(jp0Var.getParentActivity(), null);
                        jp0Var.F = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        jp0Var.F.setOnTouchListener(new org.telegram.ui.Components.we(jp0Var));
                        jp0Var.F.setDispatchKeyEventListener(new bp0(jp0Var, 1));
                        jp0Var.F.setShownFromBottom(false);
                        jp0Var.G = new org.telegram.ui.ActionBar.f1[2];
                        int i16 = 0;
                        while (i16 < 2) {
                            if ((i16 != 0 || rnVar2.D6()) && (i16 != 1 || !UserObject.isUserSelf(userI))) {
                                jp0Var.G[i16] = new org.telegram.ui.ActionBar.f1(jp0Var.getParentActivity(), i16 == 0, i16 == 1);
                                if (i16 != 0) {
                                    jp0Var.G[i16].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(userI)) {
                                    jp0Var.G[i16].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    jp0Var.G[i16].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                jp0Var.G[i16].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                jp0Var.F.a(jp0Var.G[i16], h7.z5.n(-1, 48));
                                jp0Var.G[i16].setOnClickListener(new hh.z0(jp0Var, i16, 20));
                            }
                            i16++;
                        }
                        jp0Var.F.setupRadialSelectors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false));
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(jp0Var.F, -2, -2);
                        jp0Var.E = n1Var;
                        n1Var.f23682b = false;
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        jp0Var.E.setOutsideTouchable(true);
                        jp0Var.E.setClippingEnabled(true);
                        jp0Var.E.setInputMethodMode(2);
                        jp0Var.E.setSoftInputMode(0);
                        jp0Var.E.getContentView().setFocusableInTouchMode(true);
                    }
                    jp0Var.F.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    jp0Var.E.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    jp0Var.E.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - jp0Var.F.getMeasuredWidth()), (iArr[1] - jp0Var.F.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    jp0Var.E.b();
                    try {
                        view.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 4:
                aq0 aq0Var = (aq0) this.f43316b;
                rn rnVar3 = aq0Var.Q;
                if (rnVar3 != null && aq0Var.D != 1) {
                    TLRPC.User userI2 = rnVar3.i();
                    if (aq0Var.f36610j0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(aq0Var.getParentActivity(), null);
                        aq0Var.f36610j0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        aq0Var.f36610j0.setOnTouchListener(new org.telegram.ui.Components.we(aq0Var));
                        aq0Var.f36610j0.setDispatchKeyEventListener(new np0(aq0Var, 3));
                        aq0Var.f36610j0.setShownFromBottom(false);
                        aq0Var.f36611k0 = new org.telegram.ui.ActionBar.f1[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            if ((i17 != 0 || rnVar3.D6()) && (i17 != 1 || !UserObject.isUserSelf(userI2))) {
                                aq0Var.f36611k0[i17] = new org.telegram.ui.ActionBar.f1(aq0Var.getParentActivity(), i17 == 0, i17 == 1);
                                if (i17 != 0) {
                                    aq0Var.f36611k0[i17].g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(userI2)) {
                                    aq0Var.f36611k0[i17].g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    aq0Var.f36611k0[i17].g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                aq0Var.f36611k0[i17].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                aq0Var.f36610j0.a(aq0Var.f36611k0[i17], h7.z5.n(-1, 48));
                                aq0Var.f36611k0[i17].setOnClickListener(new hh.z0(aq0Var, i17, 21));
                            }
                            i17++;
                        }
                        aq0Var.f36610j0.setupRadialSelectors(org.telegram.ui.ActionBar.g6.w0(null, aq0Var.f36621s0, false));
                        org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(aq0Var.f36610j0, -2, -2);
                        aq0Var.f36609i0 = n1Var2;
                        n1Var2.f23682b = false;
                        n1Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        aq0Var.f36609i0.setOutsideTouchable(true);
                        aq0Var.f36609i0.setClippingEnabled(true);
                        aq0Var.f36609i0.setInputMethodMode(2);
                        aq0Var.f36609i0.setSoftInputMode(0);
                        aq0Var.f36609i0.getContentView().setFocusableInTouchMode(true);
                    }
                    aq0Var.f36610j0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    aq0Var.f36609i0.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    aq0Var.f36609i0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - aq0Var.f36610j0.getMeasuredWidth()), (iArr2[1] - aq0Var.f36610j0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    aq0Var.f36609i0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f43316b;
                au0 au0Var = photoViewer.d;
                if ((au0Var != null && !au0Var.T()) || photoViewer.Y1 == 11) {
                    return false;
                }
                org.telegram.ui.ActionBar.n2 n2Var = photoViewer.f35661i4;
                boolean z12 = (n2Var == null || n2Var.getLastStoryViewer() == null) ? false : true;
                rn rnVar4 = photoViewer.f35652h4;
                if (rnVar4 != null && rnVar4.c()) {
                    return false;
                }
                if ((photoViewer.f35652h4 == null && !z12 && photoViewer.d == null) || photoViewer.Q1.o()) {
                    return false;
                }
                rn rnVar5 = photoViewer.f35652h4;
                if (rnVar5 != null) {
                    user = rnVar5.i();
                    zB = photoViewer.f35652h4.D6();
                } else {
                    au0 au0Var2 = photoViewer.d;
                    if (au0Var2 == null) {
                        return false;
                    }
                    long jA = au0Var2.a();
                    user = jA != 0 ? MessagesController.getInstance(photoViewer.P).getUser(Long.valueOf(jA)) : null;
                    zB = photoViewer.d.b();
                }
                au0 au0Var3 = photoViewer.d;
                boolean z13 = au0Var3 != null && au0Var3.p();
                au0 au0Var4 = photoViewer.d;
                boolean z14 = au0Var4 != null && au0Var4.r();
                boolean zIsUserSelf = UserObject.isUserSelf(user);
                au0 au0Var5 = photoViewer.d;
                if (au0Var5 == null || au0Var5.v() == null) {
                    z10 = false;
                } else {
                    Iterator it = photoViewer.d.v().entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object value = ((Map.Entry) it.next()).getValue();
                            if (value instanceof MediaController.PhotoEntry) {
                                if (((MediaController.PhotoEntry) value).ttl != 0) {
                                    z10 = true;
                                }
                            } else if ((value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0) {
                                z10 = true;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                }
                if (z13 || photoViewer.f35702n1) {
                    z11 = false;
                } else {
                    zr0 zr0Var = photoViewer.Q1;
                    if (!zr0Var.Q0 || zr0Var.X0 <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                boolean z15 = (z13 || !zB || z10) ? false : true;
                boolean z16 = ((z13 && z14) || zIsUserSelf) ? false : true;
                au0 au0Var6 = photoViewer.d;
                boolean z17 = au0Var6 != null && au0Var6.H() > 1;
                org.telegram.ui.Components.b70 b70VarF2 = org.telegram.ui.Components.b70.F(photoViewer.f35583a0, new jh.b(), view);
                b70VarF2.l(R.drawable.msg_sendfile, LocaleController.getString(z17 ? R.string.SendAsFiles : R.string.SendAsFile), new hq0(photoViewer, 2), z11);
                b70VarF2.l(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new hq0(photoViewer, 3), z14);
                b70VarF2.l(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new hq0(photoViewer, 4), z14);
                b70VarF2.l(R.drawable.msg_calendar2, LocaleController.getString(zIsUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new hq0(photoViewer, 5), z15);
                b70VarF2.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new hq0(photoViewer, 6), z16);
                if (b70VarF2.x() == 0) {
                    return false;
                }
                b70VarF2.V(5);
                b70VarF2.Z();
                return true;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f43316b;
                if (profileActivity.F2 == null && !profileActivity.f36007m1) {
                    profileActivity.w4(false);
                }
                return false;
            default:
                a61 a61Var = (a61) this.f43316b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a61Var.getContext(), 0, null);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearRecentEmojiStatusesText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new f41(a61Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.f22702a.L0 = false;
                alertDialog$Builder.j(new s5(a61Var, 15));
                alertDialog$Builder.o();
                a61Var.w(1.0f);
                try {
                    a61Var.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused3) {
                }
                return true;
        }
    }
}
